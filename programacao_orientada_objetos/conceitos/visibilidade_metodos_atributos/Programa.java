package conceito_classe_objetivo_instancia_atributos_metodos;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado1 = new Teclado();
		
		teclado1.cor = "Preto";
		teclado1.qtdTeclas = 50;
		teclado1.tipo = "Membrana";
		teclado1.marca = "Logitech 213";
		
		teclado1.conectar();
		teclado1.ligarRgb();
		
		System.out.println("---- Dados do Teclado ----\n\n" + teclado1 + "\n");
		teclado1.status();
		teclado1.teclar();
		System.out.print("\n");
		
		teclado1.desconectar();
		teclado1.desligarRgb();
		
		teclado1.limpar();
		teclado1.status();
		teclado1.teclar();
	}

}
