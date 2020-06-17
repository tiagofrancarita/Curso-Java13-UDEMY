package br.com.curso.java.udemy;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		// double elevb = Math.pow(formb, 2);

		double DivA = 3 * 2;
		double resolucaoA;
		double formulaA;
		formulaA = (6*(3+2));
		resolucaoA = Math.pow(formulaA, 2)/DivA;
		
		double formulaB;
		double resolucaoB;
		double DivB = 2;
		formulaB =(1 - 5) * (2 - 7)/DivB;
		resolucaoB = Math.pow(formulaB, 2);	
		
		double formulaAB;
		double formulaTotal;
		
		formulaAB = (resolucaoA - resolucaoB);
		formulaTotal = Math.pow(formulaAB, 3)/Math.pow(10, 3); 		
				
		System.out.println("resolucao A:" + resolucaoA);
		System.out.println("resolucao B:" + resolucaoB);
		System.out.println("resolucao A - B: " + formulaAB);
		System.out.println("resolucao A / B:" + formulaTotal);
		
	}

}
