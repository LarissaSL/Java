package entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double reajusteSalario(double taxa) {
		return salarioBruto += salarioBruto * taxa / 100;
	}
	
	public String toString() {
		return nome
				+ " , $ "
				+ String.format("%.2f", salarioLiquido());
	}
	
}
