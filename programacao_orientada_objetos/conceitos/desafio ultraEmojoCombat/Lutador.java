package ultraEmojoCombat;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//Construtor
	public Lutador(String no, String nacio, int ida, double al, double pe, int vi, int de, int em) {
		setNome(no);
		setNacionalidade(nacio);
		setIdade(ida);
		setAltura(al);
		this.setPeso(pe);
		setVitorias(vi);
		setDerrotas(de);
		setEmpates(em);
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNacionalidade(String nacio) {
		this.nacionalidade = nacio;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setIdade(int ida) {
		this.idade = ida;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setAltura(double al) {
		this.altura = al;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setCategoria() {
		
		if (this.peso < 55.0) {
			this.categoria = "Nula";
		}
		else if (this.peso <= 70.0) {
			this.categoria = "Peso Leve";
		}
		else if (this.peso <= 100.0) {
			this.categoria = "Peso Médio";
		}
		else if (this.peso <= 120.0) {
			this.categoria = "Peso Pesado";
		}else
			System.out.println("Peso Acima do Permitido, categoria Nula");
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setDerrotas(int de) {
		this.derrotas = de;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setEmpates(int em) {
		this.empates = em;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	//Metodos
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
	
	public void apresentar() {
		System.out.println("CHEGOU A HORA!!!\nApresentamos o Lutador");
		System.out.print(getNome());
		System.out.print(", vindo da " + getNacionalidade());
		System.out.print(" com " + getIdade() +  " anos");
		System.out.print(" pesando " + getPeso() + "kg, ");
		System.out.println("com " + getAltura() + "m de altura");
		
		System.out.println("Categoria: " + getCategoria());
		System.out.print("Vitorias: " + getVitorias());
		System.out.print(" | Derrotas: " + getDerrotas());
		System.out.println(" | Empates: " + getEmpates());
		
	}
	
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Categoria: " + getCategoria());
		System.out.print("Vitorias: " + getVitorias());
		System.out.print(" | Derrotas: " + getDerrotas());
		System.out.print(" | Empates: " + getEmpates());
	}
}
