/*******************************************************************************
 * Copyright (c) 2009-2013 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 *   * Jurgen J. Vinju - Jurgen.Vinju@cwi.nl - CWI
 *   * Tijs van der Storm - Tijs.van.der.Storm@cwi.nl
 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
*******************************************************************************/
package org.rascalmpl.interpreter.types;

import java.util.Set;
import java.util.function.Function;

import org.rascalmpl.interpreter.asserts.ImplementationError;
import org.rascalmpl.interpreter.utils.Symbols;
import org.rascalmpl.value.IConstructor;
import org.rascalmpl.value.IList;
import org.rascalmpl.value.ISet;
import org.rascalmpl.value.ISetWriter;
import org.rascalmpl.value.IValueFactory;
import org.rascalmpl.value.type.Type;
import org.rascalmpl.value.type.TypeStore;
import org.rascalmpl.values.uptr.IRascalValueFactory;
import org.rascalmpl.values.uptr.ITree;
import org.rascalmpl.values.uptr.ProductionAdapter;
import org.rascalmpl.values.uptr.RascalValueFactory;
import org.rascalmpl.values.uptr.SymbolAdapter;
import org.rascalmpl.values.uptr.TreeAdapter;

/**
 * This is an "extension" of the PDB's type system with a special kind of type
 * that implements the connection between Rascal's non-terminals and Rascal types. 
 */
public class NonTerminalType extends RascalType {
	private IConstructor symbol;
	static final Type CONSTRUCTOR = declareTypeSymbol("non-terminal", symbolType(), "symbol");

	/*package*/ public NonTerminalType(IConstructor cons) {
		// TODO refactor this into different factory methods in RascalTypeFactory
		
		if (cons.getConstructorType() == RascalValueFactory.Tree_Appl) {
			// Note that here we go from * to + lists if the list is not empty
			this.symbol = TreeAdapter.getType((ITree) cons);
		}
		else if (cons.getConstructorType() == RascalValueFactory.Tree_Amb) {
			ISet alts = TreeAdapter.getAlternatives((ITree) cons);
			
			if (!alts.isEmpty()) {
				ITree first = (ITree) alts.iterator().next();
				this.symbol = TreeAdapter.getType(first);
			}
			else {
				this.symbol = IRascalValueFactory.getInstance().constructor(RascalValueFactory.Symbol_Empty);
			}
		}
		else if (cons.getConstructorType() == RascalValueFactory.Tree_Cycle) {
			this.symbol = TreeAdapter.getType((ITree) cons);
		}
		else if (cons.getType() == RascalValueFactory.Symbol) {
			this.symbol = cons;
		}
		else if (cons.getType() == RascalValueFactory.Production) {
			this.symbol = ProductionAdapter.getType(cons);
		}
		else {
			throw new ImplementationError("Invalid concrete syntax type constructor:" + cons);
		}
	}
	
    /*package*/ NonTerminalType(org.rascalmpl.ast.Type type, boolean lex, String layout) {
		this(Symbols.typeToSymbol(type, lex, layout));
	}
	
    @Override
    public IConstructor asSymbol(IValueFactory vf, TypeStore store, ISetWriter grammar, Set<IConstructor> done) {
      return vf.constructor(CONSTRUCTOR, getSymbol());
    }
    
    public static Type fromSymbol(IConstructor symbol, TypeStore store, Function<IConstructor,Set<IConstructor>> grammar) {
      return RTF.nonTerminalType((IConstructor) symbol.get("symbol"));
    }
    
    @Override
    public boolean isNonterminal() {
    	return true;
    }
    
    @Override
    public Type asAbstractDataType() {
    	return RascalValueFactory.Tree;
    }
    
	public IConstructor getSymbol() {
		return symbol;
	}
	
	public int getArity() {
		return symbol.arity();
	}
	
	public boolean isConcreteListType() {
		return SymbolAdapter.isAnyList(getSymbol());
	}
	
