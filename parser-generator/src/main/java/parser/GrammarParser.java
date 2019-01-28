// Generated from Grammar.g4 by ANTLR 4.7.1

import grammar.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TERM=10, NTERM=11, STRING=12, CODE=13, WS=14;
	public static final int
		RULE_start = 0, RULE_choose_roole = 1, RULE_my_rule = 2, RULE_args = 3, 
		RULE_my_returns = 4, RULE_arg = 5, RULE_type = 6, RULE_rightPart = 7, 
		RULE_ruleToken = 8, RULE_param = 9;
	public static final String[] ruleNames = {
		"start", "choose_roole", "my_rule", "args", "my_returns", "arg", "type", 
		"rightPart", "ruleToken", "param"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "':'", "'|'", "'('", "','", "')'", "'[returns'", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "TERM", "NTERM", 
		"STRING", "CODE", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Grammar v;
		public Token NTERM;
		public TerminalNode NTERM() { return getToken(GrammarParser.NTERM, 0); }
		public List<Choose_rooleContext> choose_roole() {
			return getRuleContexts(Choose_rooleContext.class);
		}
		public Choose_rooleContext choose_roole(int i) {
			return getRuleContext(Choose_rooleContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((StartContext)_localctx).NTERM = match(NTERM);
			 ((StartContext)_localctx).v =  new Grammar((((StartContext)_localctx).NTERM!=null?((StartContext)_localctx).NTERM.getText():null)); 
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				choose_roole(_localctx.v);
				setState(23);
				match(T__0);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM || _la==NTERM );
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

	public static class Choose_rooleContext extends ParserRuleContext {
		public Grammar gr;
		public Token TERM;
		public Token STRING;
		public My_ruleContext my_rule;
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public My_ruleContext my_rule() {
			return getRuleContext(My_ruleContext.class,0);
		}
		public Choose_rooleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Choose_rooleContext(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_choose_roole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChoose_roole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChoose_roole(this);
		}
	}

	public final Choose_rooleContext choose_roole(Grammar gr) throws RecognitionException {
		Choose_rooleContext _localctx = new Choose_rooleContext(_ctx, getState(), gr);
		enterRule(_localctx, 2, RULE_choose_roole);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((Choose_rooleContext)_localctx).TERM = match(TERM);
				setState(30);
				match(T__1);
				setState(31);
				((Choose_rooleContext)_localctx).STRING = match(STRING);
				 _localctx.gr.addTermRule(new TermRule(false, (((Choose_rooleContext)_localctx).TERM!=null?((Choose_rooleContext)_localctx).TERM.getText():null), (((Choose_rooleContext)_localctx).STRING!=null?((Choose_rooleContext)_localctx).STRING.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				((Choose_rooleContext)_localctx).TERM = match(TERM);
				setState(34);
				match(T__2);
				setState(35);
				((Choose_rooleContext)_localctx).STRING = match(STRING);
				 _localctx.gr.addTermRule(new TermRule(true, (((Choose_rooleContext)_localctx).TERM!=null?((Choose_rooleContext)_localctx).TERM.getText():null), (((Choose_rooleContext)_localctx).STRING!=null?((Choose_rooleContext)_localctx).STRING.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				((Choose_rooleContext)_localctx).my_rule = my_rule();
				 _localctx.gr.addNonTermRule(((Choose_rooleContext)_localctx).my_rule.v); 
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

	public static class My_ruleContext extends ParserRuleContext {
		public NonTermRule v;
		public Token NTERM;
		public ArgsContext args;
		public My_returnsContext my_returns;
		public RightPartContext rightPart;
		public TerminalNode NTERM() { return getToken(GrammarParser.NTERM, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public My_returnsContext my_returns() {
			return getRuleContext(My_returnsContext.class,0);
		}
		public List<RightPartContext> rightPart() {
			return getRuleContexts(RightPartContext.class);
		}
		public RightPartContext rightPart(int i) {
			return getRuleContext(RightPartContext.class,i);
		}
		public My_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMy_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMy_rule(this);
		}
	}

	public final My_ruleContext my_rule() throws RecognitionException {
		My_ruleContext _localctx = new My_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_my_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((My_ruleContext)_localctx).NTERM = match(NTERM);
			setState(43);
			((My_ruleContext)_localctx).args = args();
			setState(44);
			((My_ruleContext)_localctx).my_returns = my_returns();
			setState(45);
			match(T__1);
			 ((My_ruleContext)_localctx).v =  new NonTermRule((((My_ruleContext)_localctx).NTERM!=null?((My_ruleContext)_localctx).NTERM.getText():null), ((My_ruleContext)_localctx).args.v, ((My_ruleContext)_localctx).my_returns.v); 
			setState(47);
			((My_ruleContext)_localctx).rightPart = rightPart();
			 _localctx.v.addRule(((My_ruleContext)_localctx).rightPart.v); 
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(49);
				match(T__3);
				setState(50);
				((My_ruleContext)_localctx).rightPart = rightPart();
				 _localctx.v.addRule(((My_ruleContext)_localctx).rightPart.v); 
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<Argument> v;
		public ArgContext arg;
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__4);
				setState(59);
				((ArgsContext)_localctx).arg = arg();
				 ((ArgsContext)_localctx).v =  new ArrayList<>(); 
				 _localctx.v.add(((ArgsContext)_localctx).arg.v); 
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(62);
					match(T__5);
					setState(63);
					((ArgsContext)_localctx).arg = arg();
					 _localctx.v.add(((ArgsContext)_localctx).arg.v); 
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(T__6);
				}
				break;
			case T__1:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				 ((ArgsContext)_localctx).v =  new ArrayList<>(); 
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

	public static class My_returnsContext extends ParserRuleContext {
		public List<Argument> v;
		public ArgContext arg;
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public My_returnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_returns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMy_returns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMy_returns(this);
		}
	}

	public final My_returnsContext my_returns() throws RecognitionException {
		My_returnsContext _localctx = new My_returnsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_my_returns);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__7);
				setState(77);
				((My_returnsContext)_localctx).arg = arg();
				 ((My_returnsContext)_localctx).v =  new ArrayList<>(); 
				 _localctx.v.add(((My_returnsContext)_localctx).arg.v); 
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(80);
					match(T__5);
					setState(81);
					((My_returnsContext)_localctx).arg = arg();
					 _localctx.v.add(((My_returnsContext)_localctx).arg.v); 
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__8);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((My_returnsContext)_localctx).v =  new ArrayList<>(); 
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

	public static class ArgContext extends ParserRuleContext {
		public Argument v;
		public Token NTERM;
		public TypeContext type;
		public TerminalNode NTERM() { return getToken(GrammarParser.NTERM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((ArgContext)_localctx).NTERM = match(NTERM);
			setState(95);
			match(T__2);
			setState(96);
			((ArgContext)_localctx).type = type();
			 ((ArgContext)_localctx).v =  new Argument((((ArgContext)_localctx).NTERM!=null?((ArgContext)_localctx).NTERM.getText():null), ((ArgContext)_localctx).type.v); 
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

	public static class TypeContext extends ParserRuleContext {
		public String v;
		public Token NTERM;
		public Token TERM;
		public TerminalNode NTERM() { return getToken(GrammarParser.NTERM, 0); }
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NTERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((TypeContext)_localctx).NTERM = match(NTERM);
				 ((TypeContext)_localctx).v =  (((TypeContext)_localctx).NTERM!=null?((TypeContext)_localctx).NTERM.getText():null); 
				}
				break;
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((TypeContext)_localctx).TERM = match(TERM);
				 ((TypeContext)_localctx).v =  (((TypeContext)_localctx).TERM!=null?((TypeContext)_localctx).TERM.getText():null); 
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

	public static class RightPartContext extends ParserRuleContext {
		public List<RuleToken> v;
		public RuleTokenContext ruleToken;
		public List<RuleTokenContext> ruleToken() {
			return getRuleContexts(RuleTokenContext.class);
		}
		public RuleTokenContext ruleToken(int i) {
			return getRuleContext(RuleTokenContext.class,i);
		}
		public RightPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRightPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRightPart(this);
		}
	}

	public final RightPartContext rightPart() throws RecognitionException {
		RightPartContext _localctx = new RightPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rightPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((RightPartContext)_localctx).v =  new ArrayList<>(); 
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				((RightPartContext)_localctx).ruleToken = ruleToken();
				 _localctx.v.add(((RightPartContext)_localctx).ruleToken.v); 
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERM) | (1L << NTERM) | (1L << CODE))) != 0) );
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

	public static class RuleTokenContext extends ParserRuleContext {
		public RuleToken v;
		public Token TERM;
		public Token NTERM;
		public ParamContext param;
		public Token CODE;
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode NTERM() { return getToken(GrammarParser.NTERM, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public RuleTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRuleToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRuleToken(this);
		}
	}

	public final RuleTokenContext ruleToken() throws RecognitionException {
		RuleTokenContext _localctx = new RuleTokenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleToken);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((RuleTokenContext)_localctx).TERM = match(TERM);
				 ((RuleTokenContext)_localctx).v =  new Term((((RuleTokenContext)_localctx).TERM!=null?((RuleTokenContext)_localctx).TERM.getText():null)); 
				}
				break;
			case NTERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((RuleTokenContext)_localctx).NTERM = match(NTERM);
				 NonTerm t = new NonTerm((((RuleTokenContext)_localctx).NTERM!=null?((RuleTokenContext)_localctx).NTERM.getText():null)); 
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(117);
					match(T__4);
					setState(118);
					((RuleTokenContext)_localctx).param = param();
					 t.addParameter(((RuleTokenContext)_localctx).param.v); 
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(120);
						match(T__5);
						setState(121);
						((RuleTokenContext)_localctx).param = param();
						 t.addParameter(((RuleTokenContext)_localctx).param.v); 
						}
						}
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(129);
					match(T__6);
					}
				}

				 ((RuleTokenContext)_localctx).v =  t; 
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((RuleTokenContext)_localctx).CODE = match(CODE);
				 ((RuleTokenContext)_localctx).v =  new Code((((RuleTokenContext)_localctx).CODE!=null?((RuleTokenContext)_localctx).CODE.getText():null)); 
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

	public static class ParamContext extends ParserRuleContext {
		public String v;
		public Token NTERM;
		public Token TERM;
		public Token CODE;
		public TerminalNode NTERM() { return getToken(GrammarParser.NTERM, 0); }
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NTERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((ParamContext)_localctx).NTERM = match(NTERM);
				 ((ParamContext)_localctx).v =  (((ParamContext)_localctx).NTERM!=null?((ParamContext)_localctx).NTERM.getText():null); 
				}
				break;
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((ParamContext)_localctx).TERM = match(TERM);
				 ((ParamContext)_localctx).v =  (((ParamContext)_localctx).TERM!=null?((ParamContext)_localctx).TERM.getText():null); 
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				((ParamContext)_localctx).CODE = match(CODE);
				 ((ParamContext)_localctx).v =  (((ParamContext)_localctx).CODE!=null?((ParamContext)_localctx).CODE.getText():null).substring(1, (((ParamContext)_localctx).CODE!=null?((ParamContext)_localctx).CODE.getText():null).length() - 1); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5E\n"+
		"\5\f\5\16\5H\13\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\6\tp\n\t\r\t\16\tq\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13\n\3\n\3\n"+
		"\5\n\u0086\n\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0093\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u009a\2\26\3"+
		"\2\2\2\4*\3\2\2\2\6,\3\2\2\2\bL\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16i\3\2"+
		"\2\2\20k\3\2\2\2\22\u008a\3\2\2\2\24\u0092\3\2\2\2\26\27\7\r\2\2\27\33"+
		"\b\2\1\2\30\31\5\4\3\2\31\32\7\3\2\2\32\34\3\2\2\2\33\30\3\2\2\2\34\35"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \7\f\2\2 !\7\4\2"+
		"\2!\"\7\16\2\2\"+\b\3\1\2#$\7\f\2\2$%\7\5\2\2%&\7\16\2\2&+\b\3\1\2\'("+
		"\5\6\4\2()\b\3\1\2)+\3\2\2\2*\37\3\2\2\2*#\3\2\2\2*\'\3\2\2\2+\5\3\2\2"+
		"\2,-\7\r\2\2-.\5\b\5\2./\5\n\6\2/\60\7\4\2\2\60\61\b\4\1\2\61\62\5\20"+
		"\t\2\629\b\4\1\2\63\64\7\6\2\2\64\65\5\20\t\2\65\66\b\4\1\2\668\3\2\2"+
		"\2\67\63\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\7\3\2\2\2;9\3\2\2\2"+
		"<=\7\7\2\2=>\5\f\7\2>?\b\5\1\2?F\b\5\1\2@A\7\b\2\2AB\5\f\7\2BC\b\5\1\2"+
		"CE\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2"+
		"IJ\7\t\2\2JM\3\2\2\2KM\b\5\1\2L<\3\2\2\2LK\3\2\2\2M\t\3\2\2\2NO\7\n\2"+
		"\2OP\5\f\7\2PQ\b\6\1\2QX\b\6\1\2RS\7\b\2\2ST\5\f\7\2TU\b\6\1\2UW\3\2\2"+
		"\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\13"+
		"\2\2\\_\3\2\2\2]_\b\6\1\2^N\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`a\7\r\2\2ab"+
		"\7\5\2\2bc\5\16\b\2cd\b\7\1\2d\r\3\2\2\2ef\7\r\2\2fj\b\b\1\2gh\7\f\2\2"+
		"hj\b\b\1\2ie\3\2\2\2ig\3\2\2\2j\17\3\2\2\2ko\b\t\1\2lm\5\22\n\2mn\b\t"+
		"\1\2np\3\2\2\2ol\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\21\3\2\2\2st\7"+
		"\f\2\2t\u008b\b\n\1\2uv\7\r\2\2v\u0085\b\n\1\2wx\7\7\2\2xy\5\24\13\2y"+
		"\u0080\b\n\1\2z{\7\b\2\2{|\5\24\13\2|}\b\n\1\2}\177\3\2\2\2~z\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\t\2\2\u0084\u0086\3\2\2\2\u0085"+
		"w\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\b\n\1\2"+
		"\u0088\u0089\7\17\2\2\u0089\u008b\b\n\1\2\u008as\3\2\2\2\u008au\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\7\r\2\2\u008d\u0093"+
		"\b\13\1\2\u008e\u008f\7\f\2\2\u008f\u0093\b\13\1\2\u0090\u0091\7\17\2"+
		"\2\u0091\u0093\b\13\1\2\u0092\u008c\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\25\3\2\2\2\17\35*9FLX^iq\u0080\u0085\u008a\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}