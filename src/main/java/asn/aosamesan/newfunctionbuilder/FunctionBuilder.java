package asn.aosamesan.newfunctionbuilder;

import asn.aosamesan.newfunctionbuilder.functions.UnivariateFunction;
import asn.aosamesan.newfunctionbuilder.parser.FunctionBuilderParserLexer;
import asn.aosamesan.newfunctionbuilder.parser.FunctionBuilderParserParser;
import asn.aosamesan.newfunctionbuilder.parser.impl.FunctionBuilderListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Component;

@Component
public class FunctionBuilder {
    public UnivariateFunction build(String input) {
        var charStream = CharStreams.fromString(input);
        var lexer = new FunctionBuilderParserLexer(charStream);
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new FunctionBuilderParserParser(tokenStream);
        var listener = new FunctionBuilderListener();
        var tree = parser.start();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.build();
    }
}
