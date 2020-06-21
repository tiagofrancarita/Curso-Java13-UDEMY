package br.com.curso.java.udemy.classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415; // valor associado pertence a classe
	
	AreaCirc(double raio) {
		
		this.raio = raio;
	}
	
	double area(){
		
		return PI * Math.pow(raio, 2);
	}

}
