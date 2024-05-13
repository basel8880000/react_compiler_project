// Generated from C:/Users/2020/IdeaProjects/react-complier/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, OPEN_SQUAREBRACKET=2, CLOSE_SQUAREBRACKET=3, OPEN_CURLYBRACES=4, 
		CLOSE_CURLYBRACES=5, IMPORT=6, FROM=7, CONST=8, EXPORT=9, DEFAULT=10, 
		LET=11, VAR=12, USESTATE=13, BOOLEAN=14, React=15, OPEN_PARENTHESIS=16, 
		STARTFUN=17, CLOSE_PARENTHESIS=18, EQUAL=19, COMMA=20, DOT=21, ARROW=22, 
		SEMICOLON=23, ADD=24, MULT=25, DIV=26, SUB=27, ELSE=28, IF=29, GREATERTHAN=30, 
		SMALLERTHAN=31, NUMBER=32, STRING=33, COMMENT=34, WS=35, IMG=36, ANCHOR=37, 
		NORMALELEMENT=38, FUNCTION=39, RETURN=40, COMMENT1=41, WS1=42, React_OPENCURLY=43, 
		COMMENT5=44, WS5=45, ONCLICKr=46, STYLEr=47, SRCr=48, HREFr=49, CLASSNAMEr=50, 
		COMMENT6=51, WS6=52, SELFCLOSETAG=53, ONCLICK=54, KEY=55, STYLE=56, SRC=57, 
		ALT=58, HREF=59, CLASSNAME=60, CLOSETAG=61, COMMENT2=62, WS2=63, CONTENT=64, 
		MAP=65, COMMENT4=66, WS4=67, ISEQUAL=68, SOE=69, GOE=70, COMMENT3=71, 
		WS3=72, ID=73;
	public static final int
		RULE_prog = 0, RULE_useStateDecl = 1, RULE_useStateVal = 2, RULE_assign = 3, 
		RULE_exp = 4, RULE_num = 5, RULE_decl = 6, RULE_val = 7, RULE_pureReact = 8, 
		RULE_reactElelment = 9, RULE_attributeR = 10, RULE_valObjList = 11, RULE_ifState = 12, 
		RULE_else = 13, RULE_condition = 14, RULE_obj = 15, RULE_varObj = 16, 
		RULE_list = 17, RULE_varlist = 18, RULE_jsx = 19, RULE_element = 20, RULE_emptyElement = 21, 
		RULE_normalElement = 22, RULE_content = 23, RULE_attribute = 24, RULE_css = 25, 
		RULE_jsxExp = 26, RULE_map = 27, RULE_imgElement = 28, RULE_component = 29, 
		RULE_comAttribute = 30, RULE_imp = 31, RULE_varimp = 32, RULE_fun = 33, 
		RULE_param = 34, RULE_funBody = 35, RULE_return = 36, RULE_export = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "useStateDecl", "useStateVal", "assign", "exp", "num", "decl", 
			"val", "pureReact", "reactElelment", "attributeR", "valObjList", "ifState", 
			"else", "condition", "obj", "varObj", "list", "varlist", "jsx", "element", 
			"emptyElement", "normalElement", "content", "attribute", "css", "jsxExp", 
			"map", "imgElement", "component", "comAttribute", "imp", "varimp", "fun", 
			"param", "funBody", "return", "export"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "']'", "'{'", "'}'", "'import'", "'from'", "'const'", 
			"'export'", "'default'", "'let'", "'var'", null, null, "'React.createElement'", 
			"'('", null, "')'", "'='", "','", "'.'", "'=>'", "';'", "'+'", "'*'", 
			"'/'", "'-'", "'else'", "'if'", "'>'", "'<'", null, null, null, null, 
			"'img'", "'a'", null, "'function'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'/>'", null, "'key'", null, 
			null, "'alt'", null, null, "'</'", null, null, null, "'map'", null, null, 
			"'=='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "OPEN_SQUAREBRACKET", "CLOSE_SQUAREBRACKET", "OPEN_CURLYBRACES", 
			"CLOSE_CURLYBRACES", "IMPORT", "FROM", "CONST", "EXPORT", "DEFAULT", 
			"LET", "VAR", "USESTATE", "BOOLEAN", "React", "OPEN_PARENTHESIS", "STARTFUN", 
			"CLOSE_PARENTHESIS", "EQUAL", "COMMA", "DOT", "ARROW", "SEMICOLON", "ADD", 
			"MULT", "DIV", "SUB", "ELSE", "IF", "GREATERTHAN", "SMALLERTHAN", "NUMBER", 
			"STRING", "COMMENT", "WS", "IMG", "ANCHOR", "NORMALELEMENT", "FUNCTION", 
			"RETURN", "COMMENT1", "WS1", "React_OPENCURLY", "COMMENT5", "WS5", "ONCLICKr", 
			"STYLEr", "SRCr", "HREFr", "CLASSNAMEr", "COMMENT6", "WS6", "SELFCLOSETAG", 
			"ONCLICK", "KEY", "STYLE", "SRC", "ALT", "HREF", "CLASSNAME", "CLOSETAG", 
			"COMMENT2", "WS2", "CONTENT", "MAP", "COMMENT4", "WS4", "ISEQUAL", "SOE", 
			"GOE", "COMMENT3", "WS3", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<ImpContext> imp() {
			return getRuleContexts(ImpContext.class);
		}
		public ImpContext imp(int i) {
			return getRuleContext(ImpContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<IfStateContext> ifState() {
			return getRuleContexts(IfStateContext.class);
		}
		public IfStateContext ifState(int i) {
			return getRuleContext(IfStateContext.class,i);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(76);
						imp();
						}
						break;
					case 2:
						{
						setState(77);
						decl();
						}
						break;
					case 3:
						{
						setState(78);
						assign();
						}
						break;
					case 4:
						{
						setState(79);
						ifState();
						}
						break;
					case 5:
						{
						setState(80);
						fun();
						}
						break;
					case 6:
						{
						setState(81);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(87);
				export();
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(90);
				match(SEMICOLON);
				}
			}

			setState(93);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateDeclContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(ReactParser.OPEN_SQUAREBRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(ReactParser.CLOSE_SQUAREBRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public UseStateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseStateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseStateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseStateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateDeclContext useStateDecl() throws RecognitionException {
		UseStateDeclContext _localctx = new UseStateDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_useStateDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6400L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
			match(OPEN_SQUAREBRACKET);
			setState(97);
			match(ID);
			setState(98);
			match(COMMA);
			setState(99);
			match(ID);
			setState(100);
			match(CLOSE_SQUAREBRACKET);
			setState(101);
			match(EQUAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateValContext extends ParserRuleContext {
		public TerminalNode USESTATE() { return getToken(ReactParser.USESTATE, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(ReactParser.CLOSE_PARENTHESIS, 0); }
		public UseStateValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStateVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseStateVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseStateVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseStateVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateValContext useStateVal() throws RecognitionException {
		UseStateValContext _localctx = new UseStateValContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_useStateVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(USESTATE);
			setState(104);
			val();
			setState(105);
			match(CLOSE_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(EQUAL);
			setState(109);
			val();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULT() { return getToken(ReactParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(ReactParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(ReactParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ReactParser.SUB, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NUMBER:
				{
				setState(112);
				num();
				}
				break;
			case ID:
				{
				setState(113);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						match(MULT);
						setState(118);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
						match(DIV);
						setState(121);
						exp(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						match(ADD);
						setState(124);
						exp(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						match(SUB);
						setState(127);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(ReactParser.SUB, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(133);
				match(SUB);
				}
			}

			setState(136);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public UseStateDeclContext useStateDecl() {
			return getRuleContext(UseStateDeclContext.class,0);
		}
		public UseStateValContext useStateVal() {
			return getRuleContext(UseStateValContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(CONST);
				setState(139);
				match(ID);
				setState(140);
				match(EQUAL);
				setState(141);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				match(ID);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(144);
					match(EQUAL);
					setState(145);
					val();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				useStateDecl();
				setState(149);
				useStateVal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(ReactParser.BOOLEAN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ValObjListContext valObjList() {
			return getRuleContext(ValObjListContext.class,0);
		}
		public PureReactContext pureReact() {
			return getRuleContext(PureReactContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_val);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				exp(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				jsx();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				obj();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				valObjList();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				pureReact();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PureReactContext extends ParserRuleContext {
		public TerminalNode React() { return getToken(ReactParser.React, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(ReactParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(ReactParser.CLOSE_SQUAREBRACKET, 0); }
		public List<ReactElelmentContext> reactElelment() {
			return getRuleContexts(ReactElelmentContext.class);
		}
		public ReactElelmentContext reactElelment(int i) {
			return getRuleContext(ReactElelmentContext.class,i);
		}
		public PureReactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureReact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPureReact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPureReact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPureReact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureReactContext pureReact() throws RecognitionException {
		PureReactContext _localctx = new PureReactContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pureReact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(React);
			setState(165);
			match(OPEN_PARENTHESIS);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(166);
				reactElelment();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(CLOSE_SQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReactElelmentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public TerminalNode CLOSE_CURLYBRACES() { return getToken(ReactParser.CLOSE_CURLYBRACES, 0); }
		public List<AttributeRContext> attributeR() {
			return getRuleContexts(AttributeRContext.class);
		}
		public AttributeRContext attributeR(int i) {
			return getRuleContext(AttributeRContext.class,i);
		}
		public ReactElelmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactElelment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReactElelment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReactElelment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReactElelment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReactElelmentContext reactElelment() throws RecognitionException {
		ReactElelmentContext _localctx = new ReactElelmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reactElelment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(STRING);
			setState(175);
			match(COMMA);
			setState(176);
			match(OPEN_CURLYBRACES);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1423137550968553472L) != 0)) {
				{
				{
				setState(177);
				attributeR();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(CLOSE_CURLYBRACES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeRContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode SRC() { return getToken(ReactParser.SRC, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode CLOSE_CURLYBRACES() { return getToken(ReactParser.CLOSE_CURLYBRACES, 0); }
		public TerminalNode IMG() { return getToken(ReactParser.IMG, 0); }
		public AttributeRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttributeR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttributeR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttributeR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeRContext attributeR() throws RecognitionException {
		AttributeRContext _localctx = new AttributeRContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeR);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONCLICK:
			case KEY:
			case STYLE:
			case CLASSNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				attribute();
				}
				break;
			case SRC:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(SRC);
				setState(187);
				match(EQUAL);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(188);
					match(OPEN_CURLYBRACES);
					setState(189);
					val();
					setState(190);
					match(CLOSE_CURLYBRACES);
					}
					break;
				case 2:
					{
					setState(192);
					val();
					}
					break;
				}
				}
				break;
			case IMG:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(IMG);
				setState(196);
				match(EQUAL);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(197);
					match(OPEN_CURLYBRACES);
					setState(198);
					val();
					setState(199);
					match(CLOSE_CURLYBRACES);
					}
					break;
				case 2:
					{
					setState(201);
					val();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValObjListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(ReactParser.OPEN_SQUAREBRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(ReactParser.CLOSE_SQUAREBRACKET, 0); }
		public ValObjListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valObjList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterValObjList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitValObjList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitValObjList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValObjListContext valObjList() throws RecognitionException {
		ValObjListContext _localctx = new ValObjListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valObjList);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ID);
				setState(207);
				match(DOT);
				setState(208);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(ID);
				setState(210);
				match(OPEN_SQUAREBRACKET);
				setState(211);
				exp(0);
				setState(212);
				match(CLOSE_SQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStateContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReactParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(ReactParser.OPEN_PARENTHESIS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(ReactParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public IfStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStateContext ifState() throws RecognitionException {
		IfStateContext _localctx = new IfStateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(IF);
			setState(217);
			match(OPEN_PARENTHESIS);
			setState(218);
			condition();
			setState(219);
			match(CLOSE_PARENTHESIS);
			{
			setState(220);
			match(OPEN_CURLYBRACES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ReactParser.ELSE, 0); }
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ELSE);
			{
			setState(223);
			match(OPEN_CURLYBRACES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode ISEQUAL() { return getToken(ReactParser.ISEQUAL, 0); }
		public TerminalNode SOE() { return getToken(ReactParser.SOE, 0); }
		public TerminalNode GOE() { return getToken(ReactParser.GOE, 0); }
		public TerminalNode BOOLEAN() { return getToken(ReactParser.BOOLEAN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				val();
				setState(226);
				match(ISEQUAL);
				setState(227);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				val();
				setState(230);
				match(SOE);
				setState(231);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				val();
				setState(234);
				match(GOE);
				setState(235);
				val();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(BOOLEAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public TerminalNode CLOSE_CURLYBRACES() { return getToken(ReactParser.CLOSE_CURLYBRACES, 0); }
		public VarObjContext varObj() {
			return getRuleContext(VarObjContext.class,0);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OPEN_CURLYBRACES);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(241);
				varObj();
				}
			}

			setState(244);
			match(CLOSE_CURLYBRACES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarObjContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public VarObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVarObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVarObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVarObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarObjContext varObj() throws RecognitionException {
		VarObjContext _localctx = new VarObjContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(246);
				match(ID);
				setState(247);
				match(COLON);
				setState(248);
				val();
				}
				break;
			case 2:
				{
				setState(249);
				match(ID);
				}
				break;
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(252);
					match(COMMA);
					setState(253);
					match(ID);
					setState(254);
					match(COLON);
					setState(255);
					val();
					}
					break;
				case 2:
					{
					setState(256);
					match(COMMA);
					setState(257);
					match(ID);
					}
					break;
				}
				}
				setState(262);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(ReactParser.OPEN_SQUAREBRACKET, 0); }
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(ReactParser.CLOSE_SQUAREBRACKET, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(OPEN_SQUAREBRACKET);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15166652436L) != 0) || _la==ID) {
				{
				setState(264);
				varlist();
				}
			}

			setState(267);
			match(CLOSE_SQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			val();
			}
			{
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(COMMA);
					setState(271);
					val();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(277);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public JsxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContext jsx() throws RecognitionException {
		JsxContext _localctx = new JsxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jsx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ImgElementContext imgElement() {
			return getRuleContext(ImgElementContext.class,0);
		}
		public NormalElementContext normalElement() {
			return getRuleContext(NormalElementContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public EmptyElementContext emptyElement() {
			return getRuleContext(EmptyElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_element);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				imgElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				normalElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				component();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				emptyElement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyElementContext extends ParserRuleContext {
		public TerminalNode SMALLERTHAN() { return getToken(ReactParser.SMALLERTHAN, 0); }
		public List<TerminalNode> GREATERTHAN() { return getTokens(ReactParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(ReactParser.GREATERTHAN, i);
		}
		public TerminalNode CLOSETAG() { return getToken(ReactParser.CLOSETAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public EmptyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEmptyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEmptyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEmptyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyElementContext emptyElement() throws RecognitionException {
		EmptyElementContext _localctx = new EmptyElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_emptyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(SMALLERTHAN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1279022294173220864L) != 0)) {
				{
				{
				setState(289);
				attribute();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(GREATERTHAN);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 1152921504741064705L) != 0)) {
				{
				{
				setState(296);
				content();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(CLOSETAG);
			setState(303);
			match(GREATERTHAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ParserRuleContext {
		public TerminalNode SMALLERTHAN() { return getToken(ReactParser.SMALLERTHAN, 0); }
		public List<TerminalNode> NORMALELEMENT() { return getTokens(ReactParser.NORMALELEMENT); }
		public TerminalNode NORMALELEMENT(int i) {
			return getToken(ReactParser.NORMALELEMENT, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(ReactParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(ReactParser.GREATERTHAN, i);
		}
		public TerminalNode CLOSETAG() { return getToken(ReactParser.CLOSETAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_normalElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(SMALLERTHAN);
			setState(306);
			match(NORMALELEMENT);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1279022294173220864L) != 0)) {
				{
				{
				setState(307);
				attribute();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(GREATERTHAN);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 1152921504741064705L) != 0)) {
				{
				{
				setState(314);
				content();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(CLOSETAG);
			setState(321);
			match(NORMALELEMENT);
			setState(322);
			match(GREATERTHAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public TerminalNode CONTENT() { return getToken(ReactParser.CONTENT, 0); }
		public JsxExpContext jsxExp() {
			return getRuleContext(JsxExpContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTENT:
				{
				setState(324);
				match(CONTENT);
				}
				break;
			case OPEN_CURLYBRACES:
				{
				setState(325);
				jsxExp();
				}
				break;
			case SMALLERTHAN:
				{
				setState(326);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public List<TerminalNode> OPEN_CURLYBRACES() { return getTokens(ReactParser.OPEN_CURLYBRACES); }
		public TerminalNode OPEN_CURLYBRACES(int i) {
			return getToken(ReactParser.OPEN_CURLYBRACES, i);
		}
		public List<TerminalNode> CLOSE_CURLYBRACES() { return getTokens(ReactParser.CLOSE_CURLYBRACES); }
		public TerminalNode CLOSE_CURLYBRACES(int i) {
			return getToken(ReactParser.CLOSE_CURLYBRACES, i);
		}
		public TerminalNode CLASSNAME() { return getToken(ReactParser.CLASSNAME, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode STYLE() { return getToken(ReactParser.STYLE, 0); }
		public TerminalNode KEY() { return getToken(ReactParser.KEY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(ReactParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(ReactParser.CLOSE_PARENTHESIS, 0); }
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONCLICK:
				{
				setState(329);
				match(ONCLICK);
				setState(330);
				match(EQUAL);
				setState(331);
				match(OPEN_CURLYBRACES);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(332);
					val();
					}
					break;
				case 2:
					{
					setState(333);
					match(ID);
					setState(334);
					match(OPEN_PARENTHESIS);
					setState(335);
					val();
					setState(336);
					match(CLOSE_PARENTHESIS);
					}
					break;
				}
				setState(340);
				match(CLOSE_CURLYBRACES);
				}
				break;
			case CLASSNAME:
				{
				setState(342);
				match(CLASSNAME);
				setState(343);
				match(EQUAL);
				setState(344);
				val();
				}
				break;
			case STYLE:
				{
				setState(345);
				match(STYLE);
				setState(346);
				match(EQUAL);
				setState(347);
				match(OPEN_CURLYBRACES);
				setState(348);
				match(OPEN_CURLYBRACES);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(349);
					css();
					}
				}

				setState(352);
				match(CLOSE_CURLYBRACES);
				setState(353);
				match(CLOSE_CURLYBRACES);
				}
				break;
			case KEY:
				{
				setState(354);
				match(KEY);
				setState(355);
				match(EQUAL);
				setState(356);
				match(OPEN_CURLYBRACES);
				setState(357);
				val();
				setState(358);
				match(CLOSE_CURLYBRACES);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(ID);
			setState(363);
			match(COLON);
			setState(364);
			val();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				match(ID);
				setState(367);
				match(COLON);
				setState(368);
				val();
				}
				}
				setState(373);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxExpContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public TerminalNode CLOSE_CURLYBRACES() { return getToken(ReactParser.CLOSE_CURLYBRACES, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public JsxExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxExpContext jsxExp() throws RecognitionException {
		JsxExpContext _localctx = new JsxExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jsxExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(OPEN_CURLYBRACES);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(375);
				map();
				}
				break;
			case 2:
				{
				setState(376);
				val();
				}
				break;
			}
			setState(379);
			match(CLOSE_CURLYBRACES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode MAP() { return getToken(ReactParser.MAP, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(ReactParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(ReactParser.CLOSE_PARENTHESIS, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ID);
			setState(382);
			match(DOT);
			setState(383);
			match(MAP);
			setState(384);
			match(OPEN_PARENTHESIS);
			setState(385);
			match(ID);
			setState(386);
			match(ARROW);
			setState(387);
			jsx();
			setState(388);
			match(CLOSE_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImgElementContext extends ParserRuleContext {
		public TerminalNode SMALLERTHAN() { return getToken(ReactParser.SMALLERTHAN, 0); }
		public TerminalNode IMG() { return getToken(ReactParser.IMG, 0); }
		public TerminalNode SELFCLOSETAG() { return getToken(ReactParser.SELFCLOSETAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ReactParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ReactParser.EQUAL, i);
		}
		public List<TerminalNode> SRC() { return getTokens(ReactParser.SRC); }
		public TerminalNode SRC(int i) {
			return getToken(ReactParser.SRC, i);
		}
		public List<TerminalNode> ALT() { return getTokens(ReactParser.ALT); }
		public TerminalNode ALT(int i) {
			return getToken(ReactParser.ALT, i);
		}
		public List<TerminalNode> OPEN_CURLYBRACES() { return getTokens(ReactParser.OPEN_CURLYBRACES); }
		public TerminalNode OPEN_CURLYBRACES(int i) {
			return getToken(ReactParser.OPEN_CURLYBRACES, i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> CLOSE_CURLYBRACES() { return getTokens(ReactParser.CLOSE_CURLYBRACES); }
		public TerminalNode CLOSE_CURLYBRACES(int i) {
			return getToken(ReactParser.CLOSE_CURLYBRACES, i);
		}
		public ImgElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImgElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImgElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImgElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElementContext imgElement() throws RecognitionException {
		ImgElementContext _localctx = new ImgElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_imgElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(SMALLERTHAN);
			setState(391);
			match(IMG);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1711367858400788480L) != 0)) {
				{
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONCLICK:
				case KEY:
				case STYLE:
				case CLASSNAME:
					{
					setState(392);
					attribute();
					}
					break;
				case SRC:
				case ALT:
					{
					setState(393);
					_la = _input.LA(1);
					if ( !(_la==SRC || _la==ALT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(394);
					match(EQUAL);
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(395);
						match(OPEN_CURLYBRACES);
						setState(396);
						val();
						setState(397);
						match(CLOSE_CURLYBRACES);
						}
						break;
					case 2:
						{
						setState(399);
						val();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(SELFCLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode SMALLERTHAN() { return getToken(ReactParser.SMALLERTHAN, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode SELFCLOSETAG() { return getToken(ReactParser.SELFCLOSETAG, 0); }
		public List<ComAttributeContext> comAttribute() {
			return getRuleContexts(ComAttributeContext.class);
		}
		public ComAttributeContext comAttribute(int i) {
			return getRuleContext(ComAttributeContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(SMALLERTHAN);
			setState(410);
			match(ID);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(411);
				comAttribute();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(SELFCLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode CLOSE_CURLYBRACES() { return getToken(ReactParser.CLOSE_CURLYBRACES, 0); }
		public ComAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComAttributeContext comAttribute() throws RecognitionException {
		ComAttributeContext _localctx = new ComAttributeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(ID);
			setState(420);
			match(EQUAL);
			setState(421);
			match(OPEN_CURLYBRACES);
			setState(422);
			val();
			setState(423);
			match(CLOSE_CURLYBRACES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImpContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public VarimpContext varimp() {
			return getRuleContext(VarimpContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_imp);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(IMPORT);
				setState(426);
				varimp();
				setState(427);
				match(FROM);
				{
				setState(428);
				match(STRING);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(IMPORT);
				{
				setState(431);
				match(STRING);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarimpContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_CURLYBRACES() { return getTokens(ReactParser.OPEN_CURLYBRACES); }
		public TerminalNode OPEN_CURLYBRACES(int i) {
			return getToken(ReactParser.OPEN_CURLYBRACES, i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> CLOSE_CURLYBRACES() { return getTokens(ReactParser.CLOSE_CURLYBRACES); }
		public TerminalNode CLOSE_CURLYBRACES(int i) {
			return getToken(ReactParser.CLOSE_CURLYBRACES, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public VarimpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varimp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVarimp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVarimp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVarimp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarimpContext varimp() throws RecognitionException {
		VarimpContext _localctx = new VarimpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_varimp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLYBRACES:
				{
				setState(434);
				match(OPEN_CURLYBRACES);
				setState(435);
				match(ID);
				setState(436);
				match(CLOSE_CURLYBRACES);
				}
				break;
			case ID:
				{
				setState(437);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(440);
					match(COMMA);
					setState(441);
					match(OPEN_CURLYBRACES);
					setState(442);
					match(ID);
					setState(443);
					match(CLOSE_CURLYBRACES);
					}
					break;
				case 2:
					{
					setState(444);
					match(COMMA);
					setState(445);
					match(ID);
					}
					break;
				}
				}
				setState(450);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode STARTFUN() { return getToken(ReactParser.STARTFUN, 0); }
		public FunBodyContext funBody() {
			return getRuleContext(FunBodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLYBRACES() { return getToken(ReactParser.CLOSE_CURLYBRACES, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OPEN_CURLYBRACES() { return getToken(ReactParser.OPEN_CURLYBRACES, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fun);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(FUNCTION);
				setState(452);
				match(ID);
				setState(453);
				param();
				setState(454);
				match(STARTFUN);
				setState(455);
				funBody();
				setState(456);
				match(CLOSE_CURLYBRACES);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(CONST);
				setState(459);
				match(ID);
				setState(460);
				match(EQUAL);
				setState(461);
				param();
				setState(462);
				match(ARROW);
				setState(463);
				match(OPEN_CURLYBRACES);
				setState(464);
				funBody();
				setState(465);
				match(CLOSE_CURLYBRACES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(ReactParser.OPEN_PARENTHESIS, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(OPEN_PARENTHESIS);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(470);
				match(ID);
				}
			}

			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(473);
				match(COMMA);
				setState(474);
				match(ID);
				}
				}
				setState(479);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunBodyContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<ReturnContext> return_() {
			return getRuleContexts(ReturnContext.class);
		}
		public ReturnContext return_(int i) {
			return getRuleContext(ReturnContext.class,i);
		}
		public List<IfStateContext> ifState() {
			return getRuleContexts(IfStateContext.class);
		}
		public IfStateContext ifState(int i) {
			return getRuleContext(IfStateContext.class,i);
		}
		public List<FunBodyContext> funBody() {
			return getRuleContexts(FunBodyContext.class);
		}
		public FunBodyContext funBody(int i) {
			return getRuleContext(FunBodyContext.class,i);
		}
		public List<TerminalNode> CLOSE_CURLYBRACES() { return getTokens(ReactParser.CLOSE_CURLYBRACES); }
		public TerminalNode CLOSE_CURLYBRACES(int i) {
			return getToken(ReactParser.CLOSE_CURLYBRACES, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ReactParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReactParser.SEMICOLON, i);
		}
		public List<ElseContext> else_() {
			return getRuleContexts(ElseContext.class);
		}
		public ElseContext else_(int i) {
			return getRuleContext(ElseContext.class,i);
		}
		public FunBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunBodyContext funBody() throws RecognitionException {
		FunBodyContext _localctx = new FunBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_funBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1100056893696L) != 0) || _la==ID) {
				{
				setState(493);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
				case LET:
				case VAR:
					{
					setState(480);
					decl();
					}
					break;
				case ID:
					{
					setState(481);
					assign();
					}
					break;
				case RETURN:
					{
					setState(482);
					return_();
					}
					break;
				case IF:
					{
					setState(483);
					ifState();
					setState(484);
					funBody();
					setState(485);
					match(CLOSE_CURLYBRACES);
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ELSE) {
						{
						setState(486);
						else_();
						setState(487);
						funBody();
						setState(488);
						match(CLOSE_CURLYBRACES);
						}
					}

					}
					break;
				case SEMICOLON:
					{
					setState(492);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(497);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(ReactParser.OPEN_PARENTHESIS, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(ReactParser.CLOSE_PARENTHESIS, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(RETURN);
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(499);
				match(OPEN_PARENTHESIS);
				setState(500);
				val();
				setState(501);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(503);
				val();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactParser.DEFAULT, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(EXPORT);
			setState(507);
			match(DEFAULT);
			setState(508);
			match(ID);
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
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u01ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000S\b\u0000\n\u0000\f\u0000"+
		"V\t\u0000\u0001\u0000\u0003\u0000Y\b\u0000\u0001\u0000\u0003\u0000\\\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004s\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0081\b\u0004\n\u0004\f\u0004\u0084\t\u0004\u0001\u0005\u0003\u0005"+
		"\u0087\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0093\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0098\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a3\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00a8\b\b\n\b\f\b\u00ab\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b3\b\t\n\t\f\t\u00b6\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c2\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00cb\b\n\u0003\n\u00cd\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00d7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ef\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00f3\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fb\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0103"+
		"\b\u0010\n\u0010\f\u0010\u0106\t\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u010a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0111\b\u0012\n\u0012\f\u0012\u0114\t\u0012\u0001\u0012\u0003"+
		"\u0012\u0117\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u011f\b\u0014\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0123\b\u0015\n\u0015\f\u0015\u0126\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u012a\b\u0015\n\u0015\f\u0015\u012d\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0135"+
		"\b\u0016\n\u0016\f\u0016\u0138\t\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u013c\b\u0016\n\u0016\f\u0016\u013f\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0148"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0153\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u015f\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0169\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0172"+
		"\b\u0019\n\u0019\f\u0019\u0175\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u017a\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0191\b\u001c\u0005\u001c\u0193\b\u001c\n\u001c\f\u001c\u0196\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u019d\b\u001d\n\u001d\f\u001d\u01a0\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01b1\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01b7"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01bf\b \n \f \u01c2"+
		"\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01d4\b!\u0001\"\u0001"+
		"\"\u0003\"\u01d8\b\"\u0001\"\u0001\"\u0005\"\u01dc\b\"\n\"\f\"\u01df\t"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01eb\b#\u0001#\u0005#\u01ee\b#\n#\f#\u01f1\t#\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0003$\u01f9\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0000\u0001\b&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0003"+
		"\u0002\u0000\b\b\u000b\f\u0001\u0000\u000b\f\u0001\u00009:\u0226\u0000"+
		"T\u0001\u0000\u0000\u0000\u0002_\u0001\u0000\u0000\u0000\u0004g\u0001"+
		"\u0000\u0000\u0000\u0006k\u0001\u0000\u0000\u0000\br\u0001\u0000\u0000"+
		"\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000"+
		"\u000e\u00a2\u0001\u0000\u0000\u0000\u0010\u00a4\u0001\u0000\u0000\u0000"+
		"\u0012\u00ae\u0001\u0000\u0000\u0000\u0014\u00cc\u0001\u0000\u0000\u0000"+
		"\u0016\u00d6\u0001\u0000\u0000\u0000\u0018\u00d8\u0001\u0000\u0000\u0000"+
		"\u001a\u00de\u0001\u0000\u0000\u0000\u001c\u00ee\u0001\u0000\u0000\u0000"+
		"\u001e\u00f0\u0001\u0000\u0000\u0000 \u00fa\u0001\u0000\u0000\u0000\""+
		"\u0107\u0001\u0000\u0000\u0000$\u010d\u0001\u0000\u0000\u0000&\u0118\u0001"+
		"\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000*\u0120\u0001\u0000\u0000"+
		"\u0000,\u0131\u0001\u0000\u0000\u0000.\u0147\u0001\u0000\u0000\u00000"+
		"\u0168\u0001\u0000\u0000\u00002\u016a\u0001\u0000\u0000\u00004\u0176\u0001"+
		"\u0000\u0000\u00006\u017d\u0001\u0000\u0000\u00008\u0186\u0001\u0000\u0000"+
		"\u0000:\u0199\u0001\u0000\u0000\u0000<\u01a3\u0001\u0000\u0000\u0000>"+
		"\u01b0\u0001\u0000\u0000\u0000@\u01b6\u0001\u0000\u0000\u0000B\u01d3\u0001"+
		"\u0000\u0000\u0000D\u01d5\u0001\u0000\u0000\u0000F\u01ef\u0001\u0000\u0000"+
		"\u0000H\u01f2\u0001\u0000\u0000\u0000J\u01fa\u0001\u0000\u0000\u0000L"+
		"S\u0003>\u001f\u0000MS\u0003\f\u0006\u0000NS\u0003\u0006\u0003\u0000O"+
		"S\u0003\u0018\f\u0000PS\u0003B!\u0000QS\u0005\u0017\u0000\u0000RL\u0001"+
		"\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000"+
		"RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0003"+
		"J%\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000"+
		"\u0000\u0000Z\\\u0005\u0017\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0000\u0000\u0001"+
		"^\u0001\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000\u0000`a\u0005\u0002"+
		"\u0000\u0000ab\u0005I\u0000\u0000bc\u0005\u0014\u0000\u0000cd\u0005I\u0000"+
		"\u0000de\u0005\u0003\u0000\u0000ef\u0005\u0013\u0000\u0000f\u0003\u0001"+
		"\u0000\u0000\u0000gh\u0005\r\u0000\u0000hi\u0003\u000e\u0007\u0000ij\u0005"+
		"\u0012\u0000\u0000j\u0005\u0001\u0000\u0000\u0000kl\u0005I\u0000\u0000"+
		"lm\u0005\u0013\u0000\u0000mn\u0003\u000e\u0007\u0000n\u0007\u0001\u0000"+
		"\u0000\u0000op\u0006\u0004\uffff\uffff\u0000ps\u0003\n\u0005\u0000qs\u0005"+
		"I\u0000\u0000ro\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0082"+
		"\u0001\u0000\u0000\u0000tu\n\u0006\u0000\u0000uv\u0005\u0019\u0000\u0000"+
		"v\u0081\u0003\b\u0004\u0007wx\n\u0005\u0000\u0000xy\u0005\u001a\u0000"+
		"\u0000y\u0081\u0003\b\u0004\u0006z{\n\u0004\u0000\u0000{|\u0005\u0018"+
		"\u0000\u0000|\u0081\u0003\b\u0004\u0005}~\n\u0003\u0000\u0000~\u007f\u0005"+
		"\u001b\u0000\u0000\u007f\u0081\u0003\b\u0004\u0004\u0080t\u0001\u0000"+
		"\u0000\u0000\u0080w\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\t\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0005\u001b\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005 \u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"\b\u0000\u0000\u008b\u008c\u0005I\u0000\u0000\u008c\u008d\u0005\u0013"+
		"\u0000\u0000\u008d\u0098\u0003\u000e\u0007\u0000\u008e\u008f\u0007\u0001"+
		"\u0000\u0000\u008f\u0092\u0005I\u0000\u0000\u0090\u0091\u0005\u0013\u0000"+
		"\u0000\u0091\u0093\u0003\u000e\u0007\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0098\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0003\u0002\u0001\u0000\u0095\u0096\u0003\u0004\u0002"+
		"\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u008a\u0001\u0000\u0000"+
		"\u0000\u0097\u008e\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000"+
		"\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u00a3\u0005!\u0000\u0000"+
		"\u009a\u00a3\u0005I\u0000\u0000\u009b\u00a3\u0005\u000e\u0000\u0000\u009c"+
		"\u00a3\u0003\b\u0004\u0000\u009d\u00a3\u0003&\u0013\u0000\u009e\u00a3"+
		"\u0003\"\u0011\u0000\u009f\u00a3\u0003\u001e\u000f\u0000\u00a0\u00a3\u0003"+
		"\u0016\u000b\u0000\u00a1\u00a3\u0003\u0010\b\u0000\u00a2\u0099\u0001\u0000"+
		"\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a2\u009b\u0001\u0000"+
		"\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000"+
		"\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u000f"+
		"\u0000\u0000\u00a5\u00a9\u0005\u0010\u0000\u0000\u00a6\u00a8\u0003\u0012"+
		"\t\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u0011\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005!\u0000\u0000\u00af\u00b0\u0005\u0014\u0000\u0000"+
		"\u00b0\u00b4\u0005\u0004\u0000\u0000\u00b1\u00b3\u0003\u0014\n\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0005\u0000\u0000\u00b8\u0013\u0001\u0000\u0000\u0000\u00b9"+
		"\u00cd\u00030\u0018\u0000\u00ba\u00bb\u00059\u0000\u0000\u00bb\u00c1\u0005"+
		"\u0013\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be\u0003"+
		"\u000e\u0007\u0000\u00be\u00bf\u0005\u0005\u0000\u0000\u00bf\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0003\u000e\u0007\u0000\u00c1\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00cd\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005$\u0000\u0000\u00c4\u00ca\u0005\u0013"+
		"\u0000\u0000\u00c5\u00c6\u0005\u0004\u0000\u0000\u00c6\u00c7\u0003\u000e"+
		"\u0007\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u0003\u000e\u0007\u0000\u00ca\u00c5\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cc\u00b9\u0001\u0000\u0000\u0000\u00cc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000\u0000\u00cd\u0015\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005I\u0000\u0000\u00cf\u00d0\u0005\u0015\u0000"+
		"\u0000\u00d0\u00d7\u0005I\u0000\u0000\u00d1\u00d2\u0005I\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0002\u0000\u0000\u00d3\u00d4\u0003\b\u0004\u0000\u00d4\u00d5"+
		"\u0005\u0003\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d7\u0017"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001d\u0000\u0000\u00d9\u00da"+
		"\u0005\u0010\u0000\u0000\u00da\u00db\u0003\u001c\u000e\u0000\u00db\u00dc"+
		"\u0005\u0012\u0000\u0000\u00dc\u00dd\u0005\u0004\u0000\u0000\u00dd\u0019"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u001c\u0000\u0000\u00df\u00e0"+
		"\u0005\u0004\u0000\u0000\u00e0\u001b\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0003\u000e\u0007\u0000\u00e2\u00e3\u0005D\u0000\u0000\u00e3\u00e4\u0003"+
		"\u000e\u0007\u0000\u00e4\u00ef\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003"+
		"\u000e\u0007\u0000\u00e6\u00e7\u0005E\u0000\u0000\u00e7\u00e8\u0003\u000e"+
		"\u0007\u0000\u00e8\u00ef\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003\u000e"+
		"\u0007\u0000\u00ea\u00eb\u0005F\u0000\u0000\u00eb\u00ec\u0003\u000e\u0007"+
		"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005\u000e\u0000"+
		"\u0000\u00ee\u00e1\u0001\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u001d\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005\u0004\u0000"+
		"\u0000\u00f1\u00f3\u0003 \u0010\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\u0005\u0000\u0000\u00f5\u001f\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005I\u0000\u0000\u00f7\u00f8\u0005\u0001\u0000\u0000\u00f8"+
		"\u00fb\u0003\u000e\u0007\u0000\u00f9\u00fb\u0005I\u0000\u0000\u00fa\u00f6"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u0104"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0014\u0000\u0000\u00fd\u00fe"+
		"\u0005I\u0000\u0000\u00fe\u00ff\u0005\u0001\u0000\u0000\u00ff\u0103\u0003"+
		"\u000e\u0007\u0000\u0100\u0101\u0005\u0014\u0000\u0000\u0101\u0103\u0005"+
		"I\u0000\u0000\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105!\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0109\u0005\u0002\u0000"+
		"\u0000\u0108\u010a\u0003$\u0012\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0003\u0000\u0000\u010c#\u0001\u0000\u0000\u0000\u010d"+
		"\u0112\u0003\u000e\u0007\u0000\u010e\u010f\u0005\u0014\u0000\u0000\u010f"+
		"\u0111\u0003\u000e\u0007\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u0117\u0005\u0014\u0000\u0000\u0116"+
		"\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"%\u0001\u0000\u0000\u0000\u0118\u0119\u0003(\u0014\u0000\u0119\'\u0001"+
		"\u0000\u0000\u0000\u011a\u011f\u00038\u001c\u0000\u011b\u011f\u0003,\u0016"+
		"\u0000\u011c\u011f\u0003:\u001d\u0000\u011d\u011f\u0003*\u0015\u0000\u011e"+
		"\u011a\u0001\u0000\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f"+
		")\u0001\u0000\u0000\u0000\u0120\u0124\u0005\u001f\u0000\u0000\u0121\u0123"+
		"\u00030\u0018\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001"+
		"\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001"+
		"\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0127\u012b\u0005\u001e\u0000\u0000\u0128\u012a\u0003"+
		".\u0017\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000"+
		"\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0005=\u0000\u0000\u012f\u0130\u0005\u001e\u0000"+
		"\u0000\u0130+\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u001f\u0000\u0000"+
		"\u0132\u0136\u0005&\u0000\u0000\u0133\u0135\u00030\u0018\u0000\u0134\u0133"+
		"\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013d"+
		"\u0005\u001e\u0000\u0000\u013a\u013c\u0003.\u0017\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		"=\u0000\u0000\u0141\u0142\u0005&\u0000\u0000\u0142\u0143\u0005\u001e\u0000"+
		"\u0000\u0143-\u0001\u0000\u0000\u0000\u0144\u0148\u0005@\u0000\u0000\u0145"+
		"\u0148\u00034\u001a\u0000\u0146\u0148\u0003(\u0014\u0000\u0147\u0144\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0148/\u0001\u0000\u0000\u0000\u0149\u014a\u00056\u0000"+
		"\u0000\u014a\u014b\u0005\u0013\u0000\u0000\u014b\u0152\u0005\u0004\u0000"+
		"\u0000\u014c\u0153\u0003\u000e\u0007\u0000\u014d\u014e\u0005I\u0000\u0000"+
		"\u014e\u014f\u0005\u0010\u0000\u0000\u014f\u0150\u0003\u000e\u0007\u0000"+
		"\u0150\u0151\u0005\u0012\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000"+
		"\u0152\u014c\u0001\u0000\u0000\u0000\u0152\u014d\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0005\u0000\u0000"+
		"\u0155\u0169\u0001\u0000\u0000\u0000\u0156\u0157\u0005<\u0000\u0000\u0157"+
		"\u0158\u0005\u0013\u0000\u0000\u0158\u0169\u0003\u000e\u0007\u0000\u0159"+
		"\u015a\u00058\u0000\u0000\u015a\u015b\u0005\u0013\u0000\u0000\u015b\u015c"+
		"\u0005\u0004\u0000\u0000\u015c\u015e\u0005\u0004\u0000\u0000\u015d\u015f"+
		"\u00032\u0019\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"\u0005\u0000\u0000\u0161\u0169\u0005\u0005\u0000\u0000\u0162\u0163\u0005"+
		"7\u0000\u0000\u0163\u0164\u0005\u0013\u0000\u0000\u0164\u0165\u0005\u0004"+
		"\u0000\u0000\u0165\u0166\u0003\u000e\u0007\u0000\u0166\u0167\u0005\u0005"+
		"\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0149\u0001\u0000"+
		"\u0000\u0000\u0168\u0156\u0001\u0000\u0000\u0000\u0168\u0159\u0001\u0000"+
		"\u0000\u0000\u0168\u0162\u0001\u0000\u0000\u0000\u01691\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0005I\u0000\u0000\u016b\u016c\u0005\u0001\u0000\u0000"+
		"\u016c\u0173\u0003\u000e\u0007\u0000\u016d\u016e\u0005\u0014\u0000\u0000"+
		"\u016e\u016f\u0005I\u0000\u0000\u016f\u0170\u0005\u0001\u0000\u0000\u0170"+
		"\u0172\u0003\u000e\u0007\u0000\u0171\u016d\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u01743\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0176\u0179\u0005\u0004\u0000\u0000\u0177\u017a"+
		"\u00036\u001b\u0000\u0178\u017a\u0003\u000e\u0007\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0005"+
		"\u0005\u0000\u0000\u017c5\u0001\u0000\u0000\u0000\u017d\u017e\u0005I\u0000"+
		"\u0000\u017e\u017f\u0005\u0015\u0000\u0000\u017f\u0180\u0005A\u0000\u0000"+
		"\u0180\u0181\u0005\u0010\u0000\u0000\u0181\u0182\u0005I\u0000\u0000\u0182"+
		"\u0183\u0005\u0016\u0000\u0000\u0183\u0184\u0003&\u0013\u0000\u0184\u0185"+
		"\u0005\u0012\u0000\u0000\u01857\u0001\u0000\u0000\u0000\u0186\u0187\u0005"+
		"\u001f\u0000\u0000\u0187\u0194\u0005$\u0000\u0000\u0188\u0193\u00030\u0018"+
		"\u0000\u0189\u018a\u0007\u0002\u0000\u0000\u018a\u0190\u0005\u0013\u0000"+
		"\u0000\u018b\u018c\u0005\u0004\u0000\u0000\u018c\u018d\u0003\u000e\u0007"+
		"\u0000\u018d\u018e\u0005\u0005\u0000\u0000\u018e\u0191\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0003\u000e\u0007\u0000\u0190\u018b\u0001\u0000\u0000"+
		"\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000"+
		"\u0000\u0192\u0188\u0001\u0000\u0000\u0000\u0192\u0189\u0001\u0000\u0000"+
		"\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u00055\u0000\u0000"+
		"\u01989\u0001\u0000\u0000\u0000\u0199\u019a\u0005\u001f\u0000\u0000\u019a"+
		"\u019e\u0005I\u0000\u0000\u019b\u019d\u0003<\u001e\u0000\u019c\u019b\u0001"+
		"\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"5\u0000\u0000\u01a2;\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005I\u0000"+
		"\u0000\u01a4\u01a5\u0005\u0013\u0000\u0000\u01a5\u01a6\u0005\u0004\u0000"+
		"\u0000\u01a6\u01a7\u0003\u000e\u0007\u0000\u01a7\u01a8\u0005\u0005\u0000"+
		"\u0000\u01a8=\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u0006\u0000\u0000"+
		"\u01aa\u01ab\u0003@ \u0000\u01ab\u01ac\u0005\u0007\u0000\u0000\u01ac\u01ad"+
		"\u0005!\u0000\u0000\u01ad\u01b1\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		"\u0006\u0000\u0000\u01af\u01b1\u0005!\u0000\u0000\u01b0\u01a9\u0001\u0000"+
		"\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1?\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0005\u0004\u0000\u0000\u01b3\u01b4\u0005I\u0000\u0000"+
		"\u01b4\u01b7\u0005\u0005\u0000\u0000\u01b5\u01b7\u0005I\u0000\u0000\u01b6"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"\u01c0\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u0014\u0000\u0000\u01b9"+
		"\u01ba\u0005\u0004\u0000\u0000\u01ba\u01bb\u0005I\u0000\u0000\u01bb\u01bf"+
		"\u0005\u0005\u0000\u0000\u01bc\u01bd\u0005\u0014\u0000\u0000\u01bd\u01bf"+
		"\u0005I\u0000\u0000\u01be\u01b8\u0001\u0000\u0000\u0000\u01be\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1A\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\'\u0000"+
		"\u0000\u01c4\u01c5\u0005I\u0000\u0000\u01c5\u01c6\u0003D\"\u0000\u01c6"+
		"\u01c7\u0005\u0011\u0000\u0000\u01c7\u01c8\u0003F#\u0000\u01c8\u01c9\u0005"+
		"\u0005\u0000\u0000\u01c9\u01d4\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005"+
		"\b\u0000\u0000\u01cb\u01cc\u0005I\u0000\u0000\u01cc\u01cd\u0005\u0013"+
		"\u0000\u0000\u01cd\u01ce\u0003D\"\u0000\u01ce\u01cf\u0005\u0016\u0000"+
		"\u0000\u01cf\u01d0\u0005\u0004\u0000\u0000\u01d0\u01d1\u0003F#\u0000\u01d1"+
		"\u01d2\u0005\u0005\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3"+
		"\u01c3\u0001\u0000\u0000\u0000\u01d3\u01ca\u0001\u0000\u0000\u0000\u01d4"+
		"C\u0001\u0000\u0000\u0000\u01d5\u01d7\u0005\u0010\u0000\u0000\u01d6\u01d8"+
		"\u0005I\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d8\u01dd\u0001\u0000\u0000\u0000\u01d9\u01da\u0005"+
		"\u0014\u0000\u0000\u01da\u01dc\u0005I\u0000\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01deE\u0001\u0000\u0000"+
		"\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01ee\u0003\f\u0006\u0000"+
		"\u01e1\u01ee\u0003\u0006\u0003\u0000\u01e2\u01ee\u0003H$\u0000\u01e3\u01e4"+
		"\u0003\u0018\f\u0000\u01e4\u01e5\u0003F#\u0000\u01e5\u01ea\u0005\u0005"+
		"\u0000\u0000\u01e6\u01e7\u0003\u001a\r\u0000\u01e7\u01e8\u0003F#\u0000"+
		"\u01e8\u01e9\u0005\u0005\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e6\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005\u0017\u0000\u0000"+
		"\u01ed\u01e0\u0001\u0000\u0000\u0000\u01ed\u01e1\u0001\u0000\u0000\u0000"+
		"\u01ed\u01e2\u0001\u0000\u0000\u0000\u01ed\u01e3\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0G\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f8\u0005(\u0000\u0000\u01f3\u01f4\u0005\u0010\u0000\u0000\u01f4\u01f5"+
		"\u0003\u000e\u0007\u0000\u01f5\u01f6\u0005\u0012\u0000\u0000\u01f6\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f9\u0003\u000e\u0007\u0000\u01f8\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f9I\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005"+
		"\t\u0000\u0000\u01fb\u01fc\u0005\n\u0000\u0000\u01fc\u01fd\u0005I\u0000"+
		"\u0000\u01fdK\u0001\u0000\u0000\u00003RTX[r\u0080\u0082\u0086\u0092\u0097"+
		"\u00a2\u00a9\u00b4\u00c1\u00ca\u00cc\u00d6\u00ee\u00f2\u00fa\u0102\u0104"+
		"\u0109\u0112\u0116\u011e\u0124\u012b\u0136\u013d\u0147\u0152\u015e\u0168"+
		"\u0173\u0179\u0190\u0192\u0194\u019e\u01b0\u01b6\u01be\u01c0\u01d3\u01d7"+
		"\u01dd\u01ea\u01ed\u01ef\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}