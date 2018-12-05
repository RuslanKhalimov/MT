// Generated from Program.g4 by ANTLR 4.7.1

import expression.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, PRINT=3, READINT=4, WHILE=5, DO=6, ASSIGN=7, COMMA=8, LPAR=9, 
		RPAR=10, LCPAR=11, RCPAR=12, ADD=13, SUB=14, MUL=15, DIV=16, EQ=17, NEQ=18, 
		LESS=19, GR=20, LESSEQ=21, GREQ=22, NOT=23, AND=24, OR=25, VAR=26, NUM=27, 
		SPACE=28;
	public static final int
		RULE_start = 0, RULE_expressions = 1, RULE_expr = 2, RULE_vars = 3, RULE_ar_expressions = 4, 
		RULE_add_sub = 5, RULE_mul_div = 6, RULE_unary_ar = 7, RULE_or = 8, RULE_and = 9, 
		RULE_unary_logic = 10, RULE_cmp = 11, RULE_cmp_op = 12;
	public static final String[] ruleNames = {
		"start", "expressions", "expr", "vars", "ar_expressions", "add_sub", "mul_div", 
		"unary_ar", "or", "and", "unary_logic", "cmp", "cmp_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'print'", "'readint'", "'while'", "'do'", "'='", 
		"','", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'=='", 
		"'!='", "'<'", "'>'", "'<='", "'>='", "'!'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "PRINT", "READINT", "WHILE", "DO", "ASSIGN", "COMMA", 
		"LPAR", "RPAR", "LCPAR", "RCPAR", "ADD", "SUB", "MUL", "DIV", "EQ", "NEQ", 
		"LESS", "GR", "LESSEQ", "GREQ", "NOT", "AND", "OR", "VAR", "NUM", "SPACE"
	};
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
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Program v;
		public ExpressionsContext expressions;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((StartContext)_localctx).expressions = expressions();
			 ((StartContext)_localctx).v =  new Program(((StartContext)_localctx).expressions.v); 
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> v;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((ExpressionsContext)_localctx).expr = expr();
			 List<Expression> res = new ArrayList<>(); 
			 res.add(((ExpressionsContext)_localctx).expr.v); 
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << DO) | (1L << VAR))) != 0)) {
				{
				{
				setState(32);
				((ExpressionsContext)_localctx).expr = expr();
				 res.add(((ExpressionsContext)_localctx).expr.v); 
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ExpressionsContext)_localctx).v =  res; 
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

	public static class ExprContext extends ParserRuleContext {
		public Expression v;
		public Ar_expressionsContext ar_expressions;
		public OrContext or;
		public ExpressionsContext expressions;
		public ExpressionsContext first;
		public ExpressionsContext second;
		public VarsContext vars;
		public TerminalNode PRINT() { return getToken(ProgramParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(ProgramParser.LPAR, 0); }
		public Ar_expressionsContext ar_expressions() {
			return getRuleContext(Ar_expressionsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ProgramParser.RPAR, 0); }
		public TerminalNode IF() { return getToken(ProgramParser.IF, 0); }
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public List<TerminalNode> LCPAR() { return getTokens(ProgramParser.LCPAR); }
		public TerminalNode LCPAR(int i) {
			return getToken(ProgramParser.LCPAR, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> RCPAR() { return getTokens(ProgramParser.RCPAR); }
		public TerminalNode RCPAR(int i) {
			return getToken(ProgramParser.RCPAR, i);
		}
		public TerminalNode ELSE() { return getToken(ProgramParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(ProgramParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(ProgramParser.DO, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProgramParser.ASSIGN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(PRINT);
				setState(43);
				match(LPAR);
				setState(44);
				((ExprContext)_localctx).ar_expressions = ar_expressions();
				setState(45);
				match(RPAR);
				 ((ExprContext)_localctx).v =  new Print(((ExprContext)_localctx).ar_expressions.v); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(IF);
				setState(49);
				((ExprContext)_localctx).or = or(0);
				setState(50);
				match(LCPAR);
				setState(51);
				((ExprContext)_localctx).expressions = expressions();
				setState(52);
				match(RCPAR);
				 ((ExprContext)_localctx).v =  new If(((ExprContext)_localctx).or.v, ((ExprContext)_localctx).expressions.v); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(IF);
				setState(56);
				((ExprContext)_localctx).or = or(0);
				setState(57);
				match(LCPAR);
				setState(58);
				((ExprContext)_localctx).first = expressions();
				setState(59);
				match(RCPAR);
				setState(60);
				match(ELSE);
				setState(61);
				match(LCPAR);
				setState(62);
				((ExprContext)_localctx).second = expressions();
				setState(63);
				match(RCPAR);
				 ((ExprContext)_localctx).v =  new IfElse(((ExprContext)_localctx).or.v, ((ExprContext)_localctx).first.v, ((ExprContext)_localctx).second.v); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(WHILE);
				setState(67);
				((ExprContext)_localctx).or = or(0);
				setState(68);
				match(LCPAR);
				setState(69);
				((ExprContext)_localctx).expressions = expressions();
				setState(70);
				match(RCPAR);
				 ((ExprContext)_localctx).v =  new While(((ExprContext)_localctx).or.v, ((ExprContext)_localctx).expressions.v); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(DO);
				setState(74);
				match(LCPAR);
				setState(75);
				((ExprContext)_localctx).expressions = expressions();
				setState(76);
				match(RCPAR);
				setState(77);
				match(WHILE);
				setState(78);
				((ExprContext)_localctx).or = or(0);
				 ((ExprContext)_localctx).v =  new DoWhile(((ExprContext)_localctx).or.v, ((ExprContext)_localctx).expressions.v); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				((ExprContext)_localctx).vars = vars();
				setState(82);
				match(ASSIGN);
				setState(83);
				((ExprContext)_localctx).ar_expressions = ar_expressions();
				 ((ExprContext)_localctx).v =  new Assignment(((ExprContext)_localctx).vars.v, ((ExprContext)_localctx).ar_expressions.v); 
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

	public static class VarsContext extends ParserRuleContext {
		public List<Variable> v;
		public Token VAR;
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProgramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProgramParser.COMMA, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((VarsContext)_localctx).VAR = match(VAR);
			 List<Variable> res = new ArrayList<>(); 
			 res.add(new Variable((((VarsContext)_localctx).VAR!=null?((VarsContext)_localctx).VAR.getText():null))); 
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				((VarsContext)_localctx).VAR = match(VAR);
				 res.add(new Variable((((VarsContext)_localctx).VAR!=null?((VarsContext)_localctx).VAR.getText():null))); 
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((VarsContext)_localctx).v =  res; 
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

	public static class Ar_expressionsContext extends ParserRuleContext {
		public List<ArithmeticExpression> v;
		public Add_subContext add_sub;
		public List<Add_subContext> add_sub() {
			return getRuleContexts(Add_subContext.class);
		}
		public Add_subContext add_sub(int i) {
			return getRuleContext(Add_subContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProgramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProgramParser.COMMA, i);
		}
		public Ar_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ar_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterAr_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitAr_expressions(this);
		}
	}

	public final Ar_expressionsContext ar_expressions() throws RecognitionException {
		Ar_expressionsContext _localctx = new Ar_expressionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ar_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((Ar_expressionsContext)_localctx).add_sub = add_sub(0);
			 List<ArithmeticExpression> res = new ArrayList<>(); 
			 res.add(((Ar_expressionsContext)_localctx).add_sub.v); 
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				((Ar_expressionsContext)_localctx).add_sub = add_sub(0);
				 res.add(((Ar_expressionsContext)_localctx).add_sub.v); 
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((Ar_expressionsContext)_localctx).v =  res; 
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

	public static class Add_subContext extends ParserRuleContext {
		public ArithmeticExpression v;
		public Add_subContext l;
		public Mul_divContext mul_div;
		public Mul_divContext r;
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ProgramParser.ADD, 0); }
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ProgramParser.SUB, 0); }
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitAdd_sub(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		return add_sub(0);
	}

	private Add_subContext add_sub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Add_subContext _localctx = new Add_subContext(_ctx, _parentState);
		Add_subContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_add_sub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			((Add_subContext)_localctx).mul_div = mul_div(0);
			 ((Add_subContext)_localctx).v =  ((Add_subContext)_localctx).mul_div.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Add_subContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_add_sub);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(ADD);
						setState(121);
						((Add_subContext)_localctx).r = ((Add_subContext)_localctx).mul_div = mul_div(0);
						 ((Add_subContext)_localctx).v =  new BinaryArithmeticExpression("+", ((Add_subContext)_localctx).l.v, ((Add_subContext)_localctx).r.v); 
						}
						break;
					case 2:
						{
						_localctx = new Add_subContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_add_sub);
						setState(124);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(125);
						match(SUB);
						setState(126);
						((Add_subContext)_localctx).r = ((Add_subContext)_localctx).mul_div = mul_div(0);
						 ((Add_subContext)_localctx).v =  new BinaryArithmeticExpression("-", ((Add_subContext)_localctx).l.v, ((Add_subContext)_localctx).r.v); 
						}
						break;
					}
					} 
				}
				setState(133);
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

	public static class Mul_divContext extends ParserRuleContext {
		public ArithmeticExpression v;
		public Mul_divContext l;
		public Unary_arContext unary_ar;
		public Unary_arContext unary_ar() {
			return getRuleContext(Unary_arContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ProgramParser.MUL, 0); }
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ProgramParser.DIV, 0); }
		public Mul_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMul_div(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		return mul_div(0);
	}

	private Mul_divContext mul_div(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mul_divContext _localctx = new Mul_divContext(_ctx, _parentState);
		Mul_divContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_mul_div, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			((Mul_divContext)_localctx).unary_ar = unary_ar();
			 ((Mul_divContext)_localctx).v =  ((Mul_divContext)_localctx).unary_ar.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_divContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mul_div);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						match(MUL);
						setState(140);
						((Mul_divContext)_localctx).unary_ar = unary_ar();
						 ((Mul_divContext)_localctx).v =  new BinaryArithmeticExpression("*", ((Mul_divContext)_localctx).l.v, ((Mul_divContext)_localctx).unary_ar.v); 
						}
						break;
					case 2:
						{
						_localctx = new Mul_divContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mul_div);
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						match(DIV);
						setState(145);
						((Mul_divContext)_localctx).unary_ar = unary_ar();
						 ((Mul_divContext)_localctx).v =  new BinaryArithmeticExpression("/", ((Mul_divContext)_localctx).l.v, ((Mul_divContext)_localctx).unary_ar.v); 
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Unary_arContext extends ParserRuleContext {
		public ArithmeticExpression v;
		public Add_subContext add_sub;
		public Token VAR;
		public Token NUM;
		public TerminalNode READINT() { return getToken(ProgramParser.READINT, 0); }
		public TerminalNode LPAR() { return getToken(ProgramParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ProgramParser.RPAR, 0); }
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(ProgramParser.NUM, 0); }
		public Unary_arContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_ar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterUnary_ar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitUnary_ar(this);
		}
	}

	public final Unary_arContext unary_ar() throws RecognitionException {
		Unary_arContext _localctx = new Unary_arContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unary_ar);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(READINT);
				setState(154);
				match(LPAR);
				setState(155);
				match(RPAR);
				 ((Unary_arContext)_localctx).v =  new Read(); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(LPAR);
				setState(158);
				((Unary_arContext)_localctx).add_sub = add_sub(0);
				setState(159);
				match(RPAR);
				 ((Unary_arContext)_localctx).v =  ((Unary_arContext)_localctx).add_sub.v; 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				((Unary_arContext)_localctx).VAR = match(VAR);
				 ((Unary_arContext)_localctx).v =  new Variable((((Unary_arContext)_localctx).VAR!=null?((Unary_arContext)_localctx).VAR.getText():null)); 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				((Unary_arContext)_localctx).NUM = match(NUM);
				 ((Unary_arContext)_localctx).v =  new Num((((Unary_arContext)_localctx).NUM!=null?((Unary_arContext)_localctx).NUM.getText():null)); 
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

	public static class OrContext extends ParserRuleContext {
		public LogicExpression v;
		public OrContext l;
		public AndContext and;
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public TerminalNode OR() { return getToken(ProgramParser.OR, 0); }
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		return or(0);
	}

	private OrContext or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrContext _localctx = new OrContext(_ctx, _parentState);
		OrContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			((OrContext)_localctx).and = and(0);
			 ((OrContext)_localctx).v =  ((OrContext)_localctx).and.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_or);
					setState(172);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(173);
					match(OR);
					setState(174);
					((OrContext)_localctx).and = and(0);
					 ((OrContext)_localctx).v =  new BinaryLogicExpression("||", ((OrContext)_localctx).l.v, ((OrContext)_localctx).and.v); 
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AndContext extends ParserRuleContext {
		public LogicExpression v;
		public AndContext l;
		public Unary_logicContext unary_logic;
		public Unary_logicContext unary_logic() {
			return getRuleContext(Unary_logicContext.class,0);
		}
		public TerminalNode AND() { return getToken(ProgramParser.AND, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		return and(0);
	}

	private AndContext and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndContext _localctx = new AndContext(_ctx, _parentState);
		AndContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			((AndContext)_localctx).unary_logic = unary_logic();
			 ((AndContext)_localctx).v =  ((AndContext)_localctx).unary_logic.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_and);
					setState(186);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(187);
					match(AND);
					setState(188);
					((AndContext)_localctx).unary_logic = unary_logic();
					 ((AndContext)_localctx).v =  new BinaryLogicExpression("&&", ((AndContext)_localctx).l.v, ((AndContext)_localctx).unary_logic.v); 
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Unary_logicContext extends ParserRuleContext {
		public LogicExpression v;
		public Unary_logicContext unary_logic;
		public CmpContext cmp;
		public OrContext or;
		public TerminalNode NOT() { return getToken(ProgramParser.NOT, 0); }
		public Unary_logicContext unary_logic() {
			return getRuleContext(Unary_logicContext.class,0);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ProgramParser.LPAR, 0); }
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ProgramParser.RPAR, 0); }
		public Unary_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterUnary_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitUnary_logic(this);
		}
	}

	public final Unary_logicContext unary_logic() throws RecognitionException {
		Unary_logicContext _localctx = new Unary_logicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unary_logic);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(NOT);
				setState(197);
				((Unary_logicContext)_localctx).unary_logic = unary_logic();
				 ((Unary_logicContext)_localctx).v =  new Negation(((Unary_logicContext)_localctx).unary_logic.v); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((Unary_logicContext)_localctx).cmp = cmp();
				 ((Unary_logicContext)_localctx).v =  ((Unary_logicContext)_localctx).cmp.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(LPAR);
				setState(204);
				((Unary_logicContext)_localctx).or = or(0);
				setState(205);
				match(RPAR);
				 ((Unary_logicContext)_localctx).v =  ((Unary_logicContext)_localctx).or.v; 
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

	public static class CmpContext extends ParserRuleContext {
		public LogicExpression v;
		public Add_subContext l;
		public Cmp_opContext cmp_op;
		public Add_subContext r;
		public Cmp_opContext cmp_op() {
			return getRuleContext(Cmp_opContext.class,0);
		}
		public List<Add_subContext> add_sub() {
			return getRuleContexts(Add_subContext.class);
		}
		public Add_subContext add_sub(int i) {
			return getRuleContext(Add_subContext.class,i);
		}
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCmp(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((CmpContext)_localctx).l = add_sub(0);
			setState(211);
			((CmpContext)_localctx).cmp_op = cmp_op();
			setState(212);
			((CmpContext)_localctx).r = add_sub(0);
			((CmpContext)_localctx).v =  new CmpExpression(((CmpContext)_localctx).cmp_op.v, ((CmpContext)_localctx).l.v, ((CmpContext)_localctx).r.v); 
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

	public static class Cmp_opContext extends ParserRuleContext {
		public String v;
		public TerminalNode EQ() { return getToken(ProgramParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ProgramParser.NEQ, 0); }
		public TerminalNode LESS() { return getToken(ProgramParser.LESS, 0); }
		public TerminalNode GR() { return getToken(ProgramParser.GR, 0); }
		public TerminalNode LESSEQ() { return getToken(ProgramParser.LESSEQ, 0); }
		public TerminalNode GREQ() { return getToken(ProgramParser.GREQ, 0); }
		public Cmp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCmp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCmp_op(this);
		}
	}

	public final Cmp_opContext cmp_op() throws RecognitionException {
		Cmp_opContext _localctx = new Cmp_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmp_op);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(EQ);
				 ((Cmp_opContext)_localctx).v =  "=="; 
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(NEQ);
				 ((Cmp_opContext)_localctx).v =  "!="; 
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(LESS);
				 ((Cmp_opContext)_localctx).v =  "<"; 
				}
				break;
			case GR:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(GR);
				 ((Cmp_opContext)_localctx).v =  ">"; 
				}
				break;
			case LESSEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(LESSEQ);
				 ((Cmp_opContext)_localctx).v =  "<="; 
				}
				break;
			case GREQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(GREQ);
				 ((Cmp_opContext)_localctx).v =  ">="; 
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
		case 5:
			return add_sub_sempred((Add_subContext)_localctx, predIndex);
		case 6:
			return mul_div_sempred((Mul_divContext)_localctx, predIndex);
		case 8:
			return or_sempred((OrContext)_localctx, predIndex);
		case 9:
			return and_sempred((AndContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean add_sub_sempred(Add_subContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mul_div_sempred(Mul_divContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean or_sempred(OrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_sempred(AndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00e8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0097\n"+
		"\b\f\b\16\b\u009a\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00a9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b4\n\n\f"+
		"\n\16\n\u00b7\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c2"+
		"\n\13\f\13\16\13\u00c5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00d3\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e6\n\16\3\16\2\6\f\16\22\24\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00f2\2\34\3\2\2\2\4\37\3\2\2"+
		"\2\6X\3\2\2\2\bZ\3\2\2\2\ng\3\2\2\2\fu\3\2\2\2\16\u0088\3\2\2\2\20\u00a8"+
		"\3\2\2\2\22\u00aa\3\2\2\2\24\u00b8\3\2\2\2\26\u00d2\3\2\2\2\30\u00d4\3"+
		"\2\2\2\32\u00e5\3\2\2\2\34\35\5\4\3\2\35\36\b\2\1\2\36\3\3\2\2\2\37 \5"+
		"\6\4\2 !\b\3\1\2!\'\b\3\1\2\"#\5\6\4\2#$\b\3\1\2$&\3\2\2\2%\"\3\2\2\2"+
		"&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\b\3\1\2+\5\3\2"+
		"\2\2,-\7\5\2\2-.\7\13\2\2./\5\n\6\2/\60\7\f\2\2\60\61\b\4\1\2\61Y\3\2"+
		"\2\2\62\63\7\3\2\2\63\64\5\22\n\2\64\65\7\r\2\2\65\66\5\4\3\2\66\67\7"+
		"\16\2\2\678\b\4\1\28Y\3\2\2\29:\7\3\2\2:;\5\22\n\2;<\7\r\2\2<=\5\4\3\2"+
		"=>\7\16\2\2>?\7\4\2\2?@\7\r\2\2@A\5\4\3\2AB\7\16\2\2BC\b\4\1\2CY\3\2\2"+
		"\2DE\7\7\2\2EF\5\22\n\2FG\7\r\2\2GH\5\4\3\2HI\7\16\2\2IJ\b\4\1\2JY\3\2"+
		"\2\2KL\7\b\2\2LM\7\r\2\2MN\5\4\3\2NO\7\16\2\2OP\7\7\2\2PQ\5\22\n\2QR\b"+
		"\4\1\2RY\3\2\2\2ST\5\b\5\2TU\7\t\2\2UV\5\n\6\2VW\b\4\1\2WY\3\2\2\2X,\3"+
		"\2\2\2X\62\3\2\2\2X9\3\2\2\2XD\3\2\2\2XK\3\2\2\2XS\3\2\2\2Y\7\3\2\2\2"+
		"Z[\7\34\2\2[\\\b\5\1\2\\b\b\5\1\2]^\7\n\2\2^_\7\34\2\2_a\b\5\1\2`]\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\b\5\1\2f\t\3"+
		"\2\2\2gh\5\f\7\2hi\b\6\1\2ip\b\6\1\2jk\7\n\2\2kl\5\f\7\2lm\b\6\1\2mo\3"+
		"\2\2\2nj\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b"+
		"\6\1\2t\13\3\2\2\2uv\b\7\1\2vw\5\16\b\2wx\b\7\1\2x\u0085\3\2\2\2yz\f\5"+
		"\2\2z{\7\17\2\2{|\5\16\b\2|}\b\7\1\2}\u0084\3\2\2\2~\177\f\4\2\2\177\u0080"+
		"\7\20\2\2\u0080\u0081\5\16\b\2\u0081\u0082\b\7\1\2\u0082\u0084\3\2\2\2"+
		"\u0083y\3\2\2\2\u0083~\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\r\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b"+
		"\b\1\2\u0089\u008a\5\20\t\2\u008a\u008b\b\b\1\2\u008b\u0098\3\2\2\2\u008c"+
		"\u008d\f\5\2\2\u008d\u008e\7\21\2\2\u008e\u008f\5\20\t\2\u008f\u0090\b"+
		"\b\1\2\u0090\u0097\3\2\2\2\u0091\u0092\f\4\2\2\u0092\u0093\7\22\2\2\u0093"+
		"\u0094\5\20\t\2\u0094\u0095\b\b\1\2\u0095\u0097\3\2\2\2\u0096\u008c\3"+
		"\2\2\2\u0096\u0091\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\17\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\6\2"+
		"\2\u009c\u009d\7\13\2\2\u009d\u009e\7\f\2\2\u009e\u00a9\b\t\1\2\u009f"+
		"\u00a0\7\13\2\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\b"+
		"\t\1\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00a9\b\t\1\2\u00a6"+
		"\u00a7\7\35\2\2\u00a7\u00a9\b\t\1\2\u00a8\u009b\3\2\2\2\u00a8\u009f\3"+
		"\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\21\3\2\2\2\u00aa"+
		"\u00ab\b\n\1\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\b\n\1\2\u00ad\u00b5\3"+
		"\2\2\2\u00ae\u00af\f\4\2\2\u00af\u00b0\7\33\2\2\u00b0\u00b1\5\24\13\2"+
		"\u00b1\u00b2\b\n\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\23\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\b\13\1\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\b"+
		"\13\1\2\u00bb\u00c3\3\2\2\2\u00bc\u00bd\f\4\2\2\u00bd\u00be\7\32\2\2\u00be"+
		"\u00bf\5\26\f\2\u00bf\u00c0\b\13\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00bc\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\25\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\5\26"+
		"\f\2\u00c8\u00c9\b\f\1\2\u00c9\u00d3\3\2\2\2\u00ca\u00cb\5\30\r\2\u00cb"+
		"\u00cc\b\f\1\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce\u00cf\5"+
		"\22\n\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1\b\f\1\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00c6\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\27\3\2\2"+
		"\2\u00d4\u00d5\5\f\7\2\u00d5\u00d6\5\32\16\2\u00d6\u00d7\5\f\7\2\u00d7"+
		"\u00d8\b\r\1\2\u00d8\31\3\2\2\2\u00d9\u00da\7\23\2\2\u00da\u00e6\b\16"+
		"\1\2\u00db\u00dc\7\24\2\2\u00dc\u00e6\b\16\1\2\u00dd\u00de\7\25\2\2\u00de"+
		"\u00e6\b\16\1\2\u00df\u00e0\7\26\2\2\u00e0\u00e6\b\16\1\2\u00e1\u00e2"+
		"\7\27\2\2\u00e2\u00e6\b\16\1\2\u00e3\u00e4\7\30\2\2\u00e4\u00e6\b\16\1"+
		"\2\u00e5\u00d9\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00df"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\33\3\2\2\2\17\'"+
		"Xbp\u0083\u0085\u0096\u0098\u00a8\u00b5\u00c3\u00d2\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}