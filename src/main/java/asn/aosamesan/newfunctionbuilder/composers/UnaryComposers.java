package asn.aosamesan.newfunctionbuilder.composers;

import asn.aosamesan.newfunctionbuilder.functions.UnivariateFunction;

public enum UnaryComposers implements UnaryComposer {
    NEGATE(f -> x -> -f.value(x)),
    RECIPROCAL(f -> x -> 1.0 / f.value(x))

    ;
    UnaryComposer composer;

    UnaryComposers(UnaryComposer composer) {
        this.composer = composer;
    }

    @Override
    public UnivariateFunction compose(UnivariateFunction function) {
        return composer.compose(function);
    }
}
