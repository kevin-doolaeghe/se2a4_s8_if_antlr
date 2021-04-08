// Generated from ProgrammeC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgrammeCParser}.
 */
public interface ProgrammeCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgrammeCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ProgrammeCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgrammeCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ProgrammeCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgrammeCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProgrammeCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgrammeCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProgrammeCParser.ExpressionContext ctx);
}