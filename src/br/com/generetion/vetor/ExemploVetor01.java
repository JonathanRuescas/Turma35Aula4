package br.com.generetion.vetor;

public class ExemploVetor01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; // come�a da posi��o [0] at� ... [9]
		
		arrayVetor[5] = 2000;
		arrayVetor[1] = 5;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Posi��o do Vetor: " + i + " | " + arrayVetor[i] + " valor.");
		}
				
		
		
		
	}

}
