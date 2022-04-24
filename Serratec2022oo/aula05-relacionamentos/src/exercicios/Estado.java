package exercicios;

public class Estado {

	private String nomeEstado;
	private String sigla;
	
	@Override
	public String toString() {
		return nomeEstado + sigla;
	}

	public Estado(String nomeEstado, String sigla) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}
	
	
}
