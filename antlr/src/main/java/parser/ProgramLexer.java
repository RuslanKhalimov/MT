// Generated from Program.g4 by ANTLR 4.7.1

import expression.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, PRINT=3, READINT=4, WHILE=5, DO=6, ASSIGN=7, COMMA=8, LPAR=9, 
		RPAR=10, LCPAR=11, RCPAR=12, ADD=13, SUB=14, MUL=15, DIV=16, EQ=17, NEQ=18, 
		LESS=19, GR=20, LESSEQ=21, GREQ=22, NOT=23, AND=24, OR=25, VAR=26, NUM=27, 
		SPACE=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "PRINT", "READINT", "WHILE", "DO", "ASSIGN", "COMMA", "LPAR", 
		"RPAR", "LCPAR", "RCPAR", "ADD", "SUB", "MUL", "DIV", "EQ", "NEQ", "LESS", 
		"GR", "LESSEQ", "GREQ", "NOT", "AND", "OR", "VAR", "NUM", "SPACE"
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


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\7\33\u0089\n\33\f\33\16\33\u008c"+
		"\13\33\3\34\5\34\u008f\n\34\3\34\3\34\7\34\u0093\n\34\f\34\16\34\u0096"+
		"\13\34\3\34\5\34\u0099\n\34\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\5\4\2C\\c|\5\2\62"+
		";C\\c|\5\2\13\f\17\17\"\"\2\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5>\3\2\2\2\7C\3\2\2\2\tI\3\2\2"+
		"\2\13Q\3\2\2\2\rW\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25`\3\2"+
		"\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2"+
		"\2\2#n\3\2\2\2%q\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+x\3\2\2\2-{\3\2\2\2/~\3"+
		"\2\2\2\61\u0080\3\2\2\2\63\u0083\3\2\2\2\65\u0086\3\2\2\2\67\u0098\3\2"+
		"\2\29\u009a\3\2\2\2;<\7k\2\2<=\7h\2\2=\4\3\2\2\2>?\7g\2\2?@\7n\2\2@A\7"+
		"u\2\2AB\7g\2\2B\6\3\2\2\2CD\7r\2\2DE\7t\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2"+
		"H\b\3\2\2\2IJ\7t\2\2JK\7g\2\2KL\7c\2\2LM\7f\2\2MN\7k\2\2NO\7p\2\2OP\7"+
		"v\2\2P\n\3\2\2\2QR\7y\2\2RS\7j\2\2ST\7k\2\2TU\7n\2\2UV\7g\2\2V\f\3\2\2"+
		"\2WX\7f\2\2XY\7q\2\2Y\16\3\2\2\2Z[\7?\2\2[\20\3\2\2\2\\]\7.\2\2]\22\3"+
		"\2\2\2^_\7*\2\2_\24\3\2\2\2`a\7+\2\2a\26\3\2\2\2bc\7}\2\2c\30\3\2\2\2"+
		"de\7\177\2\2e\32\3\2\2\2fg\7-\2\2g\34\3\2\2\2hi\7/\2\2i\36\3\2\2\2jk\7"+
		",\2\2k \3\2\2\2lm\7\61\2\2m\"\3\2\2\2no\7?\2\2op\7?\2\2p$\3\2\2\2qr\7"+
		"#\2\2rs\7?\2\2s&\3\2\2\2tu\7>\2\2u(\3\2\2\2vw\7@\2\2w*\3\2\2\2xy\7>\2"+
		"\2yz\7?\2\2z,\3\2\2\2{|\7@\2\2|}\7?\2\2}.\3\2\2\2~\177\7#\2\2\177\60\3"+
		"\2\2\2\u0080\u0081\7(\2\2\u0081\u0082\7(\2\2\u0082\62\3\2\2\2\u0083\u0084"+
		"\7~\2\2\u0084\u0085\7~\2\2\u0085\64\3\2\2\2\u0086\u008a\t\2\2\2\u0087"+
		"\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\66\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f"+
		"\7/\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0094\4\63;\2\u0091\u0093\4\62;\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0099\7\62\2\2\u0098\u008e\3\2\2\2\u0098\u0097\3"+
		"\2\2\2\u00998\3\2\2\2\u009a\u009b\t\4\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\b\35\2\2\u009d:\3\2\2\2\7\2\u008a\u008e\u0094\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}