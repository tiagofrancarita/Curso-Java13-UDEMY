package br.com.curso.java.udemy.exercicio.fixacao;

import java.util.Scanner;

public class ValorQuadradoeCubo {

	public static void main(String[] args) {
		
		double valor;
		final double quadrado=2;
		final double cubo=3;
		double formulaQ;
		double formulaC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor:");
		valor = sc.nextDouble();
		
		formulaQ = (Math.pow(valor, quadrado));
		formulaC = (Math.pow(valor, cubo));
		
		System.out.println(" O valor : " + valor +
				" elevado ao quadrado é: "+ formulaQ);
		
		System.out.println(" O valor : " + valor +
				" elevado ao cubo é: "+ formulaC);
		
		sc.close();
		

	}

}
