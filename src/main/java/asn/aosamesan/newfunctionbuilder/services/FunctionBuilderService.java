package asn.aosamesan.newfunctionbuilder.services;

import asn.aosamesan.newfunctionbuilder.FunctionBuilder;
import asn.aosamesan.newfunctionbuilder.model.Result;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FunctionBuilderService {
    private FunctionBuilder builder;

    public FunctionBuilderService(FunctionBuilder builder) {
        this.builder = builder;
    }

    public Mono<Result> calculate(String expr, double x) {
        var function = builder.build(expr);
        var result = function.value(x);
        return Mono.just(new Result(expr, x, result));
    }
}
