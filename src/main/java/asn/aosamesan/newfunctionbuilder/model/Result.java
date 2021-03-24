package asn.aosamesan.newfunctionbuilder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Result {
    private final String expression;
    private final double input;
    private final double result;
}
