// Generated from C:\Users\Izabely\Documents\GitHub\FoobarMotor\src\main\java\Grammar\Foobar.g4 by ANTLR 4.1
package grammar;
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
		ESPACE=10, EQUAL=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT", "LETRA", "NORTE", "SUL", "LESTE", "OESTE", "'.'", "'('", "')'", 
		"' '", "'='"
	};
	public static final String[] ruleNames = {
		"INT", "DIGIT", "LETRA", "NORTE", "SUL", "LESTE", "OESTE", "PONTO", "LPAR", 
		"RPAR", "ESPACE", "EQUAL"
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\rF\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\5\7\60\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\2\16"+
		"\3\3\1\5\2\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25\13\1\27"+
		"\f\1\31\r\1\3\2\f\3\2\62;\5\2C\\aac|\4\2PPpp\4\2QQqq\4\2TTtt\4\2VVvv\4"+
		"\2GGgg\4\2UUuu\4\2WWww\4\2NNnnF\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\34\3\2\2\2\5 \3\2\2\2\7\"\3\2\2\2\t"+
		"$\3\2\2\2\13*\3\2\2\2\r/\3\2\2\2\17\66\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2"+
		"\25@\3\2\2\2\27B\3\2\2\2\31D\3\2\2\2\33\35\5\5\3\2\34\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\4\3\2\2\2 !\t\2\2\2!\6\3\2\2\2"+
		"\"#\t\3\2\2#\b\3\2\2\2$%\t\4\2\2%&\t\5\2\2&\'\t\6\2\2\'(\t\7\2\2()\t\b"+
		"\2\2)\n\3\2\2\2*+\t\t\2\2+,\t\n\2\2,-\t\13\2\2-\f\3\2\2\2.\60\t\13\2\2"+
		"/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\t\b\2\2\62\63\t\t\2\2\63\64"+
		"\t\7\2\2\64\65\t\b\2\2\65\16\3\2\2\2\66\67\t\5\2\2\678\t\b\2\289\t\t\2"+
		"\29:\t\7\2\2:;\t\b\2\2;\20\3\2\2\2<=\7\60\2\2=\22\3\2\2\2>?\7*\2\2?\24"+
		"\3\2\2\2@A\7+\2\2A\26\3\2\2\2BC\7\"\2\2C\30\3\2\2\2DE\7?\2\2E\32\3\2\2"+
		"\2\5\2\36/";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}