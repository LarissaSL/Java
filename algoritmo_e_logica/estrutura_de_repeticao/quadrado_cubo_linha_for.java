package estrutura_de_repeticao;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.*/

public class quadrado_cubo_linha_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Entrada de Dados

		int quadrado = 0;
		int cubo = 0;

		System.out.print("Digite a Quantidade de linhas: ");
		int linha = sc.nextInt();

		// Processamento e Saida de Dados
		for (int i = 1; i <= linha; i++) {
			quadrado = (int) Math.pow(i, 2); //Usando o Casting do Java pra converter o dado de Double para Int
			cubo = (int) Math.pow(i, 3);
			System.out.printf("%nLinha: %d%nQuadrado: %d%nCubo: %d%n ", i, quadrado, cubo);
		}

		sc.close();

	}

}
