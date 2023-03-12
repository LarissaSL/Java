package estrutura_sequencial;
import java.util.Scanner;

public class diferenca_entreProdutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, dif;
		
		//Entrada de Dados
		System.out.println("Digite o 1º número: ");
		A = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		B = sc.nextInt();
		
		System.out.println("Digite o 3º número: ");
		C = sc.nextInt();
		
		System.out.println("Digite o 4º número: ");
		D = sc.nextInt();
		
		sc.close();
		
		//Processamento de Dados
		dif = (A * B) - (C * D);
		
		//Saida de Dados
		System.out.printf("%n%d X %d - %d X %d = %d", A, B, C, D, dif);
		
	}

}
