package asn.aosamesan.newfunctionbuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewFunctionBuilderApplicationTests {
	@Autowired
	private FunctionBuilder builder;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldCalculate() {
		String expr = "asinh(sinhx)";
		var function = builder.build(expr);

		RNG.generateRandomInteger(10, 50).forEach(x -> Assertions.assertEquals((double) x, function.value(x)));
	}

}
