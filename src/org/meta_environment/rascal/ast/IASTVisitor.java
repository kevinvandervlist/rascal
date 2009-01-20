package org.meta_environment.rascal.ast;

public interface IASTVisitor<T> {
	public T visitAlternativeAmbiguity(Alternative.Ambiguity x);

	public T visitAlternativeNamedType(Alternative.NamedType x);

	public T visitAssignableAmbiguity(Assignable.Ambiguity x);

	public T visitAssignableAnnotation(Assignable.Annotation x);

	public T visitAssignableConstructor(Assignable.Constructor x);

	public T visitAssignableFieldAccess(Assignable.FieldAccess x);

	public T visitAssignableIfDefined(Assignable.IfDefined x);

	public T visitAssignableSubscript(Assignable.Subscript x);

	public T visitAssignableTuple(Assignable.Tuple x);

	public T visitAssignableVariable(Assignable.Variable x);

	public T visitAssignmentAddition(Assignment.Addition x);

	public T visitAssignmentAmbiguity(Assignment.Ambiguity x);

	public T visitAssignmentDefault(Assignment.Default x);

	public T visitAssignmentDivision(Assignment.Division x);

	public T visitAssignmentIntersection(Assignment.Intersection x);

	public T visitAssignmentProduct(Assignment.Product x);

	public T visitAssignmentSubtraction(Assignment.Subtraction x);

	public T visitAsteriskAmbiguity(Asterisk.Ambiguity x);

	public T visitAsteriskLexical(Asterisk.Lexical x);

	public T visitBackslashAmbiguity(Backslash.Ambiguity x);

	public T visitBackslashLexical(Backslash.Lexical x);

	public T visitBasicTypeAmbiguity(BasicType.Ambiguity x);

	public T visitBasicTypeArea(BasicType.Area x);

	public T visitBasicTypeBool(BasicType.Bool x);

	public T visitBasicTypeInt(BasicType.Int x);

	public T visitBasicTypeLoc(BasicType.Loc x);

	public T visitBasicTypeReal(BasicType.Real x);

	public T visitBasicTypeString(BasicType.String x);

	public T visitBasicTypeTree(BasicType.Tree x);

	public T visitBasicTypeValue(BasicType.Value x);

	public T visitBasicTypeVoid(BasicType.Void x);

	public T visitBodyAmbiguity(Body.Ambiguity x);

	public T visitBodyToplevels(Body.Toplevels x);

	public T visitBooleanLiteralAmbiguity(BooleanLiteral.Ambiguity x);

	public T visitBooleanLiteralLexical(BooleanLiteral.Lexical x);

	public T visitBoundAmbiguity(Bound.Ambiguity x);

	public T visitBoundDefault(Bound.Default x);

	public T visitBoundEmpty(Bound.Empty x);

	public T visitBreakAmbiguity(Break.Ambiguity x);

	public T visitBreakNoLabel(Break.NoLabel x);

	public T visitBreakWithLabel(Break.WithLabel x);

	public T visitCaseAmbiguity(Case.Ambiguity x);

	public T visitCaseDefault(Case.Default x);

	public T visitCaseRule(Case.Rule x);

	public T visitCatchAmbiguity(Catch.Ambiguity x);

	public T visitCatchBinding(Catch.Binding x);

	public T visitCatchDefault(Catch.Default x);

	public T visitCharacterAmbiguity(Character.Ambiguity x);

	public T visitCharacterBottom(Character.Bottom x);

	public T visitCharacterEOF(Character.EOF x);

	public T visitCharacterLabelStart(Character.LabelStart x);

	public T visitCharacterLiteralAmbiguity(CharacterLiteral.Ambiguity x);

	public T visitCharacterLiteralLexical(CharacterLiteral.Lexical x);

	public T visitCharacterNumeric(Character.Numeric x);

	public T visitCharacterShort(Character.Short x);

	public T visitCharacterTop(Character.Top x);

	public T visitCharClassAmbiguity(CharClass.Ambiguity x);

	public T visitCharClassBracket(CharClass.Bracket x);

	public T visitCharClassComplement(CharClass.Complement x);

	public T visitCharClassDifference(CharClass.Difference x);

	public T visitCharClassIntersection(CharClass.Intersection x);

	public T visitCharClassSimpleCharclass(CharClass.SimpleCharclass x);

	public T visitCharClassUnion(CharClass.Union x);

