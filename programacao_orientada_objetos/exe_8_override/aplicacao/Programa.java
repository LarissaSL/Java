package aplicacao;
import entidades.ctaPoupanca;

import java.util.Scanner;
import java.util.Locale;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		ctaPoupanca contaX = new ctaPoupanca();
		
		System.out.print("|     Depósito     |\n");
		System.out.print("Digite o valor de Depósito: R$ ");
		double valorDeposito = sc.nextDouble();
		System.out.print("Atualizando Conta ...\n\n");
		
		System.out.print("|     Saque     |");
		System.out.print("\nDigite o valor de Saque: R$ ");
		double valorSaque = sc.nextDouble();
		System.out.print("Atualizando Conta ...\n\n");
		
		contaX.deposito(valorDeposito);
		contaX.saque(valorSaque);

		contaX.imprimirExtrato();
		
		sc.close();

	}

}
