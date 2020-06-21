package br.com.curso.java.udemy.oo;

import java.util.ArrayList;

public class Compra {

	int parcela;
	String nomeCliente;
	ArrayList<Item> itens = new ArrayList<Item>();

	double valorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

	double parcela() {

		return valorTotal() / parcela;

	}
}
