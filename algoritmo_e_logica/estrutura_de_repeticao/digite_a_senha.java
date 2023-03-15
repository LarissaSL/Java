package estrutura_de_repeticao;

import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

public class digite_a_senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int senhaCerta = 2002;
		int senha;
		
		System.out.println("Digite a senha (4 digitos, número Inteiro) ");
		senha = sc.nextInt();
		
		while (senha != senhaCerta) {
			System.out.println("Senha inválida\nTente Novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
			
	}

}
