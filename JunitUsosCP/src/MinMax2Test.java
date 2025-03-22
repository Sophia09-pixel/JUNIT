import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMax2Test {

	@Test
	void testCenario1Menor2() {
		var minMax = new MinMax2();
		int resultadoFinal = minMax.retornaMin(10, 5, 8);
		int resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultadoFinal);
	}
	
	@Test
	void testCenario1Menor3() {
		var minMax = new MinMax2();
		int resultadoFinal = minMax.retornaMin(10, 5, 3);
		int resultadoEsperado = 3;
		assertEquals(resultadoEsperado, resultadoFinal);
	}

}
