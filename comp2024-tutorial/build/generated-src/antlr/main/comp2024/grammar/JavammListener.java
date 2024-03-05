// Generated from comp2024/grammar/Javamm.g4 by ANTLR 4.5.3

package pt.up.fe.comp2024;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavammParser}.
 */
public interface JavammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavammParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavammParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavammParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavammParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavammParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(JavammParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(JavammParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JavammParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JavammParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOp}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(JavammParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOp}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(JavammParser.BinaryOpContext ctx);
}