	public T visitCharRangeAmbiguity(CharRange.Ambiguity x);

	public T visitCharRangeCharacter(CharRange.Character x);

	public T visitCharRangeRange(CharRange.Range x);

	public T visitCharRangesAmbiguity(CharRanges.Ambiguity x);

	public T visitCharRangesBracket(CharRanges.Bracket x);

	public T visitCharRangesConcatenate(CharRanges.Concatenate x);

	public T visitCharRangesRange(CharRanges.Range x);

	public T visitClosureAsFunctionAmbiguity(ClosureAsFunction.Ambiguity x);

	public T visitClosureAsFunctionEvaluated(ClosureAsFunction.Evaluated x);

	public T visitCommandAmbiguity(Command.Ambiguity x);

	public T visitCommandDeclaration(Command.Declaration x);

	public T visitCommandImport(Command.Import x);

	public T visitCommandShell(Command.Shell x);

	public T visitCommandStatement(Command.Statement x);

	public T visitCommentAmbiguity(Comment.Ambiguity x);

	public T visitCommentCharAmbiguity(CommentChar.Ambiguity x);

	public T visitCommentCharLexical(CommentChar.Lexical x);

	public T visitCommentLexical(Comment.Lexical x);

	public T visitComprehensionAmbiguity(Comprehension.Ambiguity x);

	public T visitComprehensionList(Comprehension.List x);

	public T visitComprehensionMap(Comprehension.Map x);

	public T visitComprehensionSet(Comprehension.Set x);

	public T visitDataTypeSelectorAmbiguity(DataTypeSelector.Ambiguity x);

	public T visitDataTypeSelectorSelector(DataTypeSelector.Selector x);

	public T visitDecimalIntegerLiteralAmbiguity(
			DecimalIntegerLiteral.Ambiguity x);

	public T visitDecimalIntegerLiteralLexical(DecimalIntegerLiteral.Lexical x);

	public T visitDecimalLongLiteralAmbiguity(DecimalLongLiteral.Ambiguity x);

	public T visitDecimalLongLiteralLexical(DecimalLongLiteral.Lexical x);

	public T visitDeclarationAmbiguity(Declaration.Ambiguity x);

	public T visitDeclarationAnnotation(Declaration.Annotation x);

	public T visitDeclarationData(Declaration.Data x);

	public T visitDeclarationFunction(Declaration.Function x);

	public T visitDeclarationRule(Declaration.Rule x);

	public T visitDeclarationTag(Declaration.Tag x);

	public T visitDeclarationType(Declaration.Type x);

	public T visitDeclarationVariable(Declaration.Variable x);

	public T visitDeclarationView(Declaration.View x);

	public T visitDeclaratorAmbiguity(Declarator.Ambiguity x);

	public T visitDeclaratorDefault(Declarator.Default x);

	public T visitEscapeSequenceAmbiguity(EscapeSequence.Ambiguity x);

	public T visitEscapeSequenceLexical(EscapeSequence.Lexical x);

	public T visitExpressionAddition(Expression.Addition x);

	public T visitExpressionAmbiguity(Expression.Ambiguity x);

	public T visitExpressionAnd(Expression.And x);

	public T visitExpressionAnnotation(Expression.Annotation x);

	public T visitExpressionArea(Expression.Area x);

	public T visitExpressionAreaInFileLocation(Expression.AreaInFileLocation x);

	public T visitExpressionBracket(Expression.Bracket x);

	public T visitExpressionCallOrTree(Expression.CallOrTree x);

	public T visitExpressionClosure(Expression.Closure x);

	public T visitExpressionClosureCall(Expression.ClosureCall x);

	public T visitExpressionComposition(Expression.Composition x);

	public T visitExpressionComprehension(Expression.Comprehension x);

	public T visitExpressionDivision(Expression.Division x);

	public T visitExpressionEquals(Expression.Equals x);

	public T visitExpressionEquivalence(Expression.Equivalence x);

	public T visitExpressionExists(Expression.Exists x);

	public T visitExpressionFieldAccess(Expression.FieldAccess x);

	public T visitExpressionFieldProject(Expression.FieldProject x);

	public T visitExpressionFieldUpdate(Expression.FieldUpdate x);

	public T visitExpressionFileLocation(Expression.FileLocation x);

	public T visitExpressionForAll(Expression.ForAll x);

	public T visitExpressionFunctionAsValue(Expression.FunctionAsValue x);

