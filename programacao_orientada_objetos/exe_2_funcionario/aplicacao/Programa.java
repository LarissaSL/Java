package aplicacao;

import java.util.Scanner;
import java.util.Locale;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario);
		
		System.out.print("\nQual porcentagem para incrementar no salário? ");
		double incremento = sc.nextDouble();
		
		funcionario.reajusteSalario(incremento);
		
		System.out.print("\nAtualizado: " + funcionario);
		
		sc.close();
	}

}
