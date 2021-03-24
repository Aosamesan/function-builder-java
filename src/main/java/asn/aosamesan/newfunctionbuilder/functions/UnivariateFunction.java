package asn.aosamesan.newfunctionbuilder.functions;

@FunctionalInterface
public interface UnivariateFunction {
    double value(double x);

    UnivariateFunction RECIPROCAL = x -> 1.0 / x;
    UnivariateFunction IDENTITY = x -> x;

    static UnivariateFunction constantFunction(double c) {
        return x -> c;
    }
}
