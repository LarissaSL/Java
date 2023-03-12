package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;

public class funcoes_matematicas {

	public static void main(String[] args) {
		
		//Declarar as Variaveis e Scanner para Entrada de Dados
		
		Locale.setDefault(Locale.US); // Definindo a Localidade
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, pot1, pot2, raiz1, raiz2, abs1, abs2;
		
		//Entrada de Dados
		
		System.out.println("Digite o 1º número decimal (ex. 2.0): ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o 2º número decimal (ex. 2.0): ");
		num2 = sc.nextDouble();
		
		sc.close();
		
		//Processamento de Dados
		
		pot1 = Math.pow(num1, num2);
		pot2 = Math.pow(num2, num1);
		
		raiz1 = Math.sqrt(num1);
		raiz2 = Math.sqrt(num2);
		
		abs1 = Math.abs(num1);
		abs2 = Math.abs(num2);
		
		//Saida de Dados
		
		//Potência
		System.out.printf("%nA potência de %.2f elevado a %.2f = %.2f%n", num1, num2, pot1);
		System.out.printf("A potência de %.2f elevado a %.2f = %.2f%n", num2, num1, pot2);
		
		//Raiz
		System.out.printf("%nA raiz quadrada de %.2f = %.2f%n", num1, raiz1);
		System.out.printf("A raiz quadrada de %.2f = %.2f%n", num2, raiz2);
				
		//Absoluto
		System.out.printf("%nO absoluto de %.2f é %.2f%n", num1, abs1);
		System.out.printf("O absoluto de %.2f é %.2f", num2, abs2);
		

	}

}
