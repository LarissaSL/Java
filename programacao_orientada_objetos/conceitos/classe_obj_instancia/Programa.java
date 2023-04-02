package conceito_classe_objetivo_instancia_atributos_metodos;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado1 = new Teclado();
		
		teclado1.cor = "Preto";
		teclado1.qtdTeclas = 50;
		teclado1.tipo = "Membrana";
		teclado1.marca = "Logitech 213";
		
		System.out.println("Marca: " + teclado1.marca);
		System.out.println("Cor: " + teclado1.cor);
		System.out.println("Tipo: " + teclado1.tipo);
		System.out.println("Quantidade de Teclas: " + teclado1.qtdTeclas);
		
		teclado1.conectar();
		System.out.println("\nEstá Conectado ao PC? " + teclado1.conexao + "\n");
		
		teclado1.sujar();
		System.out.println("Está Limpa as teclas? " + teclado1.estado + "\n");
		
		teclado1.ligarRgb();
		System.out.println("Está ligado o RGB? " + teclado1.iluminado);
		
		
		System.out.println("\n---- Segundo Jeito de Visualizar ----");
		System.out.print("\n");
		teclado1.limpar();
		teclado1.desligarRgb();
		System.out.print("\n");
		System.out.println(teclado1);
		System.out.print("\n");
		teclado1.teclar();
	}

}
