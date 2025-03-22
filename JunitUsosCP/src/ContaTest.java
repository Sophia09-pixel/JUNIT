import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testSetSaldo() {
		var conta = new Conta();
		
		conta.setSaldo(180.0);
		Double resultadoEsperado = 180.0;
		Double resultadoFinal = conta.getSaldo();
		
		assertEquals(resultadoEsperado, resultadoFinal);
		
	}
	
	@Test
	public void testGetSaldo() {
		var conta = new Conta();
		
		conta.setSaldo(150.0);
		Double resultadoEsperado = 150.0;
		Double resultadoFinal = conta.getSaldo();
		
		assertEquals(resultadoEsperado, resultadoFinal);
		
	}
	
	@Test
	public void testDepositar() {
		var conta = new Conta();
		
		conta.setSaldo(150.0);
		conta.depositar(50.0);
		Double resultadoEsperado = 200.0;
		Double resultadoFinal = conta.getSaldo();
		
		assertEquals(resultadoEsperado, resultadoFinal);
		
	}
	
	
}
