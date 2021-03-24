package asn.aosamesan.newfunctionbuilder.composers;

import asn.aosamesan.newfunctionbuilder.functions.UnivariateFunction;

public enum BinaryComposers implements BinaryComposer {
    ADD((a, b) -> x -> a.value(x) + b.value(x)),
    SUB((a, b) -> x -> a.value(x) - b.value(x)),
    MUL((a, b) -> x -> a.value(x) * b.value(x)),
    DIV((a, b) -> x -> a.value(x) / b.value(x)),
    POW((a, b) -> x -> Math.pow(a.value(x), b.value(x))),
    MOD((a, b) -> x -> a.value(x) % b.value(x)),
    COMPOSE((a, b) -> x -> b.value(a.value(x)))

    ;
    BinaryComposer composer;

    BinaryComposers(BinaryComposer composer) {
        this.composer = composer;
    }

    @Override
    public UnivariateFunction compose(UnivariateFunction inner, UnivariateFunction outer) {
        return composer.compose(inner, outer);
    }
}
