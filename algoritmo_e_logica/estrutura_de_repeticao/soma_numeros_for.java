package estrutura_de_repeticao;

import java.util.Scanner;

public class soma_numeros_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int soma = 0;
		int p = 1; // Quantidade do Número
		
		System.out.println("Digite o Limite de Números: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++, p++) {
			System.out.println("Digite o " + p + "º número: ");
			int X = sc.nextInt();
			soma += X;
		}
		
		sc.close();
		
		System.out.println("A soma dos números é = " + soma);

	}

}
