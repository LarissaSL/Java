package conceito_classe_objetivo_instancia_atributos_metodos;

public class Teclado {

	public Double tamanho;
	public String cor;
	public int qtdTeclas;
	public String tipo;
	protected boolean iluminado; //Apenas a Classe e Sub-classes podem usar
	public boolean estado;
	private boolean conexao; //Apenas a Classe pode modificar ou metodos especiais(Getters e Setters)
	public String marca; //Todos tem acesso
	
	
	public void mexer() {
		System.out.println("Mexendo no teclado " + this.marca + "...");
	}
	
	protected boolean ligarRgb() {
		return this.iluminado = true;
	}
	
	protected boolean desligarRgb() {
		return this.iluminado = false;
	}
	public void teclar() {
		
		if(this.conexao == true) 
			System.out.println("Digitando... ");
		else 
			System.out.println("O teclado está Desconectado, não é possivel digitar ");
		
			
	}
	
	public void sujar() {
		System.out.println("Sujando teclado " + this.marca + " ...");
		this.estado = false;
	}
	
	public void limpar(){
		System.out.println("Limpando teclado " + this.marca + " ...");
		this.estado = true;
	}
	
	
	/* O Atributo esta Privado, porém eu estou modificando na classe então funciona,
	se eu modificasse fora dela, sem uma Herança, daria Erro na compilação.
	- Se o Atributo é privado, mas dentro da classe o Metodo de modificação dela for Publico, vai funcionar.
	- Se o Atributo é privado e dentro da Classe é Privado também, da erro na visibilidade, pois vai precisar de Metodos Especiais.
	
	Como estou usando o String toString na Visualização e, é um metodo dentro da Classe, então msm que eu deixe privado ele mostrará, 
	porém não poderei modificar esse Estado no Programa Principal
	*/
	
	public boolean conectar() { 
		return this.conexao = true;
	}
	
	public boolean desconectar() {
		return this.conexao = false;
	}
	
	public void status() {
		System.out.println("Está Conectado ao PC? " + this.conexao);
		System.out.println("Está Limpa as teclas? " + this.estado);
		System.out.println("Está ligado o RGB? " + this.iluminado);
		
	}
	
	public String toString() {
		return "Marca: " + this.marca
				+ "\nCor: " + this.cor
				+ "\nTipo: " + this.tipo
				+ "\nQuantidade de Teclas: " + this.qtdTeclas;
				
	}
	
}
