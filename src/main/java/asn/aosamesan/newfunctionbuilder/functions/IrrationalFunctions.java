package asn.aosamesan.newfunctionbuilder.functions;

public enum IrrationalFunctions implements UnivariateFunction {
    SQRT(Math::sqrt)

    ;

    UnivariateFunction function;

    IrrationalFunctions(UnivariateFunction function) {
        this.function = function;
    }

    @Override
    public double value(double x) {
        return function.value(x);
    }
}
