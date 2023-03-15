package estrutura_de_repeticao;

import java.util.Scanner;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

public class dentro_do_intervalo_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de Números que deseja: ");
		int limite = sc.nextInt();
		
		int n = 0; // Numero
		int in = 0; // Dentro do Intervalo
		int out = 0; // Fora do Intervalo
		
		for (int i = 0; i < limite; i++) {
			System.out.println("Digite um número: ");
			n = sc.nextInt();
			
			if (n > 20 || n < 10) {
				out++;
			}
			else {
				in++;
			}
		}
		
		sc.close();
		System.out.println("\nDentro do Intervalo [10,20]: " + in + " no total.");
		System.out.println("Fora do Intervalo [10,20]: " + out + " no total.");
		
	}

}
