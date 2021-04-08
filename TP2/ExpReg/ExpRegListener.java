// Generated from ExpReg.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpRegParser}.
 */
public interface ExpRegListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpRegParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpRegParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpRegParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpRegParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpRegParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(ExpRegParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpRegParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(ExpRegParser.SContext ctx);
}