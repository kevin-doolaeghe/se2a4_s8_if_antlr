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
		IF=1, THEN=2, AFFECT=3, SEPARATOR=4, LPAR=5, RPAR=6, DIV=7, TIMES=8, MINUS=9, 
		PLUS=10, INT=11, VAR=12, WS=13;
	public static final int
		RULE_prog = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'='", "';'", "'('", "')'", "'/'", null, "'-'", 
			"'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "AFFECT", "SEPARATOR", "LPAR", "RPAR", "DIV", "TIMES", 
			"MINUS", "PLUS", "INT", "VAR", "WS"
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
			setState(4);
			((ProgContext)_localctx).expression = expression(0);
			setState(5);
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
		public Token VAR;
		public ExpressionContext e;
		public Token INT;
		public TerminalNode IF() { return getToken(ProgrammeCParser.IF, 0); }
		public TerminalNode THEN() { return getToken(ProgrammeCParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VAR() { return getToken(ProgrammeCParser.VAR, 0); }
		public TerminalNode AFFECT() { return getToken(ProgrammeCParser.AFFECT, 0); }
		public TerminalNode SEPARATOR() { return getToken(ProgrammeCParser.SEPARATOR, 0); }
		public TerminalNode LPAR() { return getToken(ProgrammeCParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ProgrammeCParser.RPAR, 0); }
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
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(9);
				match(IF);
				setState(10);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(11);
				match(THEN);
				setState(12);
				((ExpressionContext)_localctx).e2 = expression(9);
				 ((ExpressionContext)_localctx).inst =  new If( ((ExpressionContext)_localctx).e1.inst, ((ExpressionContext)_localctx).e2.inst ); 
				}
				break;
			case 2:
				{
				setState(15);
				((ExpressionContext)_localctx).VAR = match(VAR);
				setState(16);
				match(AFFECT);
				setState(17);
				((ExpressionContext)_localctx).e = expression(0);
				setState(18);
				match(SEPARATOR);
				 ((ExpressionContext)_localctx).inst =  new Affectation( ((ExpressionContext)_localctx).VAR.getText(), ((ExpressionContext)_localctx).e.inst ); 
				}
				break;
			case 3:
				{
				setState(21);
				match(LPAR);
				setState(22);
				((ExpressionContext)_localctx).e = expression(0);
				setState(23);
				match(RPAR);
				 ((ExpressionContext)_localctx).inst =  ((ExpressionContext)_localctx).e.inst; 
				}
				break;
			case 4:
				{
				setState(26);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).inst =  new Constante((((ExpressionContext)_localctx).INT!=null?Integer.valueOf(((ExpressionContext)_localctx).INT.getText()):0)); 
				}
				break;
			case 5:
				{
				setState(28);
				((ExpressionContext)_localctx).VAR = match(VAR);
				 ((ExpressionContext)_localctx).inst =  new Variable(((ExpressionContext)_localctx).VAR.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(33);
						((ExpressionContext)_localctx).e2 = expression(11);
						 ((ExpressionContext)_localctx).inst =  new Sequence( ((ExpressionContext)_localctx).e1.inst, ((ExpressionContext)_localctx).e2.inst ); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(37);
						match(DIV);
						setState(38);
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
						setState(41);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(42);
						match(TIMES);
						setState(43);
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
						setState(46);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(47);
						match(MINUS);
						setState(48);
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
						setState(51);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(52);
						match(PLUS);
						setState(53);
						((ExpressionContext)_localctx).e2 = expression(2);
						 ((ExpressionContext)_localctx).inst =  new EPlus(((ExpressionContext)_localctx).e1.inst,((ExpressionContext)_localctx).e2.inst); 
						}
						break;
					}
					} 
				}
				setState(60);
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
			return precpred(_ctx, 10);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17@\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3;\n\3\f\3\16\3>\13\3\3\3\2\3\4\4\2\4\2\2\2F\2\6\3\2\2\2\4 \3\2\2"+
		"\2\6\7\5\4\3\2\7\b\7\2\2\3\b\t\b\2\1\2\t\3\3\2\2\2\n\13\b\3\1\2\13\f\7"+
		"\3\2\2\f\r\5\4\3\2\r\16\7\4\2\2\16\17\5\4\3\13\17\20\b\3\1\2\20!\3\2\2"+
		"\2\21\22\7\16\2\2\22\23\7\5\2\2\23\24\5\4\3\2\24\25\7\6\2\2\25\26\b\3"+
		"\1\2\26!\3\2\2\2\27\30\7\7\2\2\30\31\5\4\3\2\31\32\7\b\2\2\32\33\b\3\1"+
		"\2\33!\3\2\2\2\34\35\7\r\2\2\35!\b\3\1\2\36\37\7\16\2\2\37!\b\3\1\2 \n"+
		"\3\2\2\2 \21\3\2\2\2 \27\3\2\2\2 \34\3\2\2\2 \36\3\2\2\2!<\3\2\2\2\"#"+
		"\f\f\2\2#$\5\4\3\r$%\b\3\1\2%;\3\2\2\2&\'\f\6\2\2\'(\7\t\2\2()\5\4\3\7"+
		")*\b\3\1\2*;\3\2\2\2+,\f\5\2\2,-\7\n\2\2-.\5\4\3\6./\b\3\1\2/;\3\2\2\2"+
		"\60\61\f\4\2\2\61\62\7\13\2\2\62\63\5\4\3\5\63\64\b\3\1\2\64;\3\2\2\2"+
		"\65\66\f\3\2\2\66\67\7\f\2\2\678\5\4\3\489\b\3\1\29;\3\2\2\2:\"\3\2\2"+
		"\2:&\3\2\2\2:+\3\2\2\2:\60\3\2\2\2:\65\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=\5\3\2\2\2><\3\2\2\2\5 :<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}