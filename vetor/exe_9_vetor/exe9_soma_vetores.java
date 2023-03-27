package exe9_somaVetores;

import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o tamanho do Vetor: ");
		int n = sc.nextInt();
		
		int[] vetorA = new int [n];
		int[] vetorB = new int [n];
		int[] vetorC = new int [n];
		
		int posicao = 1;
		
		System.out.println("\nVetor A");
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + posicao + "º número: ");
			vetorA[i] = sc.nextInt();
			posicao++;
		}
		
		posicao = 1;
		System.out.println("\n\nVetor B");
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + posicao + "º número: ");
			vetorB[i] = sc.nextInt();
			posicao++;
		}
		
		System.out.println("\n\nVetor Resultante");
		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		sc.close();
	}

}