	public T visitExpressionGreaterThan(Expression.GreaterThan x);

	public T visitExpressionGreaterThanOrEq(Expression.GreaterThanOrEq x);

	public T visitExpressionIfDefined(Expression.IfDefined x);

	public T visitExpressionIfThenElse(Expression.IfThenElse x);

	public T visitExpressionImplication(Expression.Implication x);

	public T visitExpressionIn(Expression.In x);

	public T visitExpressionIntersection(Expression.Intersection x);

	public T visitExpressionLessThan(Expression.LessThan x);

	public T visitExpressionLessThanOrEq(Expression.LessThanOrEq x);

	public T visitExpressionLexical(Expression.Lexical x);

	public T visitExpressionList(Expression.List x);

	public T visitExpressionLiteral(Expression.Literal x);

	public T visitExpressionMap(Expression.Map x);

	public T visitExpressionMatch(Expression.Match x);

	public T visitExpressionModulo(Expression.Modulo x);

	public T visitExpressionNegation(Expression.Negation x);

	public T visitExpressionNegative(Expression.Negative x);

	public T visitExpressionNoMatch(Expression.NoMatch x);

	public T visitExpressionNonEmptyBlock(Expression.NonEmptyBlock x);

	public T visitExpressionNonEquals(Expression.NonEquals x);

	public T visitExpressionNotIn(Expression.NotIn x);

	public T visitExpressionOperatorAsValue(Expression.OperatorAsValue x);

	public T visitExpressionOr(Expression.Or x);

	public T visitExpressionProduct(Expression.Product x);

	public T visitExpressionQualifiedName(Expression.QualifiedName x);

	public T visitExpressionRange(Expression.Range x);

	public T visitExpressionSet(Expression.Set x);

	public T visitExpressionStepRange(Expression.StepRange x);

	public T visitExpressionSubscript(Expression.Subscript x);

	public T visitExpressionSubtraction(Expression.Subtraction x);

	public T visitExpressionTransitiveClosure(Expression.TransitiveClosure x);

	public T visitExpressionTransitiveReflexiveClosure(
			Expression.TransitiveReflexiveClosure x);

	public T visitExpressionTuple(Expression.Tuple x);

	public T visitExpressionTypedVariable(Expression.TypedVariable x);

	public T visitExpressionVisit(Expression.Visit x);

	public T visitExpressionVoidClosure(Expression.VoidClosure x);

	public T visitFailAmbiguity(Fail.Ambiguity x);

	public T visitFailNoLabel(Fail.NoLabel x);

	public T visitFailWithLabel(Fail.WithLabel x);

	public T visitFieldAmbiguity(Field.Ambiguity x);

	public T visitFieldIndex(Field.Index x);

	public T visitFieldName(Field.Name x);

	public T visitFormalAmbiguity(Formal.Ambiguity x);

	public T visitFormalsAmbiguity(Formals.Ambiguity x);

	public T visitFormalsDefault(Formals.Default x);

	public T visitFormalTypeName(Formal.TypeName x);

	public T visitFunctionAsValueAmbiguity(FunctionAsValue.Ambiguity x);

	public T visitFunctionAsValueDefault(FunctionAsValue.Default x);

	public T visitFunctionBodyAmbiguity(FunctionBody.Ambiguity x);

	public T visitFunctionBodyDefault(FunctionBody.Default x);

	public T visitFunctionDeclarationAbstract(FunctionDeclaration.Abstract x);

	public T visitFunctionDeclarationAmbiguity(FunctionDeclaration.Ambiguity x);

	public T visitFunctionDeclarationDefault(FunctionDeclaration.Default x);

	public T visitFunctionModifierAmbiguity(FunctionModifier.Ambiguity x);

	public T visitFunctionModifierJava(FunctionModifier.Java x);

	public T visitFunctionModifiersAmbiguity(FunctionModifiers.Ambiguity x);

	public T visitFunctionModifiersList(FunctionModifiers.List x);

	public T visitFunctionTypeAmbiguity(FunctionType.Ambiguity x);

	public T visitFunctionTypeTypeArguments(FunctionType.TypeArguments x);

	public T visitGeneratorAmbiguity(Generator.Ambiguity x);

	public T visitGeneratorExpression(Generator.Expression x);

	public T visitGeneratorProducer(Generator.Producer x);

	public T visitHeaderAmbiguity(Header.Ambiguity x);

