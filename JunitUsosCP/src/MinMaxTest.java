import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinMaxTest {

	@Test
	void testDigitacao() {
		int valEsperado = 1;
		MinMax comparadora = new MinMax();
		int nroDigitado = comparadora.capturaNro();
		assertEquals(nroDigitado, valEsperado);
	}

}
