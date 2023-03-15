package estrutura_de_repeticao;

import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

public class fatorial_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Entrada de Dados

		int fatorial = 1;

		System.out.println("| Fatorial |");
		System.out.println("\nDigite um número: ");
		int n = sc.nextInt();

		// Processamento de Dados
		for (int i = n; i >= 1; i--) {

			if (n == 0)
				fatorial = 1;
			else {
				fatorial = fatorial * i ;
			}
		}

		sc.close();

		// Saida de Dados
		System.out.println("\nO fatorial de " + n + " é = " + fatorial);

	}

}
