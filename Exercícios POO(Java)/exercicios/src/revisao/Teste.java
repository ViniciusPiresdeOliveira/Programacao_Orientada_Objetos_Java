package revisao;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Livro l1 = new Livro("Fogo na Caixa D'�gua", "Aquaman", 59.90);
		Livro l2 = new Livro("A volta dos que n�o foram", "Rota66", 78.89);
		Biblioteca<Livro> biblioteca = new Biblioteca();
		biblioteca.adicionar(l1);
		biblioteca.adicionar(l2);
		biblioteca.listar();
		System.out.printf("A m�dia do pre�o dos livros �: R$%.2f" , biblioteca.pesquisarFaixaDePreco(l1.getPreco(), l2.getPreco()));
		System.out.println("\nO valor total dos livros �: R$" + (l1.getPreco()+l2.getPreco()));


	
		
	}

}
