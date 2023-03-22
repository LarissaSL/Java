/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero). */

package exe_9_vetor;

import java.util.Locale;
import java.util.Scanner;

public class exe9_maiorElemento {

	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			// Entrada de Dados
			System.out.print("Digite o Tamanho do vetor: ");
			int n = sc.nextInt();

			double[] vetor = new double[n];
			int posicao = 0;

			//Colocando os números no vetor
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Digite um número: ");
				vetor[i] = sc.nextDouble();
			}

			sc.close();
			
			//Processamento
			double maior = vetor[0];
			
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] > maior) {
					maior = vetor[i];
					posicao = i;
				}
			}
			
			//Saida de Dados
			System.out.printf("\nMaior valor: %.2f" ,  maior);
			System.out.print("\nPosicao do Maior Valor: " + posicao + "º");

	}

}
