package exercicio_olimpiada;

public class Atleta implements Olimpiada {

	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais;
	
	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "O atleta "  + nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public int getTotalParticipantes() {
	
		return totalParticipantes;
	}

	public static int totalParticipantes() {
		
		return totalParticipantes;
	}
	
	@Override
	public String verificaSituacao() {
		if (this.getPeso() > 90) {
			totalParticipantes++;
			return "participará";
		} else if(this.getPeso() >= 60 && this.getPeso() <= 90) {
			totalParticipantes++;
			return "participará";
		} else {
			return "não participará";
		}
	}

}
