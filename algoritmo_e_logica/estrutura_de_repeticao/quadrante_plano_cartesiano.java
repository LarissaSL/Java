package estrutura_de_repeticao;

import java.util.Scanner;
import java.util.Locale;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

public class quadrante_plano_cartesiano {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double X, Y;
		X = 1;
		Y = 1;

		while (X != 0 && Y != 0) {
			// Entrada de Dados
			System.out.println("Digite a coordenada de X: ");
			X = sc.nextDouble();

			System.out.println("Digite a coordenada de Y: ");
			Y = sc.nextDouble();

			if (X > 0 && Y > 0) {
				System.out.println("\nPertence ao Quadrante 1\n");
			}
			if (X < 0 && Y > 0) {
				System.out.println("\nPertence ao Quadrante 2\n");
			}
			if (X < 0 && Y < 0) {
				System.out.println("\nPertence ao Quadrante 3\n");
			}
			if (X > 0 && Y < 0) {
				System.out.println("\nPertence ao Quadrante 4\n");
			}
		}

		sc.close();
	}

}
