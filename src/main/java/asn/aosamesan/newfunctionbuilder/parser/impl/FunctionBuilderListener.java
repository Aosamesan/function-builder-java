package asn.aosamesan.newfunctionbuilder.parser.impl;

import asn.aosamesan.newfunctionbuilder.composers.BinaryComposer;
import asn.aosamesan.newfunctionbuilder.composers.BinaryComposers;
import asn.aosamesan.newfunctionbuilder.composers.UnaryComposers;
import asn.aosamesan.newfunctionbuilder.functions.*;
import asn.aosamesan.newfunctionbuilder.parser.FunctionBuilderParserBaseListener;
import asn.aosamesan.newfunctionbuilder.parser.FunctionBuilderParserParser;
import org.antlr.v4.runtime.Token;

import java.util.Stack;

public class FunctionBuilderListener extends FunctionBuilderParserBaseListener {
    private Stack<UnivariateFunction> stack;

    public FunctionBuilderListener() {
        stack = new Stack<>();
    }

    public UnivariateFunction build() {
        if (stack.size() != 1) {
            throw new RuntimeException("Something wrong...");
        }
        return stack.pop();
    }

    private BinaryComposer getBinaryComposer(String op) {
        return switch (op) {
            case "+" -> BinaryComposers.ADD;
            case "-" -> BinaryComposers.SUB;
            case "*", "×" -> BinaryComposers.MUL;
            case "/", "÷" -> BinaryComposers.DIV;
            case "^" -> BinaryComposers.POW;
            case "mod", "%" -> BinaryComposers.MOD;
            default -> throw new RuntimeException("Unexpected operator :" + op);
        };
    }

    private void binaryCompose(Token op) {
        if (op != null) {
            binaryCompose(op.getText());
        }
    }

    private void binaryCompose(String op) {
        var post = stack.pop();
        var prev = stack.pop();
        var composer = getBinaryComposer(op);
        stack.push(composer.compose(prev, post));
    }

    private void negate(Token sign) {
        if (sign != null) {
            if ("-".equals(sign.getText())) {
                var top = stack.pop();
                stack.push(UnaryComposers.NEGATE.compose(top));
            }
        }
    }

    private UnivariateFunction getLogarithmicFunction(String functionName) {
        return switch (functionName) {
            case "log" -> LogarithmicFunctions.LOG10;
            case "ln" -> LogarithmicFunctions.LOG;
            default -> throw new RuntimeException("Unexpected logarithmic function name : " + functionName);
        };
    }

    private UnivariateFunction getExponentialFunction(String functionName) {
        if ("exp".equals(functionName)) {
            return ExponentialFunctions.EXP;
        }
        throw new RuntimeException("Unexpected exponential function name : " + functionName);
    }

    private UnivariateFunction getGammaFunction(String functionName) {
        return switch (functionName) {
            case "gamma", "Γ" -> GammaFunctions.GAMMA;
            case "!" -> GammaFunctions.FACTORIAL;
            default -> throw new RuntimeException("Unexpected gamma function name : " + functionName);
        };
    }

    private UnivariateFunction getIrrationalFunction(String functionName) {
        if ("√".equals(functionName) || "sqrt".equals(functionName)) {
            return IrrationalFunctions.SQRT;
        }
        throw new RuntimeException("Unexpected irrational function name : " + functionName);
    }

    private boolean isArcFunction(String functionName) {
        return functionName != null && (
                    functionName.startsWith("arc") || functionName.startsWith("a")
                ||  functionName.endsWith("^-1") || functionName.endsWith("^(-1)")
                );
    }

    private String getBaseFunction(String functionName) {
        return functionName.replaceAll("^a(rc)?", "")
                .replaceAll("\\^[(]?-1[)]$", "");
    }

    private UnivariateFunction getTrigonometricFunction(String functionName) {
        var isArc = isArcFunction(functionName);
        var baseFunctionName = getBaseFunction(functionName);

        if (isArc) {
            return switch (baseFunctionName) {
                case "sin" -> TrigonometricFunctions.ASIN;
                case "cos" -> TrigonometricFunctions.ACOS;
                case "tan" -> TrigonometricFunctions.ATAN;
                case "csc", "cosec" -> TrigonometricFunctions.ACSC;
                case "sec" -> TrigonometricFunctions.ASEC;
                case "cot" -> TrigonometricFunctions.ACOT;
                default -> throw new RuntimeException("Unexpected trigonometric function(arc) : " + functionName);
            };
        }

        return switch (baseFunctionName) {
            case "sin" -> TrigonometricFunctions.SIN;
            case "cos" -> TrigonometricFunctions.COS;
            case "tan" -> TrigonometricFunctions.TAN;
            case "csc", "cosec" -> TrigonometricFunctions.CSC;
            case "sec" -> TrigonometricFunctions.SEC;
            case "cot" -> TrigonometricFunctions.COT;
            default -> throw new RuntimeException("Unexpected trigonometric function : " + functionName);
        };
    }

