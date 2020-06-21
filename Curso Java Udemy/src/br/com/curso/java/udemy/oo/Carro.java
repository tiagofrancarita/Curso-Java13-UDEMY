package br.com.curso.java.udemy.oo;

public class Carro {

	Motor motor = new Motor();

	void acelerar() {
		
		if (motor.fatorInjeção < 2.6) {
			motor.fatorInjeção += 0.4;
		}

	}

	void frear() {

		if (motor.fatorInjeção > 0.5) {
			motor.fatorInjeção -= 0.4;

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
