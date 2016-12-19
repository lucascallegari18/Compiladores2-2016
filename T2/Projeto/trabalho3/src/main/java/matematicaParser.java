// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matematicaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Numero=8, Incognita=9, 
		Identificador=10, String=11, Comentario=12, Espaco=13;
	public static final int
		RULE_programa = 0, RULE_intervalo = 1, RULE_valor = 2, RULE_constante = 3;
	public static final String[] ruleNames = {
		"programa", "intervalo", "valor", "constante"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "'..'", "']'", "'+infinito'", "'-infinito'", "'pi'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Numero", "Incognita", 
		"Identificador", "String", "Comentario", "Espaco"
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
	public String getGrammarFileName() { return "matematica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public matematicaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(matematicaParser.EOF, 0); }
		public List<IntervaloContext> intervalo() {
			return getRuleContexts(IntervaloContext.class);
		}
		public IntervaloContext intervalo(int i) {
			return getRuleContext(IntervaloContext.class,i);
		}
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public List<TerminalNode> Numero() { return getTokens(matematicaParser.Numero); }
		public TerminalNode Numero(int i) {
			return getToken(matematicaParser.Numero, i);
		}
		public List<TerminalNode> Identificador() { return getTokens(matematicaParser.Identificador); }
		public TerminalNode Identificador(int i) {
			return getToken(matematicaParser.Identificador, i);
		}
		public List<TerminalNode> Incognita() { return getTokens(matematicaParser.Incognita); }
		public TerminalNode Incognita(int i) {
			return getToken(matematicaParser.Incognita, i);
		}
		public List<TerminalNode> String() { return getTokens(matematicaParser.String); }
		public TerminalNode String(int i) {
			return getToken(matematicaParser.String, i);
		}
		public List<TerminalNode> Comentario() { return getTokens(matematicaParser.Comentario); }
		public TerminalNode Comentario(int i) {
			return getToken(matematicaParser.Comentario, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Numero) | (1L << Incognita) | (1L << Identificador) | (1L << String) | (1L << Comentario))) != 0)) {
				{
				setState(15);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(8);
					intervalo();
					}
					break;
				case T__3:
				case T__4:
				case T__5:
				case T__6:
					{
					setState(9);
					constante();
					}
					break;
				case Numero:
					{
					setState(10);
					match(Numero);
					}
					break;
				case Identificador:
					{
					setState(11);
					match(Identificador);
					}
					break;
				case Incognita:
					{
					setState(12);
					match(Incognita);
					}
					break;
				case String:
					{
					setState(13);
					match(String);
					}
					break;
				case Comentario:
					{
					setState(14);
					match(Comentario);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class IntervaloContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public IntervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterIntervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitIntervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitIntervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervaloContext intervalo() throws RecognitionException {
		IntervaloContext _localctx = new IntervaloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			valor();
			setState(24);
			match(T__1);
			setState(25);
			valor();
			setState(26);
			match(T__2);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(matematicaParser.Numero, 0); }
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_valor);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case Numero:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(Numero);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				constante();
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

	public static class ConstanteContext extends ParserRuleContext {
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\2\2"+
		"\6\2\4\6\b\2\3\3\2\6\t(\2\23\3\2\2\2\4\30\3\2\2\2\6 \3\2\2\2\b\"\3\2\2"+
		"\2\n\22\5\4\3\2\13\22\5\b\5\2\f\22\7\n\2\2\r\22\7\f\2\2\16\22\7\13\2\2"+
		"\17\22\7\r\2\2\20\22\7\16\2\2\21\n\3\2\2\2\21\13\3\2\2\2\21\f\3\2\2\2"+
		"\21\r\3\2\2\2\21\16\3\2\2\2\21\17\3\2\2\2\21\20\3\2\2\2\22\25\3\2\2\2"+
		"\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3"+
		"\27\3\3\2\2\2\30\31\7\3\2\2\31\32\5\6\4\2\32\33\7\4\2\2\33\34\5\6\4\2"+
		"\34\35\7\5\2\2\35\5\3\2\2\2\36!\7\n\2\2\37!\5\b\5\2 \36\3\2\2\2 \37\3"+
		"\2\2\2!\7\3\2\2\2\"#\t\2\2\2#\t\3\2\2\2\5\21\23 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}