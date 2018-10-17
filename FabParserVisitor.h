
// Generated from FabParser.g4 by ANTLR 4.7.1

#pragma once


#include "antlr4-runtime.h"
#include "FabParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by FabParser.
 */
class  FabParserVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by FabParser.
   */
    virtual antlrcpp::Any visitFile(FabParser::FileContext *context) = 0;

    virtual antlrcpp::Any visitValue(FabParser::ValueContext *context) = 0;

    virtual antlrcpp::Any visitExpression(FabParser::ExpressionContext *context) = 0;

    virtual antlrcpp::Any visitAddOp(FabParser::AddOpContext *context) = 0;

    virtual antlrcpp::Any visitCompareOp(FabParser::CompareOpContext *context) = 0;

    virtual antlrcpp::Any visitLogicOp(FabParser::LogicOpContext *context) = 0;

    virtual antlrcpp::Any visitMultOp(FabParser::MultOpContext *context) = 0;

    virtual antlrcpp::Any visitCall(FabParser::CallContext *context) = 0;

    virtual antlrcpp::Any visitConditional(FabParser::ConditionalContext *context) = 0;

    virtual antlrcpp::Any visitFieldQuery(FabParser::FieldQueryContext *context) = 0;

    virtual antlrcpp::Any visitFieldReference(FabParser::FieldReferenceContext *context) = 0;

    virtual antlrcpp::Any visitForeach(FabParser::ForeachContext *context) = 0;

    virtual antlrcpp::Any visitFunction(FabParser::FunctionContext *context) = 0;

    virtual antlrcpp::Any visitUnaryOperation(FabParser::UnaryOperationContext *context) = 0;

    virtual antlrcpp::Any visitUnaryOperator(FabParser::UnaryOperatorContext *context) = 0;

    virtual antlrcpp::Any visitTerm(FabParser::TermContext *context) = 0;

    virtual antlrcpp::Any visitBuildAction(FabParser::BuildActionContext *context) = 0;

    virtual antlrcpp::Any visitCompoundExpr(FabParser::CompoundExprContext *context) = 0;

    virtual antlrcpp::Any visitFileList(FabParser::FileListContext *context) = 0;

    virtual antlrcpp::Any visitList(FabParser::ListContext *context) = 0;

    virtual antlrcpp::Any visitLiteral(FabParser::LiteralContext *context) = 0;

    virtual antlrcpp::Any visitNameReference(FabParser::NameReferenceContext *context) = 0;

    virtual antlrcpp::Any visitParentheticalExpression(FabParser::ParentheticalExpressionContext *context) = 0;

    virtual antlrcpp::Any visitTypeDeclaration(FabParser::TypeDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitArguments(FabParser::ArgumentsContext *context) = 0;

    virtual antlrcpp::Any visitKeywordArgument(FabParser::KeywordArgumentContext *context) = 0;

    virtual antlrcpp::Any visitKeywordArguments(FabParser::KeywordArgumentsContext *context) = 0;

    virtual antlrcpp::Any visitPositionalArguments(FabParser::PositionalArgumentsContext *context) = 0;

    virtual antlrcpp::Any visitParameters(FabParser::ParametersContext *context) = 0;

    virtual antlrcpp::Any visitParameter(FabParser::ParameterContext *context) = 0;

    virtual antlrcpp::Any visitType(FabParser::TypeContext *context) = 0;

    virtual antlrcpp::Any visitFunctionType(FabParser::FunctionTypeContext *context) = 0;

    virtual antlrcpp::Any visitRecordType(FabParser::RecordTypeContext *context) = 0;

    virtual antlrcpp::Any visitFieldType(FabParser::FieldTypeContext *context) = 0;

    virtual antlrcpp::Any visitParametricType(FabParser::ParametricTypeContext *context) = 0;

    virtual antlrcpp::Any visitSimpleType(FabParser::SimpleTypeContext *context) = 0;

    virtual antlrcpp::Any visitTypeList(FabParser::TypeListContext *context) = 0;


};

