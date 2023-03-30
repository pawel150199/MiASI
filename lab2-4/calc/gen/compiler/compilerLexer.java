// Generated from java-escape by ANTLR 4.11.1
package compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PRZ=4, IF=5, WHILE=6, FOR=7, VARIABLE=8, SCIENTIFIC_NUMBER=9, 
		LPAREN=10, RPAREN=11, PLUS=12, ŚREDNIK=13, MINUS=14, TIMES=15, ID=16, 
		DIV=17, GT=18, LT=19, EQ=20, POINT=21, POW=22, NEWLINE=23, BEGINFUNC=24, 
		ENDFUNC=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "PRZ", "IF", "WHILE", "FOR", "VARIABLE", "VALID_ID_START", 
			"VALID_ID_CHAR", "SCIENTIFIC_NUMBER", "NUMBER", "UNSIGNED_INTEGER", "E", 
			"SIGN", "LPAREN", "RPAREN", "PLUS", "ŚREDNIK", "MINUS", "TIMES", "ID", 
			"DIV", "GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "BEGINFUNC", "ENDFUNC", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'def'", "'print'", "':='", "'if'", "'while'", "'for'", 
			null, null, "'('", "')'", "'+'", "';'", "'-'", "'*'", null, "'/'", "'>'", 
			"'<'", "'='", "'.'", "'^'", null, "'begin'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRZ", "IF", "WHILE", "FOR", "VARIABLE", "SCIENTIFIC_NUMBER", 
			"LPAREN", "RPAREN", "PLUS", "\u0000REDNIK", "MINUS", "TIMES", "ID", "DIV", 
			"GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "BEGINFUNC", "ENDFUNC", 
			"WS"
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


	public compilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiler.g4"; }

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
		"\u0004\u0000\u001a\u00c0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007c\b\u0007\n\u0007\f\u0007f\t\u0007\u0001\b\u0003"+
		"\bi\b\b\u0001\t\u0001\t\u0003\tm\b\t\u0001\n\u0001\n\u0001\n\u0003\nr"+
		"\b\n\u0001\n\u0001\n\u0003\nv\b\n\u0001\u000b\u0004\u000by\b\u000b\u000b"+
		"\u000b\f\u000bz\u0001\u000b\u0001\u000b\u0004\u000b\u007f\b\u000b\u000b"+
		"\u000b\f\u000b\u0080\u0003\u000b\u0083\b\u000b\u0001\f\u0004\f\u0086\b"+
		"\f\u000b\f\f\f\u0087\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0004\u0015\u009b\b\u0015\u000b\u0015\f\u0015\u009c\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0003"+
		"\u001c\u00ac\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u00bb\b\u001f\u000b\u001f\f"+
		"\u001f\u00bc\u0001\u001f\u0001\u001f\u0000\u0000 \u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\u0000"+
		"\u0013\u0000\u0015\t\u0017\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f"+
		"\n!\u000b#\f%\r\'\u000e)\u000f+\u0010-\u0011/\u00121\u00133\u00145\u0015"+
		"7\u00169\u0017;\u0018=\u0019?\u001a\u0001\u0000\u0005\u0003\u0000AZ__"+
		"az\u0002\u0000EEee\u0002\u0000++--\u0002\u0000AZaz\u0003\u0000\t\n\r\r"+
		"  \u00c4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0001A"+
		"\u0001\u0000\u0000\u0000\u0003F\u0001\u0000\u0000\u0000\u0005J\u0001\u0000"+
		"\u0000\u0000\u0007P\u0001\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000"+
		"\u000bV\u0001\u0000\u0000\u0000\r\\\u0001\u0000\u0000\u0000\u000f`\u0001"+
		"\u0000\u0000\u0000\u0011h\u0001\u0000\u0000\u0000\u0013l\u0001\u0000\u0000"+
		"\u0000\u0015n\u0001\u0000\u0000\u0000\u0017x\u0001\u0000\u0000\u0000\u0019"+
		"\u0085\u0001\u0000\u0000\u0000\u001b\u0089\u0001\u0000\u0000\u0000\u001d"+
		"\u008b\u0001\u0000\u0000\u0000\u001f\u008d\u0001\u0000\u0000\u0000!\u008f"+
		"\u0001\u0000\u0000\u0000#\u0091\u0001\u0000\u0000\u0000%\u0093\u0001\u0000"+
		"\u0000\u0000\'\u0095\u0001\u0000\u0000\u0000)\u0097\u0001\u0000\u0000"+
		"\u0000+\u009a\u0001\u0000\u0000\u0000-\u009e\u0001\u0000\u0000\u0000/"+
		"\u00a0\u0001\u0000\u0000\u00001\u00a2\u0001\u0000\u0000\u00003\u00a4\u0001"+
		"\u0000\u0000\u00005\u00a6\u0001\u0000\u0000\u00007\u00a8\u0001\u0000\u0000"+
		"\u00009\u00ab\u0001\u0000\u0000\u0000;\u00af\u0001\u0000\u0000\u0000="+
		"\u00b5\u0001\u0000\u0000\u0000?\u00ba\u0001\u0000\u0000\u0000AB\u0005"+
		"e\u0000\u0000BC\u0005l\u0000\u0000CD\u0005s\u0000\u0000DE\u0005e\u0000"+
		"\u0000E\u0002\u0001\u0000\u0000\u0000FG\u0005d\u0000\u0000GH\u0005e\u0000"+
		"\u0000HI\u0005f\u0000\u0000I\u0004\u0001\u0000\u0000\u0000JK\u0005p\u0000"+
		"\u0000KL\u0005r\u0000\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000\u0000"+
		"NO\u0005t\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005:\u0000\u0000"+
		"QR\u0005=\u0000\u0000R\b\u0001\u0000\u0000\u0000ST\u0005i\u0000\u0000"+
		"TU\u0005f\u0000\u0000U\n\u0001\u0000\u0000\u0000VW\u0005w\u0000\u0000"+
		"WX\u0005h\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005"+
		"e\u0000\u0000[\f\u0001\u0000\u0000\u0000\\]\u0005f\u0000\u0000]^\u0005"+
		"o\u0000\u0000^_\u0005r\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`d\u0003"+
		"\u0011\b\u0000ac\u0003\u0013\t\u0000ba\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"e\u0010\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0007\u0000"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0012\u0001\u0000\u0000\u0000"+
		"jm\u0003\u0011\b\u0000km\u000209\u0000lj\u0001\u0000\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000m\u0014\u0001\u0000\u0000\u0000nu\u0003\u0017\u000b"+
		"\u0000oq\u0003\u001b\r\u0000pr\u0003\u001d\u000e\u0000qp\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0003\u0019"+
		"\f\u0000tv\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v\u0016\u0001\u0000\u0000\u0000wy\u000209\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u0082\u0001\u0000\u0000\u0000|~\u0005.\u0000\u0000"+
		"}\u007f\u000209\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0018\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u000209\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u001a\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0007\u0001\u0000\u0000\u008a\u001c\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0007\u0002\u0000\u0000\u008c\u001e\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005(\u0000\u0000\u008e \u0001\u0000\u0000\u0000\u008f\u0090\u0005)"+
		"\u0000\u0000\u0090\"\u0001\u0000\u0000\u0000\u0091\u0092\u0005+\u0000"+
		"\u0000\u0092$\u0001\u0000\u0000\u0000\u0093\u0094\u0005;\u0000\u0000\u0094"+
		"&\u0001\u0000\u0000\u0000\u0095\u0096\u0005-\u0000\u0000\u0096(\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098*\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0007\u0003\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d,\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005/\u0000\u0000\u009f.\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005>\u0000\u0000\u00a10\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005<"+
		"\u0000\u0000\u00a32\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005=\u0000\u0000"+
		"\u00a54\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005.\u0000\u0000\u00a76"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005^\u0000\u0000\u00a98\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0005\r\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005\n\u0000\u0000\u00ae:\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005b\u0000\u0000\u00b0\u00b1\u0005e\u0000\u0000\u00b1\u00b2"+
		"\u0005g\u0000\u0000\u00b2\u00b3\u0005i\u0000\u0000\u00b3\u00b4\u0005n"+
		"\u0000\u0000\u00b4<\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005e\u0000\u0000"+
		"\u00b6\u00b7\u0005n\u0000\u0000\u00b7\u00b8\u0005d\u0000\u0000\u00b8>"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0007\u0004\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\u001f\u0000\u0000\u00bf@\u0001"+
		"\u0000\u0000\u0000\r\u0000dhlquz\u0080\u0082\u0087\u009c\u00ab\u00bc\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}