	public T visitHeaderDefault(Header.Default x);

	public T visitHeaderParameters(Header.Parameters x);

	public T visitHexIntegerLiteralAmbiguity(HexIntegerLiteral.Ambiguity x);

	public T visitHexIntegerLiteralLexical(HexIntegerLiteral.Lexical x);

	public T visitHexLongLiteralAmbiguity(HexLongLiteral.Ambiguity x);

	public T visitHexLongLiteralLexical(HexLongLiteral.Lexical x);

	public T visitImportAmbiguity(Import.Ambiguity x);

	public T visitImportDefault(Import.Default x);

	public T visitImportedModuleActuals(ImportedModule.Actuals x);

	public T visitImportedModuleActualsRenaming(ImportedModule.ActualsRenaming x);

	public T visitImportedModuleAmbiguity(ImportedModule.Ambiguity x);

	public T visitImportedModuleDefault(ImportedModule.Default x);

	public T visitImportedModuleRenamings(ImportedModule.Renamings x);

	public T visitImportExtend(Import.Extend x);

	public T visitIntegerLiteralAmbiguity(IntegerLiteral.Ambiguity x);

	public T visitIntegerLiteralDecimalIntegerLiteral(
			IntegerLiteral.DecimalIntegerLiteral x);

	public T visitIntegerLiteralHexIntegerLiteral(
			IntegerLiteral.HexIntegerLiteral x);

	public T visitIntegerLiteralOctalIntegerLiteral(
			IntegerLiteral.OctalIntegerLiteral x);

	public T visitKindAll(Kind.All x);

	public T visitKindAmbiguity(Kind.Ambiguity x);

	public T visitKindAnno(Kind.Anno x);

	public T visitKindData(Kind.Data x);

	public T visitKindFunction(Kind.Function x);

	public T visitKindModule(Kind.Module x);

	public T visitKindTag(Kind.Tag x);

	public T visitKindType(Kind.Type x);

	public T visitKindVariable(Kind.Variable x);

	public T visitKindView(Kind.View x);

	public T visitLabelAmbiguity(Label.Ambiguity x);

	public T visitLabelDefault(Label.Default x);

	public T visitLabelEmpty(Label.Empty x);

	public T visitLiteralAmbiguity(Literal.Ambiguity x);

	public T visitLiteralBoolean(Literal.Boolean x);

	public T visitLiteralInteger(Literal.Integer x);

	public T visitLiteralReal(Literal.Real x);

	public T visitLiteralRegExp(Literal.RegExp x);

	public T visitLiteralString(Literal.String x);

	public T visitLocalVariableDeclarationAmbiguity(
			LocalVariableDeclaration.Ambiguity x);

	public T visitLocalVariableDeclarationDefault(
			LocalVariableDeclaration.Default x);

	public T visitLocalVariableDeclarationDynamic(
			LocalVariableDeclaration.Dynamic x);

	public T visitLongLiteralAmbiguity(LongLiteral.Ambiguity x);

	public T visitLongLiteralDecimalLongLiteral(LongLiteral.DecimalLongLiteral x);

	public T visitLongLiteralHexLongLiteral(LongLiteral.HexLongLiteral x);

	public T visitLongLiteralOctalLongLiteral(LongLiteral.OctalLongLiteral x);

	public T visitMappingAmbiguity(Mapping.Ambiguity x);

	public T visitMappingDefault(Mapping.Default x);

	public T visitModuleActualsAmbiguity(ModuleActuals.Ambiguity x);

	public T visitModuleActualsDefault(ModuleActuals.Default x);

	public T visitModuleAmbiguity(Module.Ambiguity x);

	public T visitModuleDefault(Module.Default x);

	public T visitModuleParametersAmbiguity(ModuleParameters.Ambiguity x);

	public T visitModuleParametersDefault(ModuleParameters.Default x);

	public T visitNameAmbiguity(Name.Ambiguity x);

	public T visitNamedBackslashAmbiguity(NamedBackslash.Ambiguity x);

	public T visitNamedBackslashLexical(NamedBackslash.Lexical x);

	public T visitNamedRegExpAmbiguity(NamedRegExp.Ambiguity x);

	public T visitNamedRegExpLexical(NamedRegExp.Lexical x);

	public T visitNameLexical(Name.Lexical x);

	public T visitNoElseMayFollowAmbiguity(NoElseMayFollow.Ambiguity x);

