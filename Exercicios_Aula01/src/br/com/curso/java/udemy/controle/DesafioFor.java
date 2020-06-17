package br.com.curso.java.udemy.controle;

public class DesafioFor {

	public static void main(String[] args) {
		// nao pode usar valor numerico pra controlar o laço
		
		//String valor="#";
		for (String x = "#" ; !x.equals("######") ; x +="#"){
			System.out.println(x);
			//valor +="#";
		}
		

	}

}
