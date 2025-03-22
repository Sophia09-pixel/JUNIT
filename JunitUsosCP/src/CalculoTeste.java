import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculoTeste {

	@Test
	void calculoTeste() {
		float a = 10;
		float b = 15;
		float resultadoEsperado = 25;
		
		float resultado = Calculo.ExecutaCalculo(a, b);
		assertEquals(resultadoEsperado, resultado);
	}

}
