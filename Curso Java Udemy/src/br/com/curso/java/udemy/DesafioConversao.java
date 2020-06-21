package br.com.curso.java.udemy;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		String salJan;
		String SalFev;
		String salMar;
		Float resultado;
		Float media;
		
		Scanner sc = new Scanner (System.in);
		// recebe o valor informado pelo usuario e armaneza na var Saljan
		System.out.println("Digite o Salário do mês Janeiro: ");
		salJan = sc.nextLine().replace("," , ".");
		
		System.out.println("Digite o salário do mês de Fevereiro: ");
		SalFev = sc.nextLine().replace("," , ".");
		
		System.out.println("Digite o salário do mês de Março ");
		salMar = sc.nextLine().replace("," , ".");
		
		float numero1 = Float.parseFloat(salJan); // conversao
		float numero2 = Float.parseFloat(SalFev); // conversao
		float numero3 = Float.parseFloat(salMar); // conversao
		
		resultado = (numero1 + numero2 + numero3);
		media = (resultado/3);
		 System.out.printf("A soma do salario dos 3 meses é: R$ %.2f %n", resultado);
		 System.out.printf("A média do salario dos 3 meses é: R$ %.2f %n", media);
		
		sc.close();

	}

}
