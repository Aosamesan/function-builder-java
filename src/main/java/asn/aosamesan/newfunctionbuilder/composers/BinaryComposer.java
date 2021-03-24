package asn.aosamesan.newfunctionbuilder.composers;

import asn.aosamesan.newfunctionbuilder.functions.UnivariateFunction;

@FunctionalInterface
public interface BinaryComposer {
    UnivariateFunction compose(UnivariateFunction inner, UnivariateFunction outer);
}
