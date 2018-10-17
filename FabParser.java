// Generated from FabParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, WS=2, Action=3, FileListStart=4, Foreach=5, Function=6, Else=7, 
		If=8, Record=9, Type=10, BoolLiteral=11, IntLiteral=12, StringLiteral=13, 
		And=14, Cons=15, Divide=16, Equals=17, Minus=18, Multiply=19, Not=20, 
		NotEquals=21, Or=22, Plus=23, Xor=24, ArgSep=25, Assign=26, BraceOpen=27, 
		BraceClose=28, BracketOpen=29, BracketClose=30, End=31, FieldSep=32, Input=33, 
		ParenOpen=34, ParenClose=35, Produces=36, Query=37, TypeSep=38, Identifier=39, 
		FileListArgs=40, FileListEnd=41, FilenameLiteral=42, FileListWS=43;
	public static final int
		RULE_file = 0, RULE_value = 1, RULE_expression = 2, RULE_addOp = 3, RULE_compareOp = 4, 
		RULE_logicOp = 5, RULE_multOp = 6, RULE_call = 7, RULE_conditional = 8, 
		RULE_fieldQuery = 9, RULE_fieldReference = 10, RULE_foreach = 11, RULE_function = 12, 
		RULE_unaryOperation = 13, RULE_unaryOperator = 14, RULE_term = 15, RULE_buildAction = 16, 
		RULE_compoundExpr = 17, RULE_fileList = 18, RULE_list = 19, RULE_literal = 20, 
		RULE_nameReference = 21, RULE_parentheticalExpression = 22, RULE_typeDeclaration = 23, 
		RULE_arguments = 24, RULE_keywordArgument = 25, RULE_keywordArguments = 26, 
		RULE_positionalArguments = 27, RULE_parameters = 28, RULE_parameter = 29, 
		RULE_type = 30, RULE_functionType = 31, RULE_recordType = 32, RULE_fieldType = 33, 
		RULE_parametricType = 34, RULE_simpleType = 35, RULE_typeList = 36;
	public static final String[] ruleNames = {
		"file", "value", "expression", "addOp", "compareOp", "logicOp", "multOp", 
		"call", "conditional", "fieldQuery", "fieldReference", "foreach", "function", 
		"unaryOperation", "unaryOperator", "term", "buildAction", "compoundExpr", 
		"fileList", "list", "literal", "nameReference", "parentheticalExpression", 
		"typeDeclaration", "arguments", "keywordArgument", "keywordArguments", 
		"positionalArguments", "parameters", "parameter", "type", "functionType", 
		"recordType", "fieldType", "parametricType", "simpleType", "typeList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'action'", "'files('", "'foreach'", "'function'", "'else'", 
		"'if'", "'record'", "'type'", null, null, null, "'and'", "'::'", "'/'", 
		"'=='", "'-'", "'*'", "'not'", "'!='", "'or'", "'+'", "'xor'", null, "'='", 
		"'{'", "'}'", "'['", "']'", "';'", "'.'", "'<-'", "'('", null, "'->'", 
		"'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Comment", "WS", "Action", "FileListStart", "Foreach", "Function", 
		"Else", "If", "Record", "Type", "BoolLiteral", "IntLiteral", "StringLiteral", 
		"And", "Cons", "Divide", "Equals", "Minus", "Multiply", "Not", "NotEquals", 
		"Or", "Plus", "Xor", "ArgSep", "Assign", "BraceOpen", "BraceClose", "BracketOpen", 
		"BracketClose", "End", "FieldSep", "Input", "ParenOpen", "ParenClose", 
		"Produces", "Query", "TypeSep", "Identifier", "FileListArgs", "FileListEnd", 
		"FilenameLiteral", "FileListWS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FabParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public ValueContext value;
		public List<ValueContext> values = new ArrayList<ValueContext>();
		public TerminalNode EOF() { return getToken(FabParser.EOF, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Action) | (1L << FileListStart) | (1L << Foreach) | (1L << Function) | (1L << If) | (1L << Type) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Minus) | (1L << Not) | (1L << Plus) | (1L << BraceOpen) | (1L << BracketOpen) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				{
				setState(74);
				((FileContext)_localctx).value = value();
				((FileContext)_localctx).values.add(((FileContext)_localctx).value);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode End() { return getToken(FabParser.End, 0); }
		public TerminalNode Assign() { return getToken(FabParser.Assign, 0); }
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public TerminalNode TypeSep() { return getToken(FabParser.TypeSep, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82);
				((ValueContext)_localctx).name = match(Identifier);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSep) {
					{
					setState(83);
					match(TypeSep);
					setState(84);
					type();
					}
				}

				setState(87);
				match(Assign);
				}
				break;
			}
			setState(90);
			expression(0);
			setState(91);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token cons;
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public FieldQueryContext fieldQuery() {
			return getRuleContext(FieldQueryContext.class,0);
		}
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public UnaryOperationContext unaryOperation() {
			return getRuleContext(UnaryOperationContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public TerminalNode Cons() { return getToken(FabParser.Cons, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(94);
				call();
				}
				break;
			case 2:
				{
				setState(95);
				conditional();
				}
				break;
			case 3:
				{
				setState(96);
				fieldQuery();
				}
				break;
			case 4:
				{
				setState(97);
				fieldReference(0);
				}
				break;
			case 5:
				{
				setState(98);
				foreach();
				}
				break;
			case 6:
				{
				setState(99);
				function();
				}
				break;
			case 7:
				{
				setState(100);
				unaryOperation();
				}
				break;
			case 8:
				{
				setState(101);
				term();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(105);
						multOp();
						setState(106);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(109);
						addOp();
						setState(110);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(113);
						compareOp();
						setState(114);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(117);
						logicOp();
						setState(118);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(121);
						((ExpressionContext)_localctx).cons = match(Cons);
						setState(122);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(FabParser.Minus, 0); }
		public TerminalNode Plus() { return getToken(FabParser.Plus, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==Minus || _la==Plus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(FabParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(FabParser.NotEquals, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitCompareOp(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==Equals || _la==NotEquals) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicOpContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(FabParser.And, 0); }
		public TerminalNode Or() { return getToken(FabParser.Or, 0); }
		public TerminalNode Xor() { return getToken(FabParser.Xor, 0); }
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitLogicOp(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Or) | (1L << Xor))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOpContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(FabParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(FabParser.Divide, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitMultOp(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==Divide || _la==Multiply) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TermContext target;
		public TerminalNode ParenOpen() { return getToken(FabParser.ParenOpen, 0); }
		public TerminalNode ParenClose() { return getToken(FabParser.ParenClose, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((CallContext)_localctx).target = term();
			setState(137);
			match(ParenOpen);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Action) | (1L << FileListStart) | (1L << Foreach) | (1L << Function) | (1L << If) | (1L << Type) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Minus) | (1L << Not) | (1L << Plus) | (1L << BraceOpen) | (1L << BracketOpen) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				setState(138);
				arguments();
				}
			}

			setState(141);
			match(ParenClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext thenClause;
		public ExpressionContext elseClause;
		public TerminalNode If() { return getToken(FabParser.If, 0); }
		public TerminalNode Else() { return getToken(FabParser.Else, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(If);
			setState(144);
			((ConditionalContext)_localctx).condition = expression(0);
			setState(145);
			((ConditionalContext)_localctx).thenClause = expression(0);
			setState(146);
			match(Else);
			setState(147);
			((ConditionalContext)_localctx).elseClause = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldQueryContext extends ParserRuleContext {
		public TermContext base;
		public Token field;
		public ExpressionContext defaultValue;
		public TerminalNode FieldSep() { return getToken(FabParser.FieldSep, 0); }
		public TerminalNode Query() { return getToken(FabParser.Query, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterFieldQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitFieldQuery(this);
		}
	}

	public final FieldQueryContext fieldQuery() throws RecognitionException {
		FieldQueryContext _localctx = new FieldQueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((FieldQueryContext)_localctx).base = term();
			setState(150);
			match(FieldSep);
			setState(151);
			((FieldQueryContext)_localctx).field = match(Identifier);
			setState(152);
			match(Query);
			setState(153);
			((FieldQueryContext)_localctx).defaultValue = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldReferenceContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode FieldSep() { return getToken(FabParser.FieldSep, 0); }
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public FieldReferenceContext fieldReference() {
			return getRuleContext(FieldReferenceContext.class,0);
		}
		public FieldReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterFieldReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitFieldReference(this);
		}
	}

	public final FieldReferenceContext fieldReference() throws RecognitionException {
		return fieldReference(0);
	}

	private FieldReferenceContext fieldReference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldReferenceContext _localctx = new FieldReferenceContext(_ctx, _parentState);
		FieldReferenceContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_fieldReference, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			term();
			setState(157);
			match(FieldSep);
			setState(158);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldReferenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fieldReference);
					setState(160);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(161);
					match(FieldSep);
					setState(162);
					match(Identifier);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForeachContext extends ParserRuleContext {
		public ExpressionContext src;
		public ExpressionContext body;
		public TerminalNode Foreach() { return getToken(FabParser.Foreach, 0); }
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public TerminalNode Input() { return getToken(FabParser.Input, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TypeSep() { return getToken(FabParser.TypeSep, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitForeach(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Foreach);
			setState(169);
			match(Identifier);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSep) {
				{
				setState(170);
				match(TypeSep);
				setState(171);
				type();
				}
			}

			setState(174);
			match(Input);
			setState(175);
			((ForeachContext)_localctx).src = expression(0);
			setState(176);
			((ForeachContext)_localctx).body = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public ExpressionContext body;
		public TerminalNode Function() { return getToken(FabParser.Function, 0); }
		public TerminalNode ParenOpen() { return getToken(FabParser.ParenOpen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ParenClose() { return getToken(FabParser.ParenClose, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TypeSep() { return getToken(FabParser.TypeSep, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(Function);
			setState(179);
			match(ParenOpen);
			setState(180);
			parameters();
			setState(181);
			match(ParenClose);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSep) {
				{
				setState(182);
				match(TypeSep);
				setState(183);
				type();
				}
			}

			setState(186);
			((FunctionContext)_localctx).body = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperationContext extends ParserRuleContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitUnaryOperation(this);
		}
	}

	public final UnaryOperationContext unaryOperation() throws RecognitionException {
		UnaryOperationContext _localctx = new UnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			unaryOperator();
			setState(189);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(FabParser.Not, 0); }
		public TerminalNode Minus() { return getToken(FabParser.Minus, 0); }
		public TerminalNode Plus() { return getToken(FabParser.Plus, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Not) | (1L << Plus))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public BuildActionContext buildAction() {
			return getRuleContext(BuildActionContext.class,0);
		}
		public CompoundExprContext compoundExpr() {
			return getRuleContext(CompoundExprContext.class,0);
		}
		public FileListContext fileList() {
			return getRuleContext(FileListContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NameReferenceContext nameReference() {
			return getRuleContext(NameReferenceContext.class,0);
		}
		public ParentheticalExpressionContext parentheticalExpression() {
			return getRuleContext(ParentheticalExpressionContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Action:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				buildAction();
				}
				break;
			case BraceOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				compoundExpr();
				}
				break;
			case FileListStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				fileList();
				}
				break;
			case BracketOpen:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				list();
				}
				break;
			case BoolLiteral:
			case IntLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				nameReference();
				}
				break;
			case ParenOpen:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				parentheticalExpression();
				}
				break;
			case Type:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				typeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildActionContext extends ParserRuleContext {
		public TerminalNode Action() { return getToken(FabParser.Action, 0); }
		public TerminalNode ParenOpen() { return getToken(FabParser.ParenOpen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ParenClose() { return getToken(FabParser.ParenClose, 0); }
		public TerminalNode Input() { return getToken(FabParser.Input, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BuildActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterBuildAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitBuildAction(this);
		}
	}

	public final BuildActionContext buildAction() throws RecognitionException {
		BuildActionContext _localctx = new BuildActionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_buildAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Action);
			setState(204);
			match(ParenOpen);
			setState(205);
			arguments();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Input) {
				{
				setState(206);
				match(Input);
				setState(207);
				parameters();
				}
			}

			setState(210);
			match(ParenClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundExprContext extends ParserRuleContext {
		public ValueContext value;
		public List<ValueContext> values = new ArrayList<ValueContext>();
		public ExpressionContext result;
		public TerminalNode BraceOpen() { return getToken(FabParser.BraceOpen, 0); }
		public TerminalNode BraceClose() { return getToken(FabParser.BraceClose, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CompoundExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterCompoundExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitCompoundExpr(this);
		}
	}

	public final CompoundExprContext compoundExpr() throws RecognitionException {
		CompoundExprContext _localctx = new CompoundExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compoundExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(BraceOpen);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					((CompoundExprContext)_localctx).value = value();
					((CompoundExprContext)_localctx).values.add(((CompoundExprContext)_localctx).value);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(219);
			((CompoundExprContext)_localctx).result = expression(0);
			setState(220);
			match(BraceClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileListContext extends ParserRuleContext {
		public TerminalNode FileListStart() { return getToken(FabParser.FileListStart, 0); }
		public TerminalNode FileListEnd() { return getToken(FabParser.FileListEnd, 0); }
		public List<TerminalNode> FilenameLiteral() { return getTokens(FabParser.FilenameLiteral); }
		public TerminalNode FilenameLiteral(int i) {
			return getToken(FabParser.FilenameLiteral, i);
		}
		public TerminalNode FileListArgs() { return getToken(FabParser.FileListArgs, 0); }
		public KeywordArgumentsContext keywordArguments() {
			return getRuleContext(KeywordArgumentsContext.class,0);
		}
		public TerminalNode ParenClose() { return getToken(FabParser.ParenClose, 0); }
		public FileListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterFileList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitFileList(this);
		}
	}

	public final FileListContext fileList() throws RecognitionException {
		FileListContext _localctx = new FileListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fileList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(FileListStart);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FilenameLiteral) {
				{
				{
				setState(223);
				match(FilenameLiteral);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FileListEnd:
				{
				setState(229);
				match(FileListEnd);
				}
				break;
			case FileListArgs:
				{
				{
				setState(230);
				match(FileListArgs);
				setState(231);
				keywordArguments();
				setState(232);
				match(ParenClose);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode BracketOpen() { return getToken(FabParser.BracketOpen, 0); }
		public TerminalNode BracketClose() { return getToken(FabParser.BracketClose, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(BracketOpen);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Action) | (1L << FileListStart) | (1L << Foreach) | (1L << Function) | (1L << If) | (1L << Type) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Minus) | (1L << Not) | (1L << Plus) | (1L << BraceOpen) | (1L << BracketOpen) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				{
				setState(237);
				((ListContext)_localctx).expression = expression(0);
				((ListContext)_localctx).values.add(((ListContext)_localctx).expression);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(BracketClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BoolLiteral() { return getToken(FabParser.BoolLiteral, 0); }
		public TerminalNode IntLiteral() { return getToken(FabParser.IntLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(FabParser.StringLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameReferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public NameReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterNameReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitNameReference(this);
		}
	}

	public final NameReferenceContext nameReference() throws RecognitionException {
		NameReferenceContext _localctx = new NameReferenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nameReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentheticalExpressionContext extends ParserRuleContext {
		public TerminalNode ParenOpen() { return getToken(FabParser.ParenOpen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ParenClose() { return getToken(FabParser.ParenClose, 0); }
		public ParentheticalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheticalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterParentheticalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitParentheticalExpression(this);
		}
	}

	public final ParentheticalExpressionContext parentheticalExpression() throws RecognitionException {
		ParentheticalExpressionContext _localctx = new ParentheticalExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parentheticalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ParenOpen);
			setState(250);
			expression(0);
			setState(251);
			match(ParenClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(FabParser.Type, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(Type);
			setState(254);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public PositionalArgumentsContext positionalArguments() {
			return getRuleContext(PositionalArgumentsContext.class,0);
		}
		public TerminalNode ArgSep() { return getToken(FabParser.ArgSep, 0); }
		public KeywordArgumentsContext keywordArguments() {
			return getRuleContext(KeywordArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arguments);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				positionalArguments();
				setState(257);
				match(ArgSep);
				setState(258);
				keywordArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				positionalArguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				keywordArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(FabParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeywordArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterKeywordArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitKeywordArgument(this);
		}
	}

	public final KeywordArgumentContext keywordArgument() throws RecognitionException {
		KeywordArgumentContext _localctx = new KeywordArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_keywordArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(Identifier);
			setState(265);
			match(Assign);
			setState(266);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordArgumentsContext extends ParserRuleContext {
		public KeywordArgumentContext keywordArgument;
		public List<KeywordArgumentContext> args = new ArrayList<KeywordArgumentContext>();
		public List<KeywordArgumentContext> keywordArgument() {
			return getRuleContexts(KeywordArgumentContext.class);
		}
		public KeywordArgumentContext keywordArgument(int i) {
			return getRuleContext(KeywordArgumentContext.class,i);
		}
		public List<TerminalNode> ArgSep() { return getTokens(FabParser.ArgSep); }
		public TerminalNode ArgSep(int i) {
			return getToken(FabParser.ArgSep, i);
		}
		public KeywordArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterKeywordArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitKeywordArguments(this);
		}
	}

	public final KeywordArgumentsContext keywordArguments() throws RecognitionException {
		KeywordArgumentsContext _localctx = new KeywordArgumentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keywordArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			((KeywordArgumentsContext)_localctx).keywordArgument = keywordArgument();
			((KeywordArgumentsContext)_localctx).args.add(((KeywordArgumentsContext)_localctx).keywordArgument);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(ArgSep);
					setState(270);
					((KeywordArgumentsContext)_localctx).keywordArgument = keywordArgument();
					((KeywordArgumentsContext)_localctx).args.add(((KeywordArgumentsContext)_localctx).keywordArgument);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArgSep) {
				{
				setState(276);
				match(ArgSep);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionalArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ArgSep() { return getTokens(FabParser.ArgSep); }
		public TerminalNode ArgSep(int i) {
			return getToken(FabParser.ArgSep, i);
		}
		public PositionalArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterPositionalArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitPositionalArguments(this);
		}
	}

	public final PositionalArgumentsContext positionalArguments() throws RecognitionException {
		PositionalArgumentsContext _localctx = new PositionalArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_positionalArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expression(0);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(ArgSep);
					setState(281);
					expression(0);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(287);
				match(ArgSep);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> ArgSep() { return getTokens(FabParser.ArgSep); }
		public TerminalNode ArgSep(int i) {
			return getToken(FabParser.ArgSep, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(290);
				parameter();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ArgSep) {
					{
					{
					setState(291);
					match(ArgSep);
					setState(292);
					parameter();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public ExpressionContext defaultArgument;
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public TerminalNode TypeSep() { return getToken(FabParser.TypeSep, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(FabParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(Identifier);
			setState(301);
			match(TypeSep);
			setState(302);
			type();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(303);
				match(Assign);
				setState(304);
				((ParameterContext)_localctx).defaultArgument = expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public ParametricTypeContext parametricType() {
			return getRuleContext(ParametricTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				functionType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				recordType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				parametricType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				simpleType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TypeListContext params;
		public TypeContext result;
		public TerminalNode ParenOpen() { return getToken(FabParser.ParenOpen, 0); }
		public TerminalNode ParenClose() { return getToken(FabParser.ParenClose, 0); }
		public TerminalNode Produces() { return getToken(FabParser.Produces, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ParenOpen);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Record) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				setState(314);
				((FunctionTypeContext)_localctx).params = typeList();
				}
			}

			setState(317);
			match(ParenClose);
			setState(318);
			match(Produces);
			setState(319);
			((FunctionTypeContext)_localctx).result = type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode Record() { return getToken(FabParser.Record, 0); }
		public TerminalNode BracketOpen() { return getToken(FabParser.BracketOpen, 0); }
		public TerminalNode BracketClose() { return getToken(FabParser.BracketClose, 0); }
		public List<FieldTypeContext> fieldType() {
			return getRuleContexts(FieldTypeContext.class);
		}
		public FieldTypeContext fieldType(int i) {
			return getRuleContext(FieldTypeContext.class,i);
		}
		public List<TerminalNode> ArgSep() { return getTokens(FabParser.ArgSep); }
		public TerminalNode ArgSep(int i) {
			return getToken(FabParser.ArgSep, i);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitRecordType(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recordType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Record);
			setState(322);
			match(BracketOpen);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(323);
				fieldType();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						match(ArgSep);
						setState(325);
						fieldType();
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArgSep) {
				{
				setState(333);
				match(ArgSep);
				}
			}

			setState(336);
			match(BracketClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public TerminalNode TypeSep() { return getToken(FabParser.TypeSep, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitFieldType(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(Identifier);
			setState(339);
			match(TypeSep);
			setState(340);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametricTypeContext extends ParserRuleContext {
		public SimpleTypeContext base;
		public TypeListContext params;
		public TerminalNode BracketOpen() { return getToken(FabParser.BracketOpen, 0); }
		public TerminalNode BracketClose() { return getToken(FabParser.BracketClose, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ParametricTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametricType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterParametricType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitParametricType(this);
		}
	}

	public final ParametricTypeContext parametricType() throws RecognitionException {
		ParametricTypeContext _localctx = new ParametricTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parametricType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((ParametricTypeContext)_localctx).base = simpleType();
			setState(343);
			match(BracketOpen);
			setState(344);
			((ParametricTypeContext)_localctx).params = typeList();
			setState(345);
			match(BracketClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ArgSep() { return getTokens(FabParser.ArgSep); }
		public TerminalNode ArgSep(int i) {
			return getToken(FabParser.ArgSep, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			type();
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(350);
					match(ArgSep);
					setState(351);
					type();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArgSep) {
				{
				setState(357);
				match(ArgSep);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
			return fieldReference_sempred((FieldReferenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean fieldReference_sempred(FieldReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\5\3X\n\3\3\3\5\3[\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4i\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4~\n\4\f\4\16\4\u0081\13\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bb\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cc"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d3\n\22\3\22\3\22\3\23\3\23\7\23"+
		"\u00d9\n\23\f\23\16\23\u00dc\13\23\3\23\3\23\3\23\3\24\3\24\7\24\u00e3"+
		"\n\24\f\24\16\24\u00e6\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ed\n\24"+
		"\3\25\3\25\7\25\u00f1\n\25\f\25\16\25\u00f4\13\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0109\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0112\n"+
		"\34\f\34\16\34\u0115\13\34\3\34\5\34\u0118\n\34\3\35\3\35\3\35\7\35\u011d"+
		"\n\35\f\35\16\35\u0120\13\35\3\35\5\35\u0123\n\35\3\36\3\36\3\36\7\36"+
		"\u0128\n\36\f\36\16\36\u012b\13\36\5\36\u012d\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0134\n\37\3 \3 \3 \3 \5 \u013a\n \3!\3!\5!\u013e\n!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0149\n\"\f\"\16\"\u014c\13\"\5\"\u014e"+
		"\n\"\3\"\5\"\u0151\n\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&"+
		"\3&\7&\u0163\n&\f&\16&\u0166\13&\3&\5&\u0169\n&\3&\2\4\6\26\'\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\b\4\2"+
		"\24\24\31\31\4\2\23\23\27\27\5\2\20\20\30\30\32\32\4\2\22\22\25\25\5\2"+
		"\24\24\26\26\31\31\3\2\r\17\2\u0176\2O\3\2\2\2\4Z\3\2\2\2\6h\3\2\2\2\b"+
		"\u0082\3\2\2\2\n\u0084\3\2\2\2\f\u0086\3\2\2\2\16\u0088\3\2\2\2\20\u008a"+
		"\3\2\2\2\22\u0091\3\2\2\2\24\u0097\3\2\2\2\26\u009d\3\2\2\2\30\u00aa\3"+
		"\2\2\2\32\u00b4\3\2\2\2\34\u00be\3\2\2\2\36\u00c1\3\2\2\2 \u00cb\3\2\2"+
		"\2\"\u00cd\3\2\2\2$\u00d6\3\2\2\2&\u00e0\3\2\2\2(\u00ee\3\2\2\2*\u00f7"+
		"\3\2\2\2,\u00f9\3\2\2\2.\u00fb\3\2\2\2\60\u00ff\3\2\2\2\62\u0108\3\2\2"+
		"\2\64\u010a\3\2\2\2\66\u010e\3\2\2\28\u0119\3\2\2\2:\u012c\3\2\2\2<\u012e"+
		"\3\2\2\2>\u0139\3\2\2\2@\u013b\3\2\2\2B\u0143\3\2\2\2D\u0154\3\2\2\2F"+
		"\u0158\3\2\2\2H\u015d\3\2\2\2J\u015f\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2"+
		"\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TW\7"+
		")\2\2UV\7(\2\2VX\5> \2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y[\7\34\2\2ZT\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5\6\4\2]^\7!\2\2^\5\3\2\2\2_`\b\4\1\2`i\5"+
		"\20\t\2ai\5\22\n\2bi\5\24\13\2ci\5\26\f\2di\5\30\r\2ei\5\32\16\2fi\5\34"+
		"\17\2gi\5 \21\2h_\3\2\2\2ha\3\2\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2he\3"+
		"\2\2\2hf\3\2\2\2hg\3\2\2\2i\177\3\2\2\2jk\f\17\2\2kl\5\16\b\2lm\5\6\4"+
		"\20m~\3\2\2\2no\f\16\2\2op\5\b\5\2pq\5\6\4\17q~\3\2\2\2rs\f\r\2\2st\5"+
		"\n\6\2tu\5\6\4\16u~\3\2\2\2vw\f\f\2\2wx\5\f\7\2xy\5\6\4\ry~\3\2\2\2z{"+
		"\f\13\2\2{|\7\21\2\2|~\5\6\4\13}j\3\2\2\2}n\3\2\2\2}r\3\2\2\2}v\3\2\2"+
		"\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\7\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\u0083\t\2\2\2\u0083\t\3\2\2\2\u0084\u0085"+
		"\t\3\2\2\u0085\13\3\2\2\2\u0086\u0087\t\4\2\2\u0087\r\3\2\2\2\u0088\u0089"+
		"\t\5\2\2\u0089\17\3\2\2\2\u008a\u008b\5 \21\2\u008b\u008d\7$\2\2\u008c"+
		"\u008e\5\62\32\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0090\7%\2\2\u0090\21\3\2\2\2\u0091\u0092\7\n\2\2\u0092\u0093"+
		"\5\6\4\2\u0093\u0094\5\6\4\2\u0094\u0095\7\t\2\2\u0095\u0096\5\6\4\2\u0096"+
		"\23\3\2\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\"\2\2\u0099\u009a\7)\2\2"+
		"\u009a\u009b\7\'\2\2\u009b\u009c\5\6\4\2\u009c\25\3\2\2\2\u009d\u009e"+
		"\b\f\1\2\u009e\u009f\5 \21\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7)\2\2\u00a1"+
		"\u00a7\3\2\2\2\u00a2\u00a3\f\3\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a6\7)"+
		"\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\7\2"+
		"\2\u00ab\u00ae\7)\2\2\u00ac\u00ad\7(\2\2\u00ad\u00af\5> \2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1"+
		"\u00b2\5\6\4\2\u00b2\u00b3\5\6\4\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\b\2"+
		"\2\u00b5\u00b6\7$\2\2\u00b6\u00b7\5:\36\2\u00b7\u00ba\7%\2\2\u00b8\u00b9"+
		"\7(\2\2\u00b9\u00bb\5> \2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\5\6\4\2\u00bd\33\3\2\2\2\u00be\u00bf\5\36\20"+
		"\2\u00bf\u00c0\5\6\4\2\u00c0\35\3\2\2\2\u00c1\u00c2\t\6\2\2\u00c2\37\3"+
		"\2\2\2\u00c3\u00cc\5\"\22\2\u00c4\u00cc\5$\23\2\u00c5\u00cc\5&\24\2\u00c6"+
		"\u00cc\5(\25\2\u00c7\u00cc\5*\26\2\u00c8\u00cc\5,\27\2\u00c9\u00cc\5."+
		"\30\2\u00ca\u00cc\5\60\31\2\u00cb\u00c3\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00ce"+
		"\7\5\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d2\5\62\32\2\u00d0\u00d1\7#\2\2\u00d1"+
		"\u00d3\5:\36\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\7%\2\2\u00d5#\3\2\2\2\u00d6\u00da\7\35\2\2\u00d7\u00d9"+
		"\5\4\3\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\6"+
		"\4\2\u00de\u00df\7\36\2\2\u00df%\3\2\2\2\u00e0\u00e4\7\6\2\2\u00e1\u00e3"+
		"\7,\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00ec\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ed\7+"+
		"\2\2\u00e8\u00e9\7*\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb\7%\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\'\3\2\2\2"+
		"\u00ee\u00f2\7\37\2\2\u00ef\u00f1\5\6\4\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7 \2\2\u00f6)\3\2\2\2\u00f7\u00f8\t\7\2\2\u00f8"+
		"+\3\2\2\2\u00f9\u00fa\7)\2\2\u00fa-\3\2\2\2\u00fb\u00fc\7$\2\2\u00fc\u00fd"+
		"\5\6\4\2\u00fd\u00fe\7%\2\2\u00fe/\3\2\2\2\u00ff\u0100\7\f\2\2\u0100\u0101"+
		"\5> \2\u0101\61\3\2\2\2\u0102\u0103\58\35\2\u0103\u0104\7\33\2\2\u0104"+
		"\u0105\5\66\34\2\u0105\u0109\3\2\2\2\u0106\u0109\58\35\2\u0107\u0109\5"+
		"\66\34\2\u0108\u0102\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\63\3\2\2\2\u010a\u010b\7)\2\2\u010b\u010c\7\34\2\2\u010c\u010d\5\6\4"+
		"\2\u010d\65\3\2\2\2\u010e\u0113\5\64\33\2\u010f\u0110\7\33\2\2\u0110\u0112"+
		"\5\64\33\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118"+
		"\7\33\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\67\3\2\2\2\u0119"+
		"\u011e\5\6\4\2\u011a\u011b\7\33\2\2\u011b\u011d\5\6\4\2\u011c\u011a\3"+
		"\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\7\33\2\2\u0122\u0121\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u01239\3\2\2\2\u0124\u0129\5<\37\2\u0125\u0126"+
		"\7\33\2\2\u0126\u0128\5<\37\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u012d\3\2\2\2\u012d;\3\2\2\2\u012e"+
		"\u012f\7)\2\2\u012f\u0130\7(\2\2\u0130\u0133\5> \2\u0131\u0132\7\34\2"+
		"\2\u0132\u0134\5\6\4\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134="+
		"\3\2\2\2\u0135\u013a\5@!\2\u0136\u013a\5B\"\2\u0137\u013a\5F$\2\u0138"+
		"\u013a\5H%\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2"+
		"\2\u0139\u0138\3\2\2\2\u013a?\3\2\2\2\u013b\u013d\7$\2\2\u013c\u013e\5"+
		"J&\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7%\2\2\u0140\u0141\7&\2\2\u0141\u0142\5> \2\u0142A\3\2\2\2\u0143"+
		"\u0144\7\13\2\2\u0144\u014d\7\37\2\2\u0145\u014a\5D#\2\u0146\u0147\7\33"+
		"\2\2\u0147\u0149\5D#\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u0145\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\7\33"+
		"\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\7 \2\2\u0153C\3\2\2\2\u0154\u0155\7)\2\2\u0155\u0156\7(\2\2\u0156"+
		"\u0157\5> \2\u0157E\3\2\2\2\u0158\u0159\5H%\2\u0159\u015a\7\37\2\2\u015a"+
		"\u015b\5J&\2\u015b\u015c\7 \2\2\u015cG\3\2\2\2\u015d\u015e\7)\2\2\u015e"+
		"I\3\2\2\2\u015f\u0164\5> \2\u0160\u0161\7\33\2\2\u0161\u0163\5> \2\u0162"+
		"\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\7\33\2\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169K\3\2\2\2!OWZh}\177\u008d\u00a7"+
		"\u00ae\u00ba\u00cb\u00d2\u00da\u00e4\u00ec\u00f2\u0108\u0113\u0117\u011e"+
		"\u0122\u0129\u012c\u0133\u0139\u013d\u014a\u014d\u0150\u0164\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}