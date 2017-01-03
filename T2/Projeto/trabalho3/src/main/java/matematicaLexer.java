// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matematicaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		ID=32, Numero=33, Letra=34, String=35, Comentario=36, Espaco=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "ID", "Numero", 
		"Letra", "String", "Comentario", "Espaco", "Int", "Digito"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "';'", "'print'", "'('", "')'", "'='", "'-'", "'^'", 
		"'*'", "'/'", "'+'", "'integre'", "'d'", "'de'", "'a'", "'{'", "'|'", 
		"'}'", "'N'", "'Z'", "'Q'", "'R'", "'['", "'<->'", "']'", "'sen'", "'cos'", 
		"'+infinito'", "'-infinito'", "'pi'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "Numero", "Letra", 
		"String", "Comentario", "Espaco"
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


	public matematicaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "matematica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3!\3!\7!\u00b9\n!\f!\16!\u00bc\13!\3\"\3\"\3"+
		"\"\7\"\u00c1\n\"\f\"\16\"\u00c4\13\"\5\"\u00c6\n\"\3\"\3\"\3\"\3\"\7\""+
		"\u00cc\n\"\f\"\16\"\u00cf\13\"\5\"\u00d1\n\"\5\"\u00d3\n\"\3#\3#\3$\3"+
		"$\7$\u00d9\n$\f$\16$\u00dc\13$\3$\3$\3%\3%\3%\3%\7%\u00e4\n%\f%\16%\u00e7"+
		"\13%\3%\3%\3%\3%\7%\u00ed\n%\f%\16%\u00f0\13%\3%\3%\5%\u00f4\n%\3%\3%"+
		"\3&\3&\3&\3&\3\'\3\'\7\'\u00fe\n\'\f\'\16\'\u0101\13\'\3\'\5\'\u0104\n"+
		"\'\3(\3(\3\u00ee\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2\3\2\t\5\2C\\aac|\6\2\62;"+
		"C\\aac|\4\2C\\c|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2"+
		"\63;\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7Z\3\2\2\2\t`"+
		"\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25"+
		"l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37}\3\2\2\2"+
		"!\177\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2"+
		"\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2\2\2\61\u008f\3\2\2\2\63"+
		"\u0093\3\2\2\2\65\u0095\3\2\2\2\67\u0099\3\2\2\29\u009d\3\2\2\2;\u00a7"+
		"\3\2\2\2=\u00b1\3\2\2\2?\u00b4\3\2\2\2A\u00b6\3\2\2\2C\u00d2\3\2\2\2E"+
		"\u00d4\3\2\2\2G\u00d6\3\2\2\2I\u00f3\3\2\2\2K\u00f7\3\2\2\2M\u0103\3\2"+
		"\2\2O\u0105\3\2\2\2QR\7t\2\2RS\7g\2\2ST\7v\2\2TU\7w\2\2UV\7t\2\2VW\7p"+
		"\2\2W\4\3\2\2\2XY\7=\2\2Y\6\3\2\2\2Z[\7r\2\2[\\\7t\2\2\\]\7k\2\2]^\7p"+
		"\2\2^_\7v\2\2_\b\3\2\2\2`a\7*\2\2a\n\3\2\2\2bc\7+\2\2c\f\3\2\2\2de\7?"+
		"\2\2e\16\3\2\2\2fg\7/\2\2g\20\3\2\2\2hi\7`\2\2i\22\3\2\2\2jk\7,\2\2k\24"+
		"\3\2\2\2lm\7\61\2\2m\26\3\2\2\2no\7-\2\2o\30\3\2\2\2pq\7k\2\2qr\7p\2\2"+
		"rs\7v\2\2st\7g\2\2tu\7i\2\2uv\7t\2\2vw\7g\2\2w\32\3\2\2\2xy\7f\2\2y\34"+
		"\3\2\2\2z{\7f\2\2{|\7g\2\2|\36\3\2\2\2}~\7c\2\2~ \3\2\2\2\177\u0080\7"+
		"}\2\2\u0080\"\3\2\2\2\u0081\u0082\7~\2\2\u0082$\3\2\2\2\u0083\u0084\7"+
		"\177\2\2\u0084&\3\2\2\2\u0085\u0086\7P\2\2\u0086(\3\2\2\2\u0087\u0088"+
		"\7\\\2\2\u0088*\3\2\2\2\u0089\u008a\7S\2\2\u008a,\3\2\2\2\u008b\u008c"+
		"\7T\2\2\u008c.\3\2\2\2\u008d\u008e\7]\2\2\u008e\60\3\2\2\2\u008f\u0090"+
		"\7>\2\2\u0090\u0091\7/\2\2\u0091\u0092\7@\2\2\u0092\62\3\2\2\2\u0093\u0094"+
		"\7_\2\2\u0094\64\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7p\2\2\u0098\66\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7u\2\2\u009c8\3\2\2\2\u009d\u009e\7-\2\2\u009e\u009f\7k\2\2\u009f\u00a0"+
		"\7p\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7q\2\2\u00a6:\3\2\2\2\u00a7"+
		"\u00a8\7/\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7h\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7q\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3"+
		"\7k\2\2\u00b3>\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5@\3\2\2\2\u00b6\u00ba\t"+
		"\2\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bbB\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bd\u00c5\5M\'\2\u00be\u00c2\7\60\2\2\u00bf\u00c1\5O(\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00d3\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\u00d0\5M\'\2\u00c9\u00cd"+
		"\7\60\2\2\u00ca\u00cc\5O(\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00bd\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d3D\3\2\2\2\u00d4\u00d5\t\4\2\2"+
		"\u00d5F\3\2\2\2\u00d6\u00da\7$\2\2\u00d7\u00d9\n\5\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7$\2\2\u00deH\3\2\2\2\u00df"+
		"\u00e0\7\61\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\n"+
		"\6\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00f4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\61"+
		"\2\2\u00e9\u00ea\7,\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ed\13\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2"+
		"\u00f4\7\61\2\2\u00f3\u00df\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f6\b%\2\2\u00f6J\3\2\2\2\u00f7\u00f8\t\7\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fa\b&\2\2\u00faL\3\2\2\2\u00fb\u00ff\t\b\2\2\u00fc\u00fe"+
		"\5O(\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0104\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7\62"+
		"\2\2\u0103\u00fb\3\2\2\2\u0103\u0102\3\2\2\2\u0104N\3\2\2\2\u0105\u0106"+
		"\4\62;\2\u0106P\3\2\2\2\17\2\u00ba\u00c2\u00c5\u00cd\u00d0\u00d2\u00da"+
		"\u00e5\u00ee\u00f3\u00ff\u0103\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}