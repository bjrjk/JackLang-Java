// Generated from JackLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JackLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JackLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code program}
	 * labeled alternative in {@link JackLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JackLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link JackLangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JackLangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paras}
	 * labeled alternative in {@link JackLangParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParas(JackLangParser.ParasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link JackLangParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(JackLangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decl}
	 * labeled alternative in {@link JackLangParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(JackLangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link JackLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JackLangParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link JackLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(JackLangParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JackLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JackLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blk}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlk(JackLangParser.BlkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclStat}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStat(JackLangParser.VarDeclStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(JackLangParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(JackLangParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(JackLangParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(JackLangParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JackLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcStat}
	 * labeled alternative in {@link JackLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncStat(JackLangParser.FuncStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JackLangParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVisit}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVisit(JackLangParser.ArrayVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolOR}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOR(JackLangParser.BoolORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(JackLangParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareSize}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareSize(JackLangParser.CompareSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(JackLangParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNOT}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNOT(JackLangParser.BoolNOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDSUB}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDSUB(JackLangParser.ADDSUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JackLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAND}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAND(JackLangParser.BoolANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(JackLangParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULDIV}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULDIV(JackLangParser.MULDIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareEquality}
	 * labeled alternative in {@link JackLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareEquality(JackLangParser.CompareEqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link JackLangParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(JackLangParser.ExprListContext ctx);
}