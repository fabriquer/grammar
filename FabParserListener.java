// Generated from FabParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FabParser}.
 */
public interface FabParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FabParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(FabParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(FabParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FabParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FabParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FabParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FabParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(FabParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(FabParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(FabParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(FabParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicOp(FabParser.LogicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicOp(FabParser.LogicOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(FabParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(FabParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(FabParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(FabParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#fieldQuery}.
	 * @param ctx the parse tree
	 */
	void enterFieldQuery(FabParser.FieldQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#fieldQuery}.
	 * @param ctx the parse tree
	 */
	void exitFieldQuery(FabParser.FieldQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(FabParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(FabParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FabParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FabParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(FabParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(FabParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(FabParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(FabParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FabParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FabParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#buildAction}.
	 * @param ctx the parse tree
	 */
	void enterBuildAction(FabParser.BuildActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#buildAction}.
	 * @param ctx the parse tree
	 */
	void exitBuildAction(FabParser.BuildActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#compoundExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompoundExpr(FabParser.CompoundExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#compoundExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompoundExpr(FabParser.CompoundExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#fileList}.
	 * @param ctx the parse tree
	 */
	void enterFileList(FabParser.FileListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#fileList}.
	 * @param ctx the parse tree
	 */
	void exitFileList(FabParser.FileListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FabParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FabParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FabParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FabParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#nameReference}.
	 * @param ctx the parse tree
	 */
	void enterNameReference(FabParser.NameReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#nameReference}.
	 * @param ctx the parse tree
	 */
	void exitNameReference(FabParser.NameReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#parentheticalExpression}.
	 * @param ctx the parse tree
	 */
	void enterParentheticalExpression(FabParser.ParentheticalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#parentheticalExpression}.
	 * @param ctx the parse tree
	 */
	void exitParentheticalExpression(FabParser.ParentheticalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(FabParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(FabParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(FabParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(FabParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FabParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FabParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgument(FabParser.KeywordArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgument(FabParser.KeywordArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#keywordArguments}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArguments(FabParser.KeywordArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#keywordArguments}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArguments(FabParser.KeywordArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArguments(FabParser.PositionalArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArguments(FabParser.PositionalArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FabParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FabParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FabParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FabParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FabParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FabParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(FabParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(FabParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(FabParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(FabParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(FabParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(FabParser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void enterParametricType(FabParser.ParametricTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void exitParametricType(FabParser.ParametricTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(FabParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(FabParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FabParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(FabParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FabParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(FabParser.TypeListContext ctx);
}