	public T visitNoElseMayFollowDefault(NoElseMayFollow.Default x);

	public T visitNumCharAmbiguity(NumChar.Ambiguity x);

	public T visitNumCharLexical(NumChar.Lexical x);

	public T visitOctalIntegerLiteralAmbiguity(OctalIntegerLiteral.Ambiguity x);

	public T visitOctalIntegerLiteralLexical(OctalIntegerLiteral.Lexical x);

	public T visitOctalLongLiteralAmbiguity(OctalLongLiteral.Ambiguity x);

	public T visitOctalLongLiteralLexical(OctalLongLiteral.Lexical x);

	public T visitOperatorAsValueAddition(OperatorAsValue.Addition x);

	public T visitOperatorAsValueAmbiguity(OperatorAsValue.Ambiguity x);

	public T visitOperatorAsValueAnd(OperatorAsValue.And x);

	public T visitOperatorAsValueDivision(OperatorAsValue.Division x);

	public T visitOperatorAsValueEquals(OperatorAsValue.Equals x);

	public T visitOperatorAsValueGreaterThan(OperatorAsValue.GreaterThan x);

	public T visitOperatorAsValueGreaterThanOrEq(
			OperatorAsValue.GreaterThanOrEq x);

	public T visitOperatorAsValueIn(OperatorAsValue.In x);

	public T visitOperatorAsValueIntersection(OperatorAsValue.Intersection x);

	public T visitOperatorAsValueLessThan(OperatorAsValue.LessThan x);

	public T visitOperatorAsValueLessThanOrEq(OperatorAsValue.LessThanOrEq x);

	public T visitOperatorAsValueNot(OperatorAsValue.Not x);

	public T visitOperatorAsValueNotEquals(OperatorAsValue.NotEquals x);

	public T visitOperatorAsValueNotIn(OperatorAsValue.NotIn x);

	public T visitOperatorAsValueOr(OperatorAsValue.Or x);

	public T visitOperatorAsValueProduct(OperatorAsValue.Product x);

	public T visitOperatorAsValueSubtraction(OperatorAsValue.Subtraction x);

	public T visitOptCharRangesAbsent(OptCharRanges.Absent x);

	public T visitOptCharRangesAmbiguity(OptCharRanges.Ambiguity x);

	public T visitOptCharRangesPresent(OptCharRanges.Present x);

	public T visitParametersAmbiguity(Parameters.Ambiguity x);

	public T visitParametersDefault(Parameters.Default x);

	public T visitParametersVarArgs(Parameters.VarArgs x);

	public T visitQualifiedNameAmbiguity(QualifiedName.Ambiguity x);

	public T visitQualifiedNameDefault(QualifiedName.Default x);

	public T visitRealLiteralAmbiguity(RealLiteral.Ambiguity x);

	public T visitRealLiteralLexical(RealLiteral.Lexical x);

	public T visitRegExpAmbiguity(RegExp.Ambiguity x);

	public T visitRegExpLexical(RegExp.Lexical x);

	public T visitRegExpLiteralAmbiguity(RegExpLiteral.Ambiguity x);

	public T visitRegExpLiteralLexical(RegExpLiteral.Lexical x);

	public T visitRegExpModifierAmbiguity(RegExpModifier.Ambiguity x);

	public T visitRegExpModifierLexical(RegExpModifier.Lexical x);

	public T visitRenamingAmbiguity(Renaming.Ambiguity x);

	public T visitRenamingDefault(Renaming.Default x);

	public T visitRenamingsAmbiguity(Renamings.Ambiguity x);

	public T visitRenamingsDefault(Renamings.Default x);

	public T visitReplacementAmbiguity(Replacement.Ambiguity x);

	public T visitReplacementConditional(Replacement.Conditional x);

	public T visitReplacementUnconditional(Replacement.Unconditional x);

	public T visitReturnAmbiguity(Return.Ambiguity x);

	public T visitReturnNoExpression(Return.NoExpression x);

	public T visitReturnWithExpression(Return.WithExpression x);

	public T visitRuleAmbiguity(Rule.Ambiguity x);

	public T visitRuleArbitrary(Rule.Arbitrary x);

	public T visitRuleGuarded(Rule.Guarded x);

	public T visitRuleReplacing(Rule.Replacing x);

	public T visitShellCommandAmbiguity(ShellCommand.Ambiguity x);

