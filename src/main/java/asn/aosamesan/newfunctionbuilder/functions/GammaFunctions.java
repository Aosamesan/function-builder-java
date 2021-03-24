package asn.aosamesan.newfunctionbuilder.functions;

import asn.aosamesan.newfunctionbuilder.composers.FunctionShift;
import org.apache.commons.math3.special.Gamma;

public enum GammaFunctions implements UnivariateFunction {
    GAMMA(Gamma::gamma),
    FACTORIAL(FunctionShift.horizontalXShift(Gamma::gamma, -1))

    ;
    UnivariateFunction function;

    GammaFunctions(UnivariateFunction function) {
        this.function = function;
    }

    @Override
    public double value(double x) {
        return function.value(x);
    }
}
