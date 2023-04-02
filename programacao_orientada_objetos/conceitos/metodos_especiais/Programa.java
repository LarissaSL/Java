package conceito_classe_objetivo_instancia_atributos_metodos;

import java.io.IOException;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		Teclado teclado1 = new Teclado("Logitech G213","Preto","Semi-Mecânico");
		
		System.out.println("---- Dados do Teclado ----\n");
		System.out.println(teclado1);
		
		int op;
		
		do {
			
			System.out.println("O que deseja fazer com o teclado?\n");
			System.out.print("1 - Conectar ao PC\n2 - Desconectar do PC\n3 - Ligar RGB\n4 - Desligar RGB\n5 - Digitar\n6 - Sair\n\nDigite a opção: ");
			op = sc.nextInt();
			
			switch (op) {
			
			case 1: 
				teclado1.setConectar(true);
				
				System.out.print("\n");
				teclado1.status();
				System.in.read();
				break;
			
			case 2: 
				teclado1.setDesconectar(true);
				teclado1.desligarRgb();
				
				System.out.print("\n");
				teclado1.status();
				System.in.read();
				break;
			
			case 3: 
				teclado1.ligarRgb();
				
				System.out.print("\n");
				teclado1.status();
				System.in.read();
				break;
			
			case 4: 
				teclado1.desligarRgb();
				
				System.out.print("\n");
				teclado1.status();
				System.in.read();
				break;
			
			case 5: 
				teclado1.teclar();
				
				System.out.print("\n");
				teclado1.status();
				System.in.read();
				break;
			
			default:
				if(op == 6) {
					System.out.println("Programa encerrado...");
				}else {
					System.out.println("Opção Inválida, por favor digite umas das opções apresentadas.\n");
					System.in.read();
				}
				
			}
				
		}while(op != 6);
		
		System.out.print("\n");
		sc.close();
	}

}
