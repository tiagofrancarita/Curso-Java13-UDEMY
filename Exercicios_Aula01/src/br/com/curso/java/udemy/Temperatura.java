package br.com.curso.java.udemy;

public class Temperatura {

	public static void main(String[] args) {
		
		double F=86;
		final double ajuste=32;
		final double fator = 5/9.0;
		double conversao;
		
		conversao =(F - ajuste) * fator;
		
		System.out.println("A conversão de Fahrenheit para  Celsius é :" + conversao  +"ºC");

	}

}
