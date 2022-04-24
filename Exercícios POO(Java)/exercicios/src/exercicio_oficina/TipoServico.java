package exercicio_oficina;

public enum TipoServico {

	OLEO(100), LAVAGEM(50), REVISAO(200);
	
	private double tipoServico;

	private TipoServico(double tipoServico) {
		this.tipoServico = tipoServico;
	}

	public double getTipoServico() {
		return tipoServico;
	}
	
}
