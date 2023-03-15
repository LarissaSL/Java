package estrutura_de_repeticao;

import java.util.Scanner;

public class impares_ate_x_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Limite de Números: ");
		int x = sc.nextInt();

		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0 ) {
			System.out.println(i);
			}
		}
		
		sc.close();
	}

}
