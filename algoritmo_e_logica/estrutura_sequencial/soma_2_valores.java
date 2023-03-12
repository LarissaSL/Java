package estrutura_sequencial;

import java.util.Scanner;

public class soma_2_valores {

	public static void main(String[] args) {
	
/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
		
		//Ler Entrada do Teclado
		Scanner sc = new Scanner (System.in);
		
		//Entrada de Dados
		int num1, num2, resultado;
		
		System.out.println("Digite o 1º número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = sc.nextInt();
		
		sc.close();
		
		//Processamento de Dados
		resultado = num1 + num2;
		
		//Saida de Dados
		System.out.println("\nA soma de " + num1 + " + " + num2 + " = " + resultado);
		

	}

}
