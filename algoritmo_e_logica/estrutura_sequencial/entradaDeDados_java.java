package estrutura_sequencial;

import java.util.Scanner;

public class entradaDeDados_java {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Texto sem Espaços
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Olá, " + nome);
		
		//Ler número Inteiro
		int num;
		
		System.out.print("\nDigite um Número Inteiro: " );
		num = sc.nextInt();
		System.out.println("Você digitou " + num);
		
		//Ler Número com Ponto Flutuante
		double numD;
		
		System.out.print("\nDigite um número decimal: ");
		numD = sc.nextDouble();
		System.out.printf("Você digitou %.2f%n%n" , numD);
	
		
		//Ler um Caractere
		char caracter;
		
		System.out.println("Digite um Caracter: ");
		caracter = sc.next().charAt(0);
		System.out.println("Você digitou : " + caracter);
		

		//Ler até Quebra de Linha
		String frase;
		
		System.out.println("\nDigite uma Frase: ");
		sc.nextLine(); // Pegando a Quebra pendente 
		frase = sc.nextLine();
		System.out.println("Você digitou: " + frase);
		
		sc.close();

	}

}
