package ufs;

import java.util.Random;

public class Luta {

	//Tipo abstrato de dados ---> Lutador desafiante/desafiado
	private Lutador desafiante;//Desafiante vai ser uma inst?ncia da classe Lutador/objeto de Lutador
	private Lutador desafiado;//Desafiado vai ser uma inst?ncia da classe Lutador/objeto de Lutador
	private int rounds;
	private boolean aprovada;

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;
		} else {
			this.aprovada = false;
			this.desafiante = null;
			this.desafiado = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("###### Desafiante ######");
			this.desafiante.apresentar();
			System.out.println("###### Desafiado ######");
			this.desafiado.apresentar();
			
			Random aletorio = new Random();
			int vencedor = aletorio.nextInt(3); //0 1 2
			System.out.println("========== RESULTADO DA LUTA ==========");
			switch(vencedor) {
				case 0://Empate	
					System.out.println("\t        Empatou");
					this.desafiante.empatarLuta();
					this.desafiado.empatarLuta();
					break;
				case 1://Vit?ria do Desafiante
					System.out.println("\t  "+this.desafiado.getNome() + " venceu " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
				case 2://Vit?ria do Desafiado
					System.out.println("\t  "+this.desafiado.getNome() + " venceu " + this.desafiante.getNome());
					this.desafiante.perderLuta();
					this.desafiado.ganharLuta();
					break;
			}
			System.out.println("=======================================");

		} else {
			System.out.println("A luta n?o pode acontecer");
		}
	}
}
