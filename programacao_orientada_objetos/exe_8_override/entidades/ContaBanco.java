package entidades;

public class ContaBanco {

	private double saldo;
	
	public void imprimirExtrato() {		
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double deposito(double valorDeposito) {
		return this.saldo += valorDeposito;
	}
	
	public double saque(double valorSaque) {
		return this.saldo -= valorSaque;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}
