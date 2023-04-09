package ultraEmojoCombat;

import java.util.Locale;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		//Criando os vetores de Lutador e Lutas
		Lutador lutador[] = new Lutador[6];
		Luta lutas[] = new Luta[4];
		
		//Registrando os Lutadores
		lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2 , 1);
		lutador[1] = new Lutador("Putscript", "Brasil",  29, 1.68, 57.8,  14, 2, 3);
		lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9,  12, 2, 1);
		lutador[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6,  13, 0, 2);
		lutador[4] = new Lutador("UFOcobol", "Brasil", 37, 1.70, 119.3,  5, 4, 3);
		lutador[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7,  12, 2, 4);
		
		//Apresentando Todos os Lutadores
		System.out.println("-------------- Nossos Lutadores são ----------------");
		for(int i = 0; i <=5 ; i++) {
			lutador[i].status();
			System.out.println("\n------------------------------------------");
		}
		
		//Definindo as lutas
		lutas[0] = new Luta();
		lutas[0].marcarLuta(lutador[0], lutador[1]);
		
		lutas[1] = new Luta();
		lutas[1].marcarLuta(lutador[2], lutador[3]);
		
		lutas[2] = new Luta();
		lutas[2].marcarLuta(lutador[4], lutador[5]);
		
		
		//Exibindo o Resultado das lutas
		for(int i = 0; i < 3; i++) {
			System.out.println("-------------- UEC0"+ i + " ----------------");
			lutas[i].lutar();
			System.out.println("\n");
		}

	}

}
