package asn.aosamesan.newfunctionbuilder;

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

		for (int i = 0; i < 5; i++) {
			System.out.printf("f(%d)=%f\n", i, function.value(i));
		}
	}

}
