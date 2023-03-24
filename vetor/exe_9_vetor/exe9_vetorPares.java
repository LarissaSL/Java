/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
tela todos os números pares, e também a quantidade de números pares. 
*/

package exe_9_vetor;

import java.util.Scanner;

public class exe9_vetorPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada de Dados
		System.out.print("Digite o Tamanho do vetor: ");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		int contadorPar = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		sc.close();

		//Saida de Dados
		System.out.print("\nNúmeros Pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + "  ");
				contadorPar++;
			}
		}
		
		System.out.print("\nQuantidade de Pares: " + contadorPar);

	}
}
