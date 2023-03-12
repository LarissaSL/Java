package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class area_geometriaPlana {

	public static void main(String[] args) {
		
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		double PI = 3.14159;
		
		//Entrada de Dados
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		sc.close();
		
		//Processamento de Dados
		triangulo = (A * C) / 2;
		circulo = PI *  Math.pow(C, 2);
		trapezio = ((A + B) * C) / 2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		//Saida de Dados
		System.out.printf("%nA Área do Triângulo é: %.3f%n" , triangulo);
		System.out.printf("A Área do Círculo é: %.3f%n", circulo);
		System.out.printf("A Área do Trapézio é: %.3f%n", trapezio);
		System.out.printf("A Área do Quadrado é: %.3f%n", quadrado);
		System.out.printf("A Área do Retângulo é: %.3f%n", retangulo);
				
	}

}