	public T visitShellCommandEdit(ShellCommand.Edit x);

	public T visitShellCommandHelp(ShellCommand.Help x);

	public T visitShellCommandHistory(ShellCommand.History x);

	public T visitShellCommandQuit(ShellCommand.Quit x);

	public T visitShortCharAmbiguity(ShortChar.Ambiguity x);

	public T visitShortCharLexical(ShortChar.Lexical x);

	public T visitSignatureAmbiguity(Signature.Ambiguity x);

	public T visitSignatureNoThrows(Signature.NoThrows x);

	public T visitSignatureWithThrows(Signature.WithThrows x);

	public T visitSingleCharacterAmbiguity(SingleCharacter.Ambiguity x);

	public T visitSingleCharacterLexical(SingleCharacter.Lexical x);

	public T visitSingleQuotedStrCharAmbiguity(SingleQuotedStrChar.Ambiguity x);

	public T visitSingleQuotedStrCharLexical(SingleQuotedStrChar.Lexical x);

	public T visitSingleQuotedStrConAmbiguity(SingleQuotedStrCon.Ambiguity x);

	public T visitSingleQuotedStrConLexical(SingleQuotedStrCon.Lexical x);

	public T visitSortAmbiguity(Sort.Ambiguity x);

	public T visitSortLexical(Sort.Lexical x);

	public T visitStatementAll(Statement.All x);

	public T visitStatementAmbiguity(Statement.Ambiguity x);

	public T visitStatementAssert(Statement.Assert x);

	public T visitStatementAssignment(Statement.Assignment x);

	public T visitStatementBlock(Statement.Block x);

	public T visitStatementBreak(Statement.Break x);

	public T visitStatementContinue(Statement.Continue x);

	public T visitStatementDoWhile(Statement.DoWhile x);

	public T visitStatementEmptyStatement(Statement.EmptyStatement x);

	public T visitStatementExpression(Statement.Expression x);

	public T visitStatementFail(Statement.Fail x);

	public T visitStatementFirst(Statement.First x);

	public T visitStatementFor(Statement.For x);

	public T visitStatementFunctionDeclaration(Statement.FunctionDeclaration x);

	public T visitStatementGlobalDirective(Statement.GlobalDirective x);

	public T visitStatementIfThen(Statement.IfThen x);

	public T visitStatementIfThenElse(Statement.IfThenElse x);

	public T visitStatementInsert(Statement.Insert x);

	public T visitStatementReturn(Statement.Return x);

	public T visitStatementSolve(Statement.Solve x);

	public T visitStatementSwitch(Statement.Switch x);

	public T visitStatementThrow(Statement.Throw x);

	public T visitStatementTry(Statement.Try x);

	public T visitStatementTryFinally(Statement.TryFinally x);

	public T visitStatementVariableDeclaration(Statement.VariableDeclaration x);

	public T visitStatementVisit(Statement.Visit x);

	public T visitStatementWhile(Statement.While x);

	public T visitStrategyAmbiguity(Strategy.Ambiguity x);

	public T visitStrategyBottomUp(Strategy.BottomUp x);

	public T visitStrategyBottomUpBreak(Strategy.BottomUpBreak x);

	public T visitStrategyInnermost(Strategy.Innermost x);

	public T visitStrategyOutermost(Strategy.Outermost x);

	public T visitStrategyTopDown(Strategy.TopDown x);

	public T visitStrategyTopDownBreak(Strategy.TopDownBreak x);

	public T visitStrCharAmbiguity(StrChar.Ambiguity x);

	public T visitStrCharLexical(StrChar.Lexical x);

	public T visitStrCharnewline(StrChar.newline x);

	public T visitStrConAmbiguity(StrCon.Ambiguity x);

	public T visitStrConLexical(StrCon.Lexical x);

	public T visitStringCharacterAmbiguity(StringCharacter.Ambiguity x);

	public T visitStringCharacterLexical(StringCharacter.Lexical x);

	public T visitStringLiteralAmbiguity(StringLiteral.Ambiguity x);

	public T visitStringLiteralLexical(StringLiteral.Lexical x);

	public T visitStructuredTypeAmbiguity(StructuredType.Ambiguity x);

	public T visitStructuredTypeList(StructuredType.List x);

	public T visitStructuredTypeMap(StructuredType.Map x);

	public T visitStructuredTypeRelation(StructuredType.Relation x);

