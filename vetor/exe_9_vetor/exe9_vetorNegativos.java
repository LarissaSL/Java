/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package exe_9_vetor;

import java.util.Locale;
import java.util.Scanner;

public class exe9_vetorNegativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o Tamanho do vetor: ");
		int n = sc.nextInt();
		
		while (n > 10) {
			System.out.print("Digite o Tamanho do vetor: ");
			n = sc.nextInt();
		}
		
		//Declarando vetor
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i ++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		sc.close();
		
		System.out.println("\nNúmeros Negativos:  ");
		for (int i = 0; i < vetor.length; i ++) {
			if (vetor[i] < 0) {
				 System.out.println(vetor[i]);	
			}
		}
		
		
	}
}
