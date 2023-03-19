package entidades;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	// Criando o Construtor, para evitar o cadastro de Produtos Nulos
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Criando mais um Construtor, conceito de Sobrecarga
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Outra Sobrecarga, adicionando o Construtor Padrão
	public Produto() {
	}

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	// O This se refere ao atributo da Classe
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $ " 
				+ String.format("%.2f", preco) 
				+ ", " + quantidade
				+ " unidades, Total: $ "
				+ String.format("%.2f", valorTotalEmEstoque());

	}

}
