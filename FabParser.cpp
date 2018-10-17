
// Generated from FabParser.g4 by ANTLR 4.7.1


#include "FabParserVisitor.h"

#include "FabParser.h"


using namespace antlrcpp;
using namespace antlr4;

FabParser::FabParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

FabParser::~FabParser() {
  delete _interpreter;
}

std::string FabParser::getGrammarFileName() const {
  return "FabParser.g4";
}

const std::vector<std::string>& FabParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& FabParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- FileContext ------------------------------------------------------------------

FabParser::FileContext::FileContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::FileContext::EOF() {
  return getToken(FabParser::EOF, 0);
}

std::vector<FabParser::ValueContext *> FabParser::FileContext::value() {
  return getRuleContexts<FabParser::ValueContext>();
}

FabParser::ValueContext* FabParser::FileContext::value(size_t i) {
  return getRuleContext<FabParser::ValueContext>(i);
}


size_t FabParser::FileContext::getRuleIndex() const {
  return FabParser::RuleFile;
}

antlrcpp::Any FabParser::FileContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitFile(this);
  else
    return visitor->visitChildren(this);
}

FabParser::FileContext* FabParser::file() {
  FileContext *_localctx = _tracker.createInstance<FileContext>(_ctx, getState());
  enterRule(_localctx, 0, FabParser::RuleFile);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(77);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FabParser::Action)
      | (1ULL << FabParser::FileListStart)
      | (1ULL << FabParser::Foreach)
      | (1ULL << FabParser::Function)
      | (1ULL << FabParser::If)
      | (1ULL << FabParser::Type)
      | (1ULL << FabParser::BoolLiteral)
      | (1ULL << FabParser::IntLiteral)
      | (1ULL << FabParser::StringLiteral)
      | (1ULL << FabParser::Minus)
      | (1ULL << FabParser::Not)
      | (1ULL << FabParser::Plus)
      | (1ULL << FabParser::BraceOpen)
      | (1ULL << FabParser::BracketOpen)
      | (1ULL << FabParser::ParenOpen)
      | (1ULL << FabParser::Identifier))) != 0)) {
      setState(74);
      dynamic_cast<FileContext *>(_localctx)->valueContext = value();
      dynamic_cast<FileContext *>(_localctx)->values.push_back(dynamic_cast<FileContext *>(_localctx)->valueContext);
      setState(79);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(80);
    match(FabParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ValueContext ------------------------------------------------------------------

FabParser::ValueContext::ValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FabParser::ExpressionContext* FabParser::ValueContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}

tree::TerminalNode* FabParser::ValueContext::End() {
  return getToken(FabParser::End, 0);
}

tree::TerminalNode* FabParser::ValueContext::Assign() {
  return getToken(FabParser::Assign, 0);
}

tree::TerminalNode* FabParser::ValueContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}

tree::TerminalNode* FabParser::ValueContext::TypeSep() {
  return getToken(FabParser::TypeSep, 0);
}

FabParser::TypeContext* FabParser::ValueContext::type() {
  return getRuleContext<FabParser::TypeContext>(0);
}


size_t FabParser::ValueContext::getRuleIndex() const {
  return FabParser::RuleValue;
}

antlrcpp::Any FabParser::ValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitValue(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ValueContext* FabParser::value() {
  ValueContext *_localctx = _tracker.createInstance<ValueContext>(_ctx, getState());
  enterRule(_localctx, 2, FabParser::RuleValue);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(88);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(82);
      dynamic_cast<ValueContext *>(_localctx)->name = match(FabParser::Identifier);
      setState(85);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == FabParser::TypeSep) {
        setState(83);
        match(FabParser::TypeSep);
        setState(84);
        type();
      }
      setState(87);
      match(FabParser::Assign);
      break;
    }

    }
    setState(90);
    expression(0);
    setState(91);
    match(FabParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

FabParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FabParser::CallContext* FabParser::ExpressionContext::call() {
  return getRuleContext<FabParser::CallContext>(0);
}

FabParser::ConditionalContext* FabParser::ExpressionContext::conditional() {
  return getRuleContext<FabParser::ConditionalContext>(0);
}

FabParser::FieldQueryContext* FabParser::ExpressionContext::fieldQuery() {
  return getRuleContext<FabParser::FieldQueryContext>(0);
}

FabParser::FieldReferenceContext* FabParser::ExpressionContext::fieldReference() {
  return getRuleContext<FabParser::FieldReferenceContext>(0);
}

FabParser::ForeachContext* FabParser::ExpressionContext::foreach() {
  return getRuleContext<FabParser::ForeachContext>(0);
}

FabParser::FunctionContext* FabParser::ExpressionContext::function() {
  return getRuleContext<FabParser::FunctionContext>(0);
}

FabParser::UnaryOperationContext* FabParser::ExpressionContext::unaryOperation() {
  return getRuleContext<FabParser::UnaryOperationContext>(0);
}

FabParser::TermContext* FabParser::ExpressionContext::term() {
  return getRuleContext<FabParser::TermContext>(0);
}

std::vector<FabParser::ExpressionContext *> FabParser::ExpressionContext::expression() {
  return getRuleContexts<FabParser::ExpressionContext>();
}

FabParser::ExpressionContext* FabParser::ExpressionContext::expression(size_t i) {
  return getRuleContext<FabParser::ExpressionContext>(i);
}

FabParser::MultOpContext* FabParser::ExpressionContext::multOp() {
  return getRuleContext<FabParser::MultOpContext>(0);
}

FabParser::AddOpContext* FabParser::ExpressionContext::addOp() {
  return getRuleContext<FabParser::AddOpContext>(0);
}

FabParser::CompareOpContext* FabParser::ExpressionContext::compareOp() {
  return getRuleContext<FabParser::CompareOpContext>(0);
}

FabParser::LogicOpContext* FabParser::ExpressionContext::logicOp() {
  return getRuleContext<FabParser::LogicOpContext>(0);
}

tree::TerminalNode* FabParser::ExpressionContext::Cons() {
  return getToken(FabParser::Cons, 0);
}


size_t FabParser::ExpressionContext::getRuleIndex() const {
  return FabParser::RuleExpression;
}

antlrcpp::Any FabParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
}


FabParser::ExpressionContext* FabParser::expression() {
   return expression(0);
}

FabParser::ExpressionContext* FabParser::expression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  FabParser::ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, parentState);
  FabParser::ExpressionContext *previousContext = _localctx;
  size_t startState = 4;
  enterRecursionRule(_localctx, 4, FabParser::RuleExpression, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(102);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      setState(94);
      call();
      break;
    }

    case 2: {
      setState(95);
      conditional();
      break;
    }

    case 3: {
      setState(96);
      fieldQuery();
      break;
    }

    case 4: {
      setState(97);
      fieldReference(0);
      break;
    }

    case 5: {
      setState(98);
      foreach();
      break;
    }

    case 6: {
      setState(99);
      function();
      break;
    }

    case 7: {
      setState(100);
      unaryOperation();
      break;
    }

    case 8: {
      setState(101);
      term();
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(125);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(123);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(104);

          if (!(precpred(_ctx, 13))) throw FailedPredicateException(this, "precpred(_ctx, 13)");
          setState(105);
          multOp();
          setState(106);
          expression(14);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(108);

          if (!(precpred(_ctx, 12))) throw FailedPredicateException(this, "precpred(_ctx, 12)");
          setState(109);
          addOp();
          setState(110);
          expression(13);
          break;
        }

        case 3: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(112);

          if (!(precpred(_ctx, 11))) throw FailedPredicateException(this, "precpred(_ctx, 11)");
          setState(113);
          compareOp();
          setState(114);
          expression(12);
          break;
        }

        case 4: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(116);

          if (!(precpred(_ctx, 10))) throw FailedPredicateException(this, "precpred(_ctx, 10)");
          setState(117);
          logicOp();
          setState(118);
          expression(11);
          break;
        }

        case 5: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(120);

          if (!(precpred(_ctx, 9))) throw FailedPredicateException(this, "precpred(_ctx, 9)");
          setState(121);
          dynamic_cast<ExpressionContext *>(_localctx)->cons = match(FabParser::Cons);
          setState(122);
          expression(9);
          break;
        }

        } 
      }
      setState(127);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- AddOpContext ------------------------------------------------------------------

FabParser::AddOpContext::AddOpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::AddOpContext::Minus() {
  return getToken(FabParser::Minus, 0);
}

tree::TerminalNode* FabParser::AddOpContext::Plus() {
  return getToken(FabParser::Plus, 0);
}


size_t FabParser::AddOpContext::getRuleIndex() const {
  return FabParser::RuleAddOp;
}

antlrcpp::Any FabParser::AddOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitAddOp(this);
  else
    return visitor->visitChildren(this);
}

