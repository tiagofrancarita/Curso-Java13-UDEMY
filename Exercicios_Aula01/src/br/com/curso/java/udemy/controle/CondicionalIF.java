package br.com.curso.java.udemy.controle;

import java.util.Scanner;

public class CondicionalIF {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		double media;
		
		System.out.println("Informe a nota 1:");
		media= sc.nextDouble();
		
		if(media >= 7){
			
			System.out.println("Aprovado");
		}else
			
			System.out.println("Reprovado");
		
		sc.close();

	}
}
