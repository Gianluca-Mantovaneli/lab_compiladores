// Generated from exerc_gramar.g by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class exerc_gramarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, SEMI=4, L_PAREN=5, R_PAREN=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, DOT=11, OP=12, INT_VAL=13, STRING=14, ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "BEGIN", "END", "SEMI", "L_PAREN", "R_PAREN", "PLUS", "MINUS", 
			"MULT", "DIV", "DOT", "OP", "INT_VAL", "STRING", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'begin'", "'end'", "';'", "'('", "')'", "'+'", "'-'", 
			"'*'", "'/'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "BEGIN", "END", "SEMI", "L_PAREN", "R_PAREN", "PLUS", 
			"MINUS", "MULT", "DIV", "DOT", "OP", "INT_VAL", "STRING", "ID", "WS"
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


	public exerc_gramarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "exerc_gramar.g"; }

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
		"\u0004\u0000\u0010e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bH\b\u000b\u0001\f\u0004\fK\b\f\u000b\f\f"+
		"\fL\u0001\r\u0001\r\u0005\rQ\b\r\n\r\f\rT\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000eZ\b\u000e\n\u000e\f\u000e]\t\u000e\u0001\u000f"+
		"\u0004\u000f`\b\u000f\u000b\u000f\f\u000fa\u0001\u000f\u0001\u000f\u0001"+
		"R\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0004\u0001\u00000"+
		"9\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\t\n  k\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000"+
		"\u0000\u0003)\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u0007"+
		"3\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015A"+
		"\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019J\u0001\u0000"+
		"\u0000\u0000\u001bN\u0001\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000"+
		"\u001f_\u0001\u0000\u0000\u0000!\"\u0005p\u0000\u0000\"#\u0005r\u0000"+
		"\u0000#$\u0005o\u0000\u0000$%\u0005g\u0000\u0000%&\u0005r\u0000\u0000"+
		"&\'\u0005a\u0000\u0000\'(\u0005m\u0000\u0000(\u0002\u0001\u0000\u0000"+
		"\u0000)*\u0005b\u0000\u0000*+\u0005e\u0000\u0000+,\u0005g\u0000\u0000"+
		",-\u0005i\u0000\u0000-.\u0005n\u0000\u0000.\u0004\u0001\u0000\u0000\u0000"+
		"/0\u0005e\u0000\u000001\u0005n\u0000\u000012\u0005d\u0000\u00002\u0006"+
		"\u0001\u0000\u0000\u000034\u0005;\u0000\u00004\b\u0001\u0000\u0000\u0000"+
		"56\u0005(\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005)\u0000\u0000"+
		"8\f\u0001\u0000\u0000\u00009:\u0005+\u0000\u0000:\u000e\u0001\u0000\u0000"+
		"\u0000;<\u0005-\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005*\u0000"+
		"\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0005/\u0000\u0000@\u0014\u0001"+
		"\u0000\u0000\u0000AB\u0005.\u0000\u0000B\u0016\u0001\u0000\u0000\u0000"+
		"CH\u0003\r\u0006\u0000DH\u0003\u000f\u0007\u0000EH\u0003\u0011\b\u0000"+
		"FH\u0003\u0013\t\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0018\u0001\u0000"+
		"\u0000\u0000IK\u0007\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"M\u001a\u0001\u0000\u0000\u0000NR\u0005\"\u0000\u0000OQ\t\u0000\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UV\u0005\"\u0000\u0000V\u001c\u0001\u0000\u0000\u0000"+
		"W[\u0007\u0001\u0000\u0000XZ\u0007\u0002\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u001e\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^`\u0007\u0003\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0006\u000f\u0000\u0000d \u0001\u0000\u0000\u0000\u0006"+
		"\u0000GLR[a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}