	public boolean isOptionalType() {
		return SymbolAdapter.isOpt(getSymbol());
	}
	
	@Override
	public Type getAbstractDataType() {
	  return RascalValueFactory.Tree;
	}
	
	@Override
	public boolean hasField(String fieldName) {
		// safe over-approximation
		return true;
	}
	
	@Override
	public boolean hasKeywordField(String fieldName, TypeStore store) {
	    return RascalValueFactory.Tree.hasKeywordField(fieldName, store);
	}
	
	@Override
	public String getName() {
		return RascalValueFactory.Tree.getName();
	}
	
	@Override
	public Type getTypeParameters() {
		return RascalValueFactory.Tree.getTypeParameters();
	}
	
	@Override
	public <T, E extends Throwable> T accept(IRascalTypeVisitor<T,E> visitor) throws E {
		return visitor.visitNonTerminal(this);
	}
	
	@Override
	protected boolean isSubtypeOfAbstractData(Type type) {
	  return type.equivalent(RascalValueFactory.Tree);
	}
	
	@Override
	protected boolean isSubtypeOfNode(Type type) {
	  return true;
	}
	
	@Override
	protected Type lubWithNode(Type type) {
	  return type;
	}
	
	@Override
	protected Type lubWithAbstractData(Type type) {
	  return type.equivalent(RascalValueFactory.Tree) ? type : TF.nodeType(); 
	}
	
	@Override
	protected Type lubWithConstructor(Type type) {
	  return type.getAbstractDataType().equivalent(RascalValueFactory.Tree) ? RascalValueFactory.Tree : TF.nodeType();
	}
	
	@Override
	protected Type glbWithNode(Type type) {
	  return this;
	}
	
	@Override
	protected Type glbWithAbstractData(Type type) {
	  return type.equivalent(RascalValueFactory.Tree) ? this : TF.voidType(); 
	}
	
	@Override
	protected Type glbWithConstructor(Type type) {
	  return TF.voidType();
	}

	
	@Override
	protected boolean isSupertypeOf(Type type) {
	  if (type instanceof NonTerminalType) {
	    return ((NonTerminalType) type).isSubtypeOfNonTerminal(this);
	  }
	  
	  return super.isSupertypeOf(type);
	}
	
	@Override
	protected boolean isSupertypeOf(RascalType type) {
	  return type.isSubtypeOfNonTerminal(this);
	}
	
	@Override
	protected Type lub(RascalType type) {
	  return type.lubWithNonTerminal(this);
	}
	
	@Override
	protected Type glb(RascalType type) {
		return type.glbWithNonTerminal(this);
	}
	
