package br.com.generetion.vetor;

public class ExemploVetor01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; // começa da posição [0] até ... [9]
		
		arrayVetor[5] = 2000;
		arrayVetor[1] = 5;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Posição do Vetor: " + i + " | " + arrayVetor[i] + " valor.");
		}
				
		
		
		
	}

}
