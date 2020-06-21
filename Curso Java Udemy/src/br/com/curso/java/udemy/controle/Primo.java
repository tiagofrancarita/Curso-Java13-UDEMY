package br.com.curso.java.udemy.controle;

import javax.swing.JOptionPane;

public class Primo {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um numero");

		int numero = Integer.parseInt(valor);
		
		if(numero > 1 && numero % numero == 0 && numero % 1 == 0){
			System.out.println("maior que 1");
			System.out.println("Divisivel por um e por ele mesmo ");
			System.out.println("Numero primo");
		}else
			System.out.println("Não é primo");

	}

}