FabParser::AddOpContext* FabParser::addOp() {
  AddOpContext *_localctx = _tracker.createInstance<AddOpContext>(_ctx, getState());
  enterRule(_localctx, 6, FabParser::RuleAddOp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(128);
    _la = _input->LA(1);
    if (!(_la == FabParser::Minus

    || _la == FabParser::Plus)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CompareOpContext ------------------------------------------------------------------

FabParser::CompareOpContext::CompareOpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::CompareOpContext::Equals() {
  return getToken(FabParser::Equals, 0);
}

tree::TerminalNode* FabParser::CompareOpContext::NotEquals() {
  return getToken(FabParser::NotEquals, 0);
}


size_t FabParser::CompareOpContext::getRuleIndex() const {
  return FabParser::RuleCompareOp;
}

antlrcpp::Any FabParser::CompareOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitCompareOp(this);
  else
    return visitor->visitChildren(this);
}

FabParser::CompareOpContext* FabParser::compareOp() {
  CompareOpContext *_localctx = _tracker.createInstance<CompareOpContext>(_ctx, getState());
  enterRule(_localctx, 8, FabParser::RuleCompareOp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(130);
    _la = _input->LA(1);
    if (!(_la == FabParser::Equals

    || _la == FabParser::NotEquals)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LogicOpContext ------------------------------------------------------------------

FabParser::LogicOpContext::LogicOpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::LogicOpContext::And() {
  return getToken(FabParser::And, 0);
}

tree::TerminalNode* FabParser::LogicOpContext::Or() {
  return getToken(FabParser::Or, 0);
}

tree::TerminalNode* FabParser::LogicOpContext::Xor() {
  return getToken(FabParser::Xor, 0);
}


size_t FabParser::LogicOpContext::getRuleIndex() const {
  return FabParser::RuleLogicOp;
}

antlrcpp::Any FabParser::LogicOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitLogicOp(this);
  else
    return visitor->visitChildren(this);
}

FabParser::LogicOpContext* FabParser::logicOp() {
  LogicOpContext *_localctx = _tracker.createInstance<LogicOpContext>(_ctx, getState());
  enterRule(_localctx, 10, FabParser::RuleLogicOp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(132);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FabParser::And)
      | (1ULL << FabParser::Or)
      | (1ULL << FabParser::Xor))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MultOpContext ------------------------------------------------------------------

FabParser::MultOpContext::MultOpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::MultOpContext::Multiply() {
  return getToken(FabParser::Multiply, 0);
}

tree::TerminalNode* FabParser::MultOpContext::Divide() {
  return getToken(FabParser::Divide, 0);
}


size_t FabParser::MultOpContext::getRuleIndex() const {
  return FabParser::RuleMultOp;
}

antlrcpp::Any FabParser::MultOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitMultOp(this);
  else
    return visitor->visitChildren(this);
}

FabParser::MultOpContext* FabParser::multOp() {
  MultOpContext *_localctx = _tracker.createInstance<MultOpContext>(_ctx, getState());
  enterRule(_localctx, 12, FabParser::RuleMultOp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(134);
    _la = _input->LA(1);
    if (!(_la == FabParser::Divide

    || _la == FabParser::Multiply)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CallContext ------------------------------------------------------------------

FabParser::CallContext::CallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::CallContext::ParenOpen() {
  return getToken(FabParser::ParenOpen, 0);
}

tree::TerminalNode* FabParser::CallContext::ParenClose() {
  return getToken(FabParser::ParenClose, 0);
}

FabParser::TermContext* FabParser::CallContext::term() {
  return getRuleContext<FabParser::TermContext>(0);
}

FabParser::ArgumentsContext* FabParser::CallContext::arguments() {
  return getRuleContext<FabParser::ArgumentsContext>(0);
}


size_t FabParser::CallContext::getRuleIndex() const {
  return FabParser::RuleCall;
}

antlrcpp::Any FabParser::CallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitCall(this);
  else
    return visitor->visitChildren(this);
}

FabParser::CallContext* FabParser::call() {
  CallContext *_localctx = _tracker.createInstance<CallContext>(_ctx, getState());
  enterRule(_localctx, 14, FabParser::RuleCall);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(136);
    dynamic_cast<CallContext *>(_localctx)->target = term();
    setState(137);
    match(FabParser::ParenOpen);
    setState(139);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FabParser::Action)
      | (1ULL << FabParser::FileListStart)
      | (1ULL << FabParser::Foreach)
      | (1ULL << FabParser::Function)
      | (1ULL << FabParser::If)
      | (1ULL << FabParser::Type)
      | (1ULL << FabParser::BoolLiteral)
      | (1ULL << FabParser::IntLiteral)
      | (1ULL << FabParser::StringLiteral)
      | (1ULL << FabParser::Minus)
      | (1ULL << FabParser::Not)
      | (1ULL << FabParser::Plus)
      | (1ULL << FabParser::BraceOpen)
      | (1ULL << FabParser::BracketOpen)
      | (1ULL << FabParser::ParenOpen)
      | (1ULL << FabParser::Identifier))) != 0)) {
      setState(138);
      arguments();
    }
    setState(141);
    match(FabParser::ParenClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalContext ------------------------------------------------------------------

FabParser::ConditionalContext::ConditionalContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::ConditionalContext::If() {
  return getToken(FabParser::If, 0);
}

tree::TerminalNode* FabParser::ConditionalContext::Else() {
  return getToken(FabParser::Else, 0);
}

std::vector<FabParser::ExpressionContext *> FabParser::ConditionalContext::expression() {
  return getRuleContexts<FabParser::ExpressionContext>();
}

FabParser::ExpressionContext* FabParser::ConditionalContext::expression(size_t i) {
  return getRuleContext<FabParser::ExpressionContext>(i);
}


size_t FabParser::ConditionalContext::getRuleIndex() const {
  return FabParser::RuleConditional;
}

antlrcpp::Any FabParser::ConditionalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitConditional(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ConditionalContext* FabParser::conditional() {
  ConditionalContext *_localctx = _tracker.createInstance<ConditionalContext>(_ctx, getState());
  enterRule(_localctx, 16, FabParser::RuleConditional);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(143);
    match(FabParser::If);
    setState(144);
    dynamic_cast<ConditionalContext *>(_localctx)->condition = expression(0);
    setState(145);
    dynamic_cast<ConditionalContext *>(_localctx)->thenClause = expression(0);
    setState(146);
    match(FabParser::Else);
    setState(147);
    dynamic_cast<ConditionalContext *>(_localctx)->elseClause = expression(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldQueryContext ------------------------------------------------------------------

FabParser::FieldQueryContext::FieldQueryContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::FieldQueryContext::FieldSep() {
  return getToken(FabParser::FieldSep, 0);
}

tree::TerminalNode* FabParser::FieldQueryContext::Query() {
  return getToken(FabParser::Query, 0);
}

FabParser::TermContext* FabParser::FieldQueryContext::term() {
  return getRuleContext<FabParser::TermContext>(0);
}

tree::TerminalNode* FabParser::FieldQueryContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}

FabParser::ExpressionContext* FabParser::FieldQueryContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}


size_t FabParser::FieldQueryContext::getRuleIndex() const {
  return FabParser::RuleFieldQuery;
}

antlrcpp::Any FabParser::FieldQueryContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitFieldQuery(this);
  else
    return visitor->visitChildren(this);
}

FabParser::FieldQueryContext* FabParser::fieldQuery() {
  FieldQueryContext *_localctx = _tracker.createInstance<FieldQueryContext>(_ctx, getState());
  enterRule(_localctx, 18, FabParser::RuleFieldQuery);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(149);
    dynamic_cast<FieldQueryContext *>(_localctx)->base = term();
    setState(150);
    match(FabParser::FieldSep);
    setState(151);
    dynamic_cast<FieldQueryContext *>(_localctx)->field = match(FabParser::Identifier);
    setState(152);
    match(FabParser::Query);
    setState(153);
    dynamic_cast<FieldQueryContext *>(_localctx)->defaultValue = expression(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldReferenceContext ------------------------------------------------------------------

FabParser::FieldReferenceContext::FieldReferenceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FabParser::TermContext* FabParser::FieldReferenceContext::term() {
  return getRuleContext<FabParser::TermContext>(0);
}

tree::TerminalNode* FabParser::FieldReferenceContext::FieldSep() {
  return getToken(FabParser::FieldSep, 0);
}

tree::TerminalNode* FabParser::FieldReferenceContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}

FabParser::FieldReferenceContext* FabParser::FieldReferenceContext::fieldReference() {
  return getRuleContext<FabParser::FieldReferenceContext>(0);
}


size_t FabParser::FieldReferenceContext::getRuleIndex() const {
  return FabParser::RuleFieldReference;
}

antlrcpp::Any FabParser::FieldReferenceContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitFieldReference(this);
  else
    return visitor->visitChildren(this);
}


FabParser::FieldReferenceContext* FabParser::fieldReference() {
   return fieldReference(0);
}

FabParser::FieldReferenceContext* FabParser::fieldReference(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  FabParser::FieldReferenceContext *_localctx = _tracker.createInstance<FieldReferenceContext>(_ctx, parentState);
  FabParser::FieldReferenceContext *previousContext = _localctx;
  size_t startState = 20;
  enterRecursionRule(_localctx, 20, FabParser::RuleFieldReference, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(156);
    term();
    setState(157);
    match(FabParser::FieldSep);
    setState(158);
    match(FabParser::Identifier);
    _ctx->stop = _input->LT(-1);
    setState(165);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<FieldReferenceContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleFieldReference);
        setState(160);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(161);
        match(FabParser::FieldSep);
        setState(162);
        match(FabParser::Identifier); 
      }
      setState(167);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- ForeachContext ------------------------------------------------------------------

FabParser::ForeachContext::ForeachContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::ForeachContext::Foreach() {
  return getToken(FabParser::Foreach, 0);
}

tree::TerminalNode* FabParser::ForeachContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}

tree::TerminalNode* FabParser::ForeachContext::Input() {
  return getToken(FabParser::Input, 0);
}

std::vector<FabParser::ExpressionContext *> FabParser::ForeachContext::expression() {
  return getRuleContexts<FabParser::ExpressionContext>();
}

FabParser::ExpressionContext* FabParser::ForeachContext::expression(size_t i) {
  return getRuleContext<FabParser::ExpressionContext>(i);
}

tree::TerminalNode* FabParser::ForeachContext::TypeSep() {
  return getToken(FabParser::TypeSep, 0);
}

FabParser::TypeContext* FabParser::ForeachContext::type() {
  return getRuleContext<FabParser::TypeContext>(0);
}


size_t FabParser::ForeachContext::getRuleIndex() const {
  return FabParser::RuleForeach;
}

antlrcpp::Any FabParser::ForeachContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitForeach(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ForeachContext* FabParser::foreach() {
  ForeachContext *_localctx = _tracker.createInstance<ForeachContext>(_ctx, getState());
  enterRule(_localctx, 22, FabParser::RuleForeach);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(168);
    match(FabParser::Foreach);
    setState(169);
    match(FabParser::Identifier);
    setState(172);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::TypeSep) {
      setState(170);
      match(FabParser::TypeSep);
      setState(171);
      type();
    }
    setState(174);
    match(FabParser::Input);
    setState(175);
    dynamic_cast<ForeachContext *>(_localctx)->src = expression(0);
    setState(176);
    dynamic_cast<ForeachContext *>(_localctx)->body = expression(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionContext ------------------------------------------------------------------

FabParser::FunctionContext::FunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::FunctionContext::Function() {
  return getToken(FabParser::Function, 0);
}

tree::TerminalNode* FabParser::FunctionContext::ParenOpen() {
  return getToken(FabParser::ParenOpen, 0);
}

FabParser::ParametersContext* FabParser::FunctionContext::parameters() {
  return getRuleContext<FabParser::ParametersContext>(0);
}

tree::TerminalNode* FabParser::FunctionContext::ParenClose() {
  return getToken(FabParser::ParenClose, 0);
}

FabParser::ExpressionContext* FabParser::FunctionContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}

tree::TerminalNode* FabParser::FunctionContext::TypeSep() {
  return getToken(FabParser::TypeSep, 0);
}

FabParser::TypeContext* FabParser::FunctionContext::type() {
  return getRuleContext<FabParser::TypeContext>(0);
}


size_t FabParser::FunctionContext::getRuleIndex() const {
  return FabParser::RuleFunction;
}

antlrcpp::Any FabParser::FunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitFunction(this);
  else
    return visitor->visitChildren(this);
}

FabParser::FunctionContext* FabParser::function() {
  FunctionContext *_localctx = _tracker.createInstance<FunctionContext>(_ctx, getState());
  enterRule(_localctx, 24, FabParser::RuleFunction);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(178);
    match(FabParser::Function);
    setState(179);
    match(FabParser::ParenOpen);
    setState(180);
    parameters();
    setState(181);
    match(FabParser::ParenClose);
    setState(184);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::TypeSep) {
      setState(182);
      match(FabParser::TypeSep);
      setState(183);
      type();
    }
    setState(186);
    dynamic_cast<FunctionContext *>(_localctx)->body = expression(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnaryOperationContext ------------------------------------------------------------------

FabParser::UnaryOperationContext::UnaryOperationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FabParser::UnaryOperatorContext* FabParser::UnaryOperationContext::unaryOperator() {
  return getRuleContext<FabParser::UnaryOperatorContext>(0);
}

FabParser::ExpressionContext* FabParser::UnaryOperationContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}


size_t FabParser::UnaryOperationContext::getRuleIndex() const {
  return FabParser::RuleUnaryOperation;
}

antlrcpp::Any FabParser::UnaryOperationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitUnaryOperation(this);
  else
    return visitor->visitChildren(this);
}

