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
		ErrorChar=40, FileListArgs=41, FileListEnd=42, FilenameLiteral=43, FileListWS=44, 
		FileListError=45;
	public static final int
		RULE_file = 0, RULE_value = 1, RULE_expression = 2, RULE_addOp = 3, RULE_compareOp = 4, 
		RULE_logicOp = 5, RULE_multOp = 6, RULE_conditional = 7, RULE_fieldQuery = 8, 
		RULE_foreach = 9, RULE_function = 10, RULE_unaryOperation = 11, RULE_unaryOperator = 12, 
		RULE_term = 13, RULE_buildAction = 14, RULE_compoundExpr = 15, RULE_fileList = 16, 
		RULE_list = 17, RULE_literal = 18, RULE_nameReference = 19, RULE_parentheticalExpression = 20, 
		RULE_record = 21, RULE_typeDeclaration = 22, RULE_arguments = 23, RULE_keywordArgument = 24, 
		RULE_keywordArguments = 25, RULE_positionalArguments = 26, RULE_parameters = 27, 
		RULE_parameter = 28, RULE_type = 29, RULE_functionType = 30, RULE_recordType = 31, 
		RULE_fieldType = 32, RULE_parametricType = 33, RULE_typeReference = 34, 
		RULE_typeList = 35;
	public static final String[] ruleNames = {
		"file", "value", "expression", "addOp", "compareOp", "logicOp", "multOp", 
		"conditional", "fieldQuery", "foreach", "function", "unaryOperation", 
		"unaryOperator", "term", "buildAction", "compoundExpr", "fileList", "list", 
		"literal", "nameReference", "parentheticalExpression", "record", "typeDeclaration", 
		"arguments", "keywordArgument", "keywordArguments", "positionalArguments", 
		"parameters", "parameter", "type", "functionType", "recordType", "fieldType", 
		"parametricType", "typeReference", "typeList"
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
		"Produces", "Query", "TypeSep", "Identifier", "ErrorChar", "FileListArgs", 
		"FileListEnd", "FilenameLiteral", "FileListWS", "FileListError"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Action) | (1L << FileListStart) | (1L << Foreach) | (1L << Function) | (1L << If) | (1L << Record) | (1L << Type) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Minus) | (1L << Not) | (1L << Plus) | (1L << BraceOpen) | (1L << BracketOpen) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				{
				setState(72);
				((FileContext)_localctx).value = value();
				((FileContext)_localctx).values.add(((FileContext)_localctx).value);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(80);
				((ValueContext)_localctx).name = match(Identifier);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSep) {
					{
					setState(81);
					match(TypeSep);
					setState(82);
					type();
					}
				}

				setState(85);
				match(Assign);
				}
				break;
			}
			setState(88);
			expression(0);
			setState(89);
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
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public FieldQueryContext fieldQuery() {
			return getRuleContext(FieldQueryContext.class,0);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(92);
				conditional();
				}
				break;
			case 2:
				{
				setState(93);
				fieldQuery();
				}
				break;
			case 3:
				{
				setState(94);
				foreach();
				}
				break;
			case 4:
				{
				setState(95);
				function();
				}
				break;
			case 5:
				{
				setState(96);
				unaryOperation();
				}
				break;
			case 6:
				{
				setState(97);
				term(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(101);
						multOp();
						setState(102);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(105);
						addOp();
						setState(106);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(109);
						compareOp();
						setState(110);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(113);
						logicOp();
						setState(114);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(117);
						((ExpressionContext)_localctx).cons = match(Cons);
						setState(118);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(123);
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
			setState(124);
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
			setState(126);
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
			setState(128);
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
			setState(130);
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
		enterRule(_localctx, 14, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(If);
			setState(133);
			((ConditionalContext)_localctx).condition = expression(0);
			setState(134);
			((ConditionalContext)_localctx).thenClause = expression(0);
			setState(135);
			match(Else);
			setState(136);
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
		enterRule(_localctx, 16, RULE_fieldQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((FieldQueryContext)_localctx).base = term(0);
			setState(139);
			match(FieldSep);
			setState(140);
			((FieldQueryContext)_localctx).field = match(Identifier);
			setState(141);
			match(Query);
			setState(142);
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

	public static class ForeachContext extends ParserRuleContext {
		public Token loopVarName;
		public ExpressionContext src;
		public ExpressionContext body;
		public TerminalNode Foreach() { return getToken(FabParser.Foreach, 0); }
		public TerminalNode Input() { return getToken(FabParser.Input, 0); }
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
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
		enterRule(_localctx, 18, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Foreach);
			setState(145);
			((ForeachContext)_localctx).loopVarName = match(Identifier);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSep) {
				{
				setState(146);
				match(TypeSep);
				setState(147);
				type();
				}
			}

			setState(150);
			match(Input);
			setState(151);
			((ForeachContext)_localctx).src = expression(0);
			setState(152);
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
		public TerminalNode TypeSep() { return getToken(FabParser.TypeSep, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 20, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Function);
			setState(155);
			match(ParenOpen);
			setState(156);
			parameters();
			setState(157);
			match(ParenClose);
			setState(158);
			match(TypeSep);
			setState(159);
			type();
			setState(160);
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
		enterRule(_localctx, 22, RULE_unaryOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			unaryOperator();
			setState(163);
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
		enterRule(_localctx, 24, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		public TermContext callTarget;
		public TermContext base;
		public Token field;
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
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode ParenOpen() { return getToken(FabParser.ParenOpen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ParenClose() { return getToken(FabParser.ParenClose, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode FieldSep() { return getToken(FabParser.FieldSep, 0); }
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
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
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Action:
				{
				setState(168);
				buildAction();
				}
				break;
			case BraceOpen:
				{
				setState(169);
				compoundExpr();
				}
				break;
			case FileListStart:
				{
				setState(170);
				fileList();
				}
				break;
			case BracketOpen:
				{
				setState(171);
				list();
				}
				break;
			case BoolLiteral:
			case IntLiteral:
			case StringLiteral:
				{
				setState(172);
				literal();
				}
				break;
			case Identifier:
				{
				setState(173);
				nameReference();
				}
				break;
			case ParenOpen:
				{
				setState(174);
				parentheticalExpression();
				}
				break;
			case Record:
				{
				setState(175);
				record();
				}
				break;
			case Type:
				{
				setState(176);
				typeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.callTarget = _prevctx;
						_localctx.callTarget = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(179);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(180);
						match(ParenOpen);
						setState(181);
						arguments();
						setState(182);
						match(ParenClose);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.base = _prevctx;
						_localctx.base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(184);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(185);
						match(FieldSep);
						setState(186);
						((TermContext)_localctx).field = match(Identifier);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 28, RULE_buildAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Action);
			setState(193);
			match(ParenOpen);
			setState(194);
			arguments();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Input) {
				{
				setState(195);
				match(Input);
				setState(196);
				parameters();
				}
			}

			setState(199);
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
		enterRule(_localctx, 30, RULE_compoundExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(BraceOpen);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					((CompoundExprContext)_localctx).value = value();
					((CompoundExprContext)_localctx).values.add(((CompoundExprContext)_localctx).value);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(208);
			((CompoundExprContext)_localctx).result = expression(0);
			setState(209);
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
		public Token FilenameLiteral;
		public List<Token> files = new ArrayList<Token>();
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
		enterRule(_localctx, 32, RULE_fileList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FileListStart);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FilenameLiteral) {
				{
				{
				setState(212);
				((FileListContext)_localctx).FilenameLiteral = match(FilenameLiteral);
				((FileListContext)_localctx).files.add(((FileListContext)_localctx).FilenameLiteral);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FileListEnd:
				{
				setState(218);
				match(FileListEnd);
				}
				break;
			case FileListArgs:
				{
				{
				setState(219);
				match(FileListArgs);
				setState(220);
				keywordArguments();
				setState(221);
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
		enterRule(_localctx, 34, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(BracketOpen);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Action) | (1L << FileListStart) | (1L << Foreach) | (1L << Function) | (1L << If) | (1L << Record) | (1L << Type) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Minus) | (1L << Not) | (1L << Plus) | (1L << BraceOpen) | (1L << BracketOpen) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				{
				setState(226);
				((ListContext)_localctx).expression = expression(0);
				((ListContext)_localctx).values.add(((ListContext)_localctx).expression);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 38, RULE_nameReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 40, RULE_parentheticalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ParenOpen);
			setState(239);
			expression(0);
			setState(240);
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

	public static class RecordContext extends ParserRuleContext {
		public ValueContext value;
		public List<ValueContext> fields = new ArrayList<ValueContext>();
		public TerminalNode Record() { return getToken(FabParser.Record, 0); }
		public TerminalNode BraceOpen() { return getToken(FabParser.BraceOpen, 0); }
		public TerminalNode BraceClose() { return getToken(FabParser.BraceClose, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitRecord(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(Record);
			setState(243);
			match(BraceOpen);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Action) | (1L << FileListStart) | (1L << Foreach) | (1L << Function) | (1L << If) | (1L << Record) | (1L << Type) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << Minus) | (1L << Not) | (1L << Plus) | (1L << BraceOpen) | (1L << BracketOpen) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				{
				setState(244);
				((RecordContext)_localctx).value = value();
				((RecordContext)_localctx).fields.add(((RecordContext)_localctx).value);
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
		enterRule(_localctx, 44, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Type);
			setState(253);
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
		enterRule(_localctx, 46, RULE_arguments);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				positionalArguments();
				setState(256);
				match(ArgSep);
				setState(257);
				keywordArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				positionalArguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(260);
					keywordArguments();
					}
				}

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
		enterRule(_localctx, 48, RULE_keywordArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(Identifier);
			setState(266);
			match(Assign);
			setState(267);
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
		enterRule(_localctx, 50, RULE_keywordArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			((KeywordArgumentsContext)_localctx).keywordArgument = keywordArgument();
			((KeywordArgumentsContext)_localctx).args.add(((KeywordArgumentsContext)_localctx).keywordArgument);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(ArgSep);
					setState(271);
					((KeywordArgumentsContext)_localctx).keywordArgument = keywordArgument();
					((KeywordArgumentsContext)_localctx).args.add(((KeywordArgumentsContext)_localctx).keywordArgument);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArgSep) {
				{
				setState(277);
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
		enterRule(_localctx, 52, RULE_positionalArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			expression(0);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(ArgSep);
					setState(282);
					expression(0);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(288);
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
		enterRule(_localctx, 54, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(291);
				parameter();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ArgSep) {
					{
					{
					setState(292);
					match(ArgSep);
					setState(293);
					parameter();
					}
					}
					setState(298);
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
		enterRule(_localctx, 56, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(Identifier);
			setState(302);
			match(TypeSep);
			setState(303);
			type();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(304);
				match(Assign);
				setState(305);
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
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
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
		enterRule(_localctx, 58, RULE_type);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				functionType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				recordType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				parametricType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				typeReference();
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
		enterRule(_localctx, 60, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ParenOpen);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Action) | (1L << FileListStart) | (1L << Record) | (1L << Type) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << StringLiteral) | (1L << BraceOpen) | (1L << BracketOpen) | (1L << ParenOpen) | (1L << Identifier))) != 0)) {
				{
				setState(315);
				((FunctionTypeContext)_localctx).params = typeList();
				}
			}

			setState(318);
			match(ParenClose);
			setState(319);
			match(Produces);
			setState(320);
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
		enterRule(_localctx, 62, RULE_recordType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(Record);
			setState(323);
			match(BracketOpen);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(324);
				fieldType();
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(ArgSep);
						setState(326);
						fieldType();
						}
						} 
					}
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArgSep) {
				{
				setState(334);
				match(ArgSep);
				}
			}

			setState(337);
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
		enterRule(_localctx, 64, RULE_fieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(Identifier);
			setState(340);
			match(TypeSep);
			setState(341);
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
		public TypeReferenceContext base;
		public TypeListContext params;
		public TerminalNode BracketOpen() { return getToken(FabParser.BracketOpen, 0); }
		public TerminalNode BracketClose() { return getToken(FabParser.BracketClose, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
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
		enterRule(_localctx, 66, RULE_parametricType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((ParametricTypeContext)_localctx).base = typeReference();
			setState(344);
			match(BracketOpen);
			setState(345);
			((ParametricTypeContext)_localctx).params = typeList();
			setState(346);
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

	public static class TypeReferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FabParser.Identifier, 0); }
		public TerminalNode Type() { return getToken(FabParser.Type, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FabParserListener ) ((FabParserListener)listener).exitTypeReference(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeReference);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(Type);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				term(0);
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
		enterRule(_localctx, 70, RULE_typeList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			type();
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					match(ArgSep);
					setState(355);
					type();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArgSep) {
				{
				setState(361);
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
		case 13:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u016f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3V\n\3\3\3\5\3Y\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4e\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\5\13\u0097\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00b4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00be\n"+
		"\17\f\17\16\17\u00c1\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u00c8\n\20\3"+
		"\20\3\20\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\3\21\3\21\3"+
		"\21\3\22\3\22\7\22\u00d8\n\22\f\22\16\22\u00db\13\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00e2\n\22\3\23\3\23\7\23\u00e6\n\23\f\23\16\23\u00e9\13"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7"+
		"\27\u00f8\n\27\f\27\16\27\u00fb\13\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0108\n\31\5\31\u010a\n\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\7\33\u0113\n\33\f\33\16\33\u0116\13\33\3\33\5\33"+
		"\u0119\n\33\3\34\3\34\3\34\7\34\u011e\n\34\f\34\16\34\u0121\13\34\3\34"+
		"\5\34\u0124\n\34\3\35\3\35\3\35\7\35\u0129\n\35\f\35\16\35\u012c\13\35"+
		"\5\35\u012e\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0135\n\36\3\37\3\37\3"+
		"\37\3\37\5\37\u013b\n\37\3 \3 \5 \u013f\n \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\7!\u014a\n!\f!\16!\u014d\13!\5!\u014f\n!\3!\5!\u0152\n!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\5$\u0162\n$\3%\3%\3%\7%\u0167\n%\f%\16"+
		"%\u016a\13%\3%\5%\u016d\n%\3%\2\4\6\34&\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\b\4\2\24\24\31\31\4\2\23\23"+
		"\27\27\5\2\20\20\30\30\32\32\4\2\22\22\25\25\5\2\24\24\26\26\31\31\3\2"+
		"\r\17\2\u017d\2M\3\2\2\2\4X\3\2\2\2\6d\3\2\2\2\b~\3\2\2\2\n\u0080\3\2"+
		"\2\2\f\u0082\3\2\2\2\16\u0084\3\2\2\2\20\u0086\3\2\2\2\22\u008c\3\2\2"+
		"\2\24\u0092\3\2\2\2\26\u009c\3\2\2\2\30\u00a4\3\2\2\2\32\u00a7\3\2\2\2"+
		"\34\u00b3\3\2\2\2\36\u00c2\3\2\2\2 \u00cb\3\2\2\2\"\u00d5\3\2\2\2$\u00e3"+
		"\3\2\2\2&\u00ec\3\2\2\2(\u00ee\3\2\2\2*\u00f0\3\2\2\2,\u00f4\3\2\2\2."+
		"\u00fe\3\2\2\2\60\u0109\3\2\2\2\62\u010b\3\2\2\2\64\u010f\3\2\2\2\66\u011a"+
		"\3\2\2\28\u012d\3\2\2\2:\u012f\3\2\2\2<\u013a\3\2\2\2>\u013c\3\2\2\2@"+
		"\u0144\3\2\2\2B\u0155\3\2\2\2D\u0159\3\2\2\2F\u0161\3\2\2\2H\u0163\3\2"+
		"\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2"+
		"\2\2PQ\7\2\2\3Q\3\3\2\2\2RU\7)\2\2ST\7(\2\2TV\5<\37\2US\3\2\2\2UV\3\2"+
		"\2\2VW\3\2\2\2WY\7\34\2\2XR\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\6\4\2[\\\7"+
		"!\2\2\\\5\3\2\2\2]^\b\4\1\2^e\5\20\t\2_e\5\22\n\2`e\5\24\13\2ae\5\26\f"+
		"\2be\5\30\r\2ce\5\34\17\2d]\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3"+
		"\2\2\2dc\3\2\2\2e{\3\2\2\2fg\f\r\2\2gh\5\16\b\2hi\5\6\4\16iz\3\2\2\2j"+
		"k\f\f\2\2kl\5\b\5\2lm\5\6\4\rmz\3\2\2\2no\f\13\2\2op\5\n\6\2pq\5\6\4\f"+
		"qz\3\2\2\2rs\f\n\2\2st\5\f\7\2tu\5\6\4\13uz\3\2\2\2vw\f\t\2\2wx\7\21\2"+
		"\2xz\5\6\4\tyf\3\2\2\2yj\3\2\2\2yn\3\2\2\2yr\3\2\2\2yv\3\2\2\2z}\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|\7\3\2\2\2}{\3\2\2\2~\177\t\2\2\2\177\t\3\2\2\2"+
		"\u0080\u0081\t\3\2\2\u0081\13\3\2\2\2\u0082\u0083\t\4\2\2\u0083\r\3\2"+
		"\2\2\u0084\u0085\t\5\2\2\u0085\17\3\2\2\2\u0086\u0087\7\n\2\2\u0087\u0088"+
		"\5\6\4\2\u0088\u0089\5\6\4\2\u0089\u008a\7\t\2\2\u008a\u008b\5\6\4\2\u008b"+
		"\21\3\2\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\"\2\2\u008e\u008f\7)\2"+
		"\2\u008f\u0090\7\'\2\2\u0090\u0091\5\6\4\2\u0091\23\3\2\2\2\u0092\u0093"+
		"\7\7\2\2\u0093\u0096\7)\2\2\u0094\u0095\7(\2\2\u0095\u0097\5<\37\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7#"+
		"\2\2\u0099\u009a\5\6\4\2\u009a\u009b\5\6\4\2\u009b\25\3\2\2\2\u009c\u009d"+
		"\7\b\2\2\u009d\u009e\7$\2\2\u009e\u009f\58\35\2\u009f\u00a0\7%\2\2\u00a0"+
		"\u00a1\7(\2\2\u00a1\u00a2\5<\37\2\u00a2\u00a3\5\6\4\2\u00a3\27\3\2\2\2"+
		"\u00a4\u00a5\5\32\16\2\u00a5\u00a6\5\6\4\2\u00a6\31\3\2\2\2\u00a7\u00a8"+
		"\t\6\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\b\17\1\2\u00aa\u00b4\5\36\20\2\u00ab"+
		"\u00b4\5 \21\2\u00ac\u00b4\5\"\22\2\u00ad\u00b4\5$\23\2\u00ae\u00b4\5"+
		"&\24\2\u00af\u00b4\5(\25\2\u00b0\u00b4\5*\26\2\u00b1\u00b4\5,\27\2\u00b2"+
		"\u00b4\5.\30\2\u00b3\u00a9\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ac\3\2"+
		"\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00bf\3\2"+
		"\2\2\u00b5\u00b6\f\f\2\2\u00b6\u00b7\7$\2\2\u00b7\u00b8\5\60\31\2\u00b8"+
		"\u00b9\7%\2\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\f\n\2\2\u00bb\u00bc\7\""+
		"\2\2\u00bc\u00be\7)\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\35\3\2\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7$\2\2\u00c4\u00c7"+
		"\5\60\31\2\u00c5\u00c6\7#\2\2\u00c6\u00c8\58\35\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7%\2\2\u00ca\37\3"+
		"\2\2\2\u00cb\u00cf\7\35\2\2\u00cc\u00ce\5\4\3\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4\7\36\2\2\u00d4"+
		"!\3\2\2\2\u00d5\u00d9\7\6\2\2\u00d6\u00d8\7-\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e1\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e2\7,\2\2\u00dd\u00de\7+\2\2\u00de\u00df"+
		"\5\64\33\2\u00df\u00e0\7%\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc\3\2\2\2"+
		"\u00e1\u00dd\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e7\7\37\2\2\u00e4\u00e6\5"+
		"\6\4\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7 "+
		"\2\2\u00eb%\3\2\2\2\u00ec\u00ed\t\7\2\2\u00ed\'\3\2\2\2\u00ee\u00ef\7"+
		")\2\2\u00ef)\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\5\6\4\2\u00f2\u00f3"+
		"\7%\2\2\u00f3+\3\2\2\2\u00f4\u00f5\7\13\2\2\u00f5\u00f9\7\35\2\2\u00f6"+
		"\u00f8\5\4\3\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7\36\2\2\u00fd-\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\5<\37\2"+
		"\u0100/\3\2\2\2\u0101\u0102\5\66\34\2\u0102\u0103\7\33\2\2\u0103\u0104"+
		"\5\64\33\2\u0104\u010a\3\2\2\2\u0105\u010a\5\66\34\2\u0106\u0108\5\64"+
		"\33\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0107\3\2\2\2\u010a\61\3\2\2"+
		"\2\u010b\u010c\7)\2\2\u010c\u010d\7\34\2\2\u010d\u010e\5\6\4\2\u010e\63"+
		"\3\2\2\2\u010f\u0114\5\62\32\2\u0110\u0111\7\33\2\2\u0111\u0113\5\62\32"+
		"\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7\33\2\2"+
		"\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\65\3\2\2\2\u011a\u011f"+
		"\5\6\4\2\u011b\u011c\7\33\2\2\u011c\u011e\5\6\4\2\u011d\u011b\3\2\2\2"+
		"\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7\33\2\2\u0123\u0122\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\67\3\2\2\2\u0125\u012a\5:\36\2\u0126\u0127"+
		"\7\33\2\2\u0127\u0129\5:\36\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u012e\3\2\2\2\u012e9\3\2\2\2\u012f"+
		"\u0130\7)\2\2\u0130\u0131\7(\2\2\u0131\u0134\5<\37\2\u0132\u0133\7\34"+
		"\2\2\u0133\u0135\5\6\4\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		";\3\2\2\2\u0136\u013b\5> \2\u0137\u013b\5@!\2\u0138\u013b\5D#\2\u0139"+
		"\u013b\5F$\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013a\u0139\3\2\2\2\u013b=\3\2\2\2\u013c\u013e\7$\2\2\u013d\u013f\5"+
		"H%\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\7%\2\2\u0141\u0142\7&\2\2\u0142\u0143\5<\37\2\u0143?\3\2\2\2\u0144"+
		"\u0145\7\13\2\2\u0145\u014e\7\37\2\2\u0146\u014b\5B\"\2\u0147\u0148\7"+
		"\33\2\2\u0148\u014a\5B\"\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014e\u0146\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0152\7\33\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0153\u0154\7 \2\2\u0154A\3\2\2\2\u0155\u0156\7)\2\2\u0156\u0157"+
		"\7(\2\2\u0157\u0158\5<\37\2\u0158C\3\2\2\2\u0159\u015a\5F$\2\u015a\u015b"+
		"\7\37\2\2\u015b\u015c\5H%\2\u015c\u015d\7 \2\2\u015dE\3\2\2\2\u015e\u0162"+
		"\7)\2\2\u015f\u0162\7\f\2\2\u0160\u0162\5\34\17\2\u0161\u015e\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162G\3\2\2\2\u0163\u0168\5"+
		"<\37\2\u0164\u0165\7\33\2\2\u0165\u0167\5<\37\2\u0166\u0164\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7\33\2\2\u016c\u016b\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dI\3\2\2\2#MUXdy{\u0096\u00b3\u00bd\u00bf\u00c7\u00cf"+
		"\u00d9\u00e1\u00e7\u00f9\u0107\u0109\u0114\u0118\u011f\u0123\u012a\u012d"+
		"\u0134\u013a\u013e\u014b\u014e\u0151\u0161\u0168\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}