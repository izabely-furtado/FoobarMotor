// Generated from C:\Users\Izabely\Documents\GitHub\FoobarMotor\src\main\java\Grammar\Foobar.g4 by ANTLR 4.1
package grammar;
import cdp.Mapa;
//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
//import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FoobarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, LETRA=2, NORTE=3, SUL=4, LESTE=5, OESTE=6, PONTO=7, LPAR=8, RPAR=9, 
		ESPACE=10, EQUAL=11;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "LETRA", "NORTE", "SUL", "LESTE", "OESTE", "'.'", 
		"'('", "')'", "' '", "'='"
	};
	public static final int
		RULE_prog = 0, RULE_mapa = 1, RULE_cidade = 2, RULE_nomeCidade = 3, RULE_palavra = 4, 
		RULE_direcao = 5, RULE_number = 6;
	public static final String[] ruleNames = {
		"prog", "mapa", "cidade", "nomeCidade", "palavra", "direcao", "number"
	};

	@Override
	public String getGrammarFileName() { return "Foobar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public FoobarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Mapa result;
		public MapaContext m;
		public TerminalNode PONTO() { return getToken(FoobarParser.PONTO, 0); }
		public MapaContext mapa() {
			return getRuleContext(MapaContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); ((ProgContext)_localctx).m = mapa();
			setState(15); match(PONTO);
			((ProgContext)_localctx).result =  ((ProgContext)_localctx).m.result;
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

	public static class MapaContext extends ParserRuleContext {
		public Mapa result;
		public CidadeContext cAtual;
		public DirecaoContext direcao;
		public CidadeContext c2;
		public DirecaoContext direcao(int i) {
			return getRuleContext(DirecaoContext.class,i);
		}
		public CidadeContext cidade(int i) {
			return getRuleContext(CidadeContext.class,i);
		}
		public List<DirecaoContext> direcao() {
			return getRuleContexts(DirecaoContext.class);
		}
		public List<TerminalNode> RPAR() { return getTokens(FoobarParser.RPAR); }
		public List<TerminalNode> LPAR() { return getTokens(FoobarParser.LPAR); }
		public TerminalNode EQUAL(int i) {
			return getToken(FoobarParser.EQUAL, i);
		}
		public List<CidadeContext> cidade() {
			return getRuleContexts(CidadeContext.class);
		}
		public List<TerminalNode> ESPACE() { return getTokens(FoobarParser.ESPACE); }
		public TerminalNode LPAR(int i) {
			return getToken(FoobarParser.LPAR, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(FoobarParser.EQUAL); }
		public TerminalNode RPAR(int i) {
			return getToken(FoobarParser.RPAR, i);
		}
		public TerminalNode ESPACE(int i) {
			return getToken(FoobarParser.ESPACE, i);
		}
		public MapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterMapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitMapa(this);
		}
	}

	public final MapaContext mapa() throws RecognitionException {
		MapaContext _localctx = new MapaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapa);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(LPAR);
			setState(19); ((MapaContext)_localctx).cAtual = cidade();
			setState(20); match(RPAR);
			((MapaContext)_localctx).result =  ((MapaContext)_localctx).cAtual.result;
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(22); match(ESPACE);
					setState(23); ((MapaContext)_localctx).direcao = direcao();
					setState(24); match(EQUAL);
					setState(25); match(LPAR);
					setState(26); ((MapaContext)_localctx).c2 = cidade();
					setState(27); match(RPAR);
					_localctx.result.setCidade(((MapaContext)_localctx).direcao.result, ((MapaContext)_localctx).c2.result);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class CidadeContext extends ParserRuleContext {
		public Mapa result;
		public NomeCidadeContext c1;
		public NomeCidadeContext nomeCidade() {
			return getRuleContext(NomeCidadeContext.class,0);
		}
		public CidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterCidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitCidade(this);
		}
	}

	public final CidadeContext cidade() throws RecognitionException {
		CidadeContext _localctx = new CidadeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); ((CidadeContext)_localctx).c1 = nomeCidade();
			((CidadeContext)_localctx).result =  new Mapa(((CidadeContext)_localctx).c1.result) {

                            @Override
                            protected String[] strCorrespondentes() {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                            @Override
                            protected void processaAqui(String conteudo) {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }
                        };
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

	public static class NomeCidadeContext extends ParserRuleContext {
		public String result;
		public PalavraContext p1;
		public PalavraContext pn;
		public NumberContext n;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<PalavraContext> palavra() {
			return getRuleContexts(PalavraContext.class);
		}
		public List<TerminalNode> ESPACE() { return getTokens(FoobarParser.ESPACE); }
		public PalavraContext palavra(int i) {
			return getRuleContext(PalavraContext.class,i);
		}
		public TerminalNode ESPACE(int i) {
			return getToken(FoobarParser.ESPACE, i);
		}
		public NomeCidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeCidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterNomeCidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitNomeCidade(this);
		}
	}

	public final NomeCidadeContext nomeCidade() throws RecognitionException {
		NomeCidadeContext _localctx = new NomeCidadeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nomeCidade);
		String retorno = "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); ((NomeCidadeContext)_localctx).p1 = palavra();
			retorno += ((NomeCidadeContext)_localctx).p1.result;
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(40); match(ESPACE);
					setState(41); ((NomeCidadeContext)_localctx).pn = palavra();
					retorno += " " + ((NomeCidadeContext)_localctx).pn.result;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(49); match(ESPACE);
				setState(50); ((NomeCidadeContext)_localctx).n = number();
				retorno += " " + ((NomeCidadeContext)_localctx).n.result;
				}
				break;
			}
			((NomeCidadeContext)_localctx).result =  retorno;
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

	public static class PalavraContext extends ParserRuleContext {
		public String result;
		public Token LETRA;
		public List<TerminalNode> LETRA() { return getTokens(FoobarParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(FoobarParser.LETRA, i);
		}
		public PalavraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterPalavra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitPalavra(this);
		}
	}

	public final PalavraContext palavra() throws RecognitionException {
		PalavraContext _localctx = new PalavraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_palavra);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(57); ((PalavraContext)_localctx).LETRA = match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			((PalavraContext)_localctx).result =  (((PalavraContext)_localctx).LETRA!=null?((PalavraContext)_localctx).LETRA.getText():null);
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

	public static class DirecaoContext extends ParserRuleContext {
		public int result;
		public TerminalNode LESTE() { return getToken(FoobarParser.LESTE, 0); }
		public TerminalNode SUL() { return getToken(FoobarParser.SUL, 0); }
		public TerminalNode OESTE() { return getToken(FoobarParser.OESTE, 0); }
		public TerminalNode NORTE() { return getToken(FoobarParser.NORTE, 0); }
		public DirecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterDirecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitDirecao(this);
		}
	}

	public final DirecaoContext direcao() throws RecognitionException {
		DirecaoContext _localctx = new DirecaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_direcao);
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(NORTE);
				((DirecaoContext)_localctx).result =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(SUL);
				((DirecaoContext)_localctx).result =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); match(LESTE);
				((DirecaoContext)_localctx).result =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); match(OESTE);
				((DirecaoContext)_localctx).result =  4;
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

	public static class NumberContext extends ParserRuleContext {
		public Integer result;
		public Token INT;
		public TerminalNode INT() { return getToken(FoobarParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); ((NumberContext)_localctx).INT = match(INT);
			((NumberContext)_localctx).result =  Integer.parseInt((((NumberContext)_localctx).INT!=null?((NumberContext)_localctx).INT.getText():null));  
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\rP\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\5\3\5\3\5\3\5\5"+
		"\58\n\5\3\5\3\5\3\6\6\6=\n\6\r\6\16\6>\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\2\t\2\4\6\b\n\f\16\2\2O\2\20\3\2\2\2"+
		"\4\24\3\2\2\2\6%\3\2\2\2\b(\3\2\2\2\n<\3\2\2\2\fJ\3\2\2\2\16L\3\2\2\2"+
		"\20\21\5\4\3\2\21\22\7\t\2\2\22\23\b\2\1\2\23\3\3\2\2\2\24\25\7\n\2\2"+
		"\25\26\5\6\4\2\26\27\7\13\2\2\27\"\b\3\1\2\30\31\7\f\2\2\31\32\5\f\7\2"+
		"\32\33\7\r\2\2\33\34\7\n\2\2\34\35\5\6\4\2\35\36\7\13\2\2\36\37\b\3\1"+
		"\2\37!\3\2\2\2 \30\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2"+
		"$\"\3\2\2\2%&\5\b\5\2&\'\b\4\1\2\'\7\3\2\2\2()\5\n\6\2)\60\b\5\1\2*+\7"+
		"\f\2\2+,\5\n\6\2,-\b\5\1\2-/\3\2\2\2.*\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\67\3\2\2\2\62\60\3\2\2\2\63\64\7\f\2\2\64\65\5\16\b"+
		"\2\65\66\b\5\1\2\668\3\2\2\2\67\63\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\5"+
		"\1\2:\t\3\2\2\2;=\7\4\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3"+
		"\2\2\2@A\b\6\1\2A\13\3\2\2\2BC\7\5\2\2CK\b\7\1\2DE\7\6\2\2EK\b\7\1\2F"+
		"G\7\7\2\2GK\b\7\1\2HI\7\b\2\2IK\b\7\1\2JB\3\2\2\2JD\3\2\2\2JF\3\2\2\2"+
		"JH\3\2\2\2K\r\3\2\2\2LM\7\3\2\2MN\b\b\1\2N\17\3\2\2\2\7\"\60\67>J";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}