FabParser::UnaryOperationContext* FabParser::unaryOperation() {
  UnaryOperationContext *_localctx = _tracker.createInstance<UnaryOperationContext>(_ctx, getState());
  enterRule(_localctx, 26, FabParser::RuleUnaryOperation);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(188);
    unaryOperator();
    setState(189);
    expression(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnaryOperatorContext ------------------------------------------------------------------

FabParser::UnaryOperatorContext::UnaryOperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::UnaryOperatorContext::Not() {
  return getToken(FabParser::Not, 0);
}

tree::TerminalNode* FabParser::UnaryOperatorContext::Minus() {
  return getToken(FabParser::Minus, 0);
}

tree::TerminalNode* FabParser::UnaryOperatorContext::Plus() {
  return getToken(FabParser::Plus, 0);
}


size_t FabParser::UnaryOperatorContext::getRuleIndex() const {
  return FabParser::RuleUnaryOperator;
}

antlrcpp::Any FabParser::UnaryOperatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitUnaryOperator(this);
  else
    return visitor->visitChildren(this);
}

FabParser::UnaryOperatorContext* FabParser::unaryOperator() {
  UnaryOperatorContext *_localctx = _tracker.createInstance<UnaryOperatorContext>(_ctx, getState());
  enterRule(_localctx, 28, FabParser::RuleUnaryOperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(191);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FabParser::Minus)
      | (1ULL << FabParser::Not)
      | (1ULL << FabParser::Plus))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TermContext ------------------------------------------------------------------

FabParser::TermContext::TermContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FabParser::BuildActionContext* FabParser::TermContext::buildAction() {
  return getRuleContext<FabParser::BuildActionContext>(0);
}

FabParser::CompoundExprContext* FabParser::TermContext::compoundExpr() {
  return getRuleContext<FabParser::CompoundExprContext>(0);
}

FabParser::FileListContext* FabParser::TermContext::fileList() {
  return getRuleContext<FabParser::FileListContext>(0);
}

FabParser::ListContext* FabParser::TermContext::list() {
  return getRuleContext<FabParser::ListContext>(0);
}

FabParser::LiteralContext* FabParser::TermContext::literal() {
  return getRuleContext<FabParser::LiteralContext>(0);
}

FabParser::NameReferenceContext* FabParser::TermContext::nameReference() {
  return getRuleContext<FabParser::NameReferenceContext>(0);
}

FabParser::ParentheticalExpressionContext* FabParser::TermContext::parentheticalExpression() {
  return getRuleContext<FabParser::ParentheticalExpressionContext>(0);
}

FabParser::TypeDeclarationContext* FabParser::TermContext::typeDeclaration() {
  return getRuleContext<FabParser::TypeDeclarationContext>(0);
}


size_t FabParser::TermContext::getRuleIndex() const {
  return FabParser::RuleTerm;
}

antlrcpp::Any FabParser::TermContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitTerm(this);
  else
    return visitor->visitChildren(this);
}

FabParser::TermContext* FabParser::term() {
  TermContext *_localctx = _tracker.createInstance<TermContext>(_ctx, getState());
  enterRule(_localctx, 30, FabParser::RuleTerm);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(201);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case FabParser::Action: {
        enterOuterAlt(_localctx, 1);
        setState(193);
        buildAction();
        break;
      }

      case FabParser::BraceOpen: {
        enterOuterAlt(_localctx, 2);
        setState(194);
        compoundExpr();
        break;
      }

      case FabParser::FileListStart: {
        enterOuterAlt(_localctx, 3);
        setState(195);
        fileList();
        break;
      }

      case FabParser::BracketOpen: {
        enterOuterAlt(_localctx, 4);
        setState(196);
        list();
        break;
      }

      case FabParser::BoolLiteral:
      case FabParser::IntLiteral:
      case FabParser::StringLiteral: {
        enterOuterAlt(_localctx, 5);
        setState(197);
        literal();
        break;
      }

      case FabParser::Identifier: {
        enterOuterAlt(_localctx, 6);
        setState(198);
        nameReference();
        break;
      }

      case FabParser::ParenOpen: {
        enterOuterAlt(_localctx, 7);
        setState(199);
        parentheticalExpression();
        break;
      }

      case FabParser::Type: {
        enterOuterAlt(_localctx, 8);
        setState(200);
        typeDeclaration();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BuildActionContext ------------------------------------------------------------------

FabParser::BuildActionContext::BuildActionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::BuildActionContext::Action() {
  return getToken(FabParser::Action, 0);
}

tree::TerminalNode* FabParser::BuildActionContext::ParenOpen() {
  return getToken(FabParser::ParenOpen, 0);
}

FabParser::ArgumentsContext* FabParser::BuildActionContext::arguments() {
  return getRuleContext<FabParser::ArgumentsContext>(0);
}

tree::TerminalNode* FabParser::BuildActionContext::ParenClose() {
  return getToken(FabParser::ParenClose, 0);
}

tree::TerminalNode* FabParser::BuildActionContext::Input() {
  return getToken(FabParser::Input, 0);
}

FabParser::ParametersContext* FabParser::BuildActionContext::parameters() {
  return getRuleContext<FabParser::ParametersContext>(0);
}


size_t FabParser::BuildActionContext::getRuleIndex() const {
  return FabParser::RuleBuildAction;
}

antlrcpp::Any FabParser::BuildActionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitBuildAction(this);
  else
    return visitor->visitChildren(this);
}

FabParser::BuildActionContext* FabParser::buildAction() {
  BuildActionContext *_localctx = _tracker.createInstance<BuildActionContext>(_ctx, getState());
  enterRule(_localctx, 32, FabParser::RuleBuildAction);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(203);
    match(FabParser::Action);
    setState(204);
    match(FabParser::ParenOpen);
    setState(205);
    arguments();
    setState(208);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::Input) {
      setState(206);
      match(FabParser::Input);
      setState(207);
      parameters();
    }
    setState(210);
    match(FabParser::ParenClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CompoundExprContext ------------------------------------------------------------------

FabParser::CompoundExprContext::CompoundExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::CompoundExprContext::BraceOpen() {
  return getToken(FabParser::BraceOpen, 0);
}

tree::TerminalNode* FabParser::CompoundExprContext::BraceClose() {
  return getToken(FabParser::BraceClose, 0);
}

FabParser::ExpressionContext* FabParser::CompoundExprContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}

std::vector<FabParser::ValueContext *> FabParser::CompoundExprContext::value() {
  return getRuleContexts<FabParser::ValueContext>();
}

FabParser::ValueContext* FabParser::CompoundExprContext::value(size_t i) {
  return getRuleContext<FabParser::ValueContext>(i);
}


size_t FabParser::CompoundExprContext::getRuleIndex() const {
  return FabParser::RuleCompoundExpr;
}

antlrcpp::Any FabParser::CompoundExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitCompoundExpr(this);
  else
    return visitor->visitChildren(this);
}

FabParser::CompoundExprContext* FabParser::compoundExpr() {
  CompoundExprContext *_localctx = _tracker.createInstance<CompoundExprContext>(_ctx, getState());
  enterRule(_localctx, 34, FabParser::RuleCompoundExpr);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(212);
    match(FabParser::BraceOpen);
    setState(216);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(213);
        dynamic_cast<CompoundExprContext *>(_localctx)->valueContext = value();
        dynamic_cast<CompoundExprContext *>(_localctx)->values.push_back(dynamic_cast<CompoundExprContext *>(_localctx)->valueContext); 
      }
      setState(218);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    }
    setState(219);
    dynamic_cast<CompoundExprContext *>(_localctx)->result = expression(0);
    setState(220);
    match(FabParser::BraceClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FileListContext ------------------------------------------------------------------

FabParser::FileListContext::FileListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::FileListContext::FileListStart() {
  return getToken(FabParser::FileListStart, 0);
}

tree::TerminalNode* FabParser::FileListContext::FileListEnd() {
  return getToken(FabParser::FileListEnd, 0);
}

std::vector<tree::TerminalNode *> FabParser::FileListContext::FilenameLiteral() {
  return getTokens(FabParser::FilenameLiteral);
}

tree::TerminalNode* FabParser::FileListContext::FilenameLiteral(size_t i) {
  return getToken(FabParser::FilenameLiteral, i);
}

tree::TerminalNode* FabParser::FileListContext::FileListArgs() {
  return getToken(FabParser::FileListArgs, 0);
}

FabParser::KeywordArgumentsContext* FabParser::FileListContext::keywordArguments() {
  return getRuleContext<FabParser::KeywordArgumentsContext>(0);
}

tree::TerminalNode* FabParser::FileListContext::ParenClose() {
  return getToken(FabParser::ParenClose, 0);
}


size_t FabParser::FileListContext::getRuleIndex() const {
  return FabParser::RuleFileList;
}

antlrcpp::Any FabParser::FileListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitFileList(this);
  else
    return visitor->visitChildren(this);
}

FabParser::FileListContext* FabParser::fileList() {
  FileListContext *_localctx = _tracker.createInstance<FileListContext>(_ctx, getState());
  enterRule(_localctx, 36, FabParser::RuleFileList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(222);
    match(FabParser::FileListStart);
    setState(226);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == FabParser::FilenameLiteral) {
      setState(223);
      match(FabParser::FilenameLiteral);
      setState(228);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(234);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case FabParser::FileListEnd: {
        setState(229);
        match(FabParser::FileListEnd);
        break;
      }

      case FabParser::FileListArgs: {
        setState(230);
        match(FabParser::FileListArgs);
        setState(231);
        keywordArguments();
        setState(232);
        match(FabParser::ParenClose);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ListContext ------------------------------------------------------------------

FabParser::ListContext::ListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::ListContext::BracketOpen() {
  return getToken(FabParser::BracketOpen, 0);
}

tree::TerminalNode* FabParser::ListContext::BracketClose() {
  return getToken(FabParser::BracketClose, 0);
}

std::vector<FabParser::ExpressionContext *> FabParser::ListContext::expression() {
  return getRuleContexts<FabParser::ExpressionContext>();
}

FabParser::ExpressionContext* FabParser::ListContext::expression(size_t i) {
  return getRuleContext<FabParser::ExpressionContext>(i);
}


size_t FabParser::ListContext::getRuleIndex() const {
  return FabParser::RuleList;
}

antlrcpp::Any FabParser::ListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitList(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ListContext* FabParser::list() {
  ListContext *_localctx = _tracker.createInstance<ListContext>(_ctx, getState());
  enterRule(_localctx, 38, FabParser::RuleList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(236);
    match(FabParser::BracketOpen);
    setState(240);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FabParser::Action)
      | (1ULL << FabParser::FileListStart)
      | (1ULL << FabParser::Foreach)
      | (1ULL << FabParser::Function)
      | (1ULL << FabParser::If)
      | (1ULL << FabParser::Type)
      | (1ULL << FabParser::BoolLiteral)
      | (1ULL << FabParser::IntLiteral)
      | (1ULL << FabParser::StringLiteral)
      | (1ULL << FabParser::Minus)
      | (1ULL << FabParser::Not)
      | (1ULL << FabParser::Plus)
      | (1ULL << FabParser::BraceOpen)
      | (1ULL << FabParser::BracketOpen)
      | (1ULL << FabParser::ParenOpen)
      | (1ULL << FabParser::Identifier))) != 0)) {
      setState(237);
      dynamic_cast<ListContext *>(_localctx)->expressionContext = expression(0);
      dynamic_cast<ListContext *>(_localctx)->values.push_back(dynamic_cast<ListContext *>(_localctx)->expressionContext);
      setState(242);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(243);
    match(FabParser::BracketClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LiteralContext ------------------------------------------------------------------

FabParser::LiteralContext::LiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::LiteralContext::BoolLiteral() {
  return getToken(FabParser::BoolLiteral, 0);
}

tree::TerminalNode* FabParser::LiteralContext::IntLiteral() {
  return getToken(FabParser::IntLiteral, 0);
}

tree::TerminalNode* FabParser::LiteralContext::StringLiteral() {
  return getToken(FabParser::StringLiteral, 0);
}


size_t FabParser::LiteralContext::getRuleIndex() const {
  return FabParser::RuleLiteral;
}

antlrcpp::Any FabParser::LiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitLiteral(this);
  else
    return visitor->visitChildren(this);
}

FabParser::LiteralContext* FabParser::literal() {
  LiteralContext *_localctx = _tracker.createInstance<LiteralContext>(_ctx, getState());
  enterRule(_localctx, 40, FabParser::RuleLiteral);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(245);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FabParser::BoolLiteral)
      | (1ULL << FabParser::IntLiteral)
      | (1ULL << FabParser::StringLiteral))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NameReferenceContext ------------------------------------------------------------------

FabParser::NameReferenceContext::NameReferenceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::NameReferenceContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}


