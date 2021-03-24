// Generated from /Users/aosamesan/IdeaProjects/new-function-builder/src/main/java/asn/aosamesan/newfunctionbuilder/parser/FunctionBuilderParser.g4 by ANTLR 4.9.1
package asn.aosamesan.newfunctionbuilder.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionBuilderParserParser}.
 */
public interface FunctionBuilderParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FunctionBuilderParserParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FunctionBuilderParserParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#modulus}.
	 * @param ctx the parse tree
	 */
	void enterModulus(FunctionBuilderParserParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#modulus}.
	 * @param ctx the parse tree
	 */
	void exitModulus(FunctionBuilderParserParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(FunctionBuilderParserParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(FunctionBuilderParserParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(FunctionBuilderParserParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(FunctionBuilderParserParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerOnly}
	 * labeled alternative in {@link FunctionBuilderParserParser#multiplicationWithoutOp}.
	 * @param ctx the parse tree
	 */
	void enterPowerOnly(FunctionBuilderParserParser.PowerOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerOnly}
	 * labeled alternative in {@link FunctionBuilderParserParser#multiplicationWithoutOp}.
	 * @param ctx the parse tree
	 */
	void exitPowerOnly(FunctionBuilderParserParser.PowerOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithoutOp}
	 * labeled alternative in {@link FunctionBuilderParserParser#multiplicationWithoutOp}.
	 * @param ctx the parse tree
	 */
	void enterWithoutOp(FunctionBuilderParserParser.WithoutOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithoutOp}
	 * labeled alternative in {@link FunctionBuilderParserParser#multiplicationWithoutOp}.
	 * @param ctx the parse tree
	 */
	void exitWithoutOp(FunctionBuilderParserParser.WithoutOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#signedPower}.
	 * @param ctx the parse tree
	 */
	void enterSignedPower(FunctionBuilderParserParser.SignedPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#signedPower}.
	 * @param ctx the parse tree
	 */
	void exitSignedPower(FunctionBuilderParserParser.SignedPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(FunctionBuilderParserParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(FunctionBuilderParserParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#signedFunction}.
	 * @param ctx the parse tree
	 */
	void enterSignedFunction(FunctionBuilderParserParser.SignedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#signedFunction}.
	 * @param ctx the parse tree
	 */
	void exitSignedFunction(FunctionBuilderParserParser.SignedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionBuilderParserParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionBuilderParserParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(FunctionBuilderParserParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(FunctionBuilderParserParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#scalarProduct}.
	 * @param ctx the parse tree
	 */
	void enterScalarProduct(FunctionBuilderParserParser.ScalarProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#scalarProduct}.
	 * @param ctx the parse tree
	 */
	void exitScalarProduct(FunctionBuilderParserParser.ScalarProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FunctionBuilderParserParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FunctionBuilderParserParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FunctionBuilderParserParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FunctionBuilderParserParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(FunctionBuilderParserParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(FunctionBuilderParserParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FunctionBuilderParserParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FunctionBuilderParserParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FunctionBuilderParserParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FunctionBuilderParserParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#prefixFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixFunctionName(FunctionBuilderParserParser.PrefixFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#prefixFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixFunctionName(FunctionBuilderParserParser.PrefixFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#prefixFunctionPower}.
	 * @param ctx the parse tree
	 */
	void enterPrefixFunctionPower(FunctionBuilderParserParser.PrefixFunctionPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#prefixFunctionPower}.
	 * @param ctx the parse tree
	 */
	void exitPrefixFunctionPower(FunctionBuilderParserParser.PrefixFunctionPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#postfixFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterPostfixFunctionName(FunctionBuilderParserParser.PostfixFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#postfixFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitPostfixFunctionName(FunctionBuilderParserParser.PostfixFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#logarithmicFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterLogarithmicFunctionName(FunctionBuilderParserParser.LogarithmicFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#logarithmicFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitLogarithmicFunctionName(FunctionBuilderParserParser.LogarithmicFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#exponentialFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterExponentialFunctionName(FunctionBuilderParserParser.ExponentialFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#exponentialFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitExponentialFunctionName(FunctionBuilderParserParser.ExponentialFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#irrationalFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterIrrationalFunctionName(FunctionBuilderParserParser.IrrationalFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#irrationalFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitIrrationalFunctionName(FunctionBuilderParserParser.IrrationalFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#gammaFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterGammaFunctionName(FunctionBuilderParserParser.GammaFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#gammaFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitGammaFunctionName(FunctionBuilderParserParser.GammaFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#trigonometricFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterTrigonometricFunctionName(FunctionBuilderParserParser.TrigonometricFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#trigonometricFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitTrigonometricFunctionName(FunctionBuilderParserParser.TrigonometricFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#hyperbolicFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterHyperbolicFunctionName(FunctionBuilderParserParser.HyperbolicFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#hyperbolicFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitHyperbolicFunctionName(FunctionBuilderParserParser.HyperbolicFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionBuilderParserParser#factorialFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterFactorialFunctionName(FunctionBuilderParserParser.FactorialFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionBuilderParserParser#factorialFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitFactorialFunctionName(FunctionBuilderParserParser.FactorialFunctionNameContext ctx);
}