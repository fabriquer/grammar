
// Generated from FabParser.g4 by ANTLR 4.7.1

#pragma once


#include "antlr4-runtime.h"




class  FabParser : public antlr4::Parser {
public:
  enum {
    Comment = 1, WS = 2, Action = 3, FileListStart = 4, Foreach = 5, Function = 6, 
    Else = 7, If = 8, Record = 9, Type = 10, BoolLiteral = 11, IntLiteral = 12, 
    StringLiteral = 13, And = 14, Cons = 15, Divide = 16, Equals = 17, Minus = 18, 
    Multiply = 19, Not = 20, NotEquals = 21, Or = 22, Plus = 23, Xor = 24, 
    ArgSep = 25, Assign = 26, BraceOpen = 27, BraceClose = 28, BracketOpen = 29, 
    BracketClose = 30, End = 31, FieldSep = 32, Input = 33, ParenOpen = 34, 
    ParenClose = 35, Produces = 36, Query = 37, TypeSep = 38, Identifier = 39, 
    FileListArgs = 40, FileListEnd = 41, FilenameLiteral = 42, FileListWS = 43
  };

  enum {
    RuleFile = 0, RuleValue = 1, RuleExpression = 2, RuleAddOp = 3, RuleCompareOp = 4, 
    RuleLogicOp = 5, RuleMultOp = 6, RuleConditional = 7, RuleFieldQuery = 8, 
    RuleForeach = 9, RuleFunction = 10, RuleUnaryOperation = 11, RuleUnaryOperator = 12, 
    RuleTerm = 13, RuleBuildAction = 14, RuleCompoundExpr = 15, RuleFileList = 16, 
    RuleList = 17, RuleLiteral = 18, RuleNameReference = 19, RuleParentheticalExpression = 20, 
    RuleRecord = 21, RuleTypeDeclaration = 22, RuleArguments = 23, RuleKeywordArgument = 24, 
    RuleKeywordArguments = 25, RulePositionalArguments = 26, RuleParameters = 27, 
    RuleParameter = 28, RuleType = 29, RuleFunctionType = 30, RuleRecordType = 31, 
    RuleFieldType = 32, RuleParametricType = 33, RuleSimpleType = 34, RuleTypeList = 35
  };

  FabParser(antlr4::TokenStream *input);
  ~FabParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class FileContext;
  class ValueContext;
  class ExpressionContext;
  class AddOpContext;
  class CompareOpContext;
  class LogicOpContext;
  class MultOpContext;
  class ConditionalContext;
  class FieldQueryContext;
  class ForeachContext;
  class FunctionContext;
  class UnaryOperationContext;
  class UnaryOperatorContext;
  class TermContext;
  class BuildActionContext;
  class CompoundExprContext;
  class FileListContext;
  class ListContext;
  class LiteralContext;
  class NameReferenceContext;
  class ParentheticalExpressionContext;
  class RecordContext;
  class TypeDeclarationContext;
  class ArgumentsContext;
  class KeywordArgumentContext;
  class KeywordArgumentsContext;
  class PositionalArgumentsContext;
  class ParametersContext;
  class ParameterContext;
  class TypeContext;
  class FunctionTypeContext;
  class RecordTypeContext;
  class FieldTypeContext;
  class ParametricTypeContext;
  class SimpleTypeContext;
  class TypeListContext; 