size_t FabParser::NameReferenceContext::getRuleIndex() const {
  return FabParser::RuleNameReference;
}

antlrcpp::Any FabParser::NameReferenceContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitNameReference(this);
  else
    return visitor->visitChildren(this);
}

FabParser::NameReferenceContext* FabParser::nameReference() {
  NameReferenceContext *_localctx = _tracker.createInstance<NameReferenceContext>(_ctx, getState());
  enterRule(_localctx, 42, FabParser::RuleNameReference);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(247);
    match(FabParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParentheticalExpressionContext ------------------------------------------------------------------

FabParser::ParentheticalExpressionContext::ParentheticalExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::ParentheticalExpressionContext::ParenOpen() {
  return getToken(FabParser::ParenOpen, 0);
}

FabParser::ExpressionContext* FabParser::ParentheticalExpressionContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}

tree::TerminalNode* FabParser::ParentheticalExpressionContext::ParenClose() {
  return getToken(FabParser::ParenClose, 0);
}


size_t FabParser::ParentheticalExpressionContext::getRuleIndex() const {
  return FabParser::RuleParentheticalExpression;
}

antlrcpp::Any FabParser::ParentheticalExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitParentheticalExpression(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ParentheticalExpressionContext* FabParser::parentheticalExpression() {
  ParentheticalExpressionContext *_localctx = _tracker.createInstance<ParentheticalExpressionContext>(_ctx, getState());
  enterRule(_localctx, 44, FabParser::RuleParentheticalExpression);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(249);
    match(FabParser::ParenOpen);
    setState(250);
    expression(0);
    setState(251);
    match(FabParser::ParenClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeDeclarationContext ------------------------------------------------------------------

FabParser::TypeDeclarationContext::TypeDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::TypeDeclarationContext::Type() {
  return getToken(FabParser::Type, 0);
}

FabParser::TypeContext* FabParser::TypeDeclarationContext::type() {
  return getRuleContext<FabParser::TypeContext>(0);
}


size_t FabParser::TypeDeclarationContext::getRuleIndex() const {
  return FabParser::RuleTypeDeclaration;
}

antlrcpp::Any FabParser::TypeDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitTypeDeclaration(this);
  else
    return visitor->visitChildren(this);
}

FabParser::TypeDeclarationContext* FabParser::typeDeclaration() {
  TypeDeclarationContext *_localctx = _tracker.createInstance<TypeDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 46, FabParser::RuleTypeDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(253);
    match(FabParser::Type);
    setState(254);
    type();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArgumentsContext ------------------------------------------------------------------

FabParser::ArgumentsContext::ArgumentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FabParser::PositionalArgumentsContext* FabParser::ArgumentsContext::positionalArguments() {
  return getRuleContext<FabParser::PositionalArgumentsContext>(0);
}

tree::TerminalNode* FabParser::ArgumentsContext::ArgSep() {
  return getToken(FabParser::ArgSep, 0);
}

FabParser::KeywordArgumentsContext* FabParser::ArgumentsContext::keywordArguments() {
  return getRuleContext<FabParser::KeywordArgumentsContext>(0);
}


size_t FabParser::ArgumentsContext::getRuleIndex() const {
  return FabParser::RuleArguments;
}

antlrcpp::Any FabParser::ArgumentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitArguments(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ArgumentsContext* FabParser::arguments() {
  ArgumentsContext *_localctx = _tracker.createInstance<ArgumentsContext>(_ctx, getState());
  enterRule(_localctx, 48, FabParser::RuleArguments);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(262);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(256);
      positionalArguments();
      setState(257);
      match(FabParser::ArgSep);
      setState(258);
      keywordArguments();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(260);
      positionalArguments();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(261);
      keywordArguments();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- KeywordArgumentContext ------------------------------------------------------------------

FabParser::KeywordArgumentContext::KeywordArgumentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::KeywordArgumentContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}

tree::TerminalNode* FabParser::KeywordArgumentContext::Assign() {
  return getToken(FabParser::Assign, 0);
}

FabParser::ExpressionContext* FabParser::KeywordArgumentContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}


size_t FabParser::KeywordArgumentContext::getRuleIndex() const {
  return FabParser::RuleKeywordArgument;
}

antlrcpp::Any FabParser::KeywordArgumentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitKeywordArgument(this);
  else
    return visitor->visitChildren(this);
}

FabParser::KeywordArgumentContext* FabParser::keywordArgument() {
  KeywordArgumentContext *_localctx = _tracker.createInstance<KeywordArgumentContext>(_ctx, getState());
  enterRule(_localctx, 50, FabParser::RuleKeywordArgument);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(264);
    match(FabParser::Identifier);
    setState(265);
    match(FabParser::Assign);
    setState(266);
    expression(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- KeywordArgumentsContext ------------------------------------------------------------------

FabParser::KeywordArgumentsContext::KeywordArgumentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<FabParser::KeywordArgumentContext *> FabParser::KeywordArgumentsContext::keywordArgument() {
  return getRuleContexts<FabParser::KeywordArgumentContext>();
}

FabParser::KeywordArgumentContext* FabParser::KeywordArgumentsContext::keywordArgument(size_t i) {
  return getRuleContext<FabParser::KeywordArgumentContext>(i);
}

std::vector<tree::TerminalNode *> FabParser::KeywordArgumentsContext::ArgSep() {
  return getTokens(FabParser::ArgSep);
}

tree::TerminalNode* FabParser::KeywordArgumentsContext::ArgSep(size_t i) {
  return getToken(FabParser::ArgSep, i);
}


size_t FabParser::KeywordArgumentsContext::getRuleIndex() const {
  return FabParser::RuleKeywordArguments;
}

antlrcpp::Any FabParser::KeywordArgumentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitKeywordArguments(this);
  else
    return visitor->visitChildren(this);
}

FabParser::KeywordArgumentsContext* FabParser::keywordArguments() {
  KeywordArgumentsContext *_localctx = _tracker.createInstance<KeywordArgumentsContext>(_ctx, getState());
  enterRule(_localctx, 52, FabParser::RuleKeywordArguments);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(268);
    dynamic_cast<KeywordArgumentsContext *>(_localctx)->keywordArgumentContext = keywordArgument();
    dynamic_cast<KeywordArgumentsContext *>(_localctx)->args.push_back(dynamic_cast<KeywordArgumentsContext *>(_localctx)->keywordArgumentContext);
    setState(273);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(269);
        match(FabParser::ArgSep);
        setState(270);
        dynamic_cast<KeywordArgumentsContext *>(_localctx)->keywordArgumentContext = keywordArgument();
        dynamic_cast<KeywordArgumentsContext *>(_localctx)->args.push_back(dynamic_cast<KeywordArgumentsContext *>(_localctx)->keywordArgumentContext); 
      }
      setState(275);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
    }
    setState(277);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::ArgSep) {
      setState(276);
      match(FabParser::ArgSep);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PositionalArgumentsContext ------------------------------------------------------------------

FabParser::PositionalArgumentsContext::PositionalArgumentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<FabParser::ExpressionContext *> FabParser::PositionalArgumentsContext::expression() {
  return getRuleContexts<FabParser::ExpressionContext>();
}

FabParser::ExpressionContext* FabParser::PositionalArgumentsContext::expression(size_t i) {
  return getRuleContext<FabParser::ExpressionContext>(i);
}

std::vector<tree::TerminalNode *> FabParser::PositionalArgumentsContext::ArgSep() {
  return getTokens(FabParser::ArgSep);
}

tree::TerminalNode* FabParser::PositionalArgumentsContext::ArgSep(size_t i) {
  return getToken(FabParser::ArgSep, i);
}


size_t FabParser::PositionalArgumentsContext::getRuleIndex() const {
  return FabParser::RulePositionalArguments;
}

antlrcpp::Any FabParser::PositionalArgumentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitPositionalArguments(this);
  else
    return visitor->visitChildren(this);
}

FabParser::PositionalArgumentsContext* FabParser::positionalArguments() {
  PositionalArgumentsContext *_localctx = _tracker.createInstance<PositionalArgumentsContext>(_ctx, getState());
  enterRule(_localctx, 54, FabParser::RulePositionalArguments);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(279);
    expression(0);
    setState(284);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(280);
        match(FabParser::ArgSep);
        setState(281);
        expression(0); 
      }
      setState(286);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx);
    }
    setState(288);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      setState(287);
      match(FabParser::ArgSep);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParametersContext ------------------------------------------------------------------

FabParser::ParametersContext::ParametersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<FabParser::ParameterContext *> FabParser::ParametersContext::parameter() {
  return getRuleContexts<FabParser::ParameterContext>();
}

FabParser::ParameterContext* FabParser::ParametersContext::parameter(size_t i) {
  return getRuleContext<FabParser::ParameterContext>(i);
}

std::vector<tree::TerminalNode *> FabParser::ParametersContext::ArgSep() {
  return getTokens(FabParser::ArgSep);
}

tree::TerminalNode* FabParser::ParametersContext::ArgSep(size_t i) {
  return getToken(FabParser::ArgSep, i);
}


size_t FabParser::ParametersContext::getRuleIndex() const {
  return FabParser::RuleParameters;
}

