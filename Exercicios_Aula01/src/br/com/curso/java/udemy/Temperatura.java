package br.com.curso.java.udemy;

public class Temperatura {

	public static void main(String[] args) {
		
		double F=20;
		final double f1=32;
		final double x = 5/9.0;
		double conversao;
		
		conversao =(F - f1) * x;
		
		System.out.println("A conversão de Fahrenheit para  Celsius é :" + conversao  +"ºC");

	}

}
