package exercicio_lutadores;

public class CategoriaLuta {

	private String codigo;
	private String nomeCategoria;
	
	@Override
	public String toString() {
		return "CategoriaLuta:" + codigo + "\nNome da Categoria: " + nomeCategoria;
	}

	public CategoriaLuta(String codigo, String nomeCategoria) {
		super();
		this.codigo = codigo;
		this.nomeCategoria = nomeCategoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
}
