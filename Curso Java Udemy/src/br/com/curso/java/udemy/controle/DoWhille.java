package br.com.curso.java.udemy.controle;

import java.util.Scanner;

public class DoWhille {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String texto="";
		
		do{
			System.out.println("Favor fala as palavra magica");
			System.out.println("Quer sair?");
			texto = sc.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("é nois");
		sc.close();

	}

}
