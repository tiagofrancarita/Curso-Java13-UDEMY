package br.com.curso.java.udemy.controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		String Dia;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Dia da Semana: ");
		Dia = sc.nextLine();

		if (Dia.equals("Domingo")) {
			System.out.println("Domingo");
		} else if (Dia.equalsIgnoreCase("Segunda-Feira")) {
			System.out.println(2);
		} else if (Dia.equalsIgnoreCase("Terça-Feira")||Dia.equalsIgnoreCase("Terca-Feira")) {
			System.out.println(3);
		} else if (Dia.equalsIgnoreCase("Quarta-Feira")) {
			System.out.println(4);
		} else if (Dia.equalsIgnoreCase("Quinta-Feira")) {
			System.out.println(5);
		} else if (Dia.equalsIgnoreCase("Sexta-Feira")) {
			System.out.println(6);
		} else if (Dia.equalsIgnoreCase("Sábado")||Dia.equalsIgnoreCase("Sabado")) {
			System.out.println(7);	
		}else{
			System.out.println("Dia Inválido");
		}
		sc.close();

	}
}
