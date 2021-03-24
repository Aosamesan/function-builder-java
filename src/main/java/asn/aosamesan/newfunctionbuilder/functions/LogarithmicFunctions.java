package asn.aosamesan.newfunctionbuilder.functions;

public enum LogarithmicFunctions implements UnivariateFunction {
    LOG10(Math::log10),
    LOG(Math::log)

    ;
    UnivariateFunction function;

    LogarithmicFunctions(UnivariateFunction function) {
        this.function = function;
    }

    @Override
    public double value(double x) {
        return function.value(x);
    }
}
