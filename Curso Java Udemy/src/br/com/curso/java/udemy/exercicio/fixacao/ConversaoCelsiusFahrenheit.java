package br.com.curso.java.udemy.exercicio.fixacao;

import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {

	public static void main(String[] args) {
		// (0 °C × 9/5) + 32
		
		double C;
		double formula;
		double x = 9.0 / 5.0;
		double y = 32;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Conversão Celsius para Fahrenheit:");
		
		System.out.println("Digite o valor em Celsius:");
		C = sc.nextDouble();
		
		formula= (C * x) + y;
		
		System.out.println(C + " ºC, equivale a " + formula +"ºF");
		
		
		sc.close();

	}

}
