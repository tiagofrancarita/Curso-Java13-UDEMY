package br.com.curso.java.udemy.classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data = new Data();

		data.dia = 17;
		data.mes = 06;
		data.ano = 1930;

		System.out.println(data.obterDataFormatada());

		Data data1 = new Data();

		data1.dia = 20;
		data1.mes = 04;
		data1.ano = 1970;
		System.out.println(data1.obterDataFormatada());

		if (data.ano > data1.ano) {
			int idade = data.ano - data1.ano;
			System.out.println("Idade é:" + idade);
		} else if (data.ano < data1.ano) {
			int idade = (data.ano - data1.ano)*-1;
			System.out.println("Idade é:" + idade);

		}
	}
}
