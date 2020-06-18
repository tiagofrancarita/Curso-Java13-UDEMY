package br.com.curso.java.udemy.classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
 double precoComDesconto (){
	 double precoComDesconto = preco  * (1 - desconto);
	return (precoComDesconto);
 }
 
 
}
