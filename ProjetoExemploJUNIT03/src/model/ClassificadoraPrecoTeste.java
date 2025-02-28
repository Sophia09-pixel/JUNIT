package model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class ClassificadoraPrecoTeste {

	//Variavel para contagem de teste
	public static int contadorTeste = 1;
	
	@Before
	public void preparacaoTeste() {
		System.out.println("Vou executar o teste " + contadorTeste);
	}
	
	@After
	public void encerramentoTeste() {
		System.out.println("Teste "+contadorTeste+" finalizado");
		contadorTeste++;
	}
	
	@Test
	public void testeOrdenaProduto() {
        var produto1 = new Produto("C", 100);
        var produto2 = new Produto("B", 15);
        var produto3 = new Produto("A", 160);
        var produto4 = new Produto("A", 180);
        
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        
        List<Produto> produtosOrdenadosEsperados = new ArrayList<>();
        produtosOrdenadosEsperados.add(produto3);
        produtosOrdenadosEsperados.add(produto4);
        produtosOrdenadosEsperados.add(produto2);
        produtosOrdenadosEsperados.add(produto1);
        
        var classificadora = new ClassificadoraPreco();
        
        List<Produto> produtosOrdenados = classificadora.classificaProdutosPorPreco(produtos);
        
        //assertEquals(produtosOrdenadosEsperados, produtosOrdenados);        
        assertArrayEquals(produtosOrdenadosEsperados.toArray(), produtosOrdenados.toArray());
        
	}
	

}