    private UnivariateFunction getHyperbolicFunction(String functionName) {
        var isArc = isArcFunction(functionName);
        var baseFunctionName = getBaseFunction(functionName);

        if (isArc) {
            return switch (baseFunctionName) {
                case "sinh" -> HyperbolicFunctions.ASINH;
                case "cosh" -> HyperbolicFunctions.ACOSH;
                case "tanh" -> HyperbolicFunctions.ATANH;
                case "csch", "cosech" -> HyperbolicFunctions.ACSCH;
                case "sech" -> HyperbolicFunctions.ASECH;
                case "coth" -> HyperbolicFunctions.ACOTH;
                default -> throw new RuntimeException("Unexpected hyperbolic function(arc) : " + functionName);
            };
        }

        return switch (baseFunctionName) {
            case "sinh" -> HyperbolicFunctions.SINH;
            case "cosh" -> HyperbolicFunctions.COSH;
            case "tanh" -> HyperbolicFunctions.TANH;
            case "csch", "cosech" -> HyperbolicFunctions.CSCH;
            case "sech" -> HyperbolicFunctions.SECH;
            case "coth" -> HyperbolicFunctions.COTH;
            default -> throw new RuntimeException("Unexpected hyperbolic function : " + functionName);
        };
    }

    @Override
    public void exitModulus(FunctionBuilderParserParser.ModulusContext ctx) {
        binaryCompose(ctx.op);
    }

    @Override
    public void exitAddition(FunctionBuilderParserParser.AdditionContext ctx) {
        binaryCompose(ctx.op);
    }

    @Override
    public void exitMultiplication(FunctionBuilderParserParser.MultiplicationContext ctx) {
        binaryCompose(ctx.op);
    }

    @Override
    public void exitWithoutOp(FunctionBuilderParserParser.WithoutOpContext ctx) {
        binaryCompose("*");
    }

    @Override
    public void exitSignedPower(FunctionBuilderParserParser.SignedPowerContext ctx) {
        negate(ctx.sign);
    }

    @Override
    public void exitPower(FunctionBuilderParserParser.PowerContext ctx) {
        if (ctx.op != null || ctx.numeric() != null) {
            binaryCompose("^");
        }
    }

    @Override
    public void exitSignedFunction(FunctionBuilderParserParser.SignedFunctionContext ctx) {
        negate(ctx.sign);
    }

    @Override
    public void exitFunction(FunctionBuilderParserParser.FunctionContext ctx) {
        UnivariateFunction function = null;

        if (ctx.prefixFunctionName() != null) {
            var prefixFunction = ctx.prefixFunctionName();
            if (prefixFunction.logarithmicFunctionName() != null) {
                function = getLogarithmicFunction(prefixFunction.getText());
            } else if (prefixFunction.exponentialFunctionName() != null) {
                function = getExponentialFunction(prefixFunction.getText());
            } else if (prefixFunction.irrationalFunctionName() != null) {
                function = getIrrationalFunction(prefixFunction.getText());
            } else if (prefixFunction.trigonometricFunctionName() != null) {
                function = getTrigonometricFunction(prefixFunction.getText());
            } else if (prefixFunction.hyperbolicFunctionName() != null) {
                function = getHyperbolicFunction(prefixFunction.getText());
            } else if (prefixFunction.gammaFunctionName() != null) {
                function = getGammaFunction(prefixFunction.getText());
            }
        } else if (ctx.postfixFunctionName() != null) {
            var postfixFunction = ctx.postfixFunctionName();
            if ("!".equals(postfixFunction.getText())) {
                function = getGammaFunction(postfixFunction.getText());
            }
        }

        if (function != null) {
            var top = stack.pop();
            stack.push(BinaryComposers.COMPOSE.compose(top, function));
        }
    }

    @Override
    public void exitSignedAtom(FunctionBuilderParserParser.SignedAtomContext ctx) {
        negate(ctx.sign);
    }

    @Override
    public void exitScalarProduct(FunctionBuilderParserParser.ScalarProductContext ctx) {
        if (ctx.variable() != null) {
            var last = stack.pop();
            var prev = stack.pop();
            var result = BinaryComposers.MUL.compose(prev, last);
            if (ctx.number() != null) {
                result = BinaryComposers.MUL.compose(stack.pop(), result);
            }
            stack.push(result);
        }
    }

    @Override
    public void exitNumeric(FunctionBuilderParserParser.NumericContext ctx) {
        var number = ctx.getText();
        UnivariateFunction constantFunction = x -> Double.parseDouble(number);
        stack.push(constantFunction);
    }

    @Override
    public void exitConstant(FunctionBuilderParserParser.ConstantContext ctx) {
        UnivariateFunction constantFunction = switch (ctx.getText()) {
            case "pi", "PI", "π" -> x -> Math.PI;
            case "e" -> x -> Math.E;
            default -> throw new RuntimeException("Unexpected constant : " + ctx.getText());
        };
        stack.push(constantFunction);
    }

    @Override
    public void exitVariable(FunctionBuilderParserParser.VariableContext ctx) {
        stack.push(UnivariateFunction.IDENTITY);
    }
}
