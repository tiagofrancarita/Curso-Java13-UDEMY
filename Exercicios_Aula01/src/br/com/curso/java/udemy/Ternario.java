package br.com.curso.java.udemy;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 3;
		// String resultadoParcial = media >= 5 ? "Em recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "Em recuperação";
		
		System.out.println("O Aluno está: " + resultadoFinal);

	}

}
