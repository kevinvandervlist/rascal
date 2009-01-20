package org.meta_environment.rascal.ast;

import org.eclipse.imp.pdb.facts.ITree;

public abstract class Statement extends AbstractAST {
	static public class All extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private java.util.List<org.meta_environment.rascal.ast.Generator> generators;
		private org.meta_environment.rascal.ast.Statement body;

		/*
		 * label:Label "all" "(" generators:{Generator ","}+ ")" body:Statement
		 * -> Statement {cons("All")}
		 */
		private All() {
		}

		/* package */All(
				ITree tree,
				org.meta_environment.rascal.ast.Label label,
				java.util.List<org.meta_environment.rascal.ast.Generator> generators,
				org.meta_environment.rascal.ast.Statement body) {
			this.tree = tree;
			this.label = label;
			this.generators = generators;
			this.body = body;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setGenerators(
				java.util.List<org.meta_environment.rascal.ast.Generator> x) {
			this.generators = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementAll(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Generator> getGenerators() {
			return generators;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasGenerators() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean isAll() {
			return true;
		}

		public All setBody(org.meta_environment.rascal.ast.Statement x) {
			final All z = new All();
			z.$setBody(x);
			return z;
		}

		public All setGenerators(
				java.util.List<org.meta_environment.rascal.ast.Generator> x) {
			final All z = new All();
			z.$setGenerators(x);
			return z;
		}

		public All setLabel(org.meta_environment.rascal.ast.Label x) {
			final All z = new All();
			z.$setLabel(x);
			return z;
		}
	}

	static public class Ambiguity extends Statement {
		private final java.util.List<org.meta_environment.rascal.ast.Statement> alternatives;

		public Ambiguity(
				ITree tree,
				java.util.List<org.meta_environment.rascal.ast.Statement> alternatives) {
			this.alternatives = java.util.Collections
					.unmodifiableList(alternatives);
			this.tree = tree;
		}

		@Override
		public <T> T accept(IASTVisitor<T> v) {
			return v.visitStatementAmbiguity(this);
		}

		public java.util.List<org.meta_environment.rascal.ast.Statement> getAlternatives() {
			return alternatives;
		}
	}

	static public class Assert extends Statement {
		private org.meta_environment.rascal.ast.StringLiteral message;
		private org.meta_environment.rascal.ast.Expression expression;

		/*
		 * "assert" message:StringLiteral ":" expression:Expression ";" ->
		 * Statement {cons("Assert")}
		 */
		private Assert() {
		}

		/* package */Assert(ITree tree,
				org.meta_environment.rascal.ast.StringLiteral message,
				org.meta_environment.rascal.ast.Expression expression) {
			this.tree = tree;
			this.message = message;
			this.expression = expression;
		}

		private void $setExpression(org.meta_environment.rascal.ast.Expression x) {
			this.expression = x;
		}

		private void $setMessage(org.meta_environment.rascal.ast.StringLiteral x) {
			this.message = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementAssert(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getExpression() {
			return expression;
		}

		@Override
		public org.meta_environment.rascal.ast.StringLiteral getMessage() {
			return message;
		}

		@Override
		public boolean hasExpression() {
			return true;
		}

		@Override
		public boolean hasMessage() {
			return true;
		}

		@Override
		public boolean isAssert() {
			return true;
		}

		public Assert setExpression(org.meta_environment.rascal.ast.Expression x) {
			final Assert z = new Assert();
			z.$setExpression(x);
			return z;
		}

		public Assert setMessage(org.meta_environment.rascal.ast.StringLiteral x) {
			final Assert z = new Assert();
			z.$setMessage(x);
			return z;
		}
	}

	static public class Assignment extends Statement {
		private org.meta_environment.rascal.ast.Assignable assignable;
		private org.meta_environment.rascal.ast.Assignment operator;
		private org.meta_environment.rascal.ast.Expression expression;

		/*
		 * assignable:Assignable operator:Assignment expression:Expression ";"
		 * -> Statement {cons("Assignment")}
		 */
		private Assignment() {
		}

		/* package */Assignment(ITree tree,
				org.meta_environment.rascal.ast.Assignable assignable,
				org.meta_environment.rascal.ast.Assignment operator,
				org.meta_environment.rascal.ast.Expression expression) {
			this.tree = tree;
			this.assignable = assignable;
			this.operator = operator;
			this.expression = expression;
		}

		private void $setAssignable(org.meta_environment.rascal.ast.Assignable x) {
			this.assignable = x;
		}

		private void $setExpression(org.meta_environment.rascal.ast.Expression x) {
			this.expression = x;
		}

		private void $setOperator(org.meta_environment.rascal.ast.Assignment x) {
			this.operator = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementAssignment(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Assignable getAssignable() {
			return assignable;
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getExpression() {
			return expression;
		}

		@Override
		public org.meta_environment.rascal.ast.Assignment getOperator() {
			return operator;
		}

		@Override
		public boolean hasAssignable() {
			return true;
		}

		@Override
		public boolean hasExpression() {
			return true;
		}

		@Override
		public boolean hasOperator() {
			return true;
		}

		@Override
		public boolean isAssignment() {
			return true;
		}

		public Assignment setAssignable(
				org.meta_environment.rascal.ast.Assignable x) {
			final Assignment z = new Assignment();
			z.$setAssignable(x);
			return z;
		}

		public Assignment setExpression(
				org.meta_environment.rascal.ast.Expression x) {
			final Assignment z = new Assignment();
			z.$setExpression(x);
			return z;
		}

		public Assignment setOperator(
				org.meta_environment.rascal.ast.Assignment x) {
			final Assignment z = new Assignment();
			z.$setOperator(x);
			return z;
		}
	}

	static public class Block extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private java.util.List<org.meta_environment.rascal.ast.Statement> statements;

		/*
		 * label:Label "{" statements:Statement+ "}" -> Statement
		 * {cons("Block")}
		 */
		private Block() {
		}

		/* package */Block(
				ITree tree,
				org.meta_environment.rascal.ast.Label label,
				java.util.List<org.meta_environment.rascal.ast.Statement> statements) {
			this.tree = tree;
			this.label = label;
			this.statements = statements;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		private void $setStatements(
				java.util.List<org.meta_environment.rascal.ast.Statement> x) {
			this.statements = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementBlock(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Statement> getStatements() {
			return statements;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean hasStatements() {
			return true;
		}

		@Override
		public boolean isBlock() {
			return true;
		}

		public Block setLabel(org.meta_environment.rascal.ast.Label x) {
			final Block z = new Block();
			z.$setLabel(x);
			return z;
		}

		public Block setStatements(
				java.util.List<org.meta_environment.rascal.ast.Statement> x) {
			final Block z = new Block();
			z.$setStatements(x);
			return z;
		}
	}

	static public class Break extends Statement {
		private org.meta_environment.rascal.ast.Break brk;

		/* brk:Break -> Statement {cons("Break")} */
		private Break() {
		}

		/* package */Break(ITree tree, org.meta_environment.rascal.ast.Break brk) {
			this.tree = tree;
			this.brk = brk;
		}

		private void $setBrk(org.meta_environment.rascal.ast.Break x) {
			this.brk = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementBreak(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Break getBrk() {
			return brk;
		}

		@Override
		public boolean hasBrk() {
			return true;
		}

		@Override
		public boolean isBreak() {
			return true;
		}

		public Break setBrk(org.meta_environment.rascal.ast.Break x) {
			final Break z = new Break();
			z.$setBrk(x);
			return z;
		}
	}

	static public class Continue extends Statement {
		/* package */Continue(ITree tree) {
			this.tree = tree;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementContinue(this);
		}

		@Override
		public boolean isContinue() {
			return true;
		}
	}

	static public class DoWhile extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private org.meta_environment.rascal.ast.Statement body;
		private org.meta_environment.rascal.ast.Expression condition;

		/*
		 * label:Label "do" body:Statement "while" "(" condition:Expression ")"
		 * ";" -> Statement {cons("DoWhile")}
		 */
		private DoWhile() {
		}

		/* package */DoWhile(ITree tree,
				org.meta_environment.rascal.ast.Label label,
				org.meta_environment.rascal.ast.Statement body,
				org.meta_environment.rascal.ast.Expression condition) {
			this.tree = tree;
			this.label = label;
			this.body = body;
			this.condition = condition;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setCondition(org.meta_environment.rascal.ast.Expression x) {
			this.condition = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementDoWhile(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getCondition() {
			return condition;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasCondition() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean isDoWhile() {
			return true;
		}

		public DoWhile setBody(org.meta_environment.rascal.ast.Statement x) {
			final DoWhile z = new DoWhile();
			z.$setBody(x);
			return z;
		}

		public DoWhile setCondition(org.meta_environment.rascal.ast.Expression x) {
			final DoWhile z = new DoWhile();
			z.$setCondition(x);
			return z;
		}

		public DoWhile setLabel(org.meta_environment.rascal.ast.Label x) {
			final DoWhile z = new DoWhile();
			z.$setLabel(x);
			return z;
		}
	}

	static public class EmptyStatement extends Statement {
		/* package */EmptyStatement(ITree tree) {
			this.tree = tree;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementEmptyStatement(this);
		}

		@Override
		public boolean isEmptyStatement() {
			return true;
		}
	}

	static public class Expression extends Statement {
		private org.meta_environment.rascal.ast.Expression expression;

		/* expression:Expression ";" -> Statement {cons("Expression")} */
		private Expression() {
		}

		/* package */Expression(ITree tree,
				org.meta_environment.rascal.ast.Expression expression) {
			this.tree = tree;
			this.expression = expression;
		}

		private void $setExpression(org.meta_environment.rascal.ast.Expression x) {
			this.expression = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementExpression(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getExpression() {
			return expression;
		}

		@Override
		public boolean hasExpression() {
			return true;
		}

		@Override
		public boolean isExpression() {
			return true;
		}

		public Expression setExpression(
				org.meta_environment.rascal.ast.Expression x) {
			final Expression z = new Expression();
			z.$setExpression(x);
			return z;
		}
	}

	static public class Fail extends Statement {
		private org.meta_environment.rascal.ast.Fail fail;

		/* fail:Fail -> Statement {cons("Fail")} */
		private Fail() {
		}

		/* package */Fail(ITree tree, org.meta_environment.rascal.ast.Fail fail) {
			this.tree = tree;
			this.fail = fail;
		}

		private void $setFail(org.meta_environment.rascal.ast.Fail x) {
			this.fail = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementFail(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Fail getFail() {
			return fail;
		}

		@Override
		public boolean hasFail() {
			return true;
		}

		@Override
		public boolean isFail() {
			return true;
		}

		public Fail setFail(org.meta_environment.rascal.ast.Fail x) {
			final Fail z = new Fail();
			z.$setFail(x);
			return z;
		}
	}

	static public class First extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private java.util.List<org.meta_environment.rascal.ast.Generator> generators;
		private org.meta_environment.rascal.ast.Statement body;

		/*
		 * label:Label "first" "(" generators:{Generator ","}+ ")"
		 * body:Statement -> Statement {cons("First")}
		 */
		private First() {
		}

		/* package */First(
				ITree tree,
				org.meta_environment.rascal.ast.Label label,
				java.util.List<org.meta_environment.rascal.ast.Generator> generators,
				org.meta_environment.rascal.ast.Statement body) {
			this.tree = tree;
			this.label = label;
			this.generators = generators;
			this.body = body;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setGenerators(
				java.util.List<org.meta_environment.rascal.ast.Generator> x) {
			this.generators = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementFirst(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Generator> getGenerators() {
			return generators;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasGenerators() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean isFirst() {
			return true;
		}

		public First setBody(org.meta_environment.rascal.ast.Statement x) {
			final First z = new First();
			z.$setBody(x);
			return z;
		}

		public First setGenerators(
				java.util.List<org.meta_environment.rascal.ast.Generator> x) {
			final First z = new First();
			z.$setGenerators(x);
			return z;
		}

		public First setLabel(org.meta_environment.rascal.ast.Label x) {
			final First z = new First();
			z.$setLabel(x);
			return z;
		}
	}

	static public class For extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private java.util.List<org.meta_environment.rascal.ast.Generator> generators;
		private org.meta_environment.rascal.ast.Statement body;

		/*
		 * label:Label "for" "(" generators:{Generator ","}+ ")" body:Statement
		 * -> Statement {cons("For")}
		 */
		private For() {
		}

		/* package */For(
				ITree tree,
				org.meta_environment.rascal.ast.Label label,
				java.util.List<org.meta_environment.rascal.ast.Generator> generators,
				org.meta_environment.rascal.ast.Statement body) {
			this.tree = tree;
			this.label = label;
			this.generators = generators;
			this.body = body;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setGenerators(
				java.util.List<org.meta_environment.rascal.ast.Generator> x) {
			this.generators = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementFor(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Generator> getGenerators() {
			return generators;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasGenerators() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean isFor() {
			return true;
		}

		public For setBody(org.meta_environment.rascal.ast.Statement x) {
			final For z = new For();
			z.$setBody(x);
			return z;
		}

		public For setGenerators(
				java.util.List<org.meta_environment.rascal.ast.Generator> x) {
			final For z = new For();
			z.$setGenerators(x);
			return z;
		}

		public For setLabel(org.meta_environment.rascal.ast.Label x) {
			final For z = new For();
			z.$setLabel(x);
			return z;
		}
	}

	static public class FunctionDeclaration extends Statement {
		private org.meta_environment.rascal.ast.FunctionDeclaration functionDeclaration;

		/*
		 * functionDeclaration:FunctionDeclaration -> Statement
		 * {cons("FunctionDeclaration")}
		 */
		private FunctionDeclaration() {
		}

		/* package */FunctionDeclaration(
				ITree tree,
				org.meta_environment.rascal.ast.FunctionDeclaration functionDeclaration) {
			this.tree = tree;
			this.functionDeclaration = functionDeclaration;
		}

		private void $setFunctionDeclaration(
				org.meta_environment.rascal.ast.FunctionDeclaration x) {
			this.functionDeclaration = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementFunctionDeclaration(this);
		}

		@Override
		public org.meta_environment.rascal.ast.FunctionDeclaration getFunctionDeclaration() {
			return functionDeclaration;
		}

		@Override
		public boolean hasFunctionDeclaration() {
			return true;
		}

		@Override
		public boolean isFunctionDeclaration() {
			return true;
		}

		public FunctionDeclaration setFunctionDeclaration(
				org.meta_environment.rascal.ast.FunctionDeclaration x) {
			final FunctionDeclaration z = new FunctionDeclaration();
			z.$setFunctionDeclaration(x);
			return z;
		}
	}

	static public class GlobalDirective extends Statement {
		private org.meta_environment.rascal.ast.Type type;
		private java.util.List<org.meta_environment.rascal.ast.QualifiedName> names;

		/*
		 * "global" type:Type names:{QualifiedName ","}+ ";" -> Statement
		 * {cons("GlobalDirective")}
		 */
		private GlobalDirective() {
		}

		/* package */GlobalDirective(
				ITree tree,
				org.meta_environment.rascal.ast.Type type,
				java.util.List<org.meta_environment.rascal.ast.QualifiedName> names) {
			this.tree = tree;
			this.type = type;
			this.names = names;
		}

		private void $setNames(
				java.util.List<org.meta_environment.rascal.ast.QualifiedName> x) {
			this.names = x;
		}

		private void $setType(org.meta_environment.rascal.ast.Type x) {
			this.type = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementGlobalDirective(this);
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.QualifiedName> getNames() {
			return names;
		}

		@Override
		public org.meta_environment.rascal.ast.Type getType() {
			return type;
		}

		@Override
		public boolean hasNames() {
			return true;
		}

		@Override
		public boolean hasType() {
			return true;
		}

		@Override
		public boolean isGlobalDirective() {
			return true;
		}

		public GlobalDirective setNames(
				java.util.List<org.meta_environment.rascal.ast.QualifiedName> x) {
			final GlobalDirective z = new GlobalDirective();
			z.$setNames(x);
			return z;
		}

		public GlobalDirective setType(org.meta_environment.rascal.ast.Type x) {
			final GlobalDirective z = new GlobalDirective();
			z.$setType(x);
			return z;
		}
	}

	static public class IfThen extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private java.util.List<org.meta_environment.rascal.ast.Expression> conditions;
		private org.meta_environment.rascal.ast.Statement thenStatement;

		private org.meta_environment.rascal.ast.NoElseMayFollow noElseMayFollow;

		/*
		 * label:Label "if" "(" conditions:{Expression ","}+ ")"
		 * thenStatement:Statement noElseMayFollow:NoElseMayFollow -> Statement
		 * {cons("IfThen")}
		 */
		private IfThen() {
		}

		/* package */IfThen(
				ITree tree,
				org.meta_environment.rascal.ast.Label label,
				java.util.List<org.meta_environment.rascal.ast.Expression> conditions,
				org.meta_environment.rascal.ast.Statement thenStatement,
				org.meta_environment.rascal.ast.NoElseMayFollow noElseMayFollow) {
			this.tree = tree;
			this.label = label;
			this.conditions = conditions;
			this.thenStatement = thenStatement;
			this.noElseMayFollow = noElseMayFollow;
		}

		private void $setConditions(
				java.util.List<org.meta_environment.rascal.ast.Expression> x) {
			this.conditions = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		private void $setNoElseMayFollow(
				org.meta_environment.rascal.ast.NoElseMayFollow x) {
			this.noElseMayFollow = x;
		}

		private void $setThenStatement(
				org.meta_environment.rascal.ast.Statement x) {
			this.thenStatement = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementIfThen(this);
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Expression> getConditions() {
			return conditions;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public org.meta_environment.rascal.ast.NoElseMayFollow getNoElseMayFollow() {
			return noElseMayFollow;
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getThenStatement() {
			return thenStatement;
		}

		@Override
		public boolean hasConditions() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean hasNoElseMayFollow() {
			return true;
		}

		@Override
		public boolean hasThenStatement() {
			return true;
		}

		@Override
		public boolean isIfThen() {
			return true;
		}

		public IfThen setConditions(
				java.util.List<org.meta_environment.rascal.ast.Expression> x) {
			final IfThen z = new IfThen();
			z.$setConditions(x);
			return z;
		}

		public IfThen setLabel(org.meta_environment.rascal.ast.Label x) {
			final IfThen z = new IfThen();
			z.$setLabel(x);
			return z;
		}

		public IfThen setNoElseMayFollow(
				org.meta_environment.rascal.ast.NoElseMayFollow x) {
			final IfThen z = new IfThen();
			z.$setNoElseMayFollow(x);
			return z;
		}

		public IfThen setThenStatement(
				org.meta_environment.rascal.ast.Statement x) {
			final IfThen z = new IfThen();
			z.$setThenStatement(x);
			return z;
		}
	}

	static public class IfThenElse extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private java.util.List<org.meta_environment.rascal.ast.Expression> conditions;
		private org.meta_environment.rascal.ast.Statement thenStatement;

		private org.meta_environment.rascal.ast.Statement elseStatement;

		/*
		 * label:Label "if" "(" conditions:{Expression ","}+ ")"
		 * thenStatement:Statement "else" elseStatement:Statement -> Statement
		 * {cons("IfThenElse")}
		 */
		private IfThenElse() {
		}

		/* package */IfThenElse(
				ITree tree,
				org.meta_environment.rascal.ast.Label label,
				java.util.List<org.meta_environment.rascal.ast.Expression> conditions,
				org.meta_environment.rascal.ast.Statement thenStatement,
				org.meta_environment.rascal.ast.Statement elseStatement) {
			this.tree = tree;
			this.label = label;
			this.conditions = conditions;
			this.thenStatement = thenStatement;
			this.elseStatement = elseStatement;
		}

		private void $setConditions(
				java.util.List<org.meta_environment.rascal.ast.Expression> x) {
			this.conditions = x;
		}

		private void $setElseStatement(
				org.meta_environment.rascal.ast.Statement x) {
			this.elseStatement = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		private void $setThenStatement(
				org.meta_environment.rascal.ast.Statement x) {
			this.thenStatement = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementIfThenElse(this);
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Expression> getConditions() {
			return conditions;
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getElseStatement() {
			return elseStatement;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getThenStatement() {
			return thenStatement;
		}

		@Override
		public boolean hasConditions() {
			return true;
		}

		@Override
		public boolean hasElseStatement() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean hasThenStatement() {
			return true;
		}

		@Override
		public boolean isIfThenElse() {
			return true;
		}

		public IfThenElse setConditions(
				java.util.List<org.meta_environment.rascal.ast.Expression> x) {
			final IfThenElse z = new IfThenElse();
			z.$setConditions(x);
			return z;
		}

		public IfThenElse setElseStatement(
				org.meta_environment.rascal.ast.Statement x) {
			final IfThenElse z = new IfThenElse();
			z.$setElseStatement(x);
			return z;
		}

		public IfThenElse setLabel(org.meta_environment.rascal.ast.Label x) {
			final IfThenElse z = new IfThenElse();
			z.$setLabel(x);
			return z;
		}

		public IfThenElse setThenStatement(
				org.meta_environment.rascal.ast.Statement x) {
			final IfThenElse z = new IfThenElse();
			z.$setThenStatement(x);
			return z;
		}
	}

	static public class Insert extends Statement {
		private org.meta_environment.rascal.ast.Expression expression;

		/* "insert" expression:Expression ";" -> Statement {cons("Insert")} */
		private Insert() {
		}

		/* package */Insert(ITree tree,
				org.meta_environment.rascal.ast.Expression expression) {
			this.tree = tree;
			this.expression = expression;
		}

		private void $setExpression(org.meta_environment.rascal.ast.Expression x) {
			this.expression = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementInsert(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getExpression() {
			return expression;
		}

		@Override
		public boolean hasExpression() {
			return true;
		}

		@Override
		public boolean isInsert() {
			return true;
		}

		public Insert setExpression(org.meta_environment.rascal.ast.Expression x) {
			final Insert z = new Insert();
			z.$setExpression(x);
			return z;
		}
	}

	static public class Return extends Statement {
		private org.meta_environment.rascal.ast.Return ret;

		/* ret:Return -> Statement {cons("Return")} */
		private Return() {
		}

		/* package */Return(ITree tree,
				org.meta_environment.rascal.ast.Return ret) {
			this.tree = tree;
			this.ret = ret;
		}

		private void $setRet(org.meta_environment.rascal.ast.Return x) {
			this.ret = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementReturn(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Return getRet() {
			return ret;
		}

		@Override
		public boolean hasRet() {
			return true;
		}

		@Override
		public boolean isReturn() {
			return true;
		}

		public Return setRet(org.meta_environment.rascal.ast.Return x) {
			final Return z = new Return();
			z.$setRet(x);
			return z;
		}
	}

	static public class Solve extends Statement {
		private java.util.List<org.meta_environment.rascal.ast.Declarator> declarations;
		private org.meta_environment.rascal.ast.Bound bound;
		private org.meta_environment.rascal.ast.Statement body;

		/*
		 * "with" declarations:{Declarator ";"}+ ";" "solve" bound:Bound
		 * body:Statement -> Statement {cons("Solve")}
		 */
		private Solve() {
		}

		/* package */Solve(
				ITree tree,
				java.util.List<org.meta_environment.rascal.ast.Declarator> declarations,
				org.meta_environment.rascal.ast.Bound bound,
				org.meta_environment.rascal.ast.Statement body) {
			this.tree = tree;
			this.declarations = declarations;
			this.bound = bound;
			this.body = body;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setBound(org.meta_environment.rascal.ast.Bound x) {
			this.bound = x;
		}

		private void $setDeclarations(
				java.util.List<org.meta_environment.rascal.ast.Declarator> x) {
			this.declarations = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementSolve(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public org.meta_environment.rascal.ast.Bound getBound() {
			return bound;
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Declarator> getDeclarations() {
			return declarations;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasBound() {
			return true;
		}

		@Override
		public boolean hasDeclarations() {
			return true;
		}

		@Override
		public boolean isSolve() {
			return true;
		}

		public Solve setBody(org.meta_environment.rascal.ast.Statement x) {
			final Solve z = new Solve();
			z.$setBody(x);
			return z;
		}

		public Solve setBound(org.meta_environment.rascal.ast.Bound x) {
			final Solve z = new Solve();
			z.$setBound(x);
			return z;
		}

		public Solve setDeclarations(
				java.util.List<org.meta_environment.rascal.ast.Declarator> x) {
			final Solve z = new Solve();
			z.$setDeclarations(x);
			return z;
		}
	}

	static public class Switch extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private org.meta_environment.rascal.ast.Expression expression;
		private java.util.List<org.meta_environment.rascal.ast.Case> cases;

		/*
		 * label:Label "switch" "(" expression:Expression ")" "{" cases:Case+
		 * "}" -> Statement {cons("Switch")}
		 */
		private Switch() {
		}

		/* package */Switch(ITree tree,
				org.meta_environment.rascal.ast.Label label,
				org.meta_environment.rascal.ast.Expression expression,
				java.util.List<org.meta_environment.rascal.ast.Case> cases) {
			this.tree = tree;
			this.label = label;
			this.expression = expression;
			this.cases = cases;
		}

		private void $setCases(
				java.util.List<org.meta_environment.rascal.ast.Case> x) {
			this.cases = x;
		}

		private void $setExpression(org.meta_environment.rascal.ast.Expression x) {
			this.expression = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementSwitch(this);
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Case> getCases() {
			return cases;
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getExpression() {
			return expression;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public boolean hasCases() {
			return true;
		}

		@Override
		public boolean hasExpression() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean isSwitch() {
			return true;
		}

		public Switch setCases(
				java.util.List<org.meta_environment.rascal.ast.Case> x) {
			final Switch z = new Switch();
			z.$setCases(x);
			return z;
		}

		public Switch setExpression(org.meta_environment.rascal.ast.Expression x) {
			final Switch z = new Switch();
			z.$setExpression(x);
			return z;
		}

		public Switch setLabel(org.meta_environment.rascal.ast.Label x) {
			final Switch z = new Switch();
			z.$setLabel(x);
			return z;
		}
	}

	static public class Throw extends Statement {
		private org.meta_environment.rascal.ast.Expression expression;

		/* "throw" expression:Expression ";" -> Statement {cons("Throw")} */
		private Throw() {
		}

		/* package */Throw(ITree tree,
				org.meta_environment.rascal.ast.Expression expression) {
			this.tree = tree;
			this.expression = expression;
		}

		private void $setExpression(org.meta_environment.rascal.ast.Expression x) {
			this.expression = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementThrow(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getExpression() {
			return expression;
		}

		@Override
		public boolean hasExpression() {
			return true;
		}

		@Override
		public boolean isThrow() {
			return true;
		}

		public Throw setExpression(org.meta_environment.rascal.ast.Expression x) {
			final Throw z = new Throw();
			z.$setExpression(x);
			return z;
		}
	}

	static public class Try extends Statement {
		private org.meta_environment.rascal.ast.Statement body;
		private java.util.List<org.meta_environment.rascal.ast.Catch> handlers;

		/*
		 * "try" body:Statement handlers:Catch+ -> Statement {non-assoc,
		 * cons("Try")}
		 */
		private Try() {
		}

		/* package */Try(ITree tree,
				org.meta_environment.rascal.ast.Statement body,
				java.util.List<org.meta_environment.rascal.ast.Catch> handlers) {
			this.tree = tree;
			this.body = body;
			this.handlers = handlers;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setHandlers(
				java.util.List<org.meta_environment.rascal.ast.Catch> x) {
			this.handlers = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementTry(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Catch> getHandlers() {
			return handlers;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasHandlers() {
			return true;
		}

		@Override
		public boolean isTry() {
			return true;
		}

		public Try setBody(org.meta_environment.rascal.ast.Statement x) {
			final Try z = new Try();
			z.$setBody(x);
			return z;
		}

		public Try setHandlers(
				java.util.List<org.meta_environment.rascal.ast.Catch> x) {
			final Try z = new Try();
			z.$setHandlers(x);
			return z;
		}
	}

	static public class TryFinally extends Statement {
		private org.meta_environment.rascal.ast.Statement body;
		private java.util.List<org.meta_environment.rascal.ast.Catch> handlers;
		private org.meta_environment.rascal.ast.Statement finallyBody;

		/*
		 * "try" body:Statement handlers:Catch+ "finally" finallyBody:Statement
		 * -> Statement {cons("TryFinally")}
		 */
		private TryFinally() {
		}

		/* package */TryFinally(ITree tree,
				org.meta_environment.rascal.ast.Statement body,
				java.util.List<org.meta_environment.rascal.ast.Catch> handlers,
				org.meta_environment.rascal.ast.Statement finallyBody) {
			this.tree = tree;
			this.body = body;
			this.handlers = handlers;
			this.finallyBody = finallyBody;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setFinallyBody(org.meta_environment.rascal.ast.Statement x) {
			this.finallyBody = x;
		}

		private void $setHandlers(
				java.util.List<org.meta_environment.rascal.ast.Catch> x) {
			this.handlers = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementTryFinally(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getFinallyBody() {
			return finallyBody;
		}

		@Override
		public java.util.List<org.meta_environment.rascal.ast.Catch> getHandlers() {
			return handlers;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasFinallyBody() {
			return true;
		}

		@Override
		public boolean hasHandlers() {
			return true;
		}

		@Override
		public boolean isTryFinally() {
			return true;
		}

		public TryFinally setBody(org.meta_environment.rascal.ast.Statement x) {
			final TryFinally z = new TryFinally();
			z.$setBody(x);
			return z;
		}

		public TryFinally setFinallyBody(
				org.meta_environment.rascal.ast.Statement x) {
			final TryFinally z = new TryFinally();
			z.$setFinallyBody(x);
			return z;
		}

		public TryFinally setHandlers(
				java.util.List<org.meta_environment.rascal.ast.Catch> x) {
			final TryFinally z = new TryFinally();
			z.$setHandlers(x);
			return z;
		}
	}

	static public class VariableDeclaration extends Statement {
		private org.meta_environment.rascal.ast.LocalVariableDeclaration declaration;

		/*
		 * declaration:LocalVariableDeclaration ";" -> Statement
		 * {cons("VariableDeclaration")}
		 */
		private VariableDeclaration() {
		}

		/* package */VariableDeclaration(
				ITree tree,
				org.meta_environment.rascal.ast.LocalVariableDeclaration declaration) {
			this.tree = tree;
			this.declaration = declaration;
		}

		private void $setDeclaration(
				org.meta_environment.rascal.ast.LocalVariableDeclaration x) {
			this.declaration = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementVariableDeclaration(this);
		}

		@Override
		public org.meta_environment.rascal.ast.LocalVariableDeclaration getDeclaration() {
			return declaration;
		}

		@Override
		public boolean hasDeclaration() {
			return true;
		}

		@Override
		public boolean isVariableDeclaration() {
			return true;
		}

		public VariableDeclaration setDeclaration(
				org.meta_environment.rascal.ast.LocalVariableDeclaration x) {
			final VariableDeclaration z = new VariableDeclaration();
			z.$setDeclaration(x);
			return z;
		}
	}

	static public class Visit extends Statement {
		private org.meta_environment.rascal.ast.Visit visit;

		/* visit:Visit -> Statement {cons("Visit")} */
		private Visit() {
		}

		/* package */Visit(ITree tree,
				org.meta_environment.rascal.ast.Visit visit) {
			this.tree = tree;
			this.visit = visit;
		}

		private void $setVisit(org.meta_environment.rascal.ast.Visit x) {
			this.visit = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementVisit(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Visit getVisit() {
			return visit;
		}

		@Override
		public boolean hasVisit() {
			return true;
		}

		@Override
		public boolean isVisit() {
			return true;
		}

		public Visit setVisit(org.meta_environment.rascal.ast.Visit x) {
			final Visit z = new Visit();
			z.$setVisit(x);
			return z;
		}
	}

	static public class While extends Statement {
		private org.meta_environment.rascal.ast.Label label;
		private org.meta_environment.rascal.ast.Expression condition;
		private org.meta_environment.rascal.ast.Statement body;

		/*
		 * label:Label "while" "(" condition:Expression ")" body:Statement ->
		 * Statement {cons("While")}
		 */
		private While() {
		}

		/* package */While(ITree tree,
				org.meta_environment.rascal.ast.Label label,
				org.meta_environment.rascal.ast.Expression condition,
				org.meta_environment.rascal.ast.Statement body) {
			this.tree = tree;
			this.label = label;
			this.condition = condition;
			this.body = body;
		}

		private void $setBody(org.meta_environment.rascal.ast.Statement x) {
			this.body = x;
		}

		private void $setCondition(org.meta_environment.rascal.ast.Expression x) {
			this.condition = x;
		}

		private void $setLabel(org.meta_environment.rascal.ast.Label x) {
			this.label = x;
		}

		@Override
		public <T> T accept(IASTVisitor<T> visitor) {
			return visitor.visitStatementWhile(this);
		}

		@Override
		public org.meta_environment.rascal.ast.Statement getBody() {
			return body;
		}

		@Override
		public org.meta_environment.rascal.ast.Expression getCondition() {
			return condition;
		}

		@Override
		public org.meta_environment.rascal.ast.Label getLabel() {
			return label;
		}

		@Override
		public boolean hasBody() {
			return true;
		}

		@Override
		public boolean hasCondition() {
			return true;
		}

		@Override
		public boolean hasLabel() {
			return true;
		}

		@Override
		public boolean isWhile() {
			return true;
		}

		public While setBody(org.meta_environment.rascal.ast.Statement x) {
			final While z = new While();
			z.$setBody(x);
			return z;
		}

		public While setCondition(org.meta_environment.rascal.ast.Expression x) {
			final While z = new While();
			z.$setCondition(x);
			return z;
		}

		public While setLabel(org.meta_environment.rascal.ast.Label x) {
			final While z = new While();
			z.$setLabel(x);
			return z;
		}
	}

	@Override
	public abstract <T> T accept(IASTVisitor<T> visitor);

	public org.meta_environment.rascal.ast.Assignable getAssignable() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Statement getBody() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Bound getBound() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Break getBrk() {
		throw new UnsupportedOperationException();
	}

	public java.util.List<org.meta_environment.rascal.ast.Case> getCases() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Expression getCondition() {
		throw new UnsupportedOperationException();
	}

	public java.util.List<org.meta_environment.rascal.ast.Expression> getConditions() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.LocalVariableDeclaration getDeclaration() {
		throw new UnsupportedOperationException();
	}

	public java.util.List<org.meta_environment.rascal.ast.Declarator> getDeclarations() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Statement getElseStatement() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Expression getExpression() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Fail getFail() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Statement getFinallyBody() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.FunctionDeclaration getFunctionDeclaration() {
		throw new UnsupportedOperationException();
	}

	public java.util.List<org.meta_environment.rascal.ast.Generator> getGenerators() {
		throw new UnsupportedOperationException();
	}

	public java.util.List<org.meta_environment.rascal.ast.Catch> getHandlers() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Label getLabel() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.StringLiteral getMessage() {
		throw new UnsupportedOperationException();
	}

	public java.util.List<org.meta_environment.rascal.ast.QualifiedName> getNames() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.NoElseMayFollow getNoElseMayFollow() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Assignment getOperator() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Return getRet() {
		throw new UnsupportedOperationException();
	}

	public java.util.List<org.meta_environment.rascal.ast.Statement> getStatements() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Statement getThenStatement() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Type getType() {
		throw new UnsupportedOperationException();
	}

	public org.meta_environment.rascal.ast.Visit getVisit() {
		throw new UnsupportedOperationException();
	}

	public boolean hasAssignable() {
		return false;
	}

	public boolean hasBody() {
		return false;
	}

	public boolean hasBound() {
		return false;
	}

	public boolean hasBrk() {
		return false;
	}

	public boolean hasCases() {
		return false;
	}

	public boolean hasCondition() {
		return false;
	}

	public boolean hasConditions() {
		return false;
	}

	public boolean hasDeclaration() {
		return false;
	}

	public boolean hasDeclarations() {
		return false;
	}

	public boolean hasElseStatement() {
		return false;
	}

	public boolean hasExpression() {
		return false;
	}

	public boolean hasFail() {
		return false;
	}

	public boolean hasFinallyBody() {
		return false;
	}

	public boolean hasFunctionDeclaration() {
		return false;
	}

	public boolean hasGenerators() {
		return false;
	}

	public boolean hasHandlers() {
		return false;
	}

	public boolean hasLabel() {
		return false;
	}

	public boolean hasMessage() {
		return false;
	}

	public boolean hasNames() {
		return false;
	}

	public boolean hasNoElseMayFollow() {
		return false;
	}

	public boolean hasOperator() {
		return false;
	}

	public boolean hasRet() {
		return false;
	}

	public boolean hasStatements() {
		return false;
	}

	public boolean hasThenStatement() {
		return false;
	}

	public boolean hasType() {
		return false;
	}

	public boolean hasVisit() {
		return false;
	}

	public boolean isAll() {
		return false;
	}

	public boolean isAssert() {
		return false;
	}

	public boolean isAssignment() {
		return false;
	}

	public boolean isBlock() {
		return false;
	}

	public boolean isBreak() {
		return false;
	}

	public boolean isContinue() {
		return false;
	}

	public boolean isDoWhile() {
		return false;
	}

	public boolean isEmptyStatement() {
		return false;
	}

	public boolean isExpression() {
		return false;
	}

	public boolean isFail() {
		return false;
	}

	public boolean isFirst() {
		return false;
	}

	public boolean isFor() {
		return false;
	}

	public boolean isFunctionDeclaration() {
		return false;
	}

	public boolean isGlobalDirective() {
		return false;
	}

	public boolean isIfThen() {
		return false;
	}

	public boolean isIfThenElse() {
		return false;
	}

	public boolean isInsert() {
		return false;
	}

	public boolean isReturn() {
		return false;
	}

	public boolean isSolve() {
		return false;
	}

	public boolean isSwitch() {
		return false;
	}

	public boolean isThrow() {
		return false;
	}

	public boolean isTry() {
		return false;
	}

	public boolean isTryFinally() {
		return false;
	}

	public boolean isVariableDeclaration() {
		return false;
	}

	public boolean isVisit() {
		return false;
	}

	public boolean isWhile() {
		return false;
	}
}