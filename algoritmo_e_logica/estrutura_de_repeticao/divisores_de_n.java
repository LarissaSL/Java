package estrutura_de_repeticao;

import java.util.Scanner;

/*Ler um número inteiro N e calcular todos os seus divisores.*/

public class divisores_de_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Número que deseja saber os Divisores");
		int num = sc.nextInt();
		

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
