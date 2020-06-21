package br.com.curso.java.udemy;

import javax.swing.JOptionPane;

public class ConversaoTipoPrimario {

	public static void main(String[] args) {
		
		int  a = 1;
		float b = (float) 1.0; // Cast
		int c = 4;
		byte d = (byte) c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// conversão numero pra string.
		
		Integer num1 = 10000;
		Integer num2= 100000;
		System.out.println(num1.toString().length()); // conta a quantidade de caracters
		System.out.println(Integer.toString(num2).charAt(0)); // pega o caracter que está na posição 0 do texto.
		
		// conversão String para numero.
		
		String valor1;
		String valor2;
		
		valor1 = JOptionPane.showInputDialog("Digite o 1 numero");
		valor2 = JOptionPane.showInputDialog("Digite o 2 numero");
		
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); // conversao
		double numero2 = Double.parseDouble(valor2); // conversao
		
		System.out.println(numero1 + numero2);
		
	}

}
