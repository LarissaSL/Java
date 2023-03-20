package entidade;

public class funcionario {

	private String nome;
	private double salario;

	// Adicionando os Construtores e Sobrecarga

	// Construtor Padrão
	public funcionario() {
	}

	// Construtor com Parametros
	public funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void getSalario(double salario) {
		this.salario = salario;
	}

	public double aumentoSalario(double aumento) {
		return this.salario += aumento;
	}
	
	public double reduzirSalario(double reducao) {
		return this.salario -= reducao;
	}


	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salario);
	}
}
