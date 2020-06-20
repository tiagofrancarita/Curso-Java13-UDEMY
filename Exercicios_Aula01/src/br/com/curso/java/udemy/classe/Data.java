package br.com.curso.java.udemy.classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	String obterDataFormatada(){
		final String formato ="%d/%d/%d";
		return String.format(formato, dia,mes,ano);
		
	}
}
