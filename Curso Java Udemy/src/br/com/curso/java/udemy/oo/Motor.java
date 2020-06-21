package br.com.curso.java.udemy.oo;

public class Motor {

	boolean ligado = false;
	double fatorInjeção = 1;

	int giros() {

		if (!ligado) {
			return 0;
		} else {

			return (int) Math.round(fatorInjeção * 3000);// Arrendona
		}
	}

}
