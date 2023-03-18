package entidades;

public class aluno {
	
	public String nome;
	public double nota1Mes;
	public double nota2Mes;
	public double nota3Mes;

	public double notaPorTrimestre() {
		return nota1Mes + nota2Mes + nota3Mes;
	}

	public void status() {

		if (notaPorTrimestre() < 60) {
			System.out.print("\nNão passou.");
			double faltou = 60 - notaPorTrimestre() ;
			System.out.print("\nFaltaram " + faltou + " pontos.");
		} else {
			System.out.println("\nPassou.");
		}
		
	}
	
	public String toString() {
		return  "\nNota Final = "
				+ String.format("%.2f", notaPorTrimestre());			
	}

}
