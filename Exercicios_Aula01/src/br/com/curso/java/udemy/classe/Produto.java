package br.com.curso.java.udemy.classe;

public class Produto {
	
	String nome;
	double preco;
	static double DESCONTO = 0.25;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
 double precoComDesconto (){
	 double precoComDesconto = preco  * (1 - DESCONTO);
	return (precoComDesconto);
 }
 
 
}
