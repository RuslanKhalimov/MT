// Generated from Grammar.g4 by ANTLR 4.7.1

import grammar.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#choose_roole}.
	 * @param ctx the parse tree
	 */
	void enterChoose_roole(GrammarParser.Choose_rooleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#choose_roole}.
	 * @param ctx the parse tree
	 */
	void exitChoose_roole(GrammarParser.Choose_rooleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#my_rule}.
	 * @param ctx the parse tree
	 */
	void enterMy_rule(GrammarParser.My_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#my_rule}.
	 * @param ctx the parse tree
	 */
	void exitMy_rule(GrammarParser.My_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#my_returns}.
	 * @param ctx the parse tree
	 */
	void enterMy_returns(GrammarParser.My_returnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#my_returns}.
	 * @param ctx the parse tree
	 */
	void exitMy_returns(GrammarParser.My_returnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(GrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(GrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rightPart}.
	 * @param ctx the parse tree
	 */
	void enterRightPart(GrammarParser.RightPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rightPart}.
	 * @param ctx the parse tree
	 */
	void exitRightPart(GrammarParser.RightPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ruleToken}.
	 * @param ctx the parse tree
	 */
	void enterRuleToken(GrammarParser.RuleTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ruleToken}.
	 * @param ctx the parse tree
	 */
	void exitRuleToken(GrammarParser.RuleTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammarParser.ParamContext ctx);
}