package estrutura_sequencial;
import java.util.Scanner;

public class equacao_2grau {

	public static void main(String[] args) {
		
		//Entrada de Dados
		Scanner sc = new Scanner (System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Representação da Equação de 2º Grau\n ax² + bx + c = 0\n ");
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		
		sc.close();
		
		//Processamento de Dados
		//Calculando o valor de delta
		
		delta = Math.pow(b, 2) -4 * a * c;
		
		//Calculando os valores de X
		x1 = (-b + (Math.sqrt(delta))) / 2 * a;
		x2 = (-b - (Math.sqrt(delta))) / 2 * a;
		
		//Saida de Dados
		System.out.println("\nO 1º valor de X é: " + x1);
		System.out.println("O 2º valor de X é: " + x2);
		
	}

}
