// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class calcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PI=2, IF=3, LPAREN=4, RPAREN=5, PLUS=6, WHILE=7, MINUS=8, TIMES=9, 
		ID=10, DIV=11, GT=12, LT=13, EQ=14, POINT=15, POW=16, NEWLINE=17, INT=18, 
		WS=19;
	public static final int
		RULE_file_ = 0, RULE_stat = 1, RULE_expression = 2, RULE_atom = 3, RULE_constant = 4, 
		RULE_relop = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_", "stat", "expression", "atom", "constant", "relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'pi'", "'if'", "'('", "')'", "'+'", "'while'", "'-'", 
			"'*'", null, "'/'", "'>'", "'<'", "'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PI", "IF", "LPAREN", "RPAREN", "PLUS", "WHILE", "MINUS", 
			"TIMES", "ID", "DIV", "GT", "LT", "EQ", "POINT", "POW", "NEWLINE", "INT", 
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(calcParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public File_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterFile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitFile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitFile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_Context file_() throws RecognitionException {
		File_Context _localctx = new File_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 394396L) != 0) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(calcParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends StatContext {
		public ExpressionContext cond;
		public StatContext then;
		public StatContext else_;
		public TerminalNode IF() { return getToken(calcParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(calcParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(calcParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(calcParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(calcParser.RPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public If_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends StatContext {
		public ExpressionContext cond;
		public StatContext then;
		public TerminalNode WHILE() { return getToken(calcParser.WHILE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(calcParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(calcParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(calcParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(calcParser.RPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends StatContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(calcParser.ID, 0); }
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(calcParser.NEWLINE, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(IF);
				setState(21);
				match(LPAREN);
				setState(22);
				((If_statementContext)_localctx).cond = expression(0);
				setState(23);
				match(RPAREN);
				setState(24);
				match(LPAREN);
				setState(25);
				((If_statementContext)_localctx).then = stat();
				setState(26);
				match(RPAREN);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(27);
					match(T__0);
					setState(29); 
					_errHandler.sync(this);
					_alt = 1+1;
					do {
						switch (_alt) {
						case 1+1:
							{
							{
							setState(28);
							((If_statementContext)_localctx).else_ = stat();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(31); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(WHILE);
				setState(36);
				match(LPAREN);
				setState(37);
				((WhileContext)_localctx).cond = expression(0);
				setState(38);
				match(RPAREN);
				setState(39);
				match(LPAREN);
				setState(40);
				((WhileContext)_localctx).then = stat();
				setState(41);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				expression(0);
				}
				break;
			case 4:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(ID);
				setState(45);
				relop();
				setState(46);
				expression(0);
				setState(47);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Plus_minContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(calcParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(calcParser.MINUS, 0); }
		public Plus_minContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPlus_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPlus_min(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitPlus_min(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(calcParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calcParser.RPAREN, 0); }
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ConstContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(calcParser.POW, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_divContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(calcParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(calcParser.DIV, 0); }
		public Mul_divContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterMul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitMul_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitMul_div(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(calcParser.ID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(calcParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(ID);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(LPAREN);
				setState(56);
				expression(0);
				setState(57);
				match(RPAREN);
				}
				break;
			case PI:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(63);
						((PowContext)_localctx).op = match(POW);
						setState(64);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new Mul_divContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						((Mul_divContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
							((Mul_divContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new Plus_minContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						((Plus_minContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Plus_minContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						relop();
						setState(73);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			constant();
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
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(calcParser.PI, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PI);
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
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(calcParser.EQ, 0); }
		public TerminalNode GT() { return getToken(calcParser.GT, 0); }
		public TerminalNode LT() { return getToken(calcParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013W\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0003\u0001\"\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00013\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002L\b\u0002"+
		"\n\u0002\f\u0002O\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u001f\u0001\u0004\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0003\u0002\u0000\t\t\u000b\u000b\u0002\u0000"+
		"\u0006\u0006\b\b\u0001\u0000\f\u000e^\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u00022\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006P"+
		"\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000"+
		"\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e"+
		"\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0001\u0000\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0000\u0000\u0001\u0013\u0001"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0003\u0000\u0000\u0015\u0016"+
		"\u0005\u0004\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018"+
		"\u0005\u0005\u0000\u0000\u0018\u0019\u0005\u0004\u0000\u0000\u0019\u001a"+
		"\u0003\u0002\u0001\u0000\u001a!\u0005\u0005\u0000\u0000\u001b\u001d\u0005"+
		"\u0001\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000"+
		"\u0000!\u001b\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"3\u0001"+
		"\u0000\u0000\u0000#$\u0005\u0007\u0000\u0000$%\u0005\u0004\u0000\u0000"+
		"%&\u0003\u0004\u0002\u0000&\'\u0005\u0005\u0000\u0000\'(\u0005\u0004\u0000"+
		"\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0005\u0000\u0000*3\u0001\u0000"+
		"\u0000\u0000+3\u0003\u0004\u0002\u0000,-\u0005\n\u0000\u0000-.\u0003\n"+
		"\u0005\u0000./\u0003\u0004\u0002\u0000/0\u0005\u0011\u0000\u000003\u0001"+
		"\u0000\u0000\u000013\u0005\u0011\u0000\u00002\u0014\u0001\u0000\u0000"+
		"\u00002#\u0001\u0000\u0000\u00002+\u0001\u0000\u0000\u00002,\u0001\u0000"+
		"\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u0000"+
		"45\u0006\u0002\uffff\uffff\u00005=\u0005\u0012\u0000\u00006=\u0005\n\u0000"+
		"\u000078\u0005\u0004\u0000\u000089\u0003\u0004\u0002\u00009:\u0005\u0005"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;=\u0003\u0006\u0003\u0000<4\u0001"+
		"\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=M\u0001\u0000\u0000\u0000>?\n\b\u0000\u0000"+
		"?@\u0005\u0010\u0000\u0000@L\u0003\u0004\u0002\tAB\n\u0007\u0000\u0000"+
		"BC\u0007\u0000\u0000\u0000CL\u0003\u0004\u0002\bDE\n\u0006\u0000\u0000"+
		"EF\u0007\u0001\u0000\u0000FL\u0003\u0004\u0002\u0007GH\n\u0005\u0000\u0000"+
		"HI\u0003\n\u0005\u0000IJ\u0003\u0004\u0002\u0006JL\u0001\u0000\u0000\u0000"+
		"K>\u0001\u0000\u0000\u0000KA\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000"+
		"\u0000KG\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PQ\u0003\b\u0004\u0000Q\u0007\u0001\u0000\u0000"+
		"\u0000RS\u0005\u0002\u0000\u0000S\t\u0001\u0000\u0000\u0000TU\u0007\u0002"+
		"\u0000\u0000U\u000b\u0001\u0000\u0000\u0000\u0007\u000f\u001f!2<KM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}