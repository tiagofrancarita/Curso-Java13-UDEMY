package br.com.curso.java.udemy;

public class Atribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		int b =a;
		int c = a + b;
		
		
		c += b ; //  c = c + b
		c -= a;  //  c = c - a
		c *= b;  //  c = c * b
		c /= a;  //  c = c / a
		c %= 2;  //  c = c %2; 0 ou 1 "MOD"
		
		System.out.println(c);
		
	}

}
