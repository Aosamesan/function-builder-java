package asn.aosamesan.newfunctionbuilder.functions;

import asn.aosamesan.newfunctionbuilder.composers.BinaryComposers;
import asn.aosamesan.newfunctionbuilder.composers.UnaryComposers;

public enum HyperbolicFunctions implements UnivariateFunction {
    SINH(Math::sinh),
    COSH(Math::cosh),
    TANH(Math::tanh),
    CSCH(UnaryComposers.RECIPROCAL.compose(Math::sinh)),
    SECH(UnaryComposers.RECIPROCAL.compose(Math::cosh)),
    COTH(UnaryComposers.RECIPROCAL.compose(Math::tanh)),
    ASINH(x -> Math.log(Math.sqrt(Math.pow(x, 2) + 1) + x)),
    ACOSH(x -> Math.log(Math.sqrt(x + 1) * Math.sqrt(x - 1) + x)),
    ATANH(x -> Math.log(Math.sqrt((1 + x) / (1 - x)))),
    ACSCH(BinaryComposers.COMPOSE.compose(UnivariateFunction.RECIPROCAL, HyperbolicFunctions.ASINH)),
    ASECH(BinaryComposers.COMPOSE.compose(UnivariateFunction.RECIPROCAL, HyperbolicFunctions.ACOSH)),
    ACOTH(BinaryComposers.COMPOSE.compose(UnivariateFunction.RECIPROCAL, HyperbolicFunctions.ATANH))

    ;
    UnivariateFunction function;

    HyperbolicFunctions(UnivariateFunction function) {
        this.function = function;
    }

    @Override
    public double value(double x) {
        return function.value(x);
    }
}
