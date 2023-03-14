package estrutura_condicional;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

public class negativo_ouPositivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Entrada de Dados
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		sc.close();
		
		//Processamento e Saida de Dados
		if (num > 0) {
			System.out.println("\nNão Negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
	}

}
