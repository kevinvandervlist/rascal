package org.rascalmpl.semantics.dynamic;

import java.lang.String;
import java.util.List;
import org.eclipse.imp.pdb.facts.INode;

public abstract class CaseInsensitiveStringConstant extends org.rascalmpl.ast.CaseInsensitiveStringConstant {

	public CaseInsensitiveStringConstant(INode __param1) {
		super(__param1);
	}

	static public class Ambiguity extends org.rascalmpl.ast.CaseInsensitiveStringConstant.Ambiguity {

		public Ambiguity(INode __param1, List<org.rascalmpl.ast.CaseInsensitiveStringConstant> __param2) {
			super(__param1, __param2);
		}


	}

	static public class Lexical extends org.rascalmpl.ast.CaseInsensitiveStringConstant.Lexical {

		public Lexical(INode __param1, String __param2) {
			super(__param1, __param2);
		}


	}
}
