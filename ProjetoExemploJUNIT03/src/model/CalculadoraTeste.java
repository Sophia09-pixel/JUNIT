package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void somateste10com9() {
		//variavel com o valor esperado
		int valorEsperado = 19;
		
		//variavel para receber o valor real da simulacao
		int valorReal = 0;
		
		//Execução do calculo
		var calc = new Calculadora();
		valorReal = calc.soma(10, 9);
		
		//Validacao do resultado
		assertEquals(valorReal, valorEsperado);
		
	}
	
	@Test
	public void somateste9com9() {
		//variavel com o valor esperado
		int valorEsperado = 18;
		
		//variavel para receber o valor real da simulacao
		int valorReal = 0;
		
		//Execução do calculo
		var calc = new Calculadora();
		valorReal = calc.soma(9, 9);
		
		//Validacao do resultado
		assertEquals(valorReal, valorEsperado);
		
	}
	

	@Test //escrever @Teste para fazer o teste
	public void subtracaotest10por9() {
		//variavel com o valor esperado
		int valorEsperado = 1;
		
		//variavel para receber o valor real da simulacao
		int valorReal = 0;
		
		//Execução do calculo
		var calc = new Calculadora();
		valorReal = calc.subtracao(10, 9);
		
		//Validacao do resultado
		assertEquals(valorReal, valorEsperado);
		
	}
	
	@Test
	public void multiplicacaotest50por2() {
		//variavel com o valor esperado
		int valorEsperado = 100;
		
		//variavel para receber o valor real da simulacao
		int valorReal = 0;
		
		//Execução do calculo
		var calc = new Calculadora();
		valorReal = calc.multiplicacao(50, 2);
		
		//Validacao do resultado
		assertEquals(valorReal, valorEsperado);
		
	}
	
	
	@Test
	public void divisaotest10por2() {
		//variavel com o valor esperado
		double valorEsperado = 5;
		
		//variavel para receber o valor real da simulacao
		double valorReal = 0;
		
		//Execução do calculo
		var calc = new Calculadora();
		valorReal = calc.divisao(2, 10);
		
		//Validacao do resultado
		assertEquals(valorReal, valorEsperado, 0.0);
		
	}

}
