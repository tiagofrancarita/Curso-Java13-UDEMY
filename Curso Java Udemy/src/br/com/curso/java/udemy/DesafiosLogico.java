package br.com.curso.java.udemy;

public class DesafiosLogico {

	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2; 
		System.out.println("comprou TV 50\"?" + comprouTV50);
		
		boolean comprouTV32 = trabalho1 ^ trabalho2; 
		System.out.println("comprou TV 32\"?" + comprouTV32);
		
		boolean comprouSorvete = trabalho1 || trabalho2; 
		System.out.println("comprou TV 32\" e Sorvete?" + comprouSorvete);
		
		boolean maisSaudavel = !comprouSorvete; 
		System.out.println("mais Saudavel?" + maisSaudavel);
	}

}
