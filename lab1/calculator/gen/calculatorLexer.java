// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class calculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, SCIENTIFIC_NUMBER=2, LPAREN=3, NL=4, RPAREN=5, PLUS=6, MINUS=7, 
		TIMES=8, DIV=9, GT=10, LT=11, EQ=12, POINT=13, POW=14, ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "SCIENTIFIC_NUMBER", "NUMBER", 
			"UNSIGNED_INTEGER", "E", "SIGN", "LPAREN", "NL", "RPAREN", "PLUS", "MINUS", 
			"TIMES", "DIV", "GT", "LT", "EQ", "POINT", "POW", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "'\\n'", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'>'", "'<'", "'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE", "SCIENTIFIC_NUMBER", "LPAREN", "NL", "RPAREN", "PLUS", 
			"MINUS", "TIMES", "DIV", "GT", "LT", "EQ", "POINT", "POW", "ID", "WS"
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


	public calculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

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
		"\u0004\u0000\u0010~\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000\n\u0000"+
		"\f\u00003\t\u0000\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"?\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0004\u0004"+
		"\u0004F\b\u0004\u000b\u0004\f\u0004G\u0001\u0004\u0001\u0004\u0004\u0004"+
		"L\b\u0004\u000b\u0004\f\u0004M\u0003\u0004P\b\u0004\u0001\u0005\u0004"+
		"\u0005S\b\u0005\u000b\u0005\f\u0005T\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014t\b"+
		"\u0014\u000b\u0014\f\u0014u\u0001\u0015\u0004\u0015y\b\u0015\u000b\u0015"+
		"\f\u0015z\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0000\u0005\u0000\u0007\u0002\t\u0000\u000b\u0000\r\u0000\u000f\u0000"+
		"\u0011\u0003\u0013\u0004\u0015\u0005\u0017\u0006\u0019\u0007\u001b\b\u001d"+
		"\t\u001f\n!\u000b#\f%\r\'\u000e)\u000f+\u0010\u0001\u0000\u0005\u0003"+
		"\u0000AZ__az\u0002\u0000EEee\u0002\u0000++--\u0002\u0000AZaz\u0002\u0000"+
		"\t\n\r\r\u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001"+
		"\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000"+
		"\u0000\u0007;\u0001\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000\u000b"+
		"R\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000fX\u0001\u0000"+
		"\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000"+
		"\u0000\u0015^\u0001\u0000\u0000\u0000\u0017`\u0001\u0000\u0000\u0000\u0019"+
		"b\u0001\u0000\u0000\u0000\u001bd\u0001\u0000\u0000\u0000\u001df\u0001"+
		"\u0000\u0000\u0000\u001fh\u0001\u0000\u0000\u0000!j\u0001\u0000\u0000"+
		"\u0000#l\u0001\u0000\u0000\u0000%n\u0001\u0000\u0000\u0000\'p\u0001\u0000"+
		"\u0000\u0000)s\u0001\u0000\u0000\u0000+x\u0001\u0000\u0000\u0000-1\u0003"+
		"\u0003\u0001\u0000.0\u0003\u0005\u0002\u0000/.\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002\u0002\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0007"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0004\u0001\u0000\u0000"+
		"\u00007:\u0003\u0003\u0001\u00008:\u000209\u000097\u0001\u0000\u0000\u0000"+
		"98\u0001\u0000\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;B\u0003\t\u0004"+
		"\u0000<>\u0003\r\u0006\u0000=?\u0003\u000f\u0007\u0000>=\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0003\u000b"+
		"\u0005\u0000AC\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000C\b\u0001\u0000\u0000\u0000DF\u000209\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HO\u0001\u0000\u0000\u0000IK\u0005.\u0000\u0000"+
		"JL\u000209\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M"+
		"K\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000"+
		"\u0000OI\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\n\u0001\u0000"+
		"\u0000\u0000QS\u000209\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\f\u0001\u0000"+
		"\u0000\u0000VW\u0007\u0001\u0000\u0000W\u000e\u0001\u0000\u0000\u0000"+
		"XY\u0007\u0002\u0000\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005(\u0000"+
		"\u0000[\u0012\u0001\u0000\u0000\u0000\\]\u0005\n\u0000\u0000]\u0014\u0001"+
		"\u0000\u0000\u0000^_\u0005)\u0000\u0000_\u0016\u0001\u0000\u0000\u0000"+
		"`a\u0005+\u0000\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005-\u0000\u0000"+
		"c\u001a\u0001\u0000\u0000\u0000de\u0005*\u0000\u0000e\u001c\u0001\u0000"+
		"\u0000\u0000fg\u0005/\u0000\u0000g\u001e\u0001\u0000\u0000\u0000hi\u0005"+
		">\u0000\u0000i \u0001\u0000\u0000\u0000jk\u0005<\u0000\u0000k\"\u0001"+
		"\u0000\u0000\u0000lm\u0005=\u0000\u0000m$\u0001\u0000\u0000\u0000no\u0005"+
		".\u0000\u0000o&\u0001\u0000\u0000\u0000pq\u0005^\u0000\u0000q(\u0001\u0000"+
		"\u0000\u0000rt\u0007\u0003\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v*\u0001\u0000\u0000\u0000wy\u0007\u0004\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0006\u0015\u0000\u0000},\u0001"+
		"\u0000\u0000\u0000\f\u0000159>BGMOTuz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}