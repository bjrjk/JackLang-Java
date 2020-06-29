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
		BASICTYPE=18, ADD=19, SUB=20, MUL=21, DIV=22, MOD=23, EQ=24, NE=25, LT=26, 
		LE=27, GE=28, GT=29, IDENTIFIER=30, INT=31, WS=32, COMMENT=33;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_parameter = 3, 
		RULE_varDeclare = 4, RULE_declare = 5, RULE_type = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_expr = 9, RULE_exprList = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "parameters", "parameter", "varDeclare", "declare", 
			"type", "block", "statement", "expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "';'", "'['", "']'", "'{'", "'}'", "'if'", 
			"'else'", "'while'", "'do'", "'return'", "'='", "'!'", "'&&'", "'||'", 
			"'int'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'<='", 
			"'>='", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BASICTYPE", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "EQ", "NE", "LT", "LE", "GE", "GT", "IDENTIFIER", "INT", 
			"WS", "COMMENT"
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

	public static class ProgramContext extends ParserRuleContext {
		public List<VarDeclareContext> varDeclare() {
			return getRuleContexts(VarDeclareContext.class);
		}
		public VarDeclareContext varDeclare(int i) {
			return getRuleContext(VarDeclareContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					varDeclare();
					}
					break;
				case 2:
					{
					setState(23);
					function();
					}
					break;
				}
				}
				setState(26); 
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode BASICTYPE() { return getToken(JackLangParser.BASICTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(BASICTYPE);
			setState(29);
			match(IDENTIFIER);
			setState(30);
			match(T__0);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASICTYPE) {
				{
				setState(31);
				parameters();
				}
			}

			setState(34);
			match(T__1);
			setState(35);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			parameter();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(38);
				match(T__2);
				setState(39);
				parameter();
				}
				}
				setState(44);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode BASICTYPE() { return getToken(JackLangParser.BASICTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(BASICTYPE);
			setState(46);
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

	public static class VarDeclareContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			declare();
			setState(49);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JackLangParser.IDENTIFIER, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JackLangVisitor ) return ((JackLangVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			type();
			setState(52);
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
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(BASICTYPE);
				setState(55);
				match(T__4);
				setState(56);
				match(INT);
				setState(57);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__6);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << BASICTYPE) | (1L << SUB) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BlkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				block();
				}
				break;
			case 2:
				_localctx = new VarDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				varDeclare();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__8);
				setState(73);
				match(T__0);
				setState(74);
				expr(0);
				setState(75);
				match(T__1);
				setState(76);
				statement();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(77);
					match(T__9);
					setState(78);
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
				setState(81);
				match(T__10);
				setState(82);
				match(T__0);
				setState(83);
				expr(0);
				setState(84);
				match(T__1);
				setState(85);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__11);
				setState(88);
				statement();
				setState(89);
				match(T__10);
				setState(90);
				match(T__0);
				setState(91);
				expr(0);
				setState(92);
				match(T__1);
				setState(93);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(T__12);
				setState(96);
				expr(0);
				setState(97);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				expr(0);
				setState(100);
				match(T__13);
				setState(101);
				expr(0);
				setState(102);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new FuncStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				expr(0);
				setState(105);
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
		public TerminalNode MOD() { return getToken(JackLangParser.MOD, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				match(T__0);
				setState(111);
				expr(0);
				setState(112);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(IDENTIFIER);
				setState(116);
				match(T__0);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__14) | (1L << SUB) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
					{
					setState(117);
					exprList();
					}
				}

				setState(120);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new ArrayVisitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(T__4);
				setState(123);
				expr(0);
				setState(124);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(SUB);
				setState(128);
				expr(8);
				}
				break;
			case 7:
				{
				_localctx = new BoolNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__14);
				setState(130);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MULDIVContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(134);
						((MULDIVContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MULDIVContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ADDSUBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(137);
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
						setState(138);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new CompareSizeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(140);
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
						setState(141);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new CompareEqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(143);
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
						setState(144);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new BoolANDContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(146);
						match(T__15);
						setState(147);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new BoolORContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(149);
						match(T__16);
						setState(150);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(155);
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
		enterRule(_localctx, 20, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			expr(0);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(157);
				match(T__2);
				setState(158);
				expr(0);
				}
				}
				setState(163);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3\3\3\3\5\3#\n\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\7\tB\n\t\f\t\16\tE\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nR\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13y\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0086\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009a\n\13\f\13\16\13\u009d\13"+
		"\13\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\f\2\3\24\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\6\3\2\27\31\3\2\25\26\3\2\34\37\3\2\32\33\2\u00b7"+
		"\2\32\3\2\2\2\4\36\3\2\2\2\6\'\3\2\2\2\b/\3\2\2\2\n\62\3\2\2\2\f\65\3"+
		"\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22m\3\2\2\2\24\u0085\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\33\5\n\6\2\31\33\5\4\3\2\32\30\3\2\2\2\32\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36\37\7\24\2\2\37 \7 "+
		"\2\2 \"\7\3\2\2!#\5\6\4\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\4\2\2%&"+
		"\5\20\t\2&\5\3\2\2\2\',\5\b\5\2()\7\5\2\2)+\5\b\5\2*(\3\2\2\2+.\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\60\7\24\2\2\60\61\7 \2\2"+
		"\61\t\3\2\2\2\62\63\5\f\7\2\63\64\7\6\2\2\64\13\3\2\2\2\65\66\5\16\b\2"+
		"\66\67\7 \2\2\67\r\3\2\2\289\7\24\2\29:\7\7\2\2:;\7!\2\2;>\7\b\2\2<>\7"+
		"\24\2\2=8\3\2\2\2=<\3\2\2\2>\17\3\2\2\2?C\7\t\2\2@B\5\22\n\2A@\3\2\2\2"+
		"BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\n\2\2G\21\3\2\2"+
		"\2Hn\5\20\t\2In\5\n\6\2JK\7\13\2\2KL\7\3\2\2LM\5\24\13\2MN\7\4\2\2NQ\5"+
		"\22\n\2OP\7\f\2\2PR\5\22\n\2QO\3\2\2\2QR\3\2\2\2Rn\3\2\2\2ST\7\r\2\2T"+
		"U\7\3\2\2UV\5\24\13\2VW\7\4\2\2WX\5\22\n\2Xn\3\2\2\2YZ\7\16\2\2Z[\5\22"+
		"\n\2[\\\7\r\2\2\\]\7\3\2\2]^\5\24\13\2^_\7\4\2\2_`\7\6\2\2`n\3\2\2\2a"+
		"b\7\17\2\2bc\5\24\13\2cd\7\6\2\2dn\3\2\2\2ef\5\24\13\2fg\7\20\2\2gh\5"+
		"\24\13\2hi\7\6\2\2in\3\2\2\2jk\5\24\13\2kl\7\6\2\2ln\3\2\2\2mH\3\2\2\2"+
		"mI\3\2\2\2mJ\3\2\2\2mS\3\2\2\2mY\3\2\2\2ma\3\2\2\2me\3\2\2\2mj\3\2\2\2"+
		"n\23\3\2\2\2op\b\13\1\2pq\7\3\2\2qr\5\24\13\2rs\7\4\2\2s\u0086\3\2\2\2"+
		"t\u0086\7!\2\2uv\7 \2\2vx\7\3\2\2wy\5\26\f\2xw\3\2\2\2xy\3\2\2\2yz\3\2"+
		"\2\2z\u0086\7\4\2\2{|\7 \2\2|}\7\7\2\2}~\5\24\13\2~\177\7\b\2\2\177\u0086"+
		"\3\2\2\2\u0080\u0086\7 \2\2\u0081\u0082\7\26\2\2\u0082\u0086\5\24\13\n"+
		"\u0083\u0084\7\21\2\2\u0084\u0086\5\24\13\t\u0085o\3\2\2\2\u0085t\3\2"+
		"\2\2\u0085u\3\2\2\2\u0085{\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u009b\3\2\2\2\u0087\u0088\f\b\2\2\u0088"+
		"\u0089\t\2\2\2\u0089\u009a\5\24\13\t\u008a\u008b\f\7\2\2\u008b\u008c\t"+
		"\3\2\2\u008c\u009a\5\24\13\b\u008d\u008e\f\6\2\2\u008e\u008f\t\4\2\2\u008f"+
		"\u009a\5\24\13\7\u0090\u0091\f\5\2\2\u0091\u0092\t\5\2\2\u0092\u009a\5"+
		"\24\13\6\u0093\u0094\f\4\2\2\u0094\u0095\7\22\2\2\u0095\u009a\5\24\13"+
		"\5\u0096\u0097\f\3\2\2\u0097\u0098\7\23\2\2\u0098\u009a\5\24\13\4\u0099"+
		"\u0087\3\2\2\2\u0099\u008a\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u0090\3\2"+
		"\2\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u00a3\5\24\13\2\u009f\u00a0\7\5\2\2\u00a0\u00a2\5\24\13\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\27\3\2\2\2\u00a5\u00a3\3\2\2\2\17\32\34\",=CQmx\u0085\u0099"+
		"\u009b\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}