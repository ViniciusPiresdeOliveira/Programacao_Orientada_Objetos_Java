package exercicio_livraria;

public class Livro {

	public String autor;
	public String titulo;
	public double valor;
	
	public Livro(String autor, String titulo, double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Autor: " + autor + " - " + "Título: " + titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValor() {
		return valor;
	}
	
	public void reajuste(double valor) {
		 this.valor = this.valor + this.valor * valor/100;
	}
}
