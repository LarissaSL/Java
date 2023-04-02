package conceito_classe_objetivo_instancia_atributos_metodos;

public class Teclado {

	public Double tamanho;
	private String cor;
	private String tipo;
	protected boolean iluminado;
	private boolean conexao; 
	private String marca; 
	
	
	public Teclado(String marca, String cor, String tipo) {
		setMarca(marca);
		setCor(cor);
		setTipo(tipo);
	}
	
	public void setMarca(String marca) {
		 this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void mexer() {
		System.out.println("Mexendo no teclado " + this.marca + "...");
	}
	
	protected void ligarRgb() {
		
		if(iluminado == false && conexao == true) {
			System.out.println("Ligando RGB do teclado...");
			this.iluminado = true;
		} 
		else if (conexao == false) {
			System.out.println("O teclado está desconectado, impossivel ligar RGB...");
		}
		else if (iluminado == true) {
			System.out.println("O RGB do teclado já está ligado...");
		}
	}
	
	protected void desligarRgb() {
		
		if(iluminado == true && conexao == true) {
			System.out.println("Desligando RGB do teclado...");
			this.iluminado = false;
		}
		else if(iluminado == false) {
			System.out.println("O RGB do teclado já está desligado...");
		}
		else if(conexao == false) {
			this.iluminado = false;
		}
	}
	
	public void teclar() {
		
		if(this.conexao == true) 
			System.out.println("Digitando... ");
		else 
			System.out.println("O teclado está Desconectado, não é possivel digitar ");
			
	}	
	
	public void setConectar(boolean conexao) { 
		if(this.conexao == false) {
			System.out.println("Conectando teclado...");
			this.conexao = true;
		}
		else {
			System.out.println("O teclado já está conectado...");
		}
	}
	
	public boolean getConectar() {
		return this.conexao;
	}
	
	public void setDesconectar(boolean conexao) {
		
		if(this.conexao == true) {
			System.out.println("Desconectando teclado...");
			this.conexao = false;
		}
		else {
			System.out.println("O teclado já está desconectado...");
		}
		
	}
	
	public boolean getDesconectar() {
		return this.conexao;
	}
	

	public void status() {
		System.out.println("Conectado ao PC: " + this.conexao);
		System.out.println("RGB ligado: " + this.iluminado);
		
	}
	
	public String toString() {
		return "Marca: " + getMarca()
				+ "\nCor: " + getCor()
				+ "\nTipo: " + getTipo();
				
	}
	
}
