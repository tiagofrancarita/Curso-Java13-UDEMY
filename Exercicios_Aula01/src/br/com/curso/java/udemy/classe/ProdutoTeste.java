package br.com.curso.java.udemy.classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Notebook",4356.89);
		//produto.nome="Notebook";
		//produto.preco= 4356.89;
		//produto.desconto=0.25;
		
		Produto produto1 = new Produto("Processador",1200.89);
		//produto1.nome="Processador";
		//produto1.preco= 12.56;
		//produto.desconto= 0.29;
		
		System.out.println(produto.nome);
		System.out.println(produto1.nome);
		
		double precoFinal1 = produto.precoComDesconto();
		double precoFinal2 = produto1.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.println(produto.precoComDesconto());
		System.out.println(produto1.precoComDesconto());
		System.out.printf("A Média do seu carrinho é: R$ %.2f.",mediaCarrinho);
		
		}

}
