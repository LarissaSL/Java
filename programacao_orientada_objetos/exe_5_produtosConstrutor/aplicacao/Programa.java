package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com Produto");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		//Tem a função de Obrigar o Usuário ou Programador a Cadastrar um valor para cada parametro
		Produto produ = new Produto(nome, preco);
		
		System.out.println("\nProduto data: " + produ);
		
		System.out.print("\nEntre com a quantidade para Adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produ.addProduto(quantidade);
		System.out.println("Produto data: " + produ);
		
		System.out.print("\nEntre com a quantidade para Retirar do estoque: ");
		quantidade = sc.nextInt();
		produ.removerProduto(quantidade);
		System.out.println("Produto data: " + produ);
		
		sc.close();

	}

}
