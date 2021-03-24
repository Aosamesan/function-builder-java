package asn.aosamesan.newfunctionbuilder.functions;

public enum ExponentialFunctions implements UnivariateFunction {
    EXP(Math::exp)

    ;

    UnivariateFunction function;

    ExponentialFunctions(UnivariateFunction function) {
        this.function = function;
    }

    @Override
    public double value(double x) {
        return function.value(x);
    }
}