  class  FileContext : public antlr4::ParserRuleContext {
  public:
    FabParser::ValueContext *valueContext = nullptr;;
    std::vector<ValueContext *> values;;
    FileContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EOF();
    std::vector<ValueContext *> value();
    ValueContext* value(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileContext* file();

  class  ValueContext : public antlr4::ParserRuleContext {
  public:
    antlr4::Token *name = nullptr;;
    ValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *End();
    antlr4::tree::TerminalNode *Assign();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSep();
    TypeContext *type();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ValueContext* value();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    antlr4::Token *cons = nullptr;;
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalContext *conditional();
    FieldQueryContext *fieldQuery();
    ForeachContext *foreach();
    FunctionContext *function();
    UnaryOperationContext *unaryOperation();
    TermContext *term();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    MultOpContext *multOp();
    AddOpContext *addOp();
    CompareOpContext *compareOp();
    LogicOpContext *logicOp();
    antlr4::tree::TerminalNode *Cons();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionContext* expression();
  ExpressionContext* expression(int precedence);
  class  AddOpContext : public antlr4::ParserRuleContext {
  public:
    AddOpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Minus();
    antlr4::tree::TerminalNode *Plus();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AddOpContext* addOp();

  class  CompareOpContext : public antlr4::ParserRuleContext {
  public:
    CompareOpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Equals();
    antlr4::tree::TerminalNode *NotEquals();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CompareOpContext* compareOp();

  class  LogicOpContext : public antlr4::ParserRuleContext {
  public:
    LogicOpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *And();
    antlr4::tree::TerminalNode *Or();
    antlr4::tree::TerminalNode *Xor();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LogicOpContext* logicOp();

  class  MultOpContext : public antlr4::ParserRuleContext {
  public:
    MultOpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Multiply();
    antlr4::tree::TerminalNode *Divide();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MultOpContext* multOp();

  class  ConditionalContext : public antlr4::ParserRuleContext {
  public:
    FabParser::ExpressionContext *condition = nullptr;;
    FabParser::ExpressionContext *thenClause = nullptr;;
    FabParser::ExpressionContext *elseClause = nullptr;;
    ConditionalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *If();
    antlr4::tree::TerminalNode *Else();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalContext* conditional();

  class  FieldQueryContext : public antlr4::ParserRuleContext {
  public:
    FabParser::TermContext *base = nullptr;;
    antlr4::Token *field = nullptr;;
    FabParser::ExpressionContext *defaultValue = nullptr;;
    FieldQueryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FieldSep();
    antlr4::tree::TerminalNode *Query();
    TermContext *term();
    antlr4::tree::TerminalNode *Identifier();
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldQueryContext* fieldQuery();

  class  ForeachContext : public antlr4::ParserRuleContext {
  public:
    antlr4::Token *loopVarName = nullptr;;
    FabParser::ExpressionContext *src = nullptr;;
    FabParser::ExpressionContext *body = nullptr;;
    ForeachContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Foreach();
    antlr4::tree::TerminalNode *Input();
    antlr4::tree::TerminalNode *Identifier();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *TypeSep();
    TypeContext *type();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForeachContext* foreach();

  class  FunctionContext : public antlr4::ParserRuleContext {
  public:
    FabParser::ExpressionContext *body = nullptr;;
    FunctionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Function();
    antlr4::tree::TerminalNode *ParenOpen();
    ParametersContext *parameters();
    antlr4::tree::TerminalNode *ParenClose();
    antlr4::tree::TerminalNode *TypeSep();
    TypeContext *type();
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionContext* function();

  class  UnaryOperationContext : public antlr4::ParserRuleContext {
  public:
    UnaryOperationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnaryOperatorContext *unaryOperator();
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnaryOperationContext* unaryOperation();

  class  UnaryOperatorContext : public antlr4::ParserRuleContext {
  public:
    UnaryOperatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Not();
    antlr4::tree::TerminalNode *Minus();
    antlr4::tree::TerminalNode *Plus();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnaryOperatorContext* unaryOperator();

  class  TermContext : public antlr4::ParserRuleContext {
  public:
    FabParser::TermContext *callTarget = nullptr;;
    FabParser::TermContext *base = nullptr;;
    antlr4::Token *field = nullptr;;
    TermContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BuildActionContext *buildAction();
    CompoundExprContext *compoundExpr();
    FileListContext *fileList();
    ListContext *list();
    LiteralContext *literal();
    NameReferenceContext *nameReference();
    ParentheticalExpressionContext *parentheticalExpression();
    RecordContext *record();
    TypeDeclarationContext *typeDeclaration();
    antlr4::tree::TerminalNode *ParenOpen();
    ArgumentsContext *arguments();
    antlr4::tree::TerminalNode *ParenClose();
    TermContext *term();
    antlr4::tree::TerminalNode *FieldSep();
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TermContext* term();
  TermContext* term(int precedence);
  class  BuildActionContext : public antlr4::ParserRuleContext {
  public:
    BuildActionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Action();
    antlr4::tree::TerminalNode *ParenOpen();
    ArgumentsContext *arguments();
    antlr4::tree::TerminalNode *ParenClose();
    antlr4::tree::TerminalNode *Input();
    ParametersContext *parameters();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BuildActionContext* buildAction();

  class  CompoundExprContext : public antlr4::ParserRuleContext {
  public:
    FabParser::ValueContext *valueContext = nullptr;;
    std::vector<ValueContext *> values;;
    FabParser::ExpressionContext *result = nullptr;;
    CompoundExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BraceOpen();
    antlr4::tree::TerminalNode *BraceClose();
    ExpressionContext *expression();
    std::vector<ValueContext *> value();
    ValueContext* value(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CompoundExprContext* compoundExpr();

  class  FileListContext : public antlr4::ParserRuleContext {
  public:
    antlr4::Token *filenameliteralToken = nullptr;;
    std::vector<antlr4::Token *> files;;
    FileListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FileListStart();
    antlr4::tree::TerminalNode *FileListEnd();
    std::vector<antlr4::tree::TerminalNode *> FilenameLiteral();
    antlr4::tree::TerminalNode* FilenameLiteral(size_t i);
    antlr4::tree::TerminalNode *FileListArgs();
    KeywordArgumentsContext *keywordArguments();
    antlr4::tree::TerminalNode *ParenClose();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileListContext* fileList();

  class  ListContext : public antlr4::ParserRuleContext {
  public:
    FabParser::ExpressionContext *expressionContext = nullptr;;
    std::vector<ExpressionContext *> values;;
    ListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BracketOpen();
    antlr4::tree::TerminalNode *BracketClose();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ListContext* list();

  class  LiteralContext : public antlr4::ParserRuleContext {
  public:
    LiteralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BoolLiteral();
    antlr4::tree::TerminalNode *IntLiteral();
    antlr4::tree::TerminalNode *StringLiteral();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LiteralContext* literal();

  class  NameReferenceContext : public antlr4::ParserRuleContext {
  public:
    NameReferenceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  NameReferenceContext* nameReference();

  class  ParentheticalExpressionContext : public antlr4::ParserRuleContext {
  public:
    ParentheticalExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ParenOpen();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *ParenClose();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ParentheticalExpressionContext* parentheticalExpression();

  class  RecordContext : public antlr4::ParserRuleContext {
  public:
    FabParser::ValueContext *valueContext = nullptr;;
    std::vector<ValueContext *> fields;;
    RecordContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Record();
    antlr4::tree::TerminalNode *BraceOpen();
    antlr4::tree::TerminalNode *BraceClose();
    std::vector<ValueContext *> value();
    ValueContext* value(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RecordContext* record();

  class  TypeDeclarationContext : public antlr4::ParserRuleContext {
  public:
    TypeDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Type();
    TypeContext *type();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeDeclarationContext* typeDeclaration();

  class  ArgumentsContext : public antlr4::ParserRuleContext {
  public:
    ArgumentsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PositionalArgumentsContext *positionalArguments();
    antlr4::tree::TerminalNode *ArgSep();
    KeywordArgumentsContext *keywordArguments();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArgumentsContext* arguments();

  class  KeywordArgumentContext : public antlr4::ParserRuleContext {
  public:
    KeywordArgumentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Assign();
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  KeywordArgumentContext* keywordArgument();

  class  KeywordArgumentsContext : public antlr4::ParserRuleContext {
  public:
    FabParser::KeywordArgumentContext *keywordArgumentContext = nullptr;;
    std::vector<KeywordArgumentContext *> args;;
    KeywordArgumentsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<KeywordArgumentContext *> keywordArgument();
    KeywordArgumentContext* keywordArgument(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ArgSep();
    antlr4::tree::TerminalNode* ArgSep(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  KeywordArgumentsContext* keywordArguments();

  class  PositionalArgumentsContext : public antlr4::ParserRuleContext {
  public:
    PositionalArgumentsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ArgSep();
    antlr4::tree::TerminalNode* ArgSep(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PositionalArgumentsContext* positionalArguments();

  class  ParametersContext : public antlr4::ParserRuleContext {
  public:
    ParametersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ParameterContext *> parameter();
    ParameterContext* parameter(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ArgSep();
    antlr4::tree::TerminalNode* ArgSep(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ParametersContext* parameters();

  class  ParameterContext : public antlr4::ParserRuleContext {
  public:
    FabParser::ExpressionContext *defaultArgument = nullptr;;
    ParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSep();
    TypeContext *type();
    antlr4::tree::TerminalNode *Assign();
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ParameterContext* parameter();

  class  TypeContext : public antlr4::ParserRuleContext {
  public:
    TypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionTypeContext *functionType();
    RecordTypeContext *recordType();
    ParametricTypeContext *parametricType();
    SimpleTypeContext *simpleType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeContext* type();

  class  FunctionTypeContext : public antlr4::ParserRuleContext {
  public:
    FabParser::TypeListContext *params = nullptr;;
    FabParser::TypeContext *result = nullptr;;
    FunctionTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ParenOpen();
    antlr4::tree::TerminalNode *ParenClose();
    antlr4::tree::TerminalNode *Produces();
    TypeContext *type();
    TypeListContext *typeList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionTypeContext* functionType();

  class  RecordTypeContext : public antlr4::ParserRuleContext {
  public:
    RecordTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Record();
    antlr4::tree::TerminalNode *BracketOpen();
    antlr4::tree::TerminalNode *BracketClose();
    std::vector<FieldTypeContext *> fieldType();
    FieldTypeContext* fieldType(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ArgSep();
    antlr4::tree::TerminalNode* ArgSep(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RecordTypeContext* recordType();

  class  FieldTypeContext : public antlr4::ParserRuleContext {
  public:
    FieldTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSep();
    TypeContext *type();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldTypeContext* fieldType();

  class  ParametricTypeContext : public antlr4::ParserRuleContext {
  public:
    FabParser::SimpleTypeContext *base = nullptr;;
    FabParser::TypeListContext *params = nullptr;;
    ParametricTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BracketOpen();
    antlr4::tree::TerminalNode *BracketClose();
    SimpleTypeContext *simpleType();
    TypeListContext *typeList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ParametricTypeContext* parametricType();

  class  SimpleTypeContext : public antlr4::ParserRuleContext {
  public:
    SimpleTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Type();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SimpleTypeContext* simpleType();

  class  TypeListContext : public antlr4::ParserRuleContext {
  public:
    TypeListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<TypeContext *> type();
    TypeContext* type(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ArgSep();
    antlr4::tree::TerminalNode* ArgSep(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeListContext* typeList();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool expressionSempred(ExpressionContext *_localctx, size_t predicateIndex);
  bool termSempred(TermContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

