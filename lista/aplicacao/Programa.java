package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.funcionario;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionários deseja Cadastrar? ");
		int n = sc.nextInt();

		List<funcionario> lista = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("\nFuncionário " + (i + 1));
			System.out.print("\nDigite o ID: ");
			Integer idFunc = sc.nextInt();

			System.out.print("Digite o nome: ");
			sc.nextLine();
			String nomeFunc = sc.nextLine();

			System.out.print("Digite o Salário: ");
			Double salarioFunc = sc.nextDouble();

			funcionario func = new funcionario(idFunc,nomeFunc,salarioFunc);
			lista.add(func);
		}

		System.out.print("\nQual ID deseja aumentar o Salário? ");
		int posicaoID = sc.nextInt();
		
		//Procurando o ID
		Integer pos = posicao(lista, posicaoID);
		if(pos == null) {
			System.out.println("Esse ID não existe!");
		}else {
			System.out.print("Qual a porcentagem? ");
			double porcentagem = sc.nextDouble();
			
			lista.get(pos).aumento(porcentagem);
		}
		
		System.out.println("\nLista de Funcionários");
		
		for (funcionario emp : lista) {
			System.out.println(emp);
		}
		
		sc.close();

	}

	//Metodo para procurar o ID do funcionário
	public static Integer posicao(List<funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
