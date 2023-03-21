package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidade.Conta;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Conta idClienteX;

		System.out.print("Digite o Número da Conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Digite o Nome: ");
		sc.nextLine(); // Consumindo a Quebra de Linha pendente do nextInt
		String nome = sc.nextLine();

		System.out.print("\nTeve Depósito Inicial?\nS - Para Sim\nN - Para Não\n");
		char resposta = sc.next().charAt(0);

		if (resposta == 'S' || resposta == 's') {
			System.out.print("Digite o Valor do Depósito Inicial: ");
			double depositoInicial = sc.nextDouble();
			idClienteX = new Conta(nome, numeroConta, depositoInicial);
		} else {
			idClienteX = new Conta(nome, numeroConta);
		}

		// Mostrando a Conta Cadastrada
		System.out.println("\nCadastrando Conta...");
		System.out.println(idClienteX);

		// Deposito
		System.out.print("\nDigite o Valor do Deposito: ");
		double valorDeposito = sc.nextDouble();
		idClienteX.deposito(valorDeposito);
		System.out.println("\nAtualizando Conta...");
		System.out.println(idClienteX);

		// Saque
		System.out.print("\nDigite o Valor de Saque: ");
		double valorSaque = sc.nextDouble();
		idClienteX.saque(valorSaque);
		System.out.println("\nAtualizando Conta...");
		System.out.println(idClienteX);

		sc.close();
	}
}