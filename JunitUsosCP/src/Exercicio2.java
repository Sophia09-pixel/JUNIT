import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercicio2 {

	@Test
	void testeCenarioSucesso() {
		String resultadoEsperado = "resultadoEsperado";
		String resultadoObtido = "resultadoEsperado";

		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	void testeCenarioFalha() {
		String resultadoEsperado = "Funcionário já existe";
		String resultadoObtido = "Funcionário já existe";

		assertEquals(resultadoEsperado, resultadoObtido);
	}

}
