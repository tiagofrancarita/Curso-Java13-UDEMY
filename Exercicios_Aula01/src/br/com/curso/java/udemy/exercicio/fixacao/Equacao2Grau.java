package br.com.curso.java.udemy.exercicio.fixacao;

import java.util.Scanner;

/* Escreva um programa para calcular as duas 
** raízes de uma equação de segundo grau,
** sendo dados os valores dos coeficientes 
** a, b e c. 
*/


public class Equacao2Grau {

	public static void main(String[] args) {
		// formula: x= -b +- raiz de b2 - 4.a.c/2.a
		// raiz quadrada -- Math.sqrt(x);
		
		double b;
		final double A4 = 4.0;
		double a;
		double c;
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Resolvendo Equações 2º Grau::");
		
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		
		
		
		
		
sc.close();
	}

}
