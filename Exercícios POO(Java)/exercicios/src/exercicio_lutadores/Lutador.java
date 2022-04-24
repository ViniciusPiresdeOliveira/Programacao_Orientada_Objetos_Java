package exercicio_lutadores;

public class Lutador {

	private String nome;
	private String categoriaLuta;
	private int idade;
	private double peso;
	
	@Override
	public String toString() {
		return "\nLutador: " + nome + "\nCategoria da Luta: " + categoriaLuta + "\nIdade: " + idade + "\nPeso: " + peso+"kg";
	}

	public Lutador(String nome, String categoriaLuta, int idade, double peso) {
		super();
		this.nome = nome;
		this.categoriaLuta = categoriaLuta;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoriaNome() {
		return categoriaLuta;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaLuta = categoriaNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
