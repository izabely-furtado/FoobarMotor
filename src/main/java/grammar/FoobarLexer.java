// Generated from C:\Users\Izabely\Documents\GitHub\FoobarMotor\src\main\java\Grammar\Foobar.g4 by ANTLR 4.1
package grammar;

import cdp.cadeia.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FoobarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, LETRA=2, NORTE=3, SUL=4, LESTE=5, OESTE=6, PONTO=7, LPAR=8, RPAR=9, 
		ESPACE=10, EQUAL=11, VIRG=12, PVIRG=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT", "LETRA", "NORTE", "SUL", "LESTE", "OESTE", "'.'", "'('", "')'", 
		"' '", "'='", "','", "';'", "WS"
	};
	public static final String[] ruleNames = {
		"INT", "DIGIT", "LETRA", "NORTE", "SUL", "LESTE", "OESTE", "PONTO", "LPAR", 
		"RPAR", "ESPACE", "EQUAL", "VIRG", "PVIRG", "WS"
	};


	public FoobarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Foobar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\20W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r\2\16"+
		"\2$\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\5\7\66"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20R\n\20\r\20\16\20S"+
		"\3\20\3\20\2\21\3\3\1\5\2\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23"+
		"\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\2\3\2\r\3\2\62;\5\2C"+
		"\\aac|\4\2PPpp\4\2QQqq\4\2TTtt\4\2VVvv\4\2GGgg\4\2UUuu\4\2WWww\4\2NNn"+
		"n\4\2\13\f\17\17X\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\"\3\2\2\2\5"+
		"&\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13\60\3\2\2\2\r\65\3\2\2\2\17<\3\2\2\2"+
		"\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2"+
		"\2\35N\3\2\2\2\37Q\3\2\2\2!#\5\5\3\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$"+
		"%\3\2\2\2%\4\3\2\2\2&\'\t\2\2\2\'\6\3\2\2\2()\t\3\2\2)\b\3\2\2\2*+\t\4"+
		"\2\2+,\t\5\2\2,-\t\6\2\2-.\t\7\2\2./\t\b\2\2/\n\3\2\2\2\60\61\t\t\2\2"+
		"\61\62\t\n\2\2\62\63\t\13\2\2\63\f\3\2\2\2\64\66\t\13\2\2\65\64\3\2\2"+
		"\2\65\66\3\2\2\2\66\67\3\2\2\2\678\t\b\2\289\t\t\2\29:\t\7\2\2:;\t\b\2"+
		"\2;\16\3\2\2\2<=\t\5\2\2=>\t\b\2\2>?\t\t\2\2?@\t\7\2\2@A\t\b\2\2A\20\3"+
		"\2\2\2BC\7\60\2\2C\22\3\2\2\2DE\7*\2\2E\24\3\2\2\2FG\7+\2\2G\26\3\2\2"+
		"\2HI\7\"\2\2I\30\3\2\2\2JK\7?\2\2K\32\3\2\2\2LM\7.\2\2M\34\3\2\2\2NO\7"+
		"=\2\2O\36\3\2\2\2PR\t\f\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU"+
		"\3\2\2\2UV\b\20\2\2V \3\2\2\2\6\2$\65S";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}