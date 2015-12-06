// Generated from C:\Users\Izabely\Documents\GitHub\FoobarMotor\src\main\java\Grammar\Foobar.g4 by ANTLR 4.1
package grammar;

import cdp.cadeia.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FoobarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, LETRA=2, NORTE=3, SUL=4, LESTE=5, OESTE=6, PONTO=7, LPAR=8, RPAR=9, 
		ESPACE=10, EQUAL=11, VIRG=12, PVIRG=13, WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "LETRA", "NORTE", "SUL", "LESTE", "OESTE", "'.'", 
		"'('", "')'", "' '", "'='", "','", "';'", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_prog2 = 1, RULE_mapa = 2, RULE_cidade = 3, RULE_nomeCidades = 4, 
		RULE_nomeCidade = 5, RULE_palavra = 6, RULE_direcao = 7, RULE_number = 8;
	public static final String[] ruleNames = {
		"prog", "prog2", "mapa", "cidade", "nomeCidades", "nomeCidade", "palavra", 
		"direcao", "number"
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
		public IMapa result;
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
			setState(18); ((ProgContext)_localctx).m = mapa();
			setState(19); match(PONTO);
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

	public static class Prog2Context extends ParserRuleContext {
		public IMapa result;
		public NomeCidadesContext nCs;
		public DirecaoContext d;
		public NomeCidadesContext nomeCidades() {
			return getRuleContext(NomeCidadesContext.class,0);
		}
		public DirecaoContext direcao() {
			return getRuleContext(DirecaoContext.class,0);
		}
		public TerminalNode PVIRG() { return getToken(FoobarParser.PVIRG, 0); }
		public TerminalNode ESPACE() { return getToken(FoobarParser.ESPACE, 0); }
		public Prog2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterProg2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitProg2(this);
		}
	}

	public final Prog2Context prog2() throws RecognitionException {
		Prog2Context _localctx = new Prog2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); ((Prog2Context)_localctx).nCs = nomeCidades();
			setState(23); match(PVIRG);
			setState(24); match(ESPACE);
			setState(25); ((Prog2Context)_localctx).d = direcao();
			IMapa mapaExemplo = new Cidade();
			       ((Prog2Context)_localctx).result =  mapaExemplo.processaConteudo(((Prog2Context)_localctx).nCs.result, ((Prog2Context)_localctx).d.result);
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
		public IMapa result;
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
		enterRule(_localctx, 4, RULE_mapa);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(LPAR);
			setState(29); ((MapaContext)_localctx).cAtual = cidade();
			setState(30); match(RPAR);
			((MapaContext)_localctx).result =  ((MapaContext)_localctx).cAtual.result;
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(32); match(ESPACE);
					setState(33); ((MapaContext)_localctx).direcao = direcao();
					setState(34); match(EQUAL);
					setState(35); match(LPAR);
					setState(36); ((MapaContext)_localctx).c2 = cidade();
					setState(37); match(RPAR);
					_localctx.result.setCidade(((MapaContext)_localctx).direcao.result, ((MapaContext)_localctx).c2.result);
					}
					} 
				}
				setState(44);
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
		public IMapa result;
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
		enterRule(_localctx, 6, RULE_cidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); ((CidadeContext)_localctx).c1 = nomeCidade();
			((CidadeContext)_localctx).result =  new Cidade(((CidadeContext)_localctx).c1.result);
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

	public static class NomeCidadesContext extends ParserRuleContext {
		public List<String> result;
		public NomeCidadeContext p1;
		public PalavraContext pn;
		public List<PalavraContext> palavra() {
			return getRuleContexts(PalavraContext.class);
		}
		public NomeCidadeContext nomeCidade() {
			return getRuleContext(NomeCidadeContext.class,0);
		}
		public PalavraContext palavra(int i) {
			return getRuleContext(PalavraContext.class,i);
		}
		public List<TerminalNode> ESPACE() { return getTokens(FoobarParser.ESPACE); }
		public List<TerminalNode> VIRG() { return getTokens(FoobarParser.VIRG); }
		public TerminalNode ESPACE(int i) {
			return getToken(FoobarParser.ESPACE, i);
		}
		public TerminalNode VIRG(int i) {
			return getToken(FoobarParser.VIRG, i);
		}
		public NomeCidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeCidades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).enterNomeCidades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoobarListener ) ((FoobarListener)listener).exitNomeCidades(this);
		}
	}

	public final NomeCidadesContext nomeCidades() throws RecognitionException {
		NomeCidadesContext _localctx = new NomeCidadesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nomeCidades);
		List<String> retorno = new ArrayList<>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48); ((NomeCidadesContext)_localctx).p1 = nomeCidade();
			retorno.add(((NomeCidadesContext)_localctx).p1.result);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(50); match(VIRG);
					setState(51); match(ESPACE);
					setState(52); ((NomeCidadesContext)_localctx).pn = palavra();
					retorno.add(((NomeCidadesContext)_localctx).pn.result);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			((NomeCidadesContext)_localctx).result =  retorno;
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
		enterRule(_localctx, 10, RULE_nomeCidade);
		String retorno = "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62); ((NomeCidadeContext)_localctx).p1 = palavra();
			retorno += ((NomeCidadeContext)_localctx).p1.result;
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(64); match(ESPACE);
					setState(65); ((NomeCidadeContext)_localctx).pn = palavra();
					retorno += " " + ((NomeCidadeContext)_localctx).pn.result;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73); match(ESPACE);
				setState(74); ((NomeCidadeContext)_localctx).n = number();
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
		enterRule(_localctx, 12, RULE_palavra);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81); ((PalavraContext)_localctx).LETRA = match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 14, RULE_direcao);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(NORTE);
				((DirecaoContext)_localctx).result =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); match(SUL);
				((DirecaoContext)_localctx).result =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(LESTE);
				((DirecaoContext)_localctx).result =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); match(OESTE);
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
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); ((NumberContext)_localctx).INT = match(INT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\20h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6:\n\6\f\6\16\6=\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7G\n\7\f\7"+
		"\16\7J\13\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\3\7\3\b\6\bU\n\b\r\b\16\bV\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n\3\n\3\n\2\13\2"+
		"\4\6\b\n\f\16\20\22\2\2f\2\24\3\2\2\2\4\30\3\2\2\2\6\36\3\2\2\2\b/\3\2"+
		"\2\2\n\62\3\2\2\2\f@\3\2\2\2\16T\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24\25"+
		"\5\6\4\2\25\26\7\t\2\2\26\27\b\2\1\2\27\3\3\2\2\2\30\31\5\n\6\2\31\32"+
		"\7\17\2\2\32\33\7\f\2\2\33\34\5\20\t\2\34\35\b\3\1\2\35\5\3\2\2\2\36\37"+
		"\7\n\2\2\37 \5\b\5\2 !\7\13\2\2!,\b\4\1\2\"#\7\f\2\2#$\5\20\t\2$%\7\r"+
		"\2\2%&\7\n\2\2&\'\5\b\5\2\'(\7\13\2\2()\b\4\1\2)+\3\2\2\2*\"\3\2\2\2+"+
		".\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\60\5\f\7\2\60\61\b"+
		"\5\1\2\61\t\3\2\2\2\62\63\5\f\7\2\63;\b\6\1\2\64\65\7\16\2\2\65\66\7\f"+
		"\2\2\66\67\5\16\b\2\678\b\6\1\28:\3\2\2\29\64\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\6\1\2?\13\3\2\2\2@A\5\16\b\2AH"+
		"\b\7\1\2BC\7\f\2\2CD\5\16\b\2DE\b\7\1\2EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2IO\3\2\2\2JH\3\2\2\2KL\7\f\2\2LM\5\22\n\2MN\b\7\1"+
		"\2NP\3\2\2\2OK\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\7\1\2R\r\3\2\2\2SU\7\4"+
		"\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\b\1\2Y\17\3"+
		"\2\2\2Z[\7\5\2\2[c\b\t\1\2\\]\7\6\2\2]c\b\t\1\2^_\7\7\2\2_c\b\t\1\2`a"+
		"\7\b\2\2ac\b\t\1\2bZ\3\2\2\2b\\\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\21\3\2\2"+
		"\2de\7\3\2\2ef\b\n\1\2f\23\3\2\2\2\b,;HOVb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}