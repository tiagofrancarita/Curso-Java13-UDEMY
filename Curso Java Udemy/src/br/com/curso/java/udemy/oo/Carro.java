package br.com.curso.java.udemy.oo;

public class Carro {

	Motor motor = new Motor();

	void acelerar() {
		
		if (motor.fatorInje��o < 2.6) {
			motor.fatorInje��o += 0.4;
		}

	}

	void frear() {

		if (motor.fatorInje��o > 0.5) {
			motor.fatorInje��o -= 0.4;

		}
	}

	void ligar() {

		motor.ligado = true;

	}

	void desligar() {

		motor.ligado = false;
	}

	boolean statusCarro() {

		return motor.ligado;

	}

}
