package exercicio_lutadores;

public class Luta {

	private Lutador desafiante;
	private Lutador desafiado;
	private String rounds;
	private String confirmado;
	
	@Override
	public String toString() {
		return "Desafiante " + desafiante + "\n\nDesafiado " + desafiado + "\n\nTotal de Rounds: " + rounds;
	}

	public Luta(Lutador desafiante, Lutador desafiado, String rounds) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
		
	}

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

	public String getRounds() {
		return rounds;
	}

	public void setRounds(String rounds) {
		this.rounds = rounds;
	}

	public String getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(String confirmado) {
		this.confirmado = confirmado;
	}
	
	public String confirmarLuta() {
		if (desafiante != desafiado && desafiante.getCategoriaNome() == desafiado.getCategoriaNome()) {
			return confirmado = "\n\nLuta Confirmada !!!"; 
		} else {
			return confirmado = "\n\nLuta Anulada !!!";
			
		}

		}
	}
	

