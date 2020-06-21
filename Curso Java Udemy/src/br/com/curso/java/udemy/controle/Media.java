package br.com.curso.java.udemy.controle;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		double nota;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a nota");
		nota = sc.nextDouble();
		
		if(nota >10 || nota<0){
			System.out.println("Nota invalida, verifique.");
		}else if(nota >= 8.0 ){
			System.out.println("Conceito A");
		}else if(nota >= 6 ){
			System.out.println("Conceito B");
		}else if(nota <= 6 ){
			System.out.println("Recuperação");
		}
		sc.close();

	}

}
