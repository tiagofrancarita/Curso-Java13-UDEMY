package br.com.curso.java.udemy.oo;

public class Motor {

	boolean ligado = false;
	double fatorInje��o = 1;

	int giros() {

		if (!ligado) {
			return 0;
		} else {

			return (int) Math.round(fatorInje��o * 3000);// Arrendona
		}
	}

}
