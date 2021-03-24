package asn.aosamesan.newfunctionbuilder.controllers;

import asn.aosamesan.newfunctionbuilder.model.Result;
import asn.aosamesan.newfunctionbuilder.services.FunctionBuilderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FunctionBuilderController {
    private FunctionBuilderService service;

    public FunctionBuilderController(FunctionBuilderService service) {
        this.service = service;
    }

    @GetMapping("/calculate")
    public Mono<Result> calculate(@RequestParam String expr, @RequestParam double x) {
        return service.calculate(expr, x);
    }
}
