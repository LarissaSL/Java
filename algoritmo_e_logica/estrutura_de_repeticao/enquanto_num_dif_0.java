package estrutura_de_repeticao;

import java.util.Scanner;

public class enquanto_num_dif_0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite números inteiros, para parar digite 0.");
		
		int X = sc.nextInt();
		int soma = X;
		
		while (X != 0) {
			X = sc.nextInt();
			soma += X;
		}
		
		System.out.println("A soma é: " + soma);
		sc.close();

	}

}
