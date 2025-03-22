import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTest {
	
	@Test
	void testGetterPeso() {
		var produto = new Produto(180,190);
		double resultadoEsperado = 180;
		double resultadoFinal = produto.getPeso();
		assertEquals(resultadoEsperado, resultadoFinal);
	}
	
	@Test
	void testGetterAltura() {
		var produto = new Produto(180,190);
		double resultadoEsperado = 190;
		double resultadoFinal = produto.getAltura();
		assertEquals(resultadoEsperado, resultadoFinal);
	}
	
	@Test
	void testSetPeso() {
		var produto = new Produto();
		produto.setPeso(180);
		
		double resultadoEsperado = 180;
		double resultadoFinal = produto.getPeso();
		
		assertEquals(resultadoEsperado, resultadoFinal);
	}
	
	@Test
	void testSetAltura() {
		var produto = new Produto();
		produto.setAltura(180);
		
		double resultadoEsperado = 180;
		double resultadoFinal = produto.getAltura();
		
		assertEquals(resultadoEsperado, resultadoFinal);
	}
	

}
