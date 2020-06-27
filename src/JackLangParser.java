// Generated from JackLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JackLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BASICTYPE=18, ADD=19, SUB=20, MUL=21, DIV=22, EQ=23, NE=24, LT=25, LE=26, 
		GE=27, GT=28, IDENTIFIER=29, INT=30, WS=31, COMMENT=32;
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_parameters = 2, RULE_varDeclare = 3, 
		RULE_declare = 4, RULE_type = 5, RULE_block = 6, RULE_statement = 7, RULE_expr = 8, 
		RULE_exprList = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func", "parameters", "varDeclare", "declare", "type", "block", 
			"statement", "expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "';'", "'['", "']'", "'{'", "'}'", "'if'", 
			"'else'", "'while'", "'do'", "'return'", "'='", "'!'", "'&&'", "'||'", 
			"'int'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'<'", "'<='", "'>='", 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BASICTYPE", "ADD", "SUB", "MUL", 
			"DIV", "EQ", "NE", "LT", "LE", "GE", "GT", "IDENTIFIER", "INT", "WS", 
			"COMMENT"
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
	public String getGrammarFileName() { return "JackLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JackLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public List<VarDeclareContext> varDeclare() {
			return getRuleContexts(VarDeclareContext.class);
		}
		public VarDeclareContext varDeclare(int i) {
			return getRuleContext(VarDeclareContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					varDeclare();
					}
					break;
				case 2:
					{
					setState(21);
					func();
					}
					break;
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASICTYPE );
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

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends FuncContext {
		public TerminalNode BASICTYPE() { return getToken(JackLangParser.BASICTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(BASICTYPE);
			setState(27);
			match(IDENTIFIER);
			setState(28);
			match(T__0);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASICTYPE) {
				{
				setState(29);
				parameters();
				}
			}

			setState(32);
			match(T__1);
			setState(33);
			block();
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParasContext extends ParametersContext {
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public ParasContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitParas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			_localctx = new ParasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			declare();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(36);
				match(T__2);
				setState(37);
				declare();
				}
				}
				setState(42);
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

	public static class VarDeclareContext extends ParserRuleContext {
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
	 
		public VarDeclareContext() { }
		public void copyFrom(VarDeclareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclContext extends VarDeclareContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public VarDeclContext(VarDeclareContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclare);
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			declare();
			setState(44);
			match(T__3);
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

	public static class DeclareContext extends ParserRuleContext {
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
	 
		public DeclareContext() { }
		public void copyFrom(DeclareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclContext extends DeclareContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public DeclContext(DeclareContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare);
		try {
			_localctx = new DeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			type();
			setState(47);
			match(IDENTIFIER);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode BASICTYPE() { return getToken(JackLangParser.BASICTYPE, 0); }
		public TerminalNode INT() { return getToken(JackLangParser.INT, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode BASICTYPE() { return getToken(JackLangParser.BASICTYPE, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(BASICTYPE);
				setState(50);
				match(T__4);
				setState(51);
				match(INT);
				setState(52);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(BASICTYPE);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__6);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << BASICTYPE) | (1L << SUB) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__7);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlkContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitBlk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclStatContext extends StatementContext {
		public VarDeclareContext varDeclare() {
			return getRuleContext(VarDeclareContext.class,0);
		}
		public VarDeclStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitVarDeclStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncStatContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitFuncStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BlkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				block();
				}
				break;
			case 2:
				_localctx = new VarDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				varDeclare();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__8);
				setState(68);
				match(T__0);
				setState(69);
				expr(0);
				setState(70);
				match(T__1);
				setState(71);
				statement();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(72);
					match(T__9);
					setState(73);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__10);
				setState(77);
				match(T__0);
				setState(78);
				expr(0);
				setState(79);
				match(T__1);
				setState(80);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(T__11);
				setState(83);
				statement();
				setState(84);
				match(T__10);
				setState(85);
				match(T__0);
				setState(86);
				expr(0);
				setState(87);
				match(T__1);
				setState(88);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				match(T__12);
				setState(91);
				expr(0);
				setState(92);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				expr(0);
				setState(95);
				match(T__13);
				setState(96);
				expr(0);
				setState(97);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new FuncStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				expr(0);
				setState(100);
				match(T__3);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayVisitContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayVisitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitArrayVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolORContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitBoolOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ExprContext {
		public TerminalNode INT() { return getToken(JackLangParser.INT, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareSizeContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(JackLangParser.LT, 0); }
		public TerminalNode LE() { return getToken(JackLangParser.LE, 0); }
		public TerminalNode GE() { return getToken(JackLangParser.GE, 0); }
		public TerminalNode GT() { return getToken(JackLangParser.GT, 0); }
		public CompareSizeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitCompareSize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNOTContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolNOTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitBoolNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADDSUBContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(JackLangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JackLangParser.SUB, 0); }
		public ADDSUBContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitADDSUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolANDContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolANDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitBoolAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExprContext {
		public TerminalNode SUB() { return getToken(JackLangParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULDIVContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(JackLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JackLangParser.DIV, 0); }
		public MULDIVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitMULDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareEqualityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JackLangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(JackLangParser.NE, 0); }
		public CompareEqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitCompareEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(T__0);
				setState(106);
				expr(0);
				setState(107);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(IDENTIFIER);
				setState(111);
				match(T__0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__14) | (1L << SUB) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
					{
					setState(112);
					exprList();
					}
				}

				setState(115);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new ArrayVisitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(IDENTIFIER);
				setState(117);
				match(T__4);
				setState(118);
				expr(0);
				setState(119);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(SUB);
				setState(123);
				expr(8);
				}
				break;
			case 7:
				{
				_localctx = new BoolNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__14);
				setState(125);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MULDIVContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129);
						((MULDIVContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MULDIVContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ADDSUBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132);
						((ADDSUBContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ADDSUBContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new CompareSizeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135);
						((CompareSizeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
							((CompareSizeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new CompareEqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(138);
						((CompareEqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((CompareEqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(139);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new BoolANDContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						match(T__15);
						setState(142);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new BoolORContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(144);
						match(T__16);
						setState(145);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			expr(0);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(152);
				match(T__2);
				setState(153);
				expr(0);
				}
				}
				setState(158);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\79\n\7\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nt\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0095\n\n\f\n\16\n"+
		"\u0098\13\n\3\13\3\13\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13"+
		"\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\27\30\3\2\25\26\3\2\33\36\3"+
		"\2\31\32\2\u00b3\2\30\3\2\2\2\4\34\3\2\2\2\6%\3\2\2\2\b-\3\2\2\2\n\60"+
		"\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20h\3\2\2\2\22\u0080\3\2\2\2\24\u0099"+
		"\3\2\2\2\26\31\5\b\5\2\27\31\5\4\3\2\30\26\3\2\2\2\30\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\3\3\2\2\2\34\35\7\24\2\2\35\36"+
		"\7\37\2\2\36 \7\3\2\2\37!\5\6\4\2 \37\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#"+
		"\7\4\2\2#$\5\16\b\2$\5\3\2\2\2%*\5\n\6\2&\'\7\5\2\2\')\5\n\6\2(&\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,*\3\2\2\2-.\5\n\6\2./\7\6"+
		"\2\2/\t\3\2\2\2\60\61\5\f\7\2\61\62\7\37\2\2\62\13\3\2\2\2\63\64\7\24"+
		"\2\2\64\65\7\7\2\2\65\66\7 \2\2\669\7\b\2\2\679\7\24\2\28\63\3\2\2\28"+
		"\67\3\2\2\29\r\3\2\2\2:>\7\t\2\2;=\5\20\t\2<;\3\2\2\2=@\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\n\2\2B\17\3\2\2\2Ci\5\16\b\2Di"+
		"\5\b\5\2EF\7\13\2\2FG\7\3\2\2GH\5\22\n\2HI\7\4\2\2IL\5\20\t\2JK\7\f\2"+
		"\2KM\5\20\t\2LJ\3\2\2\2LM\3\2\2\2Mi\3\2\2\2NO\7\r\2\2OP\7\3\2\2PQ\5\22"+
		"\n\2QR\7\4\2\2RS\5\20\t\2Si\3\2\2\2TU\7\16\2\2UV\5\20\t\2VW\7\r\2\2WX"+
		"\7\3\2\2XY\5\22\n\2YZ\7\4\2\2Z[\7\6\2\2[i\3\2\2\2\\]\7\17\2\2]^\5\22\n"+
		"\2^_\7\6\2\2_i\3\2\2\2`a\5\22\n\2ab\7\20\2\2bc\5\22\n\2cd\7\6\2\2di\3"+
		"\2\2\2ef\5\22\n\2fg\7\6\2\2gi\3\2\2\2hC\3\2\2\2hD\3\2\2\2hE\3\2\2\2hN"+
		"\3\2\2\2hT\3\2\2\2h\\\3\2\2\2h`\3\2\2\2he\3\2\2\2i\21\3\2\2\2jk\b\n\1"+
		"\2kl\7\3\2\2lm\5\22\n\2mn\7\4\2\2n\u0081\3\2\2\2o\u0081\7 \2\2pq\7\37"+
		"\2\2qs\7\3\2\2rt\5\24\13\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2u\u0081\7\4\2"+
		"\2vw\7\37\2\2wx\7\7\2\2xy\5\22\n\2yz\7\b\2\2z\u0081\3\2\2\2{\u0081\7\37"+
		"\2\2|}\7\26\2\2}\u0081\5\22\n\n~\177\7\21\2\2\177\u0081\5\22\n\t\u0080"+
		"j\3\2\2\2\u0080o\3\2\2\2\u0080p\3\2\2\2\u0080v\3\2\2\2\u0080{\3\2\2\2"+
		"\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081\u0096\3\2\2\2\u0082\u0083\f\b\2\2"+
		"\u0083\u0084\t\2\2\2\u0084\u0095\5\22\n\t\u0085\u0086\f\7\2\2\u0086\u0087"+
		"\t\3\2\2\u0087\u0095\5\22\n\b\u0088\u0089\f\6\2\2\u0089\u008a\t\4\2\2"+
		"\u008a\u0095\5\22\n\7\u008b\u008c\f\5\2\2\u008c\u008d\t\5\2\2\u008d\u0095"+
		"\5\22\n\6\u008e\u008f\f\4\2\2\u008f\u0090\7\22\2\2\u0090\u0095\5\22\n"+
		"\5\u0091\u0092\f\3\2\2\u0092\u0093\7\23\2\2\u0093\u0095\5\22\n\4\u0094"+
		"\u0082\3\2\2\2\u0094\u0085\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u008b\3\2"+
		"\2\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009e\5\22\n\2\u009a\u009b\7\5\2\2\u009b\u009d\5\22\n\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\25\3\2\2\2\u00a0\u009e\3\2\2\2\17\30\32 *8>Lhs\u0080\u0094"+
		"\u0096\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}