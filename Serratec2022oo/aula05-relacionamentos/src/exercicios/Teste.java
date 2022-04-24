package exercicios;

public class Teste {

	public static void main(String[] args) {
		
		Telefone telefones1 = new Telefone("(24)98823-8881");
		Telefone telefones2 = new Telefone("(24)91888-3288");
		Estado estado = new Estado(" Rio de Janeiro -", " RJ ");
		Cidade cidade = new Cidade(" Petrópolis -", estado);
		Endereco endereco = new Endereco("Rua Afrânio Mello ", " Quitandinha ", " 25.651-000 ", cidade);
		Contato contato = new Contato("Vinicius", new Telefone[2], endereco);
		
		System.out.println("Nome: " + contato.getNome());
		System.out.println(endereco.toString());
		System.out.println("Telefone: " + telefones1.getNumero());
		System.out.println("Telefone: " + telefones2.getNumero());
	}

}
