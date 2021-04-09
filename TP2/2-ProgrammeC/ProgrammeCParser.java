// Generated from ProgrammeC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgrammeCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, AFFECT=5, SEPARATOR=6, LPAR=7, RPAR=8, 
		LACC=9, RACC=10, DIV=11, TIMES=12, MINUS=13, PLUS=14, EQUAL=15, DIFF=16, 
		GTHAN=17, LTHAN=18, INT=19, VAR=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_variable = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression", "variable"
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

	@Override
	public String getGrammarFileName() { return "ProgrammeC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	Env env = new Env();
	public ProgrammeCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ProgrammeCParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgrammeCListener ) ((ProgrammeCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgrammeCListener ) ((ProgrammeCListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((ProgContext)_localctx).expression = expression(0);
			setState(7);
			match(EOF);
			 System.out.println("Result: "+((ProgContext)_localctx).expression.inst.execute(env)); 
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
		public Instruction inst;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public VariableContext op;
		public ExpressionContext e4;
		public Token VAR;
		public ExpressionContext e;
		public Token INT;
		public TerminalNode IF() { return getToken(ProgrammeCParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ProgrammeCParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ProgrammeCParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ProgrammeCParser.ELSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ProgrammeCParser.WHILE, 0); }
		public TerminalNode VAR() { return getToken(ProgrammeCParser.VAR, 0); }
		public TerminalNode AFFECT() { return getToken(ProgrammeCParser.AFFECT, 0); }
		public TerminalNode SEPARATOR() { return getToken(ProgrammeCParser.SEPARATOR, 0); }
		public TerminalNode LACC() { return getToken(ProgrammeCParser.LACC, 0); }
		public TerminalNode RACC() { return getToken(ProgrammeCParser.RACC, 0); }
		public TerminalNode INT() { return getToken(ProgrammeCParser.INT, 0); }
		public TerminalNode DIV() { return getToken(ProgrammeCParser.DIV, 0); }
		public TerminalNode TIMES() { return getToken(ProgrammeCParser.TIMES, 0); }
		public TerminalNode MINUS() { return getToken(ProgrammeCParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ProgrammeCParser.PLUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgrammeCListener ) ((ProgrammeCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgrammeCListener ) ((ProgrammeCListener)listener).exitExpression(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(11);
				match(IF);
				setState(12);
				match(LPAR);
				setState(13);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(14);
				match(RPAR);
				setState(15);
				((ExpressionContext)_localctx).e2 = expression(15);
				 ((ExpressionContext)_localctx).inst =  new If( ((ExpressionContext)_localctx).e1.inst, null, ((ExpressionContext)_localctx).e2.inst, null, new Constante(0)); 
				}
				break;
			case 2:
				{
				setState(18);
				match(IF);
				setState(19);
				match(LPAR);
				setState(20);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(21);
				match(RPAR);
				setState(22);
				((ExpressionContext)_localctx).e2 = expression(0);
				setState(23);
				match(ELSE);
				setState(24);
				((ExpressionContext)_localctx).e3 = expression(14);
				 ((ExpressionContext)_localctx).inst =  new If( ((ExpressionContext)_localctx).e1.inst, null, ((ExpressionContext)_localctx).e2.inst, ((ExpressionContext)_localctx).e3.inst, new Constante(0)); 
				}
				break;
			case 3:
				{
				setState(27);
				match(IF);
				setState(28);
				match(LPAR);
				setState(29);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(30);
				((ExpressionContext)_localctx).op = variable();
				setState(31);
				((ExpressionContext)_localctx).e2 = expression(0);
				setState(32);
				match(RPAR);
				setState(33);
				((ExpressionContext)_localctx).e3 = expression(13);
				 ((ExpressionContext)_localctx).inst =  new If( ((ExpressionContext)_localctx).e1.inst, ((ExpressionContext)_localctx).e2.inst, ((ExpressionContext)_localctx).e3.inst, null, ((ExpressionContext)_localctx).op.cons ); 
				}
				break;
			case 4:
				{
				setState(36);
				match(IF);
				setState(37);
				match(LPAR);
				setState(38);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(39);
				((ExpressionContext)_localctx).op = variable();
				setState(40);
				((ExpressionContext)_localctx).e2 = expression(0);
				setState(41);
				match(RPAR);
				setState(42);
				((ExpressionContext)_localctx).e3 = expression(0);
				setState(43);
				match(ELSE);
				setState(44);
				((ExpressionContext)_localctx).e4 = expression(12);
				 ((ExpressionContext)_localctx).inst =  new If( ((ExpressionContext)_localctx).e1.inst, ((ExpressionContext)_localctx).e2.inst, ((ExpressionContext)_localctx).e3.inst, ((ExpressionContext)_localctx).e4.inst, ((ExpressionContext)_localctx).op.cons ); 
				}
				break;
			case 5:
				{
				setState(47);
				match(WHILE);
				setState(48);
				match(LPAR);
				setState(49);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(50);
				match(RPAR);
				setState(51);
				((ExpressionContext)_localctx).e2 = expression(11);
				 ((ExpressionContext)_localctx).inst =  new While( ((ExpressionContext)_localctx).e1.inst, null, ((ExpressionContext)_localctx).e2.inst, new Constante(0) ); 
				}
				break;
			case 6:
				{
				setState(54);
				match(WHILE);
				setState(55);
				match(LPAR);
				setState(56);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(57);
				((ExpressionContext)_localctx).op = variable();
				setState(58);
				((ExpressionContext)_localctx).e2 = expression(0);
				setState(59);
				match(RPAR);
				setState(60);
				((ExpressionContext)_localctx).e3 = expression(10);
				 ((ExpressionContext)_localctx).inst =  new While( ((ExpressionContext)_localctx).e1.inst, ((ExpressionContext)_localctx).e2.inst, ((ExpressionContext)_localctx).e3.inst, ((ExpressionContext)_localctx).op.cons ); 
				}
				break;
			case 7:
				{
				setState(63);
				((ExpressionContext)_localctx).VAR = match(VAR);
				setState(64);
				match(AFFECT);
				setState(65);
				((ExpressionContext)_localctx).e = expression(0);
				setState(66);
				match(SEPARATOR);
				 ((ExpressionContext)_localctx).inst =  new Affectation( ((ExpressionContext)_localctx).VAR.getText(), ((ExpressionContext)_localctx).e.inst ); 
				}
				break;
			case 8:
				{
				setState(69);
				match(LPAR);
				setState(70);
				((ExpressionContext)_localctx).e = expression(0);
				setState(71);
				match(RPAR);
				 ((ExpressionContext)_localctx).inst =  ((ExpressionContext)_localctx).e.inst; 
				}
				break;
			case 9:
				{
				setState(74);
				match(LACC);
				setState(75);
				((ExpressionContext)_localctx).e = expression(0);
				setState(76);
				match(RACC);
				 ((ExpressionContext)_localctx).inst =  ((ExpressionContext)_localctx).e.inst; 
				}
				break;
			case 10:
				{
				setState(79);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).inst =  new Constante((((ExpressionContext)_localctx).INT!=null?Integer.valueOf(((ExpressionContext)_localctx).INT.getText()):0)); 
				}
				break;
			case 11:
				{
				setState(81);
				((ExpressionContext)_localctx).VAR = match(VAR);
				 ((ExpressionContext)_localctx).inst =  new Variable(((ExpressionContext)_localctx).VAR.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(86);
						((ExpressionContext)_localctx).e2 = expression(17);
						 ((ExpressionContext)_localctx).inst =  new Sequence( ((ExpressionContext)_localctx).e1.inst, ((ExpressionContext)_localctx).e2.inst ); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(90);
						match(DIV);
						setState(91);
						((ExpressionContext)_localctx).e2 = expression(5);
						 ((ExpressionContext)_localctx).inst =  new EDiv(((ExpressionContext)_localctx).e1.inst,((ExpressionContext)_localctx).e2.inst); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(95);
						match(TIMES);
						setState(96);
						((ExpressionContext)_localctx).e2 = expression(4);
						 ((ExpressionContext)_localctx).inst =  new ETimes(((ExpressionContext)_localctx).e1.inst,((ExpressionContext)_localctx).e2.inst); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(MINUS);
						setState(101);
						((ExpressionContext)_localctx).e2 = expression(3);
						 ((ExpressionContext)_localctx).inst =  new EMoins(((ExpressionContext)_localctx).e1.inst,((ExpressionContext)_localctx).e2.inst); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(105);
						match(PLUS);
						setState(106);
						((ExpressionContext)_localctx).e2 = expression(2);
						 ((ExpressionContext)_localctx).inst =  new EPlus(((ExpressionContext)_localctx).e1.inst,((ExpressionContext)_localctx).e2.inst); 
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public Constante cons;
		public TerminalNode DIFF() { return getToken(ProgrammeCParser.DIFF, 0); }
		public TerminalNode EQUAL() { return getToken(ProgrammeCParser.EQUAL, 0); }
		public TerminalNode GTHAN() { return getToken(ProgrammeCParser.GTHAN, 0); }
		public TerminalNode LTHAN() { return getToken(ProgrammeCParser.LTHAN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgrammeCListener ) ((ProgrammeCListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgrammeCListener ) ((ProgrammeCListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(DIFF);
				 ((VariableContext)_localctx).cons =  new Constante(0); 
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(EQUAL);
				 ((VariableContext)_localctx).cons =  new Constante(1); 
				}
				break;
			case GTHAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(GTHAN);
				 ((VariableContext)_localctx).cons =  new Constante(2); 
				}
				break;
			case LTHAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(LTHAN);
				 ((VariableContext)_localctx).cons =  new Constante(3); 
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
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3V\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4}"+
		"\n\4\3\4\2\3\4\5\2\4\6\2\2\2\u008d\2\b\3\2\2\2\4U\3\2\2\2\6|\3\2\2\2\b"+
		"\t\5\4\3\2\t\n\7\2\2\3\n\13\b\2\1\2\13\3\3\2\2\2\f\r\b\3\1\2\r\16\7\3"+
		"\2\2\16\17\7\t\2\2\17\20\5\4\3\2\20\21\7\n\2\2\21\22\5\4\3\21\22\23\b"+
		"\3\1\2\23V\3\2\2\2\24\25\7\3\2\2\25\26\7\t\2\2\26\27\5\4\3\2\27\30\7\n"+
		"\2\2\30\31\5\4\3\2\31\32\7\5\2\2\32\33\5\4\3\20\33\34\b\3\1\2\34V\3\2"+
		"\2\2\35\36\7\3\2\2\36\37\7\t\2\2\37 \5\4\3\2 !\5\6\4\2!\"\5\4\3\2\"#\7"+
		"\n\2\2#$\5\4\3\17$%\b\3\1\2%V\3\2\2\2&\'\7\3\2\2\'(\7\t\2\2()\5\4\3\2"+
		")*\5\6\4\2*+\5\4\3\2+,\7\n\2\2,-\5\4\3\2-.\7\5\2\2./\5\4\3\16/\60\b\3"+
		"\1\2\60V\3\2\2\2\61\62\7\6\2\2\62\63\7\t\2\2\63\64\5\4\3\2\64\65\7\n\2"+
		"\2\65\66\5\4\3\r\66\67\b\3\1\2\67V\3\2\2\289\7\6\2\29:\7\t\2\2:;\5\4\3"+
		"\2;<\5\6\4\2<=\5\4\3\2=>\7\n\2\2>?\5\4\3\f?@\b\3\1\2@V\3\2\2\2AB\7\26"+
		"\2\2BC\7\7\2\2CD\5\4\3\2DE\7\b\2\2EF\b\3\1\2FV\3\2\2\2GH\7\t\2\2HI\5\4"+
		"\3\2IJ\7\n\2\2JK\b\3\1\2KV\3\2\2\2LM\7\13\2\2MN\5\4\3\2NO\7\f\2\2OP\b"+
		"\3\1\2PV\3\2\2\2QR\7\25\2\2RV\b\3\1\2ST\7\26\2\2TV\b\3\1\2U\f\3\2\2\2"+
		"U\24\3\2\2\2U\35\3\2\2\2U&\3\2\2\2U\61\3\2\2\2U8\3\2\2\2UA\3\2\2\2UG\3"+
		"\2\2\2UL\3\2\2\2UQ\3\2\2\2US\3\2\2\2Vq\3\2\2\2WX\f\22\2\2XY\5\4\3\23Y"+
		"Z\b\3\1\2Zp\3\2\2\2[\\\f\6\2\2\\]\7\r\2\2]^\5\4\3\7^_\b\3\1\2_p\3\2\2"+
		"\2`a\f\5\2\2ab\7\16\2\2bc\5\4\3\6cd\b\3\1\2dp\3\2\2\2ef\f\4\2\2fg\7\17"+
		"\2\2gh\5\4\3\5hi\b\3\1\2ip\3\2\2\2jk\f\3\2\2kl\7\20\2\2lm\5\4\3\4mn\b"+
		"\3\1\2np\3\2\2\2oW\3\2\2\2o[\3\2\2\2o`\3\2\2\2oe\3\2\2\2oj\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2r\5\3\2\2\2sq\3\2\2\2tu\7\22\2\2u}\b\4\1\2v"+
		"w\7\21\2\2w}\b\4\1\2xy\7\23\2\2y}\b\4\1\2z{\7\24\2\2{}\b\4\1\2|t\3\2\2"+
		"\2|v\3\2\2\2|x\3\2\2\2|z\3\2\2\2}\7\3\2\2\2\6Uoq|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}