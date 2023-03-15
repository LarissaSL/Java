package estrutura_de_repeticao;

import java.util.Scanner;
import java.util.Locale;

public class celsius_para_fahrenheit_do_while {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		char continuar;

		Scanner sc = new Scanner(System.in);

		do {
			// Entrada
			System.out.print("Digite a Temperatura em Celsius: ");
			double celsius = sc.nextDouble();

			// Processamento
			double F = (9 * celsius) / 5 + 32;

			// Saida
			System.out.printf("%nEquivalente a: %.2f", F);

			System.out.println("\nDeseja continuar? S/N: ");
			continuar = sc.next().charAt(0);

		} while (continuar == 'S');
		sc.close();
	}

}
