package aplicacao;

import java.util.Scanner;
import java.util.Locale;

import entidades.triangulo;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		triangulo x, y;

		x = new triangulo();
		y = new triangulo();

		System.out.println("Digite as medidas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as medidas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		// Processamento
		
		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("%nÁrea do Triângulo X: %.4f%n", areaX);
		System.out.printf("Área do Triângulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Maior Área é do Triângulo X");

		} else {
			System.out.println("Maior Área é do Triângulo Y");
		}
		
		sc.close();
	}

}
