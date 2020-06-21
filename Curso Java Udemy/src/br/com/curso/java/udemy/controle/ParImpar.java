package br.com.curso.java.udemy.controle;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe um numero");

		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("Número par");
		} else if (numero % 2 == 1) {
			System.out.println("Número impar");

		}

		
		}
		// ele é maior do que um e
		// é divisível apenas por um e por ele mesmo.

	}

