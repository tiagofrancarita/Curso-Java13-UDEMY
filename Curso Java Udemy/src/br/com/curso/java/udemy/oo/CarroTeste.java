package br.com.curso.java.udemy.oo;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.ligar();
		System.out.println(carro1.statusCarro());
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.frear();
		
		System.out.println(carro1.motor.giros());

	}

}
