import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DilemaPrisioneiroTeste {

	@Test
	void testeCondenacaoMutua() {
		DilemaPrisioneiro dilema = new DilemaPrisioneiro();
		
		Resposta respPrisioneiroA = Resposta.DELACAO;
		Resposta respPrisioneiroB = Resposta.DELACAO;
		
		int resultadoEsperado = 5;
		
		int resultado = dilema.calculaPena(respPrisioneiroA, respPrisioneiroB);
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	void testeInocencia() {
		DilemaPrisioneiro dilema = new DilemaPrisioneiro();
		
		Resposta respPrisioneiroA = Resposta.DELACAO;
		Resposta respPrisioneiroB = Resposta.NEGACAO;
		
		int resultadoEsperado = 0;
		
		int resultado = dilema.calculaPena(respPrisioneiroA, respPrisioneiroB);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testeCondenacaoIndividual() {
		DilemaPrisioneiro dilema = new DilemaPrisioneiro();
		
		Resposta respPrisioneiroA = Resposta.NEGACAO;
		Resposta respPrisioneiroB = Resposta.DELACAO;
		
		int resultadoEsperado = 10;
		
		int resultado = dilema.calculaPena(respPrisioneiroA, respPrisioneiroB);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testeCondenacaoCumplices() {
		DilemaPrisioneiro dilema = new DilemaPrisioneiro();
		
		Resposta respPrisioneiroA = Resposta.NEGACAO;
		Resposta respPrisioneiroB = Resposta.NEGACAO;
		
		int resultadoEsperado = 1;
		
		int resultado = dilema.calculaPena(respPrisioneiroA, respPrisioneiroB);
		
		assertEquals(resultadoEsperado, resultado);
	}

}
