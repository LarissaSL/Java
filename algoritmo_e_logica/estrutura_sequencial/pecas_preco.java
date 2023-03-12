package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class pecas_preco {

	public static void main(String[] args) {

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		Locale.setDefault(Locale.US);
		
		int cod1, cod2, qtd1 , qtd2;
		double preco1, preco2, precoT;
		Scanner sc = new Scanner (System.in);
		
		//Entrada de Dados
		System.out.println("Digite o Cód da 1ª peça: ");
		cod1 = sc.nextInt();
		
		System.out.println("Digite a quantidade comprada da 1ª peça: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Valor Unitário da 1ª peça: ");
		preco1 = sc.nextDouble();
		
		//2 peça
		System.out.println("\n\nDigite o Cód da 2ª peça: ");
		cod2 = sc.nextInt();
		
		System.out.println("Digite a quantidade comprada da 2ª peça: ");
		qtd2 = sc.nextInt();
		
		System.out.println("Valor Unitário da 2ª peça: ");
		preco2 = sc.nextDouble();
		
		sc.close();
		
		//Processamento de Dados
		precoT = qtd1 * preco1 + qtd2 * preco2;
		
		//Saida de Dados
		System.out.printf("\nTotal a pagar: R$ %.2f", precoT);
		
	}

}
