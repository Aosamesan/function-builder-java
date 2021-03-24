package asn.aosamesan.newfunctionbuilder.composers;

import asn.aosamesan.newfunctionbuilder.functions.UnivariateFunction;

public class FunctionShift {
    public static UnivariateFunction horizontalXShift(UnivariateFunction function, double shift) {
        return BinaryComposers.COMPOSE.compose(x -> x - shift, function);
    }

    public static UnivariateFunction horizontalYShift(UnivariateFunction function, double shift) {
        return BinaryComposers.COMPOSE.compose(function, y -> y + shift);
    }
}
