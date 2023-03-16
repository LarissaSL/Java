package entidades;

public class retangulo {
	
	public double largura;
	public double altura;
	
	//Metodo para Calcular a Área
	public double area() {
		return  largura * altura;
	}
	
	//Metodo para Calcular o Perimetro
	public double perimetro() {
		return 2 * largura + 2 * altura;
	}
	
	//Metodo para Calcular a Diagonal
	public double diagonal() {
		return Math.sqrt(Math.pow(altura, 2.0) + Math.pow(largura, 2.0));
	}
}
