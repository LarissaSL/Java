package aplicacao;

import java.util.Scanner;
import entidades.equacoes;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		equacoes equacao1Grau = new equacoes();
		equacoes equacao2Grau = new equacoes();
		
		System.out.println("A equação do 1º grau tem esse padrão: ax + b = c");
		
		System.out.print("\nDigite o valor de A: ");
		equacao1Grau.a = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		equacao1Grau.b = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		equacao1Grau.c = sc.nextInt();
		
		System.out.println(equacao1Grau + "\n\nX = " + equacao1Grau.equacao1Grau());
		
		//Equação do 2º Grau
		System.out.println("\nA equação do 2º grau tem esse padrão: ax² + bx + c = 0");
		
		System.out.print("\nDigite o valor de A: ");
		equacao2Grau.a = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		equacao2Grau.b = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		equacao2Grau.c = sc.nextInt();
		
		int delta = equacao2Grau.delta();
		
		System.out.printf("\n" + equacao2Grau + "\n\nValores de ");
		equacao2Grau.equacao2GrauX(delta);
		
		sc.close();

	}

}
