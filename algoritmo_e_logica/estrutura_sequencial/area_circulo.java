package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class area_circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double PI = 3.14159;
		double area, raio;
		
		//Entrada de Dados
		
		System.out.println("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		sc.close();
		
		//Processamento de Dados
		area = Math.pow(raio, 2) * PI; 
		
		//Saida de Dados
		System.out.printf("%nO valor da Área do Circulo é %.4f", area);

	}

}