	@Override
	public boolean isSubtypeOfNonTerminal(RascalType other) {
		if (other == this) {
			return true;
		}
	  IConstructor otherSym = ((NonTerminalType)other).symbol;
	 
	  if ((SymbolAdapter.isIterPlus(symbol) && (SymbolAdapter.isIterStar(otherSym) || SymbolAdapter.isIterPlus(otherSym)))
		 || (SymbolAdapter.isIterStar(symbol) && SymbolAdapter.isIterStar(otherSym))) {
		  RascalType nt1 = (RascalType) RTF.nonTerminalType(SymbolAdapter.getSymbol(symbol));
		  RascalType nt2 = (RascalType) RTF.nonTerminalType(SymbolAdapter.getSymbol(otherSym));
		  return nt1.isSubtypeOfNonTerminal(nt2);
	  }
	  else if ((SymbolAdapter.isIterPlusSeps(symbol) && (SymbolAdapter.isIterStarSeps(otherSym) || SymbolAdapter.isIterPlusSeps(otherSym)))
			  || (SymbolAdapter.isIterStarSeps(symbol) && SymbolAdapter.isIterStarSeps(otherSym))) {
		  RascalType nt1 = (RascalType) RTF.nonTerminalType(SymbolAdapter.getSymbol(symbol));
		  RascalType nt2 = (RascalType) RTF.nonTerminalType(SymbolAdapter.getSymbol(otherSym));
		  
		  if (nt1.isSubtypeOfNonTerminal(nt2)) {
			  IList seps1 = SymbolAdapter.getSeparators(symbol);
			  IList seps2 = SymbolAdapter.getSeparators(otherSym);

			  // this works around broken regular prods in the RVM which have the wrong or missing layout symbols:
			  int sep1index = seps1.length() == 3 ? 1 : 0;
			  int sep2index = seps2.length() == 3 ? 1 : 0;

			  nt1 = (RascalType) RTF.nonTerminalType((IConstructor) seps1.get(sep1index));
			  nt2 = (RascalType) RTF.nonTerminalType((IConstructor) seps2.get(sep2index));
			  return nt1.isSubtypeOfNonTerminal(nt2);
		  }

		  return false;
	  }
	  else if (SymbolAdapter.isOpt(symbol) && SymbolAdapter.isOpt(otherSym)) {
		  RascalType nt1 = (RascalType) RTF.nonTerminalType(SymbolAdapter.getSymbol(symbol));
		  RascalType nt2 = (RascalType) RTF.nonTerminalType(SymbolAdapter.getSymbol(otherSym));
		  return nt1.isSubtypeOfNonTerminal(nt2);
	  }
//	  else if (SymbolAdapter.isSequence(symbol) && SymbolAdapter.isSeq(otherSym)) {
		  // TODO pairwise issubtype
//	  }

	  if (SymbolAdapter.isParameter(otherSym)) {
		  RascalType bound = (RascalType) RTF.nonTerminalType((IConstructor) otherSym.get("bound"));
		  return isSubtypeOf(bound);
	  }
	  
	  // TODO co-variance for the other structured symbols (sequence, opt, list)
	  return SymbolAdapter.isEqual(otherSym, symbol);
	}
	
	@Override
	protected Type lubWithNonTerminal(RascalType other) {
		IConstructor otherSym = ((NonTerminalType)other).symbol;

		// * eats +
		if (SymbolAdapter.isIterPlus(symbol) && SymbolAdapter.isIterStar(otherSym)) {
			return other;
		}
		else if (SymbolAdapter.isIterPlus(otherSym) && SymbolAdapter.isIterStar(symbol)) {
			return this;
		}
		else if (SymbolAdapter.isIterPlusSeps(symbol) && SymbolAdapter.isIterStarSeps(otherSym)) {
			return other;
		}
		else if (SymbolAdapter.isIterPlusSeps(otherSym) && SymbolAdapter.isIterStarSeps(symbol)) {
			return this;
		}

		return SymbolAdapter.isEqual(otherSym, symbol) ? this : RascalValueFactory.Tree;
	}

	@Override
	protected Type glbWithNonTerminal(RascalType other) {
	  IConstructor otherSym = ((NonTerminalType)other).symbol;
	  
	if (SymbolAdapter.isIterPlus(symbol) && SymbolAdapter.isIterStar(otherSym)) {
      return this;
    }
    else if (SymbolAdapter.isIterPlus(otherSym) && SymbolAdapter.isIterStar(symbol)) {
      return other;
    }
    else if (SymbolAdapter.isIterPlusSeps(symbol) && SymbolAdapter.isIterStarSeps(otherSym)) {
      return this;
    }
    else if (SymbolAdapter.isIterPlusSeps(otherSym) && SymbolAdapter.isIterStarSeps(symbol)) {
      return other;
    }

    return SymbolAdapter.isEqual(otherSym, symbol) ? other : TF.voidType();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if (obj.getClass() == getClass()) {
			NonTerminalType other = (NonTerminalType) obj;
			return symbol.equals(other.symbol);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return symbol.hashCode();
	}
	
	@Override
	public String toString() {
		return SymbolAdapter.toString(symbol, false);
	}
}
