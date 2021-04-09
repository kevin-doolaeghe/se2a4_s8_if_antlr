// Generated from ProgrammeC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgrammeCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, AFFECT=5, SEPARATOR=6, LPAR=7, RPAR=8, 
		LACC=9, RACC=10, DIV=11, TIMES=12, MINUS=13, PLUS=14, EQUAL=15, DIFF=16, 
		GTHAN=17, LTHAN=18, INT=19, VAR=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "ELSE", "WHILE", "AFFECT", "SEPARATOR", "LPAR", "RPAR", 
			"LACC", "RACC", "DIV", "TIMES", "MINUS", "PLUS", "EQUAL", "DIFF", "GTHAN", 
			"LTHAN", "INT", "VAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'='", "';'", "'('", "')'", 
			"'{'", "'}'", "'/'", null, "'-'", "'+'", "'=='", "'!='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "WHILE", "AFFECT", "SEPARATOR", "LPAR", "RPAR", 
			"LACC", "RACC", "DIV", "TIMES", "MINUS", "PLUS", "EQUAL", "DIFF", "GTHAN", 
			"LTHAN", "INT", "VAR", "WS"
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

	Env env = new Env();

	public ProgrammeCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProgrammeC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24`\n\24\r\24\16\24"+
		"a\3\25\3\25\7\25f\n\25\f\25\16\25i\13\25\3\26\6\26l\n\26\r\26\16\26m\3"+
		"\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\7\3\2,,\3\2\62;\4\2"+
		"C\\c|\6\2\62;C\\aac|\4\2\13\f\"\"\2s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t:\3\2\2\2\13@\3"+
		"\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L"+
		"\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37T\3\2\2\2!W\3\2\2\2#Z\3"+
		"\2\2\2%\\\3\2\2\2\'_\3\2\2\2)c\3\2\2\2+k\3\2\2\2-.\7k\2\2./\7h\2\2/\4"+
		"\3\2\2\2\60\61\7v\2\2\61\62\7j\2\2\62\63\7g\2\2\63\64\7p\2\2\64\6\3\2"+
		"\2\2\65\66\7g\2\2\66\67\7n\2\2\678\7u\2\289\7g\2\29\b\3\2\2\2:;\7y\2\2"+
		";<\7j\2\2<=\7k\2\2=>\7n\2\2>?\7g\2\2?\n\3\2\2\2@A\7?\2\2A\f\3\2\2\2BC"+
		"\7=\2\2C\16\3\2\2\2DE\7*\2\2E\20\3\2\2\2FG\7+\2\2G\22\3\2\2\2HI\7}\2\2"+
		"I\24\3\2\2\2JK\7\177\2\2K\26\3\2\2\2LM\7\61\2\2M\30\3\2\2\2NO\t\2\2\2"+
		"O\32\3\2\2\2PQ\7/\2\2Q\34\3\2\2\2RS\7-\2\2S\36\3\2\2\2TU\7?\2\2UV\7?\2"+
		"\2V \3\2\2\2WX\7#\2\2XY\7?\2\2Y\"\3\2\2\2Z[\7@\2\2[$\3\2\2\2\\]\7>\2\2"+
		"]&\3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b(\3\2\2\2"+
		"cg\t\4\2\2df\t\5\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h*\3\2\2\2"+
		"ig\3\2\2\2jl\t\6\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2"+
		"op\b\26\2\2p,\3\2\2\2\6\2agm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}