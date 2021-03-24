// Generated from /Users/aosamesan/IdeaProjects/new-function-builder/src/main/java/asn/aosamesan/newfunctionbuilder/parser/FunctionBuilderParser.g4 by ANTLR 4.9.1
package asn.aosamesan.newfunctionbuilder.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionBuilderParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NUMERICS=9, 
		CONSTANTS=10, VARIABLE=11, LPAREN=12, RPAREN=13, LMPAREN=14, RMPAREN=15, 
		PLUS=16, MINUS=17, MULTIPLY=18, DIVIDE=19, MODULUS=20, PERCENT=21, HAT=22, 
		TRIGONOMETRIC_FUNCTIONS=23, HYPERBOLIC_FUNCTIONS=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NUMERICS", 
			"CONSTANTS", "VARIABLE", "LPAREN", "RPAREN", "LMPAREN", "RMPAREN", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULUS", "PERCENT", "HAT", "TRIGONOMETRIC_FUNCTIONS", 
			"HYPERBOLIC_FUNCTIONS", "PI", "EULER", "ARC", "SIN", "COS", "TAN", "CSC", 
			"SEC", "COT", "HYPERBOLIC", "INVERSE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'log'", "'ln'", "'exp'", "'sqrt'", "'\u221A'", "'gamma'", "'\u0393'", 
			"'!'", null, null, "'x'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", null, 
			null, "'mod'", "'%'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NUMERICS", "CONSTANTS", 
			"VARIABLE", "LPAREN", "RPAREN", "LMPAREN", "RMPAREN", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "MODULUS", "PERCENT", "HAT", "TRIGONOMETRIC_FUNCTIONS", 
			"HYPERBOLIC_FUNCTIONS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public FunctionBuilderParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunctionBuilderParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0147\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\6\ni\n\n\r\n\16\nj\3\n\3\n\6\no\n\n\r\n\16\np\5\ns\n\n\3\n"+
		"\3\n\5\nw\n\n\3\n\6\nz\n\n\r\n\16\n{\5\n~\n\n\3\13\3\13\5\13\u0082\n\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\5\30\u009f"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00a6\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00ad\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00b4\n\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u00bb\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c2\n\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00c8\n\30\3\31\5\31\u00cb\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d5\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00df\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00e9\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f3\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00fd\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0106\n\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u010d\n\32\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0115\n\34\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3 \5 \u012b\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\5$\u013f\n$\3%\6%\u0142\n%\r%\16%\u0143\3%\3%\2\2&\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2"+
		"I\33\3\2\7\3\2\62;\4\2--//\4\2,,\u00d9\u00d9\4\2\61\61\u00f9\u00f9\5\2"+
		"\13\f\17\17\"\"\2\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5O\3\2\2\2"+
		"\7R\3\2\2\2\tV\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17c\3\2\2\2\21e\3\2\2\2"+
		"\23h\3\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087"+
		"\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2"+
		"\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0099\3\2\2\2-\u009b"+
		"\3\2\2\2/\u00c7\3\2\2\2\61\u0105\3\2\2\2\63\u010c\3\2\2\2\65\u010e\3\2"+
		"\2\2\67\u0114\3\2\2\29\u0116\3\2\2\2;\u011a\3\2\2\2=\u011e\3\2\2\2?\u012a"+
		"\3\2\2\2A\u012c\3\2\2\2C\u0130\3\2\2\2E\u0134\3\2\2\2G\u013e\3\2\2\2I"+
		"\u0141\3\2\2\2KL\7n\2\2LM\7q\2\2MN\7i\2\2N\4\3\2\2\2OP\7n\2\2PQ\7p\2\2"+
		"Q\6\3\2\2\2RS\7g\2\2ST\7z\2\2TU\7r\2\2U\b\3\2\2\2VW\7u\2\2WX\7s\2\2XY"+
		"\7t\2\2YZ\7v\2\2Z\n\3\2\2\2[\\\7\u221c\2\2\\\f\3\2\2\2]^\7i\2\2^_\7c\2"+
		"\2_`\7o\2\2`a\7o\2\2ab\7c\2\2b\16\3\2\2\2cd\7\u0395\2\2d\20\3\2\2\2ef"+
		"\7#\2\2f\22\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"kr\3\2\2\2ln\7\60\2\2mo\t\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2qs\3\2\2\2rl\3\2\2\2rs\3\2\2\2s}\3\2\2\2tv\7G\2\2uw\t\3\2\2vu\3\2\2"+
		"\2vw\3\2\2\2wy\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}t\3\2\2\2}~\3\2\2\2~\24\3\2\2\2\177\u0082\5\63\32\2\u0080"+
		"\u0082\5\65\33\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\26\3\2\2"+
		"\2\u0083\u0084\7z\2\2\u0084\30\3\2\2\2\u0085\u0086\7*\2\2\u0086\32\3\2"+
		"\2\2\u0087\u0088\7+\2\2\u0088\34\3\2\2\2\u0089\u008a\7}\2\2\u008a\36\3"+
		"\2\2\2\u008b\u008c\7\177\2\2\u008c \3\2\2\2\u008d\u008e\7-\2\2\u008e\""+
		"\3\2\2\2\u008f\u0090\7/\2\2\u0090$\3\2\2\2\u0091\u0092\t\4\2\2\u0092&"+
		"\3\2\2\2\u0093\u0094\t\5\2\2\u0094(\3\2\2\2\u0095\u0096\7o\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7f\2\2\u0098*\3\2\2\2\u0099\u009a\7\'\2\2\u009a,\3"+
		"\2\2\2\u009b\u009c\7`\2\2\u009c.\3\2\2\2\u009d\u009f\5\67\34\2\u009e\u009d"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00c8\59\35\2\u00a1"+
		"\u00a2\59\35\2\u00a2\u00a3\5G$\2\u00a3\u00c8\3\2\2\2\u00a4\u00a6\5\67"+
		"\34\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00c8\5;\36\2\u00a8\u00a9\5;\36\2\u00a9\u00aa\5G$\2\u00aa\u00c8\3\2\2"+
		"\2\u00ab\u00ad\5\67\34\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00c8\5=\37\2\u00af\u00b0\5=\37\2\u00b0\u00b1\5G"+
		"$\2\u00b1\u00c8\3\2\2\2\u00b2\u00b4\5\67\34\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c8\5? \2\u00b6\u00b7\5? \2"+
		"\u00b7\u00b8\5G$\2\u00b8\u00c8\3\2\2\2\u00b9\u00bb\5\67\34\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c8\5A!\2\u00bd"+
		"\u00be\5A!\2\u00be\u00bf\5G$\2\u00bf\u00c8\3\2\2\2\u00c0\u00c2\5\67\34"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8"+
		"\5C\"\2\u00c4\u00c5\5A!\2\u00c5\u00c6\5G$\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u009e\3\2\2\2\u00c7\u00a1\3\2\2\2\u00c7\u00a5\3\2\2\2\u00c7\u00a8\3\2"+
		"\2\2\u00c7\u00ac\3\2\2\2\u00c7\u00af\3\2\2\2\u00c7\u00b3\3\2\2\2\u00c7"+
		"\u00b6\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c1\3\2"+
		"\2\2\u00c7\u00c4\3\2\2\2\u00c8\60\3\2\2\2\u00c9\u00cb\5\67\34\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\59"+
		"\35\2\u00cd\u00ce\5E#\2\u00ce\u0106\3\2\2\2\u00cf\u00d0\59\35\2\u00d0"+
		"\u00d1\5E#\2\u00d1\u00d2\5G$\2\u00d2\u0106\3\2\2\2\u00d3\u00d5\5\67\34"+
		"\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\5;\36\2\u00d7\u00d8\5E#\2\u00d8\u0106\3\2\2\2\u00d9\u00da\5;\36\2\u00da"+
		"\u00db\5E#\2\u00db\u00dc\5G$\2\u00dc\u0106\3\2\2\2\u00dd\u00df\5\67\34"+
		"\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\5=\37\2\u00e1\u00e2\5E#\2\u00e2\u0106\3\2\2\2\u00e3\u00e4\5=\37\2\u00e4"+
		"\u00e5\5E#\2\u00e5\u00e6\5G$\2\u00e6\u0106\3\2\2\2\u00e7\u00e9\5\67\34"+
		"\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\5? \2\u00eb\u00ec\5E#\2\u00ec\u0106\3\2\2\2\u00ed\u00ee\5? \2\u00ee\u00ef"+
		"\5E#\2\u00ef\u00f0\5G$\2\u00f0\u0106\3\2\2\2\u00f1\u00f3\5\67\34\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\5A"+
		"!\2\u00f5\u00f6\5E#\2\u00f6\u0106\3\2\2\2\u00f7\u00f8\5A!\2\u00f8\u00f9"+
		"\5E#\2\u00f9\u00fa\5G$\2\u00fa\u0106\3\2\2\2\u00fb\u00fd\5\67\34\2\u00fc"+
		"\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\5C"+
		"\"\2\u00ff\u0100\5E#\2\u0100\u0106\3\2\2\2\u0101\u0102\5A!\2\u0102\u0103"+
		"\5E#\2\u0103\u0104\5G$\2\u0104\u0106\3\2\2\2\u0105\u00ca\3\2\2\2\u0105"+
		"\u00cf\3\2\2\2\u0105\u00d4\3\2\2\2\u0105\u00d9\3\2\2\2\u0105\u00de\3\2"+
		"\2\2\u0105\u00e3\3\2\2\2\u0105\u00e8\3\2\2\2\u0105\u00ed\3\2\2\2\u0105"+
		"\u00f2\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0101\3\2"+
		"\2\2\u0106\62\3\2\2\2\u0107\u0108\7R\2\2\u0108\u010d\7K\2\2\u0109\u010a"+
		"\7r\2\2\u010a\u010d\7k\2\2\u010b\u010d\7\u03c2\2\2\u010c\u0107\3\2\2\2"+
		"\u010c\u0109\3\2\2\2\u010c\u010b\3\2\2\2\u010d\64\3\2\2\2\u010e\u010f"+
		"\7g\2\2\u010f\66\3\2\2\2\u0110\u0111\7c\2\2\u0111\u0112\7t\2\2\u0112\u0115"+
		"\7e\2\2\u0113\u0115\7c\2\2\u0114\u0110\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"8\3\2\2\2\u0116\u0117\7u\2\2\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119"+
		":\3\2\2\2\u011a\u011b\7e\2\2\u011b\u011c\7q\2\2\u011c\u011d\7u\2\2\u011d"+
		"<\3\2\2\2\u011e\u011f\7v\2\2\u011f\u0120\7c\2\2\u0120\u0121\7p\2\2\u0121"+
		">\3\2\2\2\u0122\u0123\7e\2\2\u0123\u0124\7u\2\2\u0124\u012b\7e\2\2\u0125"+
		"\u0126\7e\2\2\u0126\u0127\7q\2\2\u0127\u0128\7u\2\2\u0128\u0129\7g\2\2"+
		"\u0129\u012b\7e\2\2\u012a\u0122\3\2\2\2\u012a\u0125\3\2\2\2\u012b@\3\2"+
		"\2\2\u012c\u012d\7u\2\2\u012d\u012e\7g\2\2\u012e\u012f\7e\2\2\u012fB\3"+
		"\2\2\2\u0130\u0131\7e\2\2\u0131\u0132\7q\2\2\u0132\u0133\7v\2\2\u0133"+
		"D\3\2\2\2\u0134\u0135\7j\2\2\u0135F\3\2\2\2\u0136\u0137\7`\2\2\u0137\u0138"+
		"\7/\2\2\u0138\u013f\7\63\2\2\u0139\u013a\7`\2\2\u013a\u013b\7*\2\2\u013b"+
		"\u013c\7/\2\2\u013c\u013d\7\63\2\2\u013d\u013f\7+\2\2\u013e\u0136\3\2"+
		"\2\2\u013e\u0139\3\2\2\2\u013fH\3\2\2\2\u0140\u0142\t\6\2\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\b%\2\2\u0146J\3\2\2\2\35\2jprv{}\u0081\u009e"+
		"\u00a5\u00ac\u00b3\u00ba\u00c1\u00c7\u00ca\u00d4\u00de\u00e8\u00f2\u00fc"+
		"\u0105\u010c\u0114\u012a\u013e\u0143\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}