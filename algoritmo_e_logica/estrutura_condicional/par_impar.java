package estrutura_condicional;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/


public class par_impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num;
		
		//Entrada de Dados
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		sc.close();
		
		//Processamento e Saida de Dados
		if (num % 2 == 0) {
			System.out.println("O número é Par");
		}
		else {
			System.out.println("O número é Impar");
		}
	}

}
