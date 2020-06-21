package br.com.curso.java.udemy;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a matricula");
		pessoa.setMatricula(sc.nextLine());
		
		System.out.println("Digite o CPF");
		pessoa.setCpf(sc.nextLine());
		
		System.out.println("Digite a Dt nascimento");
		pessoa.setDtNasc(sc.nextLine());
		
		System.out.println(pessoa.toString());

		
		sc.close();
	}

}
