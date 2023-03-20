package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidade.funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		//Cadastro do Funcionário
		System.out.println("Cadastrar Funcionário");

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Salário: ");
		double salario = sc.nextDouble();
	
		funcionario _001 = new funcionario(nome,salario);
		
		System.out.println("Funcionário Cadastrado: " + _001);
		
		//Cadastrar Aumento
		System.out.print("\nDigite o valor que deseja aumentar: ");
		double aumento = sc.nextDouble();
		System.out.print("\nAtualizando Salário... ");
		System.out.println("\nSalário Atualizado: " + _001.aumentoSalario(aumento));
		
		//Cadastra Redução
		System.out.print("\nDigite o valor que deseja reduzir: ");
		double reducao = sc.nextDouble();
		System.out.print("\nAtualizando Salário... ");
		System.out.println("\nSalário Atualizado: " + _001.reduzirSalario(reducao));
		
		sc.close();
	
	}

}
