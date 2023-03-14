package estrutura_condicional;
import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.*/

public class numeros_multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int A, B;
		
		//Entrada de Dados
		System.out.println("Digite o 1º número: ");
		A = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		B = sc.nextInt();
		
		sc.close();
		
		//Processamento e Saida de Dados
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}

	}

}
