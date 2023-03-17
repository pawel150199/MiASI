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
public class calculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, SCIENTIFIC_NUMBER=2, LPAREN=3, NL=4, RPAREN=5, PLUS=6, MINUS=7, 
		TIMES=8, DIV=9, GT=10, LT=11, EQ=12, POINT=13, POW=14, ID=15, WS=16;
	public static final int
		RULE_file_ = 0, RULE_expression = 1, RULE_setVar = 2, RULE_atom = 3, RULE_relop = 4, 
		RULE_scientific = 5, RULE_variable = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_", "expression", "setVar", "atom", "relop", "scientific", "variable"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(calculatorParser.EOF, 0); }
		public List<SetVarContext> setVar() {
			return getRuleContexts(SetVarContext.class);
		}
		public SetVarContext setVar(int i) {
			return getRuleContext(SetVarContext.class,i);
		}
		public File_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterFile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitFile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitFile_(this);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 32990L) != 0) {
				{
				{
				setState(14);
				setVar();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
	public static class ParenContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(calculatorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calculatorParser.RPAREN, 0); }
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusminContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(calculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(calculatorParser.MINUS, 0); }
		public PlusminContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPlusmin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPlusmin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPlusmin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(calculatorParser.VARIABLE, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IddContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(calculatorParser.ID, 0); }
		public IddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterIdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitIdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitIdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(calculatorParser.POW, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Scienttific_numContext extends ExpressionContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(calculatorParser.SCIENTIFIC_NUMBER, 0); }
		public Scienttific_numContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterScienttific_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitScienttific_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitScienttific_num(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtommulContext extends ExpressionContext {
		public Token op;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(calculatorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(calculatorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(calculatorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(calculatorParser.MINUS, i);
		}
		public AtommulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAtommul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAtommul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtommul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MuldivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(calculatorParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(calculatorParser.DIV, 0); }
		public MuldivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMuldiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMuldiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMuldiv(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				_localctx = new IddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new Scienttific_numContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(SCIENTIFIC_NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(LPAREN);
				setState(27);
				expression(0);
				setState(28);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new AtommulContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(30);
					((AtommulContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AtommulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(48);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(39);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(40);
						match(POW);
						setState(41);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new MuldivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(42);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(43);
						((MuldivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
							((MuldivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusminContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(45);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(46);
						((PlusminContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusminContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(47);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class SetVarContext extends ParserRuleContext {
		public SetVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVar; }
	 
		public SetVarContext() { }
		public void copyFrom(SetVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends SetVarContext {
		public TerminalNode NL() { return getToken(calculatorParser.NL, 0); }
		public NullContext(SetVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends SetVarContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(SetVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends SetVarContext {
		public TerminalNode ID() { return getToken(calculatorParser.ID, 0); }
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NL() { return getToken(calculatorParser.NL, 0); }
		public AssignContext(SetVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVarContext setVar() throws RecognitionException {
		SetVarContext _localctx = new SetVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setVar);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				expression(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(ID);
				setState(55);
				relop();
				setState(56);
				expression(0);
				setState(57);
				match(NL);
				}
				break;
			case 3:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(NL);
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
	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				variable();
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
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(calculatorParser.GT, 0); }
		public TerminalNode LT() { return getToken(calculatorParser.LT, 0); }
		public TerminalNode EQ() { return getToken(calculatorParser.EQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(calculatorParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(SCIENTIFIC_NUMBER);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(calculatorParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(VARIABLE);
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
		case 1:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001"+
		"\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00011\b\u0001\n\u0001\f\u00014\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"=\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000"+
		"\u0001\u0002\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0003\u0001\u0000"+
		"\u0006\u0007\u0001\u0000\b\t\u0001\u0000\n\fM\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000"+
		"\u0006@\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nD\u0001\u0000"+
		"\u0000\u0000\fF\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0004\u0002"+
		"\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0006\u0001\uffff\uffff\u0000\u0017&\u0005\u0001\u0000"+
		"\u0000\u0018&\u0005\u000f\u0000\u0000\u0019&\u0005\u0002\u0000\u0000\u001a"+
		"\u001b\u0005\u0003\u0000\u0000\u001b\u001c\u0003\u0002\u0001\u0000\u001c"+
		"\u001d\u0005\u0005\u0000\u0000\u001d&\u0001\u0000\u0000\u0000\u001e \u0007"+
		"\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0003\u0006\u0003\u0000"+
		"%\u0016\u0001\u0000\u0000\u0000%\u0018\u0001\u0000\u0000\u0000%\u0019"+
		"\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%!\u0001\u0000"+
		"\u0000\u0000&2\u0001\u0000\u0000\u0000\'(\n\b\u0000\u0000()\u0005\u000e"+
		"\u0000\u0000)1\u0003\u0002\u0001\t*+\n\u0007\u0000\u0000+,\u0007\u0001"+
		"\u0000\u0000,1\u0003\u0002\u0001\b-.\n\u0006\u0000\u0000./\u0007\u0000"+
		"\u0000\u0000/1\u0003\u0002\u0001\u00070\'\u0001\u0000\u0000\u00000*\u0001"+
		"\u0000\u0000\u00000-\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0003\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u00005=\u0003\u0002\u0001\u000067\u0005"+
		"\u000f\u0000\u000078\u0003\b\u0004\u000089\u0003\u0002\u0001\u00009:\u0005"+
		"\u0004\u0000\u0000:=\u0001\u0000\u0000\u0000;=\u0005\u0004\u0000\u0000"+
		"<5\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=\u0005\u0001\u0000\u0000\u0000>A\u0003\n\u0005\u0000?A\u0003\f"+
		"\u0006\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0007"+
		"\u0001\u0000\u0000\u0000BC\u0007\u0002\u0000\u0000C\t\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0002\u0000\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0001\u0000\u0000G\r\u0001\u0000\u0000\u0000\u0007\u0011!%02<@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}