// Generated from exerc_gramar.g by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class exerc_gramarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, SEMI=4, L_PAREN=5, R_PAREN=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, DOT=11, OP=12, INT_VAL=13, STRING=14, ID=15, WS=16;
	public static final int
		RULE_begin = 0, RULE_statement = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "statement", "expr"
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

	@Override
	public String getGrammarFileName() { return "exerc_gramar.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exerc_gramarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				statement();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 57382L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(exerc_gramarParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(exerc_gramarParser.ID, 0); }
		public List<TerminalNode> SEMI() { return getTokens(exerc_gramarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(exerc_gramarParser.SEMI, i);
		}
		public TerminalNode BEGIN() { return getToken(exerc_gramarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(exerc_gramarParser.END, 0); }
		public TerminalNode DOT() { return getToken(exerc_gramarParser.DOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(PROGRAM);
				setState(12);
				match(ID);
				setState(13);
				match(SEMI);
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(BEGIN);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57376L) != 0)) {
					{
					{
					setState(15);
					expr(0);
					setState(16);
					match(SEMI);
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23);
				match(END);
				setState(24);
				match(DOT);
				}
				break;
			case L_PAREN:
			case INT_VAL:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				expr(0);
				setState(26);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Valor_inteiroContext extends ExprContext {
		public TerminalNode INT_VAL() { return getToken(exerc_gramarParser.INT_VAL, 0); }
		public Valor_inteiroContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Valor_stringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(exerc_gramarParser.STRING, 0); }
		public Valor_stringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicação_e_DivisãoContext extends ExprContext {
		public Token OP;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(exerc_gramarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(exerc_gramarParser.DIV, 0); }
		public Multiplicação_e_DivisãoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AgrupamentoContext extends ExprContext {
		public TerminalNode L_PAREN() { return getToken(exerc_gramarParser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(exerc_gramarParser.R_PAREN, 0); }
		public AgrupamentoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ExprContext {
		public TerminalNode ID() { return getToken(exerc_gramarParser.ID, 0); }
		public IdentificadorContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Adição_e_SubtraçãoContext extends ExprContext {
		public Token OP;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(exerc_gramarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(exerc_gramarParser.MINUS, 0); }
		public Adição_e_SubtraçãoContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
				{
				_localctx = new AgrupamentoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(31);
				match(L_PAREN);
				setState(32);
				expr(0);
				setState(33);
				match(R_PAREN);
				}
				break;
			case INT_VAL:
				{
				_localctx = new Valor_inteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(INT_VAL);
				}
				break;
			case STRING:
				{
				_localctx = new Valor_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new IdentificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicação_e_DivisãoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(41);
						((Multiplicação_e_DivisãoContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((Multiplicação_e_DivisãoContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Adição_e_SubtraçãoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
						((Adição_e_SubtraçãoContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Adição_e_SubtraçãoContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(50);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b"+
		"\u0002\n\u0002\f\u00022\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000"+
		"\u0002\u0004\u0000\u0002\u0001\u0000\t\n\u0001\u0000\u0007\b9\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004&\u0001"+
		"\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000"+
		"\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000"+
		"\t\n\u0001\u0000\u0000\u0000\n\u0001\u0001\u0000\u0000\u0000\u000b\f\u0005"+
		"\u0001\u0000\u0000\f\r\u0005\u000f\u0000\u0000\r\u001d\u0005\u0004\u0000"+
		"\u0000\u000e\u0014\u0005\u0002\u0000\u0000\u000f\u0010\u0003\u0004\u0002"+
		"\u0000\u0010\u0011\u0005\u0004\u0000\u0000\u0011\u0013\u0001\u0000\u0000"+
		"\u0000\u0012\u000f\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000\u0000"+
		"\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000"+
		"\u0000\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u001d\u0005\u000b\u0000"+
		"\u0000\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0005\u0004\u0000"+
		"\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u000b\u0001\u0000\u0000"+
		"\u0000\u001c\u000e\u0001\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000"+
		"\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001f\u0006\u0002\uffff"+
		"\uffff\u0000\u001f \u0005\u0005\u0000\u0000 !\u0003\u0004\u0002\u0000"+
		"!\"\u0005\u0006\u0000\u0000\"\'\u0001\u0000\u0000\u0000#\'\u0005\r\u0000"+
		"\u0000$\'\u0005\u000e\u0000\u0000%\'\u0005\u000f\u0000\u0000&\u001e\u0001"+
		"\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&%\u0001\u0000\u0000\u0000\'0\u0001\u0000\u0000\u0000()\n\u0005\u0000"+
		"\u0000)*\u0007\u0000\u0000\u0000*/\u0003\u0004\u0002\u0006+,\n\u0004\u0000"+
		"\u0000,-\u0007\u0001\u0000\u0000-/\u0003\u0004\u0002\u0005.(\u0001\u0000"+
		"\u0000\u0000.+\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0005\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u0000\u0006\t\u0014\u001c&.0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}