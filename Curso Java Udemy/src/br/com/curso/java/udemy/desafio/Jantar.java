package br.com.curso.java.udemy.desafio;



public class Jantar {

	public static void main(String[] args) {
		//
		Comida c = new Comida("Arroz",0.180);
		
		Comida c2 = new Comida("feijuca",0.300);
		
		
		//nome, peso, prato
		
		Pessoa p = new Pessoa ("Tiago",99.8);
		
		
		//double pesoTotal;
		//pesoTotal = (c2.peso + c.peso + p.peso);
		System.out.println(p.apresentar());
		p.comer(c);
		p.comer(c2);
		System.out.println(p.apresentar());
		
		
		
		
		
		
		
	}

}
