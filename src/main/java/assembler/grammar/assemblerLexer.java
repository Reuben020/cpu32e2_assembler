// Generated from E:/My Code/java/cpu32e2_assembler/src/main/java/assembler/grammar\assembler.g4 by ANTLR 4.7
package assembler.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class assemblerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALIGN=1, ORIGIN=2, FUNCTION=3, ENDFUNCTION=4, CONST=5, ENDCONST=6, DATA=7, 
		ENDDATA=8, DATATYPE=9, OR0=10, OSR1=11, ORS1=12, OI1=13, IR=14, RI2=15, 
		OR2=16, RI3=17, OI3=18, OR4=19, BR=20, LD=21, ST=22, REG=23, SYSREG=24, 
		MTYPE=25, INCTYPE=26, COND=27, LABEL=28, ID=29, DNUM=30, HNUM=31, BNUM=32, 
		PLUS=33, MINUS=34, NOT=35, MULTIPLY=36, DIVIDE=37, MODULUS=38, SHIFTLEFT=39, 
		SHIFTRIGHT=40, SHIFTRIGHTARITH=41, AND=42, XOR=43, OR=44, COMMA=45, LBRACKET=46, 
		RBRACKET=47, EQUALS=48, LPAREN=49, RPAREN=50, NEWLINE=51, CHAR=52, STRING=53, 
		SINGLE_CMNT=54, COMMENT=55, WHITESPACE=56, FILEEND=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ALIGN", "ORIGIN", "FUNCTION", "ENDFUNCTION", "CONST", "ENDCONST", "DATA", 
		"ENDDATA", "DATATYPE", "OR0", "OSR1", "ORS1", "OI1", "IR", "RI2", "OR2", 
		"RI3", "OI3", "OR4", "BR", "LD", "ST", "REG", "SYSREG", "MTYPE", "INCTYPE", 
		"COND", "LABEL", "ID", "DNUM", "HNUM", "BNUM", "PLUS", "MINUS", "NOT", 
		"MULTIPLY", "DIVIDE", "MODULUS", "SHIFTLEFT", "SHIFTRIGHT", "SHIFTRIGHTARITH", 
		"AND", "XOR", "OR", "COMMA", "LBRACKET", "RBRACKET", "EQUALS", "LPAREN", 
		"RPAREN", "NEWLINE", "CHAR", "STRING", "SINGLE_CMNT", "COMMENT", "WHITESPACE", 
		"FILEEND"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'align'", "'origin'", "'function'", "'endfunction'", "'const'", 
		"'endconst'", "'data'", "'enddata'", null, null, "'ssr'", "'lsr'", "'int'", 
		"'iret'", null, "'not'", null, "'mui'", null, null, "'ld'", "'st'", null, 
		null, null, null, null, null, null, null, null, null, "'+'", "'-'", "'~'", 
		"'*'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'&'", "'^'", "'|'", "','", 
		"'['", "']'", "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALIGN", "ORIGIN", "FUNCTION", "ENDFUNCTION", "CONST", "ENDCONST", 
		"DATA", "ENDDATA", "DATATYPE", "OR0", "OSR1", "ORS1", "OI1", "IR", "RI2", 
		"OR2", "RI3", "OI3", "OR4", "BR", "LD", "ST", "REG", "SYSREG", "MTYPE", 
		"INCTYPE", "COND", "LABEL", "ID", "DNUM", "HNUM", "BNUM", "PLUS", "MINUS", 
		"NOT", "MULTIPLY", "DIVIDE", "MODULUS", "SHIFTLEFT", "SHIFTRIGHT", "SHIFTRIGHTARITH", 
		"AND", "XOR", "OR", "COMMA", "LBRACKET", "RBRACKET", "EQUALS", "LPAREN", 
		"RPAREN", "NEWLINE", "CHAR", "STRING", "SINGLE_CMNT", "COMMENT", "WHITESPACE", 
		"FILEEND"
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


	public assemblerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "assembler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0367\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00ce\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0130\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0146\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u014d\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u01f3\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u028b\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02ae\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u02b7\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02e3\n\34\3\35\3\35\3\35"+
		"\3\36\6\36\u02e9\n\36\r\36\16\36\u02ea\3\36\7\36\u02ee\n\36\f\36\16\36"+
		"\u02f1\13\36\3\37\6\37\u02f4\n\37\r\37\16\37\u02f5\3 \6 \u02f9\n \r \16"+
		" \u02fa\3 \7 \u02fe\n \f \16 \u0301\13 \3 \3 \3!\6!\u0306\n!\r!\16!\u0307"+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\5\64\u0335\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\6\66\u033f\n\66\r\66\16\66\u0340\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0349"+
		"\n\67\f\67\16\67\u034c\13\67\3\67\3\67\38\38\38\38\38\78\u0355\n8\f8\16"+
		"8\u0358\138\38\38\38\38\38\39\69\u0360\n9\r9\169\u0361\39\39\3:\3:\3\u0356"+
		"\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;\3\2\13\4\2>>@@\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\62;CHch"+
		"\3\2\62\63\3\2$$\3\2\f\f\4\2\13\13\"\"\2\u0404\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\3u\3\2\2\2\5{\3\2\2\2\7\u0082\3\2\2\2\t\u008b\3\2\2\2\13\u0097"+
		"\3\2\2\2\r\u009d\3\2\2\2\17\u00a6\3\2\2\2\21\u00ab\3\2\2\2\23\u00c3\3"+
		"\2\2\2\25\u00cd\3\2\2\2\27\u00cf\3\2\2\2\31\u00d3\3\2\2\2\33\u00d7\3\2"+
		"\2\2\35\u00db\3\2\2\2\37\u00f0\3\2\2\2!\u00f2\3\2\2\2#\u012f\3\2\2\2%"+
		"\u0131\3\2\2\2\'\u0145\3\2\2\2)\u014c\3\2\2\2+\u014e\3\2\2\2-\u0151\3"+
		"\2\2\2/\u01f2\3\2\2\2\61\u028a\3\2\2\2\63\u02ad\3\2\2\2\65\u02b6\3\2\2"+
		"\2\67\u02e2\3\2\2\29\u02e4\3\2\2\2;\u02e8\3\2\2\2=\u02f3\3\2\2\2?\u02f8"+
		"\3\2\2\2A\u0305\3\2\2\2C\u030b\3\2\2\2E\u030d\3\2\2\2G\u030f\3\2\2\2I"+
		"\u0311\3\2\2\2K\u0313\3\2\2\2M\u0315\3\2\2\2O\u0317\3\2\2\2Q\u031a\3\2"+
		"\2\2S\u031d\3\2\2\2U\u0321\3\2\2\2W\u0323\3\2\2\2Y\u0325\3\2\2\2[\u0327"+
		"\3\2\2\2]\u0329\3\2\2\2_\u032b\3\2\2\2a\u032d\3\2\2\2c\u032f\3\2\2\2e"+
		"\u0331\3\2\2\2g\u0334\3\2\2\2i\u0338\3\2\2\2k\u033c\3\2\2\2m\u0344\3\2"+
		"\2\2o\u034f\3\2\2\2q\u035f\3\2\2\2s\u0365\3\2\2\2uv\7c\2\2vw\7n\2\2wx"+
		"\7k\2\2xy\7i\2\2yz\7p\2\2z\4\3\2\2\2{|\7q\2\2|}\7t\2\2}~\7k\2\2~\177\7"+
		"i\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\6\3\2\2\2\u0082\u0083"+
		"\7h\2\2\u0083\u0084\7w\2\2\u0084\u0085\7p\2\2\u0085\u0086\7e\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7k\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p\2\2"+
		"\u008a\b\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f"+
		"\2\2\u008e\u008f\7h\2\2\u008f\u0090\7w\2\2\u0090\u0091\7p\2\2\u0091\u0092"+
		"\7e\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7p\2\2\u0096\n\3\2\2\2\u0097\u0098\7e\2\2\u0098\u0099\7q\2\2\u0099"+
		"\u009a\7p\2\2\u009a\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\f\3\2\2\2\u009d"+
		"\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7e\2\2"+
		"\u00a1\u00a2\7q\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7c\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7c\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4"+
		"\u00b5\7{\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00c4\7u\2\2"+
		"\u00b8\u00b9\7y\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc"+
		"\7f\2\2\u00bc\u00c4\7u\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7y\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c4\7u\2\2"+
		"\u00c3\u00b3\3\2\2\2\u00c3\u00b8\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4\24"+
		"\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ce\7m\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\u00ce\7r\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\26\3"+
		"\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\30\3\2\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\32\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\34\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7v\2\2\u00df\36\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7o\2\2\u00e2"+
		"\u00f1\7r\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00f1\7s\2\2"+
		"\u00e6\u00e7\7v\2\2\u00e7\u00e8\7u\2\2\u00e8\u00f1\7v\2\2\u00e9\u00ea"+
		"\7w\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7o\2\2\u00ec\u00f1\7r\2\2\u00ed"+
		"\u00ee\7o\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f1\7x\2\2\u00f0\u00e0\3\2\2"+
		"\2\u00f0\u00e3\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ed"+
		"\3\2\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5"+
		"\7v\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7f\2\2\u00f8\u0130"+
		"\7e\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7f\2\2\u00fb\u0130\7f\2\2\u00fc"+
		"\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u0130\7f\2\2\u00ff\u0100\7q\2\2"+
		"\u0100\u0130\7t\2\2\u0101\u0102\7u\2\2\u0102\u0103\7d\2\2\u0103\u0130"+
		"\7d\2\2\u0104\u0105\7u\2\2\u0105\u0106\7w\2\2\u0106\u0130\7d\2\2\u0107"+
		"\u0108\7w\2\2\u0108\u0109\7c\2\2\u0109\u010a\7f\2\2\u010a\u0130\7e\2\2"+
		"\u010b\u010c\7w\2\2\u010c\u010d\7c\2\2\u010d\u010e\7f\2\2\u010e\u0130"+
		"\7f\2\2\u010f\u0110\7w\2\2\u0110\u0111\7u\2\2\u0111\u0112\7d\2\2\u0112"+
		"\u0130\7d\2\2\u0113\u0114\7w\2\2\u0114\u0115\7u\2\2\u0115\u0116\7w\2\2"+
		"\u0116\u0130\7d\2\2\u0117\u0118\7z\2\2\u0118\u0119\7q\2\2\u0119\u0130"+
		"\7t\2\2\u011a\u011b\7t\2\2\u011b\u011c\7e\2\2\u011c\u0130\7n\2\2\u011d"+
		"\u011e\7t\2\2\u011e\u011f\7e\2\2\u011f\u0130\7t\2\2\u0120\u0121\7t\2\2"+
		"\u0121\u0122\7q\2\2\u0122\u0130\7n\2\2\u0123\u0124\7t\2\2\u0124\u0125"+
		"\7q\2\2\u0125\u0130\7t\2\2\u0126\u0127\7u\2\2\u0127\u0128\7c\2\2\u0128"+
		"\u0130\7t\2\2\u0129\u012a\7u\2\2\u012a\u012b\7j\2\2\u012b\u0130\7n\2\2"+
		"\u012c\u012d\7u\2\2\u012d\u012e\7j\2\2\u012e\u0130\7t\2\2\u012f\u00f6"+
		"\3\2\2\2\u012f\u00f9\3\2\2\2\u012f\u00fc\3\2\2\2\u012f\u00ff\3\2\2\2\u012f"+
		"\u0101\3\2\2\2\u012f\u0104\3\2\2\2\u012f\u0107\3\2\2\2\u012f\u010b\3\2"+
		"\2\2\u012f\u010f\3\2\2\2\u012f\u0113\3\2\2\2\u012f\u0117\3\2\2\2\u012f"+
		"\u011a\3\2\2\2\u012f\u011d\3\2\2\2\u012f\u0120\3\2\2\2\u012f\u0123\3\2"+
		"\2\2\u012f\u0126\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u012c\3\2\2\2\u0130"+
		"$\3\2\2\2\u0131\u0132\7o\2\2\u0132\u0133\7w\2\2\u0133\u0134\7k\2\2\u0134"+
		"&\3\2\2\2\u0135\u0136\7u\2\2\u0136\u0137\7f\2\2\u0137\u0138\7k\2\2\u0138"+
		"\u0146\7x\2\2\u0139\u013a\7u\2\2\u013a\u013b\7o\2\2\u013b\u013c\7w\2\2"+
		"\u013c\u0146\7n\2\2\u013d\u013e\7w\2\2\u013e\u013f\7f\2\2\u013f\u0140"+
		"\7k\2\2\u0140\u0146\7x\2\2\u0141\u0142\7w\2\2\u0142\u0143\7o\2\2\u0143"+
		"\u0144\7w\2\2\u0144\u0146\7n\2\2\u0145\u0135\3\2\2\2\u0145\u0139\3\2\2"+
		"\2\u0145\u013d\3\2\2\2\u0145\u0141\3\2\2\2\u0146(\3\2\2\2\u0147\u0148"+
		"\7d\2\2\u0148\u014d\7t\2\2\u0149\u014a\7d\2\2\u014a\u014b\7t\2\2\u014b"+
		"\u014d\7n\2\2\u014c\u0147\3\2\2\2\u014c\u0149\3\2\2\2\u014d*\3\2\2\2\u014e"+
		"\u014f\7n\2\2\u014f\u0150\7f\2\2\u0150,\3\2\2\2\u0151\u0152\7u\2\2\u0152"+
		"\u0153\7v\2\2\u0153.\3\2\2\2\u0154\u0155\7t\2\2\u0155\u01f3\7\62\2\2\u0156"+
		"\u0157\7x\2\2\u0157\u01f3\7\62\2\2\u0158\u0159\7t\2\2\u0159\u01f3\7\63"+
		"\2\2\u015a\u015b\7x\2\2\u015b\u01f3\7\63\2\2\u015c\u015d\7t\2\2\u015d"+
		"\u01f3\7\64\2\2\u015e\u015f\7c\2\2\u015f\u01f3\7\62\2\2\u0160\u0161\7"+
		"t\2\2\u0161\u01f3\7\65\2\2\u0162\u0163\7c\2\2\u0163\u01f3\7\63\2\2\u0164"+
		"\u0165\7t\2\2\u0165\u01f3\7\66\2\2\u0166\u0167\7c\2\2\u0167\u01f3\7\64"+
		"\2\2\u0168\u0169\7t\2\2\u0169\u01f3\7\67\2\2\u016a\u016b\7c\2\2\u016b"+
		"\u01f3\7\65\2\2\u016c\u016d\7t\2\2\u016d\u01f3\78\2\2\u016e\u016f\7c\2"+
		"\2\u016f\u01f3\7\66\2\2\u0170\u0171\7t\2\2\u0171\u01f3\79\2\2\u0172\u0173"+
		"\7c\2\2\u0173\u01f3\7\67\2\2\u0174\u0175\7t\2\2\u0175\u01f3\7:\2\2\u0176"+
		"\u0177\7c\2\2\u0177\u01f3\78\2\2\u0178\u0179\7t\2\2\u0179\u01f3\7;\2\2"+
		"\u017a\u017b\7c\2\2\u017b\u01f3\79\2\2\u017c\u017d\7t\2\2\u017d\u017e"+
		"\7\63\2\2\u017e\u01f3\7\62\2\2\u017f\u0180\7v\2\2\u0180\u01f3\7\62\2\2"+
		"\u0181\u0182\7t\2\2\u0182\u0183\7\63\2\2\u0183\u01f3\7\63\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u01f3\7\63\2\2\u0186\u0187\7t\2\2\u0187\u0188\7\63\2\2\u0188"+
		"\u01f3\7\64\2\2\u0189\u018a\7v\2\2\u018a\u01f3\7\64\2\2\u018b\u018c\7"+
		"t\2\2\u018c\u018d\7\63\2\2\u018d\u01f3\7\65\2\2\u018e\u018f\7v\2\2\u018f"+
		"\u01f3\7\65\2\2\u0190\u0191\7t\2\2\u0191\u0192\7\63\2\2\u0192\u01f3\7"+
		"\66\2\2\u0193\u0194\7v\2\2\u0194\u01f3\7\66\2\2\u0195\u0196\7t\2\2\u0196"+
		"\u0197\7\63\2\2\u0197\u01f3\7\67\2\2\u0198\u0199\7v\2\2\u0199\u01f3\7"+
		"\67\2\2\u019a\u019b\7t\2\2\u019b\u019c\7\63\2\2\u019c\u01f3\78\2\2\u019d"+
		"\u019e\7v\2\2\u019e\u01f3\78\2\2\u019f\u01a0\7t\2\2\u01a0\u01a1\7\63\2"+
		"\2\u01a1\u01f3\79\2\2\u01a2\u01a3\7v\2\2\u01a3\u01f3\79\2\2\u01a4\u01a5"+
		"\7t\2\2\u01a5\u01a6\7\63\2\2\u01a6\u01f3\7:\2\2\u01a7\u01a8\7v\2\2\u01a8"+
		"\u01f3\7:\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7\63\2\2\u01ab\u01f3\7;\2"+
		"\2\u01ac\u01ad\7v\2\2\u01ad\u01f3\7;\2\2\u01ae\u01af\7t\2\2\u01af\u01b0"+
		"\7\64\2\2\u01b0\u01f3\7\62\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7\63\2\2"+
		"\u01b3\u01f3\7\62\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7\64\2\2\u01b6\u01f3"+
		"\7\63\2\2\u01b7\u01b8\7v\2\2\u01b8\u01b9\7\63\2\2\u01b9\u01f3\7\63\2\2"+
		"\u01ba\u01bb\7t\2\2\u01bb\u01bc\7\64\2\2\u01bc\u01f3\7\64\2\2\u01bd\u01be"+
		"\7v\2\2\u01be\u01bf\7\63\2\2\u01bf\u01f3\7\64\2\2\u01c0\u01c1\7t\2\2\u01c1"+
		"\u01c2\7\64\2\2\u01c2\u01f3\7\65\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7"+
		"\63\2\2\u01c5\u01f3\7\65\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7\64\2\2\u01c8"+
		"\u01f3\7\66\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7\63\2\2\u01cb\u01f3\7"+
		"\66\2\2\u01cc\u01cd\7t\2\2\u01cd\u01ce\7\64\2\2\u01ce\u01f3\7\67\2\2\u01cf"+
		"\u01d0\7v\2\2\u01d0\u01d1\7\63\2\2\u01d1\u01f3\7\67\2\2\u01d2\u01d3\7"+
		"t\2\2\u01d3\u01d4\7\64\2\2\u01d4\u01f3\78\2\2\u01d5\u01d6\7v\2\2\u01d6"+
		"\u01d7\7\63\2\2\u01d7\u01f3\78\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7\64"+
		"\2\2\u01da\u01f3\79\2\2\u01db\u01dc\7v\2\2\u01dc\u01dd\7\63\2\2\u01dd"+
		"\u01f3\79\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7\64\2\2\u01e0\u01f3\7:\2"+
		"\2\u01e1\u01e2\7h\2\2\u01e2\u01f3\7r\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5"+
		"\7\64\2\2\u01e5\u01f3\7;\2\2\u01e6\u01e7\7g\2\2\u01e7\u01f3\7c\2\2\u01e8"+
		"\u01e9\7t\2\2\u01e9\u01ea\7\65\2\2\u01ea\u01f3\7\62\2\2\u01eb\u01ec\7"+
		"t\2\2\u01ec\u01f3\7c\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7\65\2\2\u01ef"+
		"\u01f3\7\63\2\2\u01f0\u01f1\7u\2\2\u01f1\u01f3\7r\2\2\u01f2\u0154\3\2"+
		"\2\2\u01f2\u0156\3\2\2\2\u01f2\u0158\3\2\2\2\u01f2\u015a\3\2\2\2\u01f2"+
		"\u015c\3\2\2\2\u01f2\u015e\3\2\2\2\u01f2\u0160\3\2\2\2\u01f2\u0162\3\2"+
		"\2\2\u01f2\u0164\3\2\2\2\u01f2\u0166\3\2\2\2\u01f2\u0168\3\2\2\2\u01f2"+
		"\u016a\3\2\2\2\u01f2\u016c\3\2\2\2\u01f2\u016e\3\2\2\2\u01f2\u0170\3\2"+
		"\2\2\u01f2\u0172\3\2\2\2\u01f2\u0174\3\2\2\2\u01f2\u0176\3\2\2\2\u01f2"+
		"\u0178\3\2\2\2\u01f2\u017a\3\2\2\2\u01f2\u017c\3\2\2\2\u01f2\u017f\3\2"+
		"\2\2\u01f2\u0181\3\2\2\2\u01f2\u0184\3\2\2\2\u01f2\u0186\3\2\2\2\u01f2"+
		"\u0189\3\2\2\2\u01f2\u018b\3\2\2\2\u01f2\u018e\3\2\2\2\u01f2\u0190\3\2"+
		"\2\2\u01f2\u0193\3\2\2\2\u01f2\u0195\3\2\2\2\u01f2\u0198\3\2\2\2\u01f2"+
		"\u019a\3\2\2\2\u01f2\u019d\3\2\2\2\u01f2\u019f\3\2\2\2\u01f2\u01a2\3\2"+
		"\2\2\u01f2\u01a4\3\2\2\2\u01f2\u01a7\3\2\2\2\u01f2\u01a9\3\2\2\2\u01f2"+
		"\u01ac\3\2\2\2\u01f2\u01ae\3\2\2\2\u01f2\u01b1\3\2\2\2\u01f2\u01b4\3\2"+
		"\2\2\u01f2\u01b7\3\2\2\2\u01f2\u01ba\3\2\2\2\u01f2\u01bd\3\2\2\2\u01f2"+
		"\u01c0\3\2\2\2\u01f2\u01c3\3\2\2\2\u01f2\u01c6\3\2\2\2\u01f2\u01c9\3\2"+
		"\2\2\u01f2\u01cc\3\2\2\2\u01f2\u01cf\3\2\2\2\u01f2\u01d2\3\2\2\2\u01f2"+
		"\u01d5\3\2\2\2\u01f2\u01d8\3\2\2\2\u01f2\u01db\3\2\2\2\u01f2\u01de\3\2"+
		"\2\2\u01f2\u01e1\3\2\2\2\u01f2\u01e3\3\2\2\2\u01f2\u01e6\3\2\2\2\u01f2"+
		"\u01e8\3\2\2\2\u01f2\u01eb\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f3\60\3\2\2\2\u01f4\u01f5\7u\2\2\u01f5\u01f6\7{\2\2\u01f6\u01f7"+
		"\7u\2\2\u01f7\u028b\7\62\2\2\u01f8\u01f9\7u\2\2\u01f9\u01fa\7{\2\2\u01fa"+
		"\u01fb\7u\2\2\u01fb\u028b\7\63\2\2\u01fc\u01fd\7u\2\2\u01fd\u01fe\7{\2"+
		"\2\u01fe\u01ff\7u\2\2\u01ff\u028b\7\64\2\2\u0200\u0201\7u\2\2\u0201\u0202"+
		"\7{\2\2\u0202\u0203\7u\2\2\u0203\u028b\7\65\2\2\u0204\u0205\7u\2\2\u0205"+
		"\u0206\7{\2\2\u0206\u0207\7u\2\2\u0207\u028b\7\66\2\2\u0208\u0209\7u\2"+
		"\2\u0209\u020a\7{\2\2\u020a\u020b\7u\2\2\u020b\u028b\7\67\2\2\u020c\u020d"+
		"\7u\2\2\u020d\u020e\7{\2\2\u020e\u020f\7u\2\2\u020f\u028b\78\2\2\u0210"+
		"\u0211\7u\2\2\u0211\u0212\7{\2\2\u0212\u0213\7u\2\2\u0213\u028b\79\2\2"+
		"\u0214\u0215\7u\2\2\u0215\u0216\7{\2\2\u0216\u0217\7u\2\2\u0217\u028b"+
		"\7:\2\2\u0218\u0219\7u\2\2\u0219\u021a\7{\2\2\u021a\u021b\7u\2\2\u021b"+
		"\u028b\7;\2\2\u021c\u021d\7u\2\2\u021d\u021e\7{\2\2\u021e\u021f\7u\2\2"+
		"\u021f\u0220\7\63\2\2\u0220\u028b\7\62\2\2\u0221\u0222\7u\2\2\u0222\u0223"+
		"\7{\2\2\u0223\u0224\7u\2\2\u0224\u0225\7\63\2\2\u0225\u028b\7\63\2\2\u0226"+
		"\u0227\7u\2\2\u0227\u0228\7{\2\2\u0228\u0229\7u\2\2\u0229\u022a\7\63\2"+
		"\2\u022a\u028b\7\64\2\2\u022b\u022c\7u\2\2\u022c\u022d\7{\2\2\u022d\u022e"+
		"\7u\2\2\u022e\u022f\7\63\2\2\u022f\u028b\7\65\2\2\u0230\u0231\7u\2\2\u0231"+
		"\u0232\7{\2\2\u0232\u0233\7u\2\2\u0233\u0234\7\63\2\2\u0234\u028b\7\66"+
		"\2\2\u0235\u0236\7u\2\2\u0236\u0237\7{\2\2\u0237\u0238\7u\2\2\u0238\u0239"+
		"\7\63\2\2\u0239\u028b\7\67\2\2\u023a\u023b\7u\2\2\u023b\u023c\7{\2\2\u023c"+
		"\u023d\7u\2\2\u023d\u023e\7\63\2\2\u023e\u028b\78\2\2\u023f\u0240\7u\2"+
		"\2\u0240\u0241\7{\2\2\u0241\u0242\7u\2\2\u0242\u0243\7\63\2\2\u0243\u028b"+
		"\79\2\2\u0244\u0245\7u\2\2\u0245\u0246\7{\2\2\u0246\u0247\7u\2\2\u0247"+
		"\u0248\7\63\2\2\u0248\u028b\7:\2\2\u0249\u024a\7u\2\2\u024a\u024b\7{\2"+
		"\2\u024b\u024c\7u\2\2\u024c\u024d\7\63\2\2\u024d\u028b\7;\2\2\u024e\u024f"+
		"\7u\2\2\u024f\u0250\7{\2\2\u0250\u0251\7u\2\2\u0251\u0252\7\64\2\2\u0252"+
		"\u028b\7\62\2\2\u0253\u0254\7u\2\2\u0254\u0255\7{\2\2\u0255\u0256\7u\2"+
		"\2\u0256\u0257\7\64\2\2\u0257\u028b\7\63\2\2\u0258\u0259\7u\2\2\u0259"+
		"\u025a\7{\2\2\u025a\u025b\7u\2\2\u025b\u025c\7\64\2\2\u025c\u028b\7\64"+
		"\2\2\u025d\u025e\7u\2\2\u025e\u025f\7{\2\2\u025f\u0260\7u\2\2\u0260\u0261"+
		"\7\64\2\2\u0261\u028b\7\65\2\2\u0262\u0263\7u\2\2\u0263\u0264\7{\2\2\u0264"+
		"\u0265\7u\2\2\u0265\u0266\7\64\2\2\u0266\u028b\7\66\2\2\u0267\u0268\7"+
		"u\2\2\u0268\u0269\7{\2\2\u0269\u026a\7u\2\2\u026a\u026b\7\64\2\2\u026b"+
		"\u028b\7\67\2\2\u026c\u026d\7u\2\2\u026d\u026e\7{\2\2\u026e\u026f\7u\2"+
		"\2\u026f\u0270\7\64\2\2\u0270\u028b\78\2\2\u0271\u0272\7u\2\2\u0272\u0273"+
		"\7{\2\2\u0273\u0274\7u\2\2\u0274\u0275\7\64\2\2\u0275\u028b\79\2\2\u0276"+
		"\u0277\7u\2\2\u0277\u0278\7{\2\2\u0278\u0279\7u\2\2\u0279\u027a\7\64\2"+
		"\2\u027a\u028b\7:\2\2\u027b\u027c\7u\2\2\u027c\u027d\7{\2\2\u027d\u027e"+
		"\7u\2\2\u027e\u027f\7\64\2\2\u027f\u028b\7;\2\2\u0280\u0281\7u\2\2\u0281"+
		"\u0282\7{\2\2\u0282\u0283\7u\2\2\u0283\u0284\7\65\2\2\u0284\u028b\7\62"+
		"\2\2\u0285\u0286\7u\2\2\u0286\u0287\7{\2\2\u0287\u0288\7u\2\2\u0288\u0289"+
		"\7\65\2\2\u0289\u028b\7\63\2\2\u028a\u01f4\3\2\2\2\u028a\u01f8\3\2\2\2"+
		"\u028a\u01fc\3\2\2\2\u028a\u0200\3\2\2\2\u028a\u0204\3\2\2\2\u028a\u0208"+
		"\3\2\2\2\u028a\u020c\3\2\2\2\u028a\u0210\3\2\2\2\u028a\u0214\3\2\2\2\u028a"+
		"\u0218\3\2\2\2\u028a\u021c\3\2\2\2\u028a\u0221\3\2\2\2\u028a\u0226\3\2"+
		"\2\2\u028a\u022b\3\2\2\2\u028a\u0230\3\2\2\2\u028a\u0235\3\2\2\2\u028a"+
		"\u023a\3\2\2\2\u028a\u023f\3\2\2\2\u028a\u0244\3\2\2\2\u028a\u0249\3\2"+
		"\2\2\u028a\u024e\3\2\2\2\u028a\u0253\3\2\2\2\u028a\u0258\3\2\2\2\u028a"+
		"\u025d\3\2\2\2\u028a\u0262\3\2\2\2\u028a\u0267\3\2\2\2\u028a\u026c\3\2"+
		"\2\2\u028a\u0271\3\2\2\2\u028a\u0276\3\2\2\2\u028a\u027b\3\2\2\2\u028a"+
		"\u0280\3\2\2\2\u028a\u0285\3\2\2\2\u028b\62\3\2\2\2\u028c\u028d\7d\2\2"+
		"\u028d\u028e\7{\2\2\u028e\u028f\7v\2\2\u028f\u02ae\7g\2\2\u0290\u0291"+
		"\7w\2\2\u0291\u0292\7d\2\2\u0292\u0293\7{\2\2\u0293\u0294\7v\2\2\u0294"+
		"\u02ae\7g\2\2\u0295\u0296\7u\2\2\u0296\u0297\7d\2\2\u0297\u0298\7{\2\2"+
		"\u0298\u0299\7v\2\2\u0299\u02ae\7g\2\2\u029a\u029b\7y\2\2\u029b\u029c"+
		"\7q\2\2\u029c\u029d\7t\2\2\u029d\u02ae\7f\2\2\u029e\u029f\7w\2\2\u029f"+
		"\u02a0\7y\2\2\u02a0\u02a1\7q\2\2\u02a1\u02a2\7t\2\2\u02a2\u02ae\7f\2\2"+
		"\u02a3\u02a4\7u\2\2\u02a4\u02a5\7y\2\2\u02a5\u02a6\7q\2\2\u02a6\u02a7"+
		"\7t\2\2\u02a7\u02ae\7f\2\2\u02a8\u02a9\7f\2\2\u02a9\u02aa\7y\2\2\u02aa"+
		"\u02ab\7q\2\2\u02ab\u02ac\7t\2\2\u02ac\u02ae\7f\2\2\u02ad\u028c\3\2\2"+
		"\2\u02ad\u0290\3\2\2\2\u02ad\u0295\3\2\2\2\u02ad\u029a\3\2\2\2\u02ad\u029e"+
		"\3\2\2\2\u02ad\u02a3\3\2\2\2\u02ad\u02a8\3\2\2\2\u02ae\64\3\2\2\2\u02af"+
		"\u02b0\7r\2\2\u02b0\u02b1\7t\2\2\u02b1\u02b7\7g\2\2\u02b2\u02b3\7r\2\2"+
		"\u02b3\u02b4\7q\2\2\u02b4\u02b5\7u\2\2\u02b5\u02b7\7v\2\2\u02b6\u02af"+
		"\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b7\66\3\2\2\2\u02b8\u02b9\7w\2\2\u02b9"+
		"\u02ba\7p\2\2\u02ba\u02e3\7e\2\2\u02bb\u02bc\7|\2\2\u02bc\u02e3\7t\2\2"+
		"\u02bd\u02be\7?\2\2\u02be\u02e3\7?\2\2\u02bf\u02c0\7#\2\2\u02c0\u02c1"+
		"\7|\2\2\u02c1\u02e3\7t\2\2\u02c2\u02c3\7#\2\2\u02c3\u02e3\7?\2\2\u02c4"+
		"\u02c5\7e\2\2\u02c5\u02e3\7t\2\2\u02c6\u02c7\7@\2\2\u02c7\u02c8\7?\2\2"+
		"\u02c8\u02e3\7w\2\2\u02c9\u02ca\7#\2\2\u02ca\u02cb\7e\2\2\u02cb\u02e3"+
		"\7t\2\2\u02cc\u02cd\7>\2\2\u02cd\u02e3\7w\2\2\u02ce\u02cf\7q\2\2\u02cf"+
		"\u02e3\7x\2\2\u02d0\u02d1\7#\2\2\u02d1\u02d2\7q\2\2\u02d2\u02e3\7x\2\2"+
		"\u02d3\u02d4\7p\2\2\u02d4\u02e3\7i\2\2\u02d5\u02d6\7#\2\2\u02d6\u02d7"+
		"\7p\2\2\u02d7\u02e3\7i\2\2\u02d8\u02d9\7@\2\2\u02d9\u02e3\7w\2\2\u02da"+
		"\u02db\7>\2\2\u02db\u02dc\7?\2\2\u02dc\u02e3\7w\2\2\u02dd\u02e3\t\2\2"+
		"\2\u02de\u02df\7@\2\2\u02df\u02e3\7?\2\2\u02e0\u02e1\7>\2\2\u02e1\u02e3"+
		"\7?\2\2\u02e2\u02b8\3\2\2\2\u02e2\u02bb\3\2\2\2\u02e2\u02bd\3\2\2\2\u02e2"+
		"\u02bf\3\2\2\2\u02e2\u02c2\3\2\2\2\u02e2\u02c4\3\2\2\2\u02e2\u02c6\3\2"+
		"\2\2\u02e2\u02c9\3\2\2\2\u02e2\u02cc\3\2\2\2\u02e2\u02ce\3\2\2\2\u02e2"+
		"\u02d0\3\2\2\2\u02e2\u02d3\3\2\2\2\u02e2\u02d5\3\2\2\2\u02e2\u02d8\3\2"+
		"\2\2\u02e2\u02da\3\2\2\2\u02e2\u02dd\3\2\2\2\u02e2\u02de\3\2\2\2\u02e2"+
		"\u02e0\3\2\2\2\u02e38\3\2\2\2\u02e4\u02e5\5;\36\2\u02e5\u02e6\7<\2\2\u02e6"+
		":\3\2\2\2\u02e7\u02e9\t\3\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2"+
		"\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ef\3\2\2\2\u02ec\u02ee"+
		"\t\4\2\2\u02ed\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0<\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f4\t\5\2\2"+
		"\u02f3\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6>\3\2\2\2\u02f7\u02f9\t\5\2\2\u02f8\u02f7\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02ff\3\2"+
		"\2\2\u02fc\u02fe\t\6\2\2\u02fd\u02fc\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2"+
		"\2\2\u0302\u0303\7j\2\2\u0303@\3\2\2\2\u0304\u0306\t\7\2\2\u0305\u0304"+
		"\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030a\7d\2\2\u030aB\3\2\2\2\u030b\u030c\7-\2\2\u030c"+
		"D\3\2\2\2\u030d\u030e\7/\2\2\u030eF\3\2\2\2\u030f\u0310\7\u0080\2\2\u0310"+
		"H\3\2\2\2\u0311\u0312\7,\2\2\u0312J\3\2\2\2\u0313\u0314\7\61\2\2\u0314"+
		"L\3\2\2\2\u0315\u0316\7\'\2\2\u0316N\3\2\2\2\u0317\u0318\7>\2\2\u0318"+
		"\u0319\7>\2\2\u0319P\3\2\2\2\u031a\u031b\7@\2\2\u031b\u031c\7@\2\2\u031c"+
		"R\3\2\2\2\u031d\u031e\7@\2\2\u031e\u031f\7@\2\2\u031f\u0320\7@\2\2\u0320"+
		"T\3\2\2\2\u0321\u0322\7(\2\2\u0322V\3\2\2\2\u0323\u0324\7`\2\2\u0324X"+
		"\3\2\2\2\u0325\u0326\7~\2\2\u0326Z\3\2\2\2\u0327\u0328\7.\2\2\u0328\\"+
		"\3\2\2\2\u0329\u032a\7]\2\2\u032a^\3\2\2\2\u032b\u032c\7_\2\2\u032c`\3"+
		"\2\2\2\u032d\u032e\7?\2\2\u032eb\3\2\2\2\u032f\u0330\7*\2\2\u0330d\3\2"+
		"\2\2\u0331\u0332\7+\2\2\u0332f\3\2\2\2\u0333\u0335\7\17\2\2\u0334\u0333"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7\f\2\2\u0337"+
		"h\3\2\2\2\u0338\u0339\7)\2\2\u0339\u033a\13\2\2\2\u033a\u033b\7)\2\2\u033b"+
		"j\3\2\2\2\u033c\u033e\7$\2\2\u033d\u033f\n\b\2\2\u033e\u033d\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0343\7$\2\2\u0343l\3\2\2\2\u0344\u0345\7\61\2\2\u0345\u0346"+
		"\7\61\2\2\u0346\u034a\3\2\2\2\u0347\u0349\n\t\2\2\u0348\u0347\3\2\2\2"+
		"\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d"+
		"\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\b\67\2\2\u034en\3\2\2\2\u034f"+
		"\u0350\7\61\2\2\u0350\u0351\7,\2\2\u0351\u0356\3\2\2\2\u0352\u0355\5o"+
		"8\2\u0353\u0355\13\2\2\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355"+
		"\u0358\3\2\2\2\u0356\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0359\3\2"+
		"\2\2\u0358\u0356\3\2\2\2\u0359\u035a\7,\2\2\u035a\u035b\7\61\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035d\b8\2\2\u035dp\3\2\2\2\u035e\u0360\t\n\2\2\u035f"+
		"\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2"+
		"\2\2\u0362\u0363\3\2\2\2\u0363\u0364\b9\3\2\u0364r\3\2\2\2\u0365\u0366"+
		"\7\2\2\3\u0366t\3\2\2\2\32\2\u00c3\u00cd\u00f0\u012f\u0145\u014c\u01f2"+
		"\u028a\u02ad\u02b6\u02e2\u02ea\u02ef\u02f5\u02fa\u02ff\u0307\u0334\u0340"+
		"\u034a\u0354\u0356\u0361\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}