package principal;

import java.util.Scanner;

import model.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int a = 5;
		int b = 7;
		
		Calculadora calculadora = new Calculadora();
		System.out.println("Soma: "+calculadora.soma(a, b));
		System.out.println("Subtracao: "+calculadora.subtracao(a, b));
		System.out.println("Multiplicacao: "+calculadora.multiplicacao(a, b));
		System.out.println("Divisao: "+calculadora.divisao(a, b));

	}

}
