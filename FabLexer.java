// Generated from FabLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FabLexer extends Lexer {
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
		FileList=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "FileList"
	};

	public static final String[] ruleNames = {
		"Comment", "WS", "Action", "FileListStart", "Foreach", "Function", "Else", 
		"If", "Record", "Type", "BoolLiteral", "IntLiteral", "StringLiteral", 
		"And", "Cons", "Divide", "Equals", "Minus", "Multiply", "Not", "NotEquals", 
		"Or", "Plus", "Xor", "ArgSep", "Assign", "BraceOpen", "BraceClose", "BracketOpen", 
		"BracketClose", "End", "FieldSep", "Input", "ParenOpen", "ParenClose", 
		"Produces", "Query", "TypeSep", "Identifier", "FileListArgs", "FileListEnd", 
		"FilenameLiteral", "FileListWS"
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


	public FabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FabLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u011a\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2\3\3\6\3e\n\3\r\3\16\3"+
		"f\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a9\n\f\3"+
		"\r\6\r\u00ac\n\r\r\r\16\r\u00ad\3\16\3\16\7\16\u00b2\n\16\f\16\16\16\u00b5"+
		"\13\16\3\16\3\16\3\16\7\16\u00ba\n\16\f\16\16\16\u00bd\13\16\3\16\5\16"+
		"\u00c0\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\7(\u0102\n(\f(\16(\u0105\13(\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"+\6+\u0110\n+\r+\16+\u0111\3,\6,\u0115\n,\r,\16,\u0116\3,\3,\4\u00b3\u00bb"+
		"\2-\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36"+
		"\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<"+
		"\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-\4\2\3\b\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\6\2\60;C\\aac|\2\u0122\2\4\3\2\2"+
		"\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3"+
		"\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2"+
		"\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2"+
		"\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2"+
		"\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2"+
		"\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2"+
		"\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\3R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\3X"+
		"\3\2\2\2\4Z\3\2\2\2\6d\3\2\2\2\bj\3\2\2\2\nq\3\2\2\2\fz\3\2\2\2\16\u0082"+
		"\3\2\2\2\20\u008b\3\2\2\2\22\u0090\3\2\2\2\24\u0093\3\2\2\2\26\u009a\3"+
		"\2\2\2\30\u00a8\3\2\2\2\32\u00ab\3\2\2\2\34\u00bf\3\2\2\2\36\u00c1\3\2"+
		"\2\2 \u00c5\3\2\2\2\"\u00c8\3\2\2\2$\u00ca\3\2\2\2&\u00cd\3\2\2\2(\u00cf"+
		"\3\2\2\2*\u00d1\3\2\2\2,\u00d5\3\2\2\2.\u00d8\3\2\2\2\60\u00db\3\2\2\2"+
		"\62\u00dd\3\2\2\2\64\u00e1\3\2\2\2\66\u00e3\3\2\2\28\u00e5\3\2\2\2:\u00e7"+
		"\3\2\2\2<\u00e9\3\2\2\2>\u00eb\3\2\2\2@\u00ed\3\2\2\2B\u00ef\3\2\2\2D"+
		"\u00f1\3\2\2\2F\u00f4\3\2\2\2H\u00f6\3\2\2\2J\u00f8\3\2\2\2L\u00fb\3\2"+
		"\2\2N\u00fd\3\2\2\2P\u00ff\3\2\2\2R\u0106\3\2\2\2T\u010a\3\2\2\2V\u010f"+
		"\3\2\2\2X\u0114\3\2\2\2Z^\7%\2\2[]\n\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\b\2\2\2b\5\3\2\2\2ce\t\3\2\2dc\3"+
		"\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\3\2\2i\7\3\2\2\2jk"+
		"\7c\2\2kl\7e\2\2lm\7v\2\2mn\7k\2\2no\7q\2\2op\7p\2\2p\t\3\2\2\2qr\7h\2"+
		"\2rs\7k\2\2st\7n\2\2tu\7g\2\2uv\7u\2\2vw\7*\2\2wx\3\2\2\2xy\b\5\3\2y\13"+
		"\3\2\2\2z{\7h\2\2{|\7q\2\2|}\7t\2\2}~\7g\2\2~\177\7c\2\2\177\u0080\7e"+
		"\2\2\u0080\u0081\7j\2\2\u0081\r\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7p\2\2\u0085\u0086\7e\2\2\u0086\u0087\7v\2\2\u0087"+
		"\u0088\7k\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p\2\2\u008a\17\3\2\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2"+
		"\u008f\21\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h\2\2\u0092\23\3\2\2"+
		"\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7e\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099\7f\2\2\u0099\25\3\2\2\2\u009a\u009b"+
		"\7v\2\2\u009b\u009c\7{\2\2\u009c\u009d\7r\2\2\u009d\u009e\7g\2\2\u009e"+
		"\27\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a9\7g\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2"+
		"\u00a6\u00a7\7u\2\2\u00a7\u00a9\7g\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a3"+
		"\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\33\3\2\2"+
		"\2\u00af\u00b3\7)\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00c0\7)\2\2\u00b7\u00bb\7$\2\2\u00b8\u00ba\13\2"+
		"\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\7$"+
		"\2\2\u00bf\u00af\3\2\2\2\u00bf\u00b7\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7f\2\2\u00c4\37\3\2\2\2\u00c5\u00c6"+
		"\7<\2\2\u00c6\u00c7\7<\2\2\u00c7!\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9#"+
		"\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\7?\2\2\u00cc%\3\2\2\2\u00cd\u00ce"+
		"\7/\2\2\u00ce\'\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0)\3\2\2\2\u00d1\u00d2"+
		"\7p\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7v\2\2\u00d4+\3\2\2\2\u00d5\u00d6"+
		"\7#\2\2\u00d6\u00d7\7?\2\2\u00d7-\3\2\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da"+
		"\7t\2\2\u00da/\3\2\2\2\u00db\u00dc\7-\2\2\u00dc\61\3\2\2\2\u00dd\u00de"+
		"\7z\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\63\3\2\2\2\u00e1\u00e2"+
		"\7.\2\2\u00e2\65\3\2\2\2\u00e3\u00e4\7?\2\2\u00e4\67\3\2\2\2\u00e5\u00e6"+
		"\7}\2\2\u00e69\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8;\3\2\2\2\u00e9\u00ea"+
		"\7]\2\2\u00ea=\3\2\2\2\u00eb\u00ec\7_\2\2\u00ec?\3\2\2\2\u00ed\u00ee\7"+
		"=\2\2\u00eeA\3\2\2\2\u00ef\u00f0\7\60\2\2\u00f0C\3\2\2\2\u00f1\u00f2\7"+
		">\2\2\u00f2\u00f3\7/\2\2\u00f3E\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5G\3\2"+
		"\2\2\u00f6\u00f7\7+\2\2\u00f7I\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fa"+
		"\7@\2\2\u00faK\3\2\2\2\u00fb\u00fc\7A\2\2\u00fcM\3\2\2\2\u00fd\u00fe\7"+
		"<\2\2\u00feO\3\2\2\2\u00ff\u0103\t\5\2\2\u0100\u0102\t\6\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"Q\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7.\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\b)\4\2\u0109S\3\2\2\2\u010a\u010b\7+\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\b*\4\2\u010dU\3\2\2\2\u010e\u0110\t\7\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112W\3\2\2\2"+
		"\u0113\u0115\t\3\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b,\2\2\u0119"+
		"Y\3\2\2\2\16\2\3^f\u00a8\u00ad\u00b3\u00bb\u00bf\u0103\u0111\u0116\5\b"+
		"\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}