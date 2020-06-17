package br.com.curso.java.udemy.controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String valor ="";
		
		while(!valor.equalsIgnoreCase("Sair")){
			System.out.println("Digite Algo");
			valor = sc.nextLine();
			
		}
		
		
		sc.close();

	}

}
