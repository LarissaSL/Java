package estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação*/

public class qual_quadrante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		double X, Y;
		
		
		//Entrada de Dados
		System.out.println("Digite a coordenada de X: ");
		X = sc.nextDouble();
		
		System.out.println("Digite a coordenada de Y: ");
		Y = sc.nextDouble();
		
		sc.close();
		
		//Processamento e Saida de Dados
		if (X > 0 && Y > 0) {
			System.out.println("\nPertence ao Quadrante 1");
		}
		if (X < 0 && Y > 0) {
			System.out.println("\nPertence ao Quadrante 2");
		}
		if (X < 0 && Y < 0) {
			System.out.println("\nPertence ao Quadrante 3");
		}
		if (X > 0 && Y < 0) {
			System.out.println("\nPertence ao Quadrante 4");
		}
		if (X == 0 && Y == 0) {
			System.out.println("\nPertence a Origem");
		}
	}

}
