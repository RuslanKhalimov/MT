// Generated from Program.g4 by ANTLR 4.7.1

import expression.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ProgramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ProgramParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(ProgramParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(ProgramParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProgramParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProgramParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(ProgramParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(ProgramParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#ar_expressions}.
	 * @param ctx the parse tree
	 */
	void enterAr_expressions(ProgramParser.Ar_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#ar_expressions}.
	 * @param ctx the parse tree
	 */
	void exitAr_expressions(ProgramParser.Ar_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(ProgramParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(ProgramParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(ProgramParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(ProgramParser.Mul_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#unary_ar}.
	 * @param ctx the parse tree
	 */
	void enterUnary_ar(ProgramParser.Unary_arContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#unary_ar}.
	 * @param ctx the parse tree
	 */
	void exitUnary_ar(ProgramParser.Unary_arContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(ProgramParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(ProgramParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ProgramParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ProgramParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#unary_logic}.
	 * @param ctx the parse tree
	 */
	void enterUnary_logic(ProgramParser.Unary_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#unary_logic}.
	 * @param ctx the parse tree
	 */
	void exitUnary_logic(ProgramParser.Unary_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(ProgramParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(ProgramParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void enterCmp_op(ProgramParser.Cmp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void exitCmp_op(ProgramParser.Cmp_opContext ctx);
}