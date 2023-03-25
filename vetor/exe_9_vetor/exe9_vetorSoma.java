/*aça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor*/

package exe_9_vetor;

import java.util.Locale;
import java.util.Scanner;

public class exe9_vetorSoma {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;

		// Entrada de Dados
		System.out.print("Digite o Tamanho do vetor: ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}

		sc.close();

		// Processamento
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		
		//Saida de Dados
		System.out.println("\nValores");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
		}
		
		System.out.printf("%n%nSoma: %.2f", soma);
		System.out.printf("%nMédia: %.2f", media);
		
	}

}