	public T visitStructuredTypeSet(StructuredType.Set x);

	public T visitStructuredTypeTuple(StructuredType.Tuple x);

	public T visitSymbolAlternative(Symbol.Alternative x);

	public T visitSymbolAmbiguity(Symbol.Ambiguity x);

	public T visitSymbolCaseInsensitiveLiteral(Symbol.CaseInsensitiveLiteral x);

	public T visitSymbolCharacterClass(Symbol.CharacterClass x);

	public T visitSymbolEmpty(Symbol.Empty x);

	public T visitSymbolIter(Symbol.Iter x);

	public T visitSymbolIterSep(Symbol.IterSep x);

	public T visitSymbolIterStar(Symbol.IterStar x);

	public T visitSymbolIterStarSep(Symbol.IterStarSep x);

	public T visitSymbolLiftedSymbol(Symbol.LiftedSymbol x);

	public T visitSymbolLiteral(Symbol.Literal x);

	public T visitSymbolOptional(Symbol.Optional x);

	public T visitSymbolParameterizedSort(Symbol.ParameterizedSort x);

	public T visitSymbolSequence(Symbol.Sequence x);

	public T visitSymbolSort(Symbol.Sort x);

	public T visitTagAmbiguity(Tag.Ambiguity x);

	public T visitTagCharAmbiguity(TagChar.Ambiguity x);

	public T visitTagCharLexical(TagChar.Lexical x);

	public T visitTagDefault(Tag.Default x);

	public T visitTagsAmbiguity(Tags.Ambiguity x);

	public T visitTagsDefault(Tags.Default x);

	public T visitTagStringAmbiguity(TagString.Ambiguity x);

	public T visitTagStringLexical(TagString.Lexical x);

	public T visitToplevelAmbiguity(Toplevel.Ambiguity x);

	public T visitToplevelDefaultVisibility(Toplevel.DefaultVisibility x);

	public T visitToplevelGivenVisibility(Toplevel.GivenVisibility x);

	public T visitTypeAmbiguity(Type.Ambiguity x);

	public T visitTypeArgAmbiguity(TypeArg.Ambiguity x);

	public T visitTypeArgDefault(TypeArg.Default x);

	public T visitTypeArgNamed(TypeArg.Named x);

	public T visitTypeBasic(Type.Basic x);

	public T visitTypeFunction(Type.Function x);

	public T visitTypeSelector(Type.Selector x);

	public T visitTypeStructured(Type.Structured x);

	public T visitTypeSymbol(Type.Symbol x);

	public T visitTypeUser(Type.User x);

	public T visitTypeVarAmbiguity(TypeVar.Ambiguity x);

	public T visitTypeVarBounded(TypeVar.Bounded x);

	public T visitTypeVarFree(TypeVar.Free x);

	public T visitTypeVariable(Type.Variable x);

	public T visitUnicodeEscapeAmbiguity(UnicodeEscape.Ambiguity x);

	public T visitUnicodeEscapeLexical(UnicodeEscape.Lexical x);

	public T visitUserTypeAmbiguity(UserType.Ambiguity x);

	public T visitUserTypeName(UserType.Name x);

	public T visitUserTypeParametric(UserType.Parametric x);

	public T visitValueProducerAmbiguity(ValueProducer.Ambiguity x);

	public T visitValueProducerDefaultStrategy(ValueProducer.DefaultStrategy x);

	public T visitValueProducerGivenStrategy(ValueProducer.GivenStrategy x);

	public T visitVariableAmbiguity(Variable.Ambiguity x);

	public T visitVariableInitialized(Variable.Initialized x);

	public T visitVariableUnInitialized(Variable.UnInitialized x);

	public T visitVariantAmbiguity(Variant.Ambiguity x);

	public T visitVariantAnonymousConstructor(Variant.AnonymousConstructor x);

	public T visitVariantNAryConstructor(Variant.NAryConstructor x);

	public T visitVariantNillaryConstructor(Variant.NillaryConstructor x);

	public T visitVisibilityAmbiguity(Visibility.Ambiguity x);

	public T visitVisibilityPrivate(Visibility.Private x);

	public T visitVisibilityPublic(Visibility.Public x);

	public T visitVisitAmbiguity(Visit.Ambiguity x);

	public T visitVisitDefaultStrategy(Visit.DefaultStrategy x);

	public T visitVisitGivenStrategy(Visit.GivenStrategy x);
}