package exercicio_livraria;

public class Operacao implements Livraria{

	public String tipo;
	public double valorOperacao;
	public Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return ("Tipo: " + tipo + " - " + "Valor: R$" + valorOperacao + " - ");
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void venderLivro() {
		valorOperacao = livro.getValor() + livro.getValor() * 0.09;
	}

	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 0.02 + Livraria.taxaEmprestimo;
	}
	
}
