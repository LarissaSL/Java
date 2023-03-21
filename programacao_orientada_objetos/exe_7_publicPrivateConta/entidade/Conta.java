package entidade;

public class Conta {

	private String nome;
	private int numeroConta;
	private double saldo;

	// Construtor
	public Conta(String nome, int numeroConta, double depositoInicial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}
	
	//Sobrecarga
	public Conta(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposito(double valor) {
		return this.saldo += valor;
	}

	public double saque(double valor) {
		return this.saldo -= (valor + 5.00);
	}
	
	public String toString() {
		return "Conta "
				+ numeroConta
				+ ", Titular: "
				+ nome
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
}
