package estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

public class intervalo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		double intervalo;
		
		//Entrada de Dados
		System.out.println("Digite um número: ");
		intervalo = sc.nextDouble();
		
		sc.close();
		
		//Processamento e Saida de Dados
		if (intervalo <= 25 && intervalo >= 0) {
			System.out.println("Intervalo [0,25]");
		}
		if (intervalo > 25 && intervalo <=50) {
			System.out.println("Intervalo [25,50]");
		}
		if (intervalo > 50 && intervalo <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		if (intervalo > 75 && intervalo <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		if (intervalo < 0 || intervalo > 100) {
			System.out.println("Fora dos Intervalos");
		}
	}

}
