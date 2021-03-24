package asn.aosamesan.newfunctionbuilder.functions;

import asn.aosamesan.newfunctionbuilder.composers.BinaryComposers;
import asn.aosamesan.newfunctionbuilder.composers.UnaryComposers;

public enum TrigonometricFunctions implements UnivariateFunction {
    SIN(Math::sin),
    COS(Math::cos),
    TAN(Math::tan),
    CSC(UnaryComposers.RECIPROCAL.compose(Math::sin)),
    SEC(UnaryComposers.RECIPROCAL.compose(Math::cos)),
    COT(UnaryComposers.RECIPROCAL.compose(Math::tan)),
    ASIN(Math::asin),
    ACOS(Math::acos),
    ATAN(Math::atan),
    ACSC(BinaryComposers.COMPOSE.compose(UnivariateFunction.RECIPROCAL, Math::asin)),
    ASEC(BinaryComposers.COMPOSE.compose(UnivariateFunction.RECIPROCAL, Math::acos)),
    ACOT(BinaryComposers.COMPOSE.compose(UnivariateFunction.RECIPROCAL, Math::atan))

    ;

    UnivariateFunction function;

    TrigonometricFunctions(UnivariateFunction function) {
        this.function = function;
    }

    @Override
    public double value(double x) {
        return function.value(x);
    }
}