antlrcpp::Any FabParser::ParametersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitParameters(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ParametersContext* FabParser::parameters() {
  ParametersContext *_localctx = _tracker.createInstance<ParametersContext>(_ctx, getState());
  enterRule(_localctx, 56, FabParser::RuleParameters);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(298);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::Identifier) {
      setState(290);
      parameter();
      setState(295);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == FabParser::ArgSep) {
        setState(291);
        match(FabParser::ArgSep);
        setState(292);
        parameter();
        setState(297);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParameterContext ------------------------------------------------------------------

FabParser::ParameterContext::ParameterContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::ParameterContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}

tree::TerminalNode* FabParser::ParameterContext::TypeSep() {
  return getToken(FabParser::TypeSep, 0);
}

FabParser::TypeContext* FabParser::ParameterContext::type() {
  return getRuleContext<FabParser::TypeContext>(0);
}

tree::TerminalNode* FabParser::ParameterContext::Assign() {
  return getToken(FabParser::Assign, 0);
}

FabParser::ExpressionContext* FabParser::ParameterContext::expression() {
  return getRuleContext<FabParser::ExpressionContext>(0);
}


size_t FabParser::ParameterContext::getRuleIndex() const {
  return FabParser::RuleParameter;
}

antlrcpp::Any FabParser::ParameterContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitParameter(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ParameterContext* FabParser::parameter() {
  ParameterContext *_localctx = _tracker.createInstance<ParameterContext>(_ctx, getState());
  enterRule(_localctx, 58, FabParser::RuleParameter);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(300);
    match(FabParser::Identifier);
    setState(301);
    match(FabParser::TypeSep);
    setState(302);
    type();
    setState(305);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::Assign) {
      setState(303);
      match(FabParser::Assign);
      setState(304);
      dynamic_cast<ParameterContext *>(_localctx)->defaultArgument = expression(0);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

FabParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

FabParser::FunctionTypeContext* FabParser::TypeContext::functionType() {
  return getRuleContext<FabParser::FunctionTypeContext>(0);
}

FabParser::RecordTypeContext* FabParser::TypeContext::recordType() {
  return getRuleContext<FabParser::RecordTypeContext>(0);
}

FabParser::ParametricTypeContext* FabParser::TypeContext::parametricType() {
  return getRuleContext<FabParser::ParametricTypeContext>(0);
}

FabParser::SimpleTypeContext* FabParser::TypeContext::simpleType() {
  return getRuleContext<FabParser::SimpleTypeContext>(0);
}


size_t FabParser::TypeContext::getRuleIndex() const {
  return FabParser::RuleType;
}

antlrcpp::Any FabParser::TypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitType(this);
  else
    return visitor->visitChildren(this);
}

FabParser::TypeContext* FabParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 60, FabParser::RuleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(311);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(307);
      functionType();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(308);
      recordType();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(309);
      parametricType();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(310);
      simpleType();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionTypeContext ------------------------------------------------------------------

FabParser::FunctionTypeContext::FunctionTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::FunctionTypeContext::ParenOpen() {
  return getToken(FabParser::ParenOpen, 0);
}

tree::TerminalNode* FabParser::FunctionTypeContext::ParenClose() {
  return getToken(FabParser::ParenClose, 0);
}

tree::TerminalNode* FabParser::FunctionTypeContext::Produces() {
  return getToken(FabParser::Produces, 0);
}

FabParser::TypeContext* FabParser::FunctionTypeContext::type() {
  return getRuleContext<FabParser::TypeContext>(0);
}

FabParser::TypeListContext* FabParser::FunctionTypeContext::typeList() {
  return getRuleContext<FabParser::TypeListContext>(0);
}


size_t FabParser::FunctionTypeContext::getRuleIndex() const {
  return FabParser::RuleFunctionType;
}

antlrcpp::Any FabParser::FunctionTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitFunctionType(this);
  else
    return visitor->visitChildren(this);
}

FabParser::FunctionTypeContext* FabParser::functionType() {
  FunctionTypeContext *_localctx = _tracker.createInstance<FunctionTypeContext>(_ctx, getState());
  enterRule(_localctx, 62, FabParser::RuleFunctionType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(313);
    match(FabParser::ParenOpen);
    setState(315);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << FabParser::Record)
      | (1ULL << FabParser::ParenOpen)
      | (1ULL << FabParser::Identifier))) != 0)) {
      setState(314);
      dynamic_cast<FunctionTypeContext *>(_localctx)->params = typeList();
    }
    setState(317);
    match(FabParser::ParenClose);
    setState(318);
    match(FabParser::Produces);
    setState(319);
    dynamic_cast<FunctionTypeContext *>(_localctx)->result = type();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RecordTypeContext ------------------------------------------------------------------

FabParser::RecordTypeContext::RecordTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::RecordTypeContext::Record() {
  return getToken(FabParser::Record, 0);
}

tree::TerminalNode* FabParser::RecordTypeContext::BracketOpen() {
  return getToken(FabParser::BracketOpen, 0);
}

tree::TerminalNode* FabParser::RecordTypeContext::BracketClose() {
  return getToken(FabParser::BracketClose, 0);
}

std::vector<FabParser::FieldTypeContext *> FabParser::RecordTypeContext::fieldType() {
  return getRuleContexts<FabParser::FieldTypeContext>();
}

FabParser::FieldTypeContext* FabParser::RecordTypeContext::fieldType(size_t i) {
  return getRuleContext<FabParser::FieldTypeContext>(i);
}

std::vector<tree::TerminalNode *> FabParser::RecordTypeContext::ArgSep() {
  return getTokens(FabParser::ArgSep);
}

tree::TerminalNode* FabParser::RecordTypeContext::ArgSep(size_t i) {
  return getToken(FabParser::ArgSep, i);
}


size_t FabParser::RecordTypeContext::getRuleIndex() const {
  return FabParser::RuleRecordType;
}

antlrcpp::Any FabParser::RecordTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitRecordType(this);
  else
    return visitor->visitChildren(this);
}

FabParser::RecordTypeContext* FabParser::recordType() {
  RecordTypeContext *_localctx = _tracker.createInstance<RecordTypeContext>(_ctx, getState());
  enterRule(_localctx, 64, FabParser::RuleRecordType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(321);
    match(FabParser::Record);
    setState(322);
    match(FabParser::BracketOpen);
    setState(331);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::Identifier) {
      setState(323);
      fieldType();
      setState(328);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(324);
          match(FabParser::ArgSep);
          setState(325);
          fieldType(); 
        }
        setState(330);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx);
      }
    }
    setState(334);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::ArgSep) {
      setState(333);
      match(FabParser::ArgSep);
    }
    setState(336);
    match(FabParser::BracketClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldTypeContext ------------------------------------------------------------------

FabParser::FieldTypeContext::FieldTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::FieldTypeContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}

tree::TerminalNode* FabParser::FieldTypeContext::TypeSep() {
  return getToken(FabParser::TypeSep, 0);
}

FabParser::TypeContext* FabParser::FieldTypeContext::type() {
  return getRuleContext<FabParser::TypeContext>(0);
}


size_t FabParser::FieldTypeContext::getRuleIndex() const {
  return FabParser::RuleFieldType;
}

antlrcpp::Any FabParser::FieldTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitFieldType(this);
  else
    return visitor->visitChildren(this);
}

