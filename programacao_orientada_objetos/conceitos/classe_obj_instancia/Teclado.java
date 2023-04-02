package conceito_classe_objetivo_instancia_atributos_metodos;

public class Teclado {

	public Double tamanho;
	public String cor;
	public int qtdTeclas;
	public String tipo;
	public boolean iluminado;
	public boolean estado;
	public boolean conexao;
	public String marca;
	
	
	public void mexer() {
		System.out.println("Mexendo no teclado " + this.marca + "...");
	}
	
	public boolean ligarRgb() {
		return this.iluminado = true;
	}
	
	public boolean desligarRgb() {
		return this.iluminado = false;
	}
	public void teclar() {
		System.out.println("Digitando... ");
	}
	
	public void sujar() {
		System.out.println("Sujando teclado " + this.marca + " ...");
		this.estado = false;
	}
	
	public void limpar(){
		System.out.println("Limpando teclado " + this.marca + " ...");
		this.estado = true;
	}
	
	public boolean conectar() {
		return this.conexao = true;
	}
	
	public boolean desconectar() {
		return this.conexao = false;
	}
	
	public String toString() {
		return "Marca: " + this.marca
				+ "\nCor: " + this.cor
				+ "\nTipo: " + this.tipo
				+ "\nQuantidade de Teclas: " + this.qtdTeclas
				+ "\n\nEstá Conectado ao PC? " + this.conexao
				+ "\nEstá Limpa as teclas? " + this.estado
				+ "\nEstá ligado o RGB? " + this.iluminado;
				
	}
	
}
