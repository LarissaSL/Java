package estrutura_condicional;
import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/

public class duracao_do_jogo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int horaInicial, horaFinal, totalHoras;
		
		//Entrada de Dados
		System.out.println("Digite a Hora Inicial do Jogo: ");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a Hora Final do Jogo: ");
		horaFinal = sc.nextInt();
		
		sc.close();
		
		//Processamento de Dados
		if (horaInicial < horaFinal) {
			totalHoras = horaFinal - horaInicial;
		}
		else{
			totalHoras = 24 - horaInicial + horaFinal;
		}
		
		//Saida de Dados
		System.out.println("O jogo durou " + totalHoras + " horas.");
	}

}
