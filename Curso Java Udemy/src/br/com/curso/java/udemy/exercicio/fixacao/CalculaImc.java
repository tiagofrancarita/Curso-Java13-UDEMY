package br.com.curso.java.udemy.exercicio.fixacao;

import java.util.Scanner;

public class CalculaImc {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		double peso;
		double altura;
		double formula;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Calculo IMC");

		System.out.println("Informe o nome do paciente: ");
		nome = sc.nextLine();
		
		System.out.println("Informe a idade:");
		idade = sc.nextInt();
		
		System.out.println("Informe o peso:");
		peso = sc.nextDouble();
		
		System.out.println("Informe o altura:");
		altura = sc.nextDouble();
		
		//Peso / altura 2
		formula = (peso / Math.pow(altura, 2));
		
		System.out.printf("O IMC do paciente : " + nome + " idade: "+ idade + " anos. " + " é :%.2f %n ", formula);
		
		sc.close();
	}

}
