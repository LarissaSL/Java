package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar.*/

public class quanto_pagar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		int item, qtd;
		double total;
		
		//Entrada de Dados
		System.out.println("|  Codigo  |   Especificação   |   Preço   | ");
		System.out.println("|     1    |  Cachorro-Quente  |  R$4,00   | ");
		System.out.println("|     2    |      X-Salada     |  R$4,50   | ");
		System.out.println("|     3    |      X-Bacon      |  R$5,00   | ");
		System.out.println("|     4    |  Torrada Simples  |  R$2,00   | ");
		System.out.println("|     5    |    Refrigerante   |  R$1,50   | ");
		
		System.out.println("\nDigite o Código do Item desejado: ");
		item = sc.nextInt();
		
		System.out.println("\nDigite a Quantidade desejada: ");
		qtd = sc.nextInt();
		
		sc.close();
		
		//Saida de Dados
		
		switch(item) {
		case 1:
			total = 4.00 * qtd;
			System.out.printf("%nTotal a Pagar: R$ %.2f reais", total);
			break;
		
		case 2:
			total = 4.50 * qtd;
			System.out.printf("%nTotal a Pagar: R$ %.2f reais", total);
			break;
		
		case 3:
			total = 5.00 * qtd;
			System.out.printf("%nTotal a Pagar: R$ %.2f reais", total);
			break;
		
		case 4:
			total = 2.00 * qtd;
			System.out.printf("%nTotal a Pagar: R$ %.2f reais", total);
			break;
		
		case 5:
			total = 1.50 * qtd;
			System.out.printf("%nTotal a Pagar: R$ %.2f reais", total);
			break;
		}

	}

}
