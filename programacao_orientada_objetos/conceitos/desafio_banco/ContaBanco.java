package desafio_banco;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;	
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return this.status;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	
	public void fecharConta() {
		if (this.status == true) {
			
			if(this.saldo == 0) {
				System.out.println("Fechando Conta...");
				setStatus(false);
			}
			else if(this.saldo > 0 ) {
				System.out.println("Por favor sacar o dinheiro da Conta antes de fechar ela.");
			}
			else if(this.saldo < 0) {
				System.out.println("Só será permitido o fechamento da conta ao quitar a divida.");
			}	
		}
	}
	
	public double depositar(double quantia) {
			return this.saldo += quantia;

	}
	
	public void abrirConta(String tipo) {
		this.tipo = tipo;
		
		if(this.tipo == "cc") {
			this.setSaldo(50.00);
		}
		else if(this.tipo == "cp") {
			this.setSaldo(150.00);	
		}
		
		setStatus(true);
	}
		
	
	public void sacar(double quantia) {
		
			if(quantia <= this.saldo) {
				this.saldo -= quantia;
		
			}else {
				System.out.println("Quantia maior que a do Saldo");
			}
	}
	
	public void pagarMensal() {
		if (this.tipo == "cc") {
			this.saldo -= 12.00;
		}
		if (this.tipo == "cp") {
			this.saldo -= 20.00;
		}
	}
	
	public String toString() {
		return "Número da Conta: " + this.numConta + " | Titular: " + this.dono + " | Saldo: " + this.saldo + " | Tipo: " + this.tipo + " | Status: " + this.status;
	}
}
