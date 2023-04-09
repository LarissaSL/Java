package ultraEmojoCombat;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public int getRounds() {
		return rounds;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public boolean isAprovada() {
		return aprovada;
	}
	
	public void marcarLuta(Lutador desafiado, Lutador desafiante) {
		
		if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
			this.aprovada = true;
			setDesafiado(desafiado);
			setDesafiante(desafiante);
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		
		if (this.aprovada) {
			System.out.println("\n------------- Desafiado ---------------\n");
			this.desafiado.apresentar();
			System.out.println("\n------------- Desafiante --------------\n");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			
			case 0:
				//Empate
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				
				System.out.println("\n------------- Resultado -----------\n");
				System.out.println("Empatou! " + "\n");
				this.desafiado.status();
				System.out.println("\n");
				this.desafiante.status();
				break;
				
			case 1:
				//Desafiado Ganha
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				
				System.out.println("\n------------- Resultado -----------\n");
				System.out.println("E o vencedor é o " + this.desafiado.getNome() + "\n");
				this.desafiado.status();
				System.out.println("\n");
				this.desafiante.status();
				
				break;
				
			case 2:
				//Desafiante Ganha
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				
				System.out.println("\n------------- Resultado -----------\n");
				System.out.println("E o vencedor é o " + this.desafiante.getNome() + "\n");
				this.desafiado.status();
				System.out.println("\n");
				this.desafiante.status();
				break;
			}
		}else {
			System.out.println("\nLuta não pode acontecer");
		}
	}
	
	
	
	
}