FabParser::FieldTypeContext* FabParser::fieldType() {
  FieldTypeContext *_localctx = _tracker.createInstance<FieldTypeContext>(_ctx, getState());
  enterRule(_localctx, 66, FabParser::RuleFieldType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(338);
    match(FabParser::Identifier);
    setState(339);
    match(FabParser::TypeSep);
    setState(340);
    type();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParametricTypeContext ------------------------------------------------------------------

FabParser::ParametricTypeContext::ParametricTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::ParametricTypeContext::BracketOpen() {
  return getToken(FabParser::BracketOpen, 0);
}

tree::TerminalNode* FabParser::ParametricTypeContext::BracketClose() {
  return getToken(FabParser::BracketClose, 0);
}

FabParser::SimpleTypeContext* FabParser::ParametricTypeContext::simpleType() {
  return getRuleContext<FabParser::SimpleTypeContext>(0);
}

FabParser::TypeListContext* FabParser::ParametricTypeContext::typeList() {
  return getRuleContext<FabParser::TypeListContext>(0);
}


size_t FabParser::ParametricTypeContext::getRuleIndex() const {
  return FabParser::RuleParametricType;
}

antlrcpp::Any FabParser::ParametricTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitParametricType(this);
  else
    return visitor->visitChildren(this);
}

FabParser::ParametricTypeContext* FabParser::parametricType() {
  ParametricTypeContext *_localctx = _tracker.createInstance<ParametricTypeContext>(_ctx, getState());
  enterRule(_localctx, 68, FabParser::RuleParametricType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(342);
    dynamic_cast<ParametricTypeContext *>(_localctx)->base = simpleType();
    setState(343);
    match(FabParser::BracketOpen);
    setState(344);
    dynamic_cast<ParametricTypeContext *>(_localctx)->params = typeList();
    setState(345);
    match(FabParser::BracketClose);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SimpleTypeContext ------------------------------------------------------------------

FabParser::SimpleTypeContext::SimpleTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* FabParser::SimpleTypeContext::Identifier() {
  return getToken(FabParser::Identifier, 0);
}


size_t FabParser::SimpleTypeContext::getRuleIndex() const {
  return FabParser::RuleSimpleType;
}

antlrcpp::Any FabParser::SimpleTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitSimpleType(this);
  else
    return visitor->visitChildren(this);
}

FabParser::SimpleTypeContext* FabParser::simpleType() {
  SimpleTypeContext *_localctx = _tracker.createInstance<SimpleTypeContext>(_ctx, getState());
  enterRule(_localctx, 70, FabParser::RuleSimpleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(347);
    match(FabParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeListContext ------------------------------------------------------------------

FabParser::TypeListContext::TypeListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<FabParser::TypeContext *> FabParser::TypeListContext::type() {
  return getRuleContexts<FabParser::TypeContext>();
}

FabParser::TypeContext* FabParser::TypeListContext::type(size_t i) {
  return getRuleContext<FabParser::TypeContext>(i);
}

std::vector<tree::TerminalNode *> FabParser::TypeListContext::ArgSep() {
  return getTokens(FabParser::ArgSep);
}

tree::TerminalNode* FabParser::TypeListContext::ArgSep(size_t i) {
  return getToken(FabParser::ArgSep, i);
}


size_t FabParser::TypeListContext::getRuleIndex() const {
  return FabParser::RuleTypeList;
}

antlrcpp::Any FabParser::TypeListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<FabParserVisitor*>(visitor))
    return parserVisitor->visitTypeList(this);
  else
    return visitor->visitChildren(this);
}

FabParser::TypeListContext* FabParser::typeList() {
  TypeListContext *_localctx = _tracker.createInstance<TypeListContext>(_ctx, getState());
  enterRule(_localctx, 72, FabParser::RuleTypeList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(349);
    type();
    setState(354);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(350);
        match(FabParser::ArgSep);
        setState(351);
        type(); 
      }
      setState(356);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx);
    }
    setState(358);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == FabParser::ArgSep) {
      setState(357);
      match(FabParser::ArgSep);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool FabParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 2: return expressionSempred(dynamic_cast<ExpressionContext *>(context), predicateIndex);
    case 10: return fieldReferenceSempred(dynamic_cast<FieldReferenceContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool FabParser::expressionSempred(ExpressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 13);
    case 1: return precpred(_ctx, 12);
    case 2: return precpred(_ctx, 11);
    case 3: return precpred(_ctx, 10);
    case 4: return precpred(_ctx, 9);

  default:
    break;
  }
  return true;
}

bool FabParser::fieldReferenceSempred(FieldReferenceContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 5: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> FabParser::_decisionToDFA;
atn::PredictionContextCache FabParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN FabParser::_atn;
std::vector<uint16_t> FabParser::_serializedATN;

std::vector<std::string> FabParser::_ruleNames = {
  "file", "value", "expression", "addOp", "compareOp", "logicOp", "multOp", 
  "call", "conditional", "fieldQuery", "fieldReference", "foreach", "function", 
  "unaryOperation", "unaryOperator", "term", "buildAction", "compoundExpr", 
  "fileList", "list", "literal", "nameReference", "parentheticalExpression", 
  "typeDeclaration", "arguments", "keywordArgument", "keywordArguments", 
  "positionalArguments", "parameters", "parameter", "type", "functionType", 
  "recordType", "fieldType", "parametricType", "simpleType", "typeList"
};

std::vector<std::string> FabParser::_literalNames = {
  "", "", "", "'action'", "'files('", "'foreach'", "'function'", "'else'", 
  "'if'", "'record'", "'type'", "", "", "", "'and'", "'::'", "'/'", "'=='", 
  "'-'", "'*'", "'not'", "'!='", "'or'", "'+'", "'xor'", "", "'='", "'{'", 
  "'}'", "'['", "']'", "';'", "'.'", "'<-'", "'('", "", "'->'", "'?'", "':'"
};

std::vector<std::string> FabParser::_symbolicNames = {
  "", "Comment", "WS", "Action", "FileListStart", "Foreach", "Function", 
  "Else", "If", "Record", "Type", "BoolLiteral", "IntLiteral", "StringLiteral", 
  "And", "Cons", "Divide", "Equals", "Minus", "Multiply", "Not", "NotEquals", 
  "Or", "Plus", "Xor", "ArgSep", "Assign", "BraceOpen", "BraceClose", "BracketOpen", 
  "BracketClose", "End", "FieldSep", "Input", "ParenOpen", "ParenClose", 
  "Produces", "Query", "TypeSep", "Identifier", "FileListArgs", "FileListEnd", 
  "FilenameLiteral", "FileListWS"
};

dfa::Vocabulary FabParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> FabParser::_tokenNames;

FabParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x2d, 0x16b, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 
    0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x4, 
    0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 0x9, 0x14, 0x4, 0x15, 
    0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 0x9, 0x17, 0x4, 0x18, 0x9, 
    0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 
    0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 
    0x1f, 0x9, 0x1f, 0x4, 0x20, 0x9, 0x20, 0x4, 0x21, 0x9, 0x21, 0x4, 0x22, 
    0x9, 0x22, 0x4, 0x23, 0x9, 0x23, 0x4, 0x24, 0x9, 0x24, 0x4, 0x25, 0x9, 
    0x25, 0x4, 0x26, 0x9, 0x26, 0x3, 0x2, 0x7, 0x2, 0x4e, 0xa, 0x2, 0xc, 
    0x2, 0xe, 0x2, 0x51, 0xb, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x5, 0x3, 0x58, 0xa, 0x3, 0x3, 0x3, 0x5, 0x3, 0x5b, 0xa, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
    0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x69, 0xa, 
    0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
    0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
    0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x7, 0x4, 0x7e, 
    0xa, 0x4, 0xc, 0x4, 0xe, 0x4, 0x81, 0xb, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 
    0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x5, 0x9, 0x8e, 0xa, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 
    0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x7, 0xc, 0xa6, 0xa, 
    0xc, 0xc, 0xc, 0xe, 0xc, 0xa9, 0xb, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x5, 0xd, 0xaf, 0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 
    0xe, 0xbb, 0xa, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 
    0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
    0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 0xcc, 0xa, 0x11, 0x3, 
    0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x5, 0x12, 0xd3, 0xa, 
    0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 0x3, 0x13, 0x7, 0x13, 0xd9, 0xa, 
    0x13, 0xc, 0x13, 0xe, 0x13, 0xdc, 0xb, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
    0x13, 0x3, 0x14, 0x3, 0x14, 0x7, 0x14, 0xe3, 0xa, 0x14, 0xc, 0x14, 0xe, 
    0x14, 0xe6, 0xb, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
    0x14, 0x5, 0x14, 0xed, 0xa, 0x14, 0x3, 0x15, 0x3, 0x15, 0x7, 0x15, 0xf1, 
    0xa, 0x15, 0xc, 0x15, 0xe, 0x15, 0xf4, 0xb, 0x15, 0x3, 0x15, 0x3, 0x15, 
    0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 
    0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 
    0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0x109, 0xa, 0x1a, 
    0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 
    0x1c, 0x7, 0x1c, 0x112, 0xa, 0x1c, 0xc, 0x1c, 0xe, 0x1c, 0x115, 0xb, 
    0x1c, 0x3, 0x1c, 0x5, 0x1c, 0x118, 0xa, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 
    0x3, 0x1d, 0x7, 0x1d, 0x11d, 0xa, 0x1d, 0xc, 0x1d, 0xe, 0x1d, 0x120, 
    0xb, 0x1d, 0x3, 0x1d, 0x5, 0x1d, 0x123, 0xa, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 
    0x3, 0x1e, 0x7, 0x1e, 0x128, 0xa, 0x1e, 0xc, 0x1e, 0xe, 0x1e, 0x12b, 
    0xb, 0x1e, 0x5, 0x1e, 0x12d, 0xa, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 
    0x3, 0x1f, 0x3, 0x1f, 0x5, 0x1f, 0x134, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 
    0x3, 0x20, 0x3, 0x20, 0x5, 0x20, 0x13a, 0xa, 0x20, 0x3, 0x21, 0x3, 0x21, 
    0x5, 0x21, 0x13e, 0xa, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 
    0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x7, 0x22, 0x149, 
    0xa, 0x22, 0xc, 0x22, 0xe, 0x22, 0x14c, 0xb, 0x22, 0x5, 0x22, 0x14e, 
    0xa, 0x22, 0x3, 0x22, 0x5, 0x22, 0x151, 0xa, 0x22, 0x3, 0x22, 0x3, 0x22, 
    0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 
    0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x25, 0x3, 0x25, 0x3, 0x26, 0x3, 0x26, 
    0x3, 0x26, 0x7, 0x26, 0x163, 0xa, 0x26, 0xc, 0x26, 0xe, 0x26, 0x166, 
    0xb, 0x26, 0x3, 0x26, 0x5, 0x26, 0x169, 0xa, 0x26, 0x3, 0x26, 0x2, 0x4, 
    0x6, 0x16, 0x27, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 
    0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 
    0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 0x42, 0x44, 
    0x46, 0x48, 0x4a, 0x2, 0x8, 0x4, 0x2, 0x14, 0x14, 0x19, 0x19, 0x4, 0x2, 
    0x13, 0x13, 0x17, 0x17, 0x5, 0x2, 0x10, 0x10, 0x18, 0x18, 0x1a, 0x1a, 
    0x4, 0x2, 0x12, 0x12, 0x15, 0x15, 0x5, 0x2, 0x14, 0x14, 0x16, 0x16, 
    0x19, 0x19, 0x3, 0x2, 0xd, 0xf, 0x2, 0x176, 0x2, 0x4f, 0x3, 0x2, 0x2, 
    0x2, 0x4, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x6, 0x68, 0x3, 0x2, 0x2, 0x2, 0x8, 
    0x82, 0x3, 0x2, 0x2, 0x2, 0xa, 0x84, 0x3, 0x2, 0x2, 0x2, 0xc, 0x86, 
    0x3, 0x2, 0x2, 0x2, 0xe, 0x88, 0x3, 0x2, 0x2, 0x2, 0x10, 0x8a, 0x3, 
    0x2, 0x2, 0x2, 0x12, 0x91, 0x3, 0x2, 0x2, 0x2, 0x14, 0x97, 0x3, 0x2, 
    0x2, 0x2, 0x16, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x18, 0xaa, 0x3, 0x2, 0x2, 
    0x2, 0x1a, 0xb4, 0x3, 0x2, 0x2, 0x2, 0x1c, 0xbe, 0x3, 0x2, 0x2, 0x2, 
    0x1e, 0xc1, 0x3, 0x2, 0x2, 0x2, 0x20, 0xcb, 0x3, 0x2, 0x2, 0x2, 0x22, 
    0xcd, 0x3, 0x2, 0x2, 0x2, 0x24, 0xd6, 0x3, 0x2, 0x2, 0x2, 0x26, 0xe0, 
    0x3, 0x2, 0x2, 0x2, 0x28, 0xee, 0x3, 0x2, 0x2, 0x2, 0x2a, 0xf7, 0x3, 
    0x2, 0x2, 0x2, 0x2c, 0xf9, 0x3, 0x2, 0x2, 0x2, 0x2e, 0xfb, 0x3, 0x2, 
    0x2, 0x2, 0x30, 0xff, 0x3, 0x2, 0x2, 0x2, 0x32, 0x108, 0x3, 0x2, 0x2, 
    0x2, 0x34, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x36, 0x10e, 0x3, 0x2, 0x2, 0x2, 
    0x38, 0x119, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x12c, 0x3, 0x2, 0x2, 0x2, 0x3c, 
    0x12e, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x139, 0x3, 0x2, 0x2, 0x2, 0x40, 0x13b, 
    0x3, 0x2, 0x2, 0x2, 0x42, 0x143, 0x3, 0x2, 0x2, 0x2, 0x44, 0x154, 0x3, 
    0x2, 0x2, 0x2, 0x46, 0x158, 0x3, 0x2, 0x2, 0x2, 0x48, 0x15d, 0x3, 0x2, 
    0x2, 0x2, 0x4a, 0x15f, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x4e, 0x5, 0x4, 0x3, 
    0x2, 0x4d, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x51, 0x3, 0x2, 0x2, 0x2, 
    0x4f, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x50, 0x3, 0x2, 0x2, 0x2, 0x50, 
    0x52, 0x3, 0x2, 0x2, 0x2, 0x51, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x52, 0x53, 
    0x7, 0x2, 0x2, 0x3, 0x53, 0x3, 0x3, 0x2, 0x2, 0x2, 0x54, 0x57, 0x7, 
    0x29, 0x2, 0x2, 0x55, 0x56, 0x7, 0x28, 0x2, 0x2, 0x56, 0x58, 0x5, 0x3e, 
    0x20, 0x2, 0x57, 0x55, 0x3, 0x2, 0x2, 0x2, 0x57, 0x58, 0x3, 0x2, 0x2, 
    0x2, 0x58, 0x59, 0x3, 0x2, 0x2, 0x2, 0x59, 0x5b, 0x7, 0x1c, 0x2, 0x2, 
    0x5a, 0x54, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x5b, 
    0x5c, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x5d, 0x5, 0x6, 0x4, 0x2, 0x5d, 0x5e, 
    0x7, 0x21, 0x2, 0x2, 0x5e, 0x5, 0x3, 0x2, 0x2, 0x2, 0x5f, 0x60, 0x8, 
    0x4, 0x1, 0x2, 0x60, 0x69, 0x5, 0x10, 0x9, 0x2, 0x61, 0x69, 0x5, 0x12, 
    0xa, 0x2, 0x62, 0x69, 0x5, 0x14, 0xb, 0x2, 0x63, 0x69, 0x5, 0x16, 0xc, 
    0x2, 0x64, 0x69, 0x5, 0x18, 0xd, 0x2, 0x65, 0x69, 0x5, 0x1a, 0xe, 0x2, 
    0x66, 0x69, 0x5, 0x1c, 0xf, 0x2, 0x67, 0x69, 0x5, 0x20, 0x11, 0x2, 0x68, 
    0x5f, 0x3, 0x2, 0x2, 0x2, 0x68, 0x61, 0x3, 0x2, 0x2, 0x2, 0x68, 0x62, 
    0x3, 0x2, 0x2, 0x2, 0x68, 0x63, 0x3, 0x2, 0x2, 0x2, 0x68, 0x64, 0x3, 
    0x2, 0x2, 0x2, 0x68, 0x65, 0x3, 0x2, 0x2, 0x2, 0x68, 0x66, 0x3, 0x2, 
    0x2, 0x2, 0x68, 0x67, 0x3, 0x2, 0x2, 0x2, 0x69, 0x7f, 0x3, 0x2, 0x2, 
    0x2, 0x6a, 0x6b, 0xc, 0xf, 0x2, 0x2, 0x6b, 0x6c, 0x5, 0xe, 0x8, 0x2, 
    0x6c, 0x6d, 0x5, 0x6, 0x4, 0x10, 0x6d, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x6e, 
    0x6f, 0xc, 0xe, 0x2, 0x2, 0x6f, 0x70, 0x5, 0x8, 0x5, 0x2, 0x70, 0x71, 
    0x5, 0x6, 0x4, 0xf, 0x71, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x72, 0x73, 0xc, 
    0xd, 0x2, 0x2, 0x73, 0x74, 0x5, 0xa, 0x6, 0x2, 0x74, 0x75, 0x5, 0x6, 
    0x4, 0xe, 0x75, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x76, 0x77, 0xc, 0xc, 0x2, 
    0x2, 0x77, 0x78, 0x5, 0xc, 0x7, 0x2, 0x78, 0x79, 0x5, 0x6, 0x4, 0xd, 
    0x79, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7b, 0xc, 0xb, 0x2, 0x2, 0x7b, 
    0x7c, 0x7, 0x11, 0x2, 0x2, 0x7c, 0x7e, 0x5, 0x6, 0x4, 0xb, 0x7d, 0x6a, 
    0x3, 0x2, 0x2, 0x2, 0x7d, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x72, 0x3, 
    0x2, 0x2, 0x2, 0x7d, 0x76, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x7a, 0x3, 0x2, 
    0x2, 0x2, 0x7e, 0x81, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x7d, 0x3, 0x2, 0x2, 
    0x2, 0x7f, 0x80, 0x3, 0x2, 0x2, 0x2, 0x80, 0x7, 0x3, 0x2, 0x2, 0x2, 
    0x81, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x82, 0x83, 0x9, 0x2, 0x2, 0x2, 0x83, 
    0x9, 0x3, 0x2, 0x2, 0x2, 0x84, 0x85, 0x9, 0x3, 0x2, 0x2, 0x85, 0xb, 
    0x3, 0x2, 0x2, 0x2, 0x86, 0x87, 0x9, 0x4, 0x2, 0x2, 0x87, 0xd, 0x3, 
    0x2, 0x2, 0x2, 0x88, 0x89, 0x9, 0x5, 0x2, 0x2, 0x89, 0xf, 0x3, 0x2, 
    0x2, 0x2, 0x8a, 0x8b, 0x5, 0x20, 0x11, 0x2, 0x8b, 0x8d, 0x7, 0x24, 0x2, 
    0x2, 0x8c, 0x8e, 0x5, 0x32, 0x1a, 0x2, 0x8d, 0x8c, 0x3, 0x2, 0x2, 0x2, 
    0x8d, 0x8e, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x8f, 
    0x90, 0x7, 0x25, 0x2, 0x2, 0x90, 0x11, 0x3, 0x2, 0x2, 0x2, 0x91, 0x92, 
    0x7, 0xa, 0x2, 0x2, 0x92, 0x93, 0x5, 0x6, 0x4, 0x2, 0x93, 0x94, 0x5, 
    0x6, 0x4, 0x2, 0x94, 0x95, 0x7, 0x9, 0x2, 0x2, 0x95, 0x96, 0x5, 0x6, 
    0x4, 0x2, 0x96, 0x13, 0x3, 0x2, 0x2, 0x2, 0x97, 0x98, 0x5, 0x20, 0x11, 
    0x2, 0x98, 0x99, 0x7, 0x22, 0x2, 0x2, 0x99, 0x9a, 0x7, 0x29, 0x2, 0x2, 
    0x9a, 0x9b, 0x7, 0x27, 0x2, 0x2, 0x9b, 0x9c, 0x5, 0x6, 0x4, 0x2, 0x9c, 
    0x15, 0x3, 0x2, 0x2, 0x2, 0x9d, 0x9e, 0x8, 0xc, 0x1, 0x2, 0x9e, 0x9f, 
    0x5, 0x20, 0x11, 0x2, 0x9f, 0xa0, 0x7, 0x22, 0x2, 0x2, 0xa0, 0xa1, 0x7, 
    0x29, 0x2, 0x2, 0xa1, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xa2, 0xa3, 0xc, 0x3, 
    0x2, 0x2, 0xa3, 0xa4, 0x7, 0x22, 0x2, 0x2, 0xa4, 0xa6, 0x7, 0x29, 0x2, 
    0x2, 0xa5, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xa6, 0xa9, 0x3, 0x2, 0x2, 0x2, 
    0xa7, 0xa5, 0x3, 0x2, 0x2, 0x2, 0xa7, 0xa8, 0x3, 0x2, 0x2, 0x2, 0xa8, 
    0x17, 0x3, 0x2, 0x2, 0x2, 0xa9, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xaa, 0xab, 
    0x7, 0x7, 0x2, 0x2, 0xab, 0xae, 0x7, 0x29, 0x2, 0x2, 0xac, 0xad, 0x7, 
    0x28, 0x2, 0x2, 0xad, 0xaf, 0x5, 0x3e, 0x20, 0x2, 0xae, 0xac, 0x3, 0x2, 
    0x2, 0x2, 0xae, 0xaf, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xb0, 0x3, 0x2, 0x2, 
    0x2, 0xb0, 0xb1, 0x7, 0x23, 0x2, 0x2, 0xb1, 0xb2, 0x5, 0x6, 0x4, 0x2, 
    0xb2, 0xb3, 0x5, 0x6, 0x4, 0x2, 0xb3, 0x19, 0x3, 0x2, 0x2, 0x2, 0xb4, 
    0xb5, 0x7, 0x8, 0x2, 0x2, 0xb5, 0xb6, 0x7, 0x24, 0x2, 0x2, 0xb6, 0xb7, 
    0x5, 0x3a, 0x1e, 0x2, 0xb7, 0xba, 0x7, 0x25, 0x2, 0x2, 0xb8, 0xb9, 0x7, 
    0x28, 0x2, 0x2, 0xb9, 0xbb, 0x5, 0x3e, 0x20, 0x2, 0xba, 0xb8, 0x3, 0x2, 
    0x2, 0x2, 0xba, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xbb, 0xbc, 0x3, 0x2, 0x2, 
    0x2, 0xbc, 0xbd, 0x5, 0x6, 0x4, 0x2, 0xbd, 0x1b, 0x3, 0x2, 0x2, 0x2, 
    0xbe, 0xbf, 0x5, 0x1e, 0x10, 0x2, 0xbf, 0xc0, 0x5, 0x6, 0x4, 0x2, 0xc0, 
    0x1d, 0x3, 0x2, 0x2, 0x2, 0xc1, 0xc2, 0x9, 0x6, 0x2, 0x2, 0xc2, 0x1f, 
    0x3, 0x2, 0x2, 0x2, 0xc3, 0xcc, 0x5, 0x22, 0x12, 0x2, 0xc4, 0xcc, 0x5, 
    0x24, 0x13, 0x2, 0xc5, 0xcc, 0x5, 0x26, 0x14, 0x2, 0xc6, 0xcc, 0x5, 
    0x28, 0x15, 0x2, 0xc7, 0xcc, 0x5, 0x2a, 0x16, 0x2, 0xc8, 0xcc, 0x5, 
    0x2c, 0x17, 0x2, 0xc9, 0xcc, 0x5, 0x2e, 0x18, 0x2, 0xca, 0xcc, 0x5, 
    0x30, 0x19, 0x2, 0xcb, 0xc3, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xc4, 0x3, 0x2, 
    0x2, 0x2, 0xcb, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xc6, 0x3, 0x2, 0x2, 
    0x2, 0xcb, 0xc7, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xc8, 0x3, 0x2, 0x2, 0x2, 
    0xcb, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xca, 0x3, 0x2, 0x2, 0x2, 0xcc, 
    0x21, 0x3, 0x2, 0x2, 0x2, 0xcd, 0xce, 0x7, 0x5, 0x2, 0x2, 0xce, 0xcf, 
    0x7, 0x24, 0x2, 0x2, 0xcf, 0xd2, 0x5, 0x32, 0x1a, 0x2, 0xd0, 0xd1, 0x7, 
    0x23, 0x2, 0x2, 0xd1, 0xd3, 0x5, 0x3a, 0x1e, 0x2, 0xd2, 0xd0, 0x3, 0x2, 
    0x2, 0x2, 0xd2, 0xd3, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd4, 0x3, 0x2, 0x2, 
    0x2, 0xd4, 0xd5, 0x7, 0x25, 0x2, 0x2, 0xd5, 0x23, 0x3, 0x2, 0x2, 0x2, 
    0xd6, 0xda, 0x7, 0x1d, 0x2, 0x2, 0xd7, 0xd9, 0x5, 0x4, 0x3, 0x2, 0xd8, 
    0xd7, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xda, 0xd8, 
    0x3, 0x2, 0x2, 0x2, 0xda, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xdd, 0x3, 
    0x2, 0x2, 0x2, 0xdc, 0xda, 0x3, 0x2, 0x2, 0x2, 0xdd, 0xde, 0x5, 0x6, 
    0x4, 0x2, 0xde, 0xdf, 0x7, 0x1e, 0x2, 0x2, 0xdf, 0x25, 0x3, 0x2, 0x2, 
    0x2, 0xe0, 0xe4, 0x7, 0x6, 0x2, 0x2, 0xe1, 0xe3, 0x7, 0x2c, 0x2, 0x2, 
    0xe2, 0xe1, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xe4, 
    0xe2, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe5, 0xec, 
    0x3, 0x2, 0x2, 0x2, 0xe6, 0xe4, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xed, 0x7, 
    0x2b, 0x2, 0x2, 0xe8, 0xe9, 0x7, 0x2a, 0x2, 0x2, 0xe9, 0xea, 0x5, 0x36, 
    0x1c, 0x2, 0xea, 0xeb, 0x7, 0x25, 0x2, 0x2, 0xeb, 0xed, 0x3, 0x2, 0x2, 
    0x2, 0xec, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xec, 0xe8, 0x3, 0x2, 0x2, 0x2, 
    0xed, 0x27, 0x3, 0x2, 0x2, 0x2, 0xee, 0xf2, 0x7, 0x1f, 0x2, 0x2, 0xef, 
    0xf1, 0x5, 0x6, 0x4, 0x2, 0xf0, 0xef, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xf4, 
    0x3, 0x2, 0x2, 0x2, 0xf2, 0xf0, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xf3, 0x3, 
    0x2, 0x2, 0x2, 0xf3, 0xf5, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xf2, 0x3, 0x2, 
    0x2, 0x2, 0xf5, 0xf6, 0x7, 0x20, 0x2, 0x2, 0xf6, 0x29, 0x3, 0x2, 0x2, 
    0x2, 0xf7, 0xf8, 0x9, 0x7, 0x2, 0x2, 0xf8, 0x2b, 0x3, 0x2, 0x2, 0x2, 
    0xf9, 0xfa, 0x7, 0x29, 0x2, 0x2, 0xfa, 0x2d, 0x3, 0x2, 0x2, 0x2, 0xfb, 
    0xfc, 0x7, 0x24, 0x2, 0x2, 0xfc, 0xfd, 0x5, 0x6, 0x4, 0x2, 0xfd, 0xfe, 
    0x7, 0x25, 0x2, 0x2, 0xfe, 0x2f, 0x3, 0x2, 0x2, 0x2, 0xff, 0x100, 0x7, 
    0xc, 0x2, 0x2, 0x100, 0x101, 0x5, 0x3e, 0x20, 0x2, 0x101, 0x31, 0x3, 
    0x2, 0x2, 0x2, 0x102, 0x103, 0x5, 0x38, 0x1d, 0x2, 0x103, 0x104, 0x7, 
    0x1b, 0x2, 0x2, 0x104, 0x105, 0x5, 0x36, 0x1c, 0x2, 0x105, 0x109, 0x3, 
    0x2, 0x2, 0x2, 0x106, 0x109, 0x5, 0x38, 0x1d, 0x2, 0x107, 0x109, 0x5, 
    0x36, 0x1c, 0x2, 0x108, 0x102, 0x3, 0x2, 0x2, 0x2, 0x108, 0x106, 0x3, 
    0x2, 0x2, 0x2, 0x108, 0x107, 0x3, 0x2, 0x2, 0x2, 0x109, 0x33, 0x3, 0x2, 
    0x2, 0x2, 0x10a, 0x10b, 0x7, 0x29, 0x2, 0x2, 0x10b, 0x10c, 0x7, 0x1c, 
    0x2, 0x2, 0x10c, 0x10d, 0x5, 0x6, 0x4, 0x2, 0x10d, 0x35, 0x3, 0x2, 0x2, 
    0x2, 0x10e, 0x113, 0x5, 0x34, 0x1b, 0x2, 0x10f, 0x110, 0x7, 0x1b, 0x2, 
    0x2, 0x110, 0x112, 0x5, 0x34, 0x1b, 0x2, 0x111, 0x10f, 0x3, 0x2, 0x2, 
    0x2, 0x112, 0x115, 0x3, 0x2, 0x2, 0x2, 0x113, 0x111, 0x3, 0x2, 0x2, 
    0x2, 0x113, 0x114, 0x3, 0x2, 0x2, 0x2, 0x114, 0x117, 0x3, 0x2, 0x2, 
    0x2, 0x115, 0x113, 0x3, 0x2, 0x2, 0x2, 0x116, 0x118, 0x7, 0x1b, 0x2, 
    0x2, 0x117, 0x116, 0x3, 0x2, 0x2, 0x2, 0x117, 0x118, 0x3, 0x2, 0x2, 
    0x2, 0x118, 0x37, 0x3, 0x2, 0x2, 0x2, 0x119, 0x11e, 0x5, 0x6, 0x4, 0x2, 
    0x11a, 0x11b, 0x7, 0x1b, 0x2, 0x2, 0x11b, 0x11d, 0x5, 0x6, 0x4, 0x2, 
    0x11c, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x11d, 0x120, 0x3, 0x2, 0x2, 0x2, 
    0x11e, 0x11c, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11f, 0x3, 0x2, 0x2, 0x2, 
    0x11f, 0x122, 0x3, 0x2, 0x2, 0x2, 0x120, 0x11e, 0x3, 0x2, 0x2, 0x2, 
    0x121, 0x123, 0x7, 0x1b, 0x2, 0x2, 0x122, 0x121, 0x3, 0x2, 0x2, 0x2, 
    0x122, 0x123, 0x3, 0x2, 0x2, 0x2, 0x123, 0x39, 0x3, 0x2, 0x2, 0x2, 0x124, 
    0x129, 0x5, 0x3c, 0x1f, 0x2, 0x125, 0x126, 0x7, 0x1b, 0x2, 0x2, 0x126, 
    0x128, 0x5, 0x3c, 0x1f, 0x2, 0x127, 0x125, 0x3, 0x2, 0x2, 0x2, 0x128, 
    0x12b, 0x3, 0x2, 0x2, 0x2, 0x129, 0x127, 0x3, 0x2, 0x2, 0x2, 0x129, 
    0x12a, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x12b, 
    0x129, 0x3, 0x2, 0x2, 0x2, 0x12c, 0x124, 0x3, 0x2, 0x2, 0x2, 0x12c, 
    0x12d, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x12e, 0x12f, 
    0x7, 0x29, 0x2, 0x2, 0x12f, 0x130, 0x7, 0x28, 0x2, 0x2, 0x130, 0x133, 
    0x5, 0x3e, 0x20, 0x2, 0x131, 0x132, 0x7, 0x1c, 0x2, 0x2, 0x132, 0x134, 
    0x5, 0x6, 0x4, 0x2, 0x133, 0x131, 0x3, 0x2, 0x2, 0x2, 0x133, 0x134, 
    0x3, 0x2, 0x2, 0x2, 0x134, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x135, 0x13a, 0x5, 
    0x40, 0x21, 0x2, 0x136, 0x13a, 0x5, 0x42, 0x22, 0x2, 0x137, 0x13a, 0x5, 
    0x46, 0x24, 0x2, 0x138, 0x13a, 0x5, 0x48, 0x25, 0x2, 0x139, 0x135, 0x3, 
    0x2, 0x2, 0x2, 0x139, 0x136, 0x3, 0x2, 0x2, 0x2, 0x139, 0x137, 0x3, 
    0x2, 0x2, 0x2, 0x139, 0x138, 0x3, 0x2, 0x2, 0x2, 0x13a, 0x3f, 0x3, 0x2, 
    0x2, 0x2, 0x13b, 0x13d, 0x7, 0x24, 0x2, 0x2, 0x13c, 0x13e, 0x5, 0x4a, 
    0x26, 0x2, 0x13d, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x13d, 0x13e, 0x3, 0x2, 
    0x2, 0x2, 0x13e, 0x13f, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x140, 0x7, 0x25, 
    0x2, 0x2, 0x140, 0x141, 0x7, 0x26, 0x2, 0x2, 0x141, 0x142, 0x5, 0x3e, 
    0x20, 0x2, 0x142, 0x41, 0x3, 0x2, 0x2, 0x2, 0x143, 0x144, 0x7, 0xb, 
    0x2, 0x2, 0x144, 0x14d, 0x7, 0x1f, 0x2, 0x2, 0x145, 0x14a, 0x5, 0x44, 
    0x23, 0x2, 0x146, 0x147, 0x7, 0x1b, 0x2, 0x2, 0x147, 0x149, 0x5, 0x44, 
    0x23, 0x2, 0x148, 0x146, 0x3, 0x2, 0x2, 0x2, 0x149, 0x14c, 0x3, 0x2, 
    0x2, 0x2, 0x14a, 0x148, 0x3, 0x2, 0x2, 0x2, 0x14a, 0x14b, 0x3, 0x2, 
    0x2, 0x2, 0x14b, 0x14e, 0x3, 0x2, 0x2, 0x2, 0x14c, 0x14a, 0x3, 0x2, 
    0x2, 0x2, 0x14d, 0x145, 0x3, 0x2, 0x2, 0x2, 0x14d, 0x14e, 0x3, 0x2, 
    0x2, 0x2, 0x14e, 0x150, 0x3, 0x2, 0x2, 0x2, 0x14f, 0x151, 0x7, 0x1b, 
    0x2, 0x2, 0x150, 0x14f, 0x3, 0x2, 0x2, 0x2, 0x150, 0x151, 0x3, 0x2, 
    0x2, 0x2, 0x151, 0x152, 0x3, 0x2, 0x2, 0x2, 0x152, 0x153, 0x7, 0x20, 
    0x2, 0x2, 0x153, 0x43, 0x3, 0x2, 0x2, 0x2, 0x154, 0x155, 0x7, 0x29, 
    0x2, 0x2, 0x155, 0x156, 0x7, 0x28, 0x2, 0x2, 0x156, 0x157, 0x5, 0x3e, 
    0x20, 0x2, 0x157, 0x45, 0x3, 0x2, 0x2, 0x2, 0x158, 0x159, 0x5, 0x48, 
    0x25, 0x2, 0x159, 0x15a, 0x7, 0x1f, 0x2, 0x2, 0x15a, 0x15b, 0x5, 0x4a, 
    0x26, 0x2, 0x15b, 0x15c, 0x7, 0x20, 0x2, 0x2, 0x15c, 0x47, 0x3, 0x2, 
    0x2, 0x2, 0x15d, 0x15e, 0x7, 0x29, 0x2, 0x2, 0x15e, 0x49, 0x3, 0x2, 
    0x2, 0x2, 0x15f, 0x164, 0x5, 0x3e, 0x20, 0x2, 0x160, 0x161, 0x7, 0x1b, 
    0x2, 0x2, 0x161, 0x163, 0x5, 0x3e, 0x20, 0x2, 0x162, 0x160, 0x3, 0x2, 
    0x2, 0x2, 0x163, 0x166, 0x3, 0x2, 0x2, 0x2, 0x164, 0x162, 0x3, 0x2, 
    0x2, 0x2, 0x164, 0x165, 0x3, 0x2, 0x2, 0x2, 0x165, 0x168, 0x3, 0x2, 
    0x2, 0x2, 0x166, 0x164, 0x3, 0x2, 0x2, 0x2, 0x167, 0x169, 0x7, 0x1b, 
    0x2, 0x2, 0x168, 0x167, 0x3, 0x2, 0x2, 0x2, 0x168, 0x169, 0x3, 0x2, 
    0x2, 0x2, 0x169, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x21, 0x4f, 0x57, 0x5a, 0x68, 
    0x7d, 0x7f, 0x8d, 0xa7, 0xae, 0xba, 0xcb, 0xd2, 0xda, 0xe4, 0xec, 0xf2, 
    0x108, 0x113, 0x117, 0x11e, 0x122, 0x129, 0x12c, 0x133, 0x139, 0x13d, 
    0x14a, 0x14d, 0x150, 0x164, 0x168, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

FabParser::Initializer FabParser::_init;
