package br.com.curso.java.udemy.oo;

public class CompraTeste {


	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.parcela=3;
		compra1.nomeCliente="Tiago";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println("----------------- Itens----------------------------------------");
		System.out.println("Descrição: " + compra1.itens.get(0).nome + "|Preço Unitário R$ "
		+ compra1.itens.get(0).preco  +  "|Quantidade: " 
		+ compra1.itens.get(0).quantidade);
		
		System.out.println("Descrição: " + compra1.itens.get(1).nome + "|Preço Unitário R$ "
		+ compra1.itens.get(1).preco  +  "|Quantidade: " 
		+ compra1.itens.get(1).quantidade);
		
		System.out.println("Descrição: " + compra1.itens.get(2).nome + "|Preço Unitário R$ "
		+ compra1.itens.get(2).preco  +  "|Quantidade: " 
		+ compra1.itens.get(2).quantidade);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Quantidade de itens no carrinho: " 
		 + compra1.itens.size() );
		System.out.println("Quantidade de parcelas: " + compra1.parcela);
		System.out.printf("Total da compra R$ %.2f%n",
				compra1.valorTotal());
		System.out.printf("Total da parcela R$ %.2f%n",
				compra1.parcela());
		

	}

}
