package estrutura_de_repeticao;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

public class posto_de_gasolina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tipoCombustivel, alcool, gasolina, diesel;

		// Iniciando as Variaveis
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		tipoCombustivel = 0;

		while (tipoCombustivel != 4) {
			System.out.println("\n|  Tipos de Combustiveis  |\n");
			System.out.println("1. Álcool\n2. Gasolina");
			System.out.println("3. Diesel\n4. Sair");
			System.out.print("\nDigite o Tipo de Combustivel: ");
			
			tipoCombustivel = sc.nextInt();

			switch (tipoCombustivel) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			default:
				System.out.println("Digite uma opção Válida");
			}
		}

		sc.close();

		if (tipoCombustivel == 4) {
			System.out.println("\nMuito Obrigada!");
		}

		System.out.println("\n|  Quantidade de Clientes  |");
		System.out.printf("Álcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);

	}

}
