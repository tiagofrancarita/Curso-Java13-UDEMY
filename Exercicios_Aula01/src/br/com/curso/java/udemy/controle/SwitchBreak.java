package br.com.curso.java.udemy.controle;

public class SwitchBreak {

	public static void main(String[] args) {
		
		String conceito="";
		int nota =7;
		
		switch(nota){
		
		case 10:
			conceito = "A";
		break;
		case 7:
			conceito = "B";
		break;
		}
		System.out.println("Conceito:" + conceito);
		

	}

}
