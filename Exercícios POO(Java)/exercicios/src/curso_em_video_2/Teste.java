package curso_em_video_2;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa[4];
		Livro [] l = new Livro[4];
		
		p[0] = new Pessoa("Vinicius", 18, "Masculino");
		p[1] = new Pessoa("Afonso", 78, "Masculino");
		p[2] = new Pessoa("Cremilda", 89, "Feminino");
		p[3] = new Pessoa("Francisco", 84, "Masculino");
		
		l[0] = new Livro("Cabe?a Fria, Cora??o Quente", "Abel Ferreira", 408, p[1]);
		l[1] = new Livro("Eu Sou Zlatan", "Zlatan Ibrahimovic", 421, p[2]);
		l[2] = new Livro("Pep Guardiola: A evolu??o", "Mart? Perarnau ", 440, p[0]);
		l[3] = new Livro("Klopp", "Raphael Honigstein", 368, p[3]);
		
		l[0].abrir();
		l[0].avancarPag();
		l[1].abrir();
		l[1].avancarPag();
		l[1].avancarPag();
		l[2].abrir();
		l[2].avancarPag();
		l[2].avancarPag();
		l[2].avancarPag();
		l[2].voltarPag();
		l[3].abrir();
		l[3].folhear(57);
		l[3].avancarPag();
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
		System.out.println(l[3].detalhes());
		
		
	}

}
