package desafio_banco;

import java.util.Scanner;
import java.util.Locale;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBanco c1 = new ContaBanco();
		
		System.out.println("-- Abertura Conta C1 --");
		c1.setNumConta(202);
		c1.setDono("Buzz Lightyear");
		c1.setTipo("cc");
		
		c1.abrirConta("cc");
		System.out.println(c1);
		
		System.out.println("\n-- Deposito C1 --");
		System.out.print("Digite a quantia para Deposito: ");
		double quantia = sc.nextDouble();
		c1.depositar(quantia);
		System.out.println(c1);
		
		System.out.println("\n-- Desconto Mensal na C1 --");
		c1.pagarMensal();
		System.out.println(c1);
		
		System.out.println("\n-- Saque na C1 --");
		System.out.print("Digite a quantia para Saque: ");
		quantia = sc.nextDouble();
		c1.sacar(quantia);
		System.out.println(c1);
		
		ContaBanco c2 = new ContaBanco();
		
		System.out.println("\n\n-- Abertura Conta C2 --");
		c2.setNumConta(203);
		c2.setDono("Woody");
		c2.setTipo("cp");
		
		c2.abrirConta("cp");
		System.out.println(c2);
		
		System.out.println("\n-- Deposito C2 --");
		System.out.print("Digite a quantia para Deposito: ");
		quantia = sc.nextDouble();
		c2.depositar(quantia);
		System.out.println(c2);
		
		System.out.println("\n-- Desconto Mensal na C2 --");
		c2.pagarMensal();
		System.out.println(c2);
		
		System.out.println("\n-- Saque na C2 --");
		System.out.print("Digite a quantia para Saque: ");
		quantia = sc.nextDouble();
		c2.sacar(quantia);
		System.out.println(c2);
		
		System.out.println("\n-- Contas --");
		c1.fecharConta();
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		sc.close();
	}

}
