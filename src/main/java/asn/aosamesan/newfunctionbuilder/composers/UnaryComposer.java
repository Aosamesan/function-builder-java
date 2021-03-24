package asn.aosamesan.newfunctionbuilder.composers;

import asn.aosamesan.newfunctionbuilder.functions.UnivariateFunction;

@FunctionalInterface
public interface UnaryComposer {
    UnivariateFunction compose(UnivariateFunction function);
}
