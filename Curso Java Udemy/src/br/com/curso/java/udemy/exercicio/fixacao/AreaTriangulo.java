package br.com.curso.java.udemy.exercicio.fixacao;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		double base;
		double altura;
		double formula;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do triangulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo: ");
		altura = sc.nextDouble();
		
		formula = (base * altura)/2;
		
		System.out.println("A Area do triango é : " + formula);
		
		
		
		sc.close();

	}

}
