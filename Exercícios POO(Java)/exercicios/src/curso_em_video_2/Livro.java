package curso_em_video_2;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private String status;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.status = "Livro Fechado";
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String detalhes() {
		return "============= Livro ==========" + "\nT?tulo: " + titulo + "\nAutor: " + autor + "\nTotal de P?ginas: "
				+ totPaginas + "\nP?gina Atual: " + pagAtual + "\nStatus: " + status + "\nLeitor: " + leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String aberto) {
		this.status = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.status = "Livro aberto";

	}

	@Override
	public void fechar() {
		this.status = "Livro Fechado";

	}

	@Override
	public void folhear(int p) {
		if (p > this.getTotPaginas() || p < 0) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}

	}

	@Override
	public void avancarPag() {
		this.pagAtual += 1;

	}

	@Override
	public void voltarPag() {
		this.pagAtual -= 1;

	}

}
