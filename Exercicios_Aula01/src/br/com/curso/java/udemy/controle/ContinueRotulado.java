package br.com.curso.java.udemy.controle;

public class ContinueRotulado {

	public static void main(String[] args) {
		externo: for(int i=0; i<3; i++){
			interno: for(int j=0; j<3;j++){
				
				if (i==1){
					continue interno;
				}
				System.out.printf("%d %d",i, j);
				
			}
			
		}

	}

}
