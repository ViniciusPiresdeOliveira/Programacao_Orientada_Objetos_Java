package revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Biblioteca<Livro>{

	private String responsavel;
	private ArrayList<Livro> listaLivros = new ArrayList();
	

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void adicionar(Livro elemento) {
		listaLivros.add(elemento);
	}
	
	public void listar() {
		for (Livro elemento : listaLivros) {
			System.out.println(elemento);
		}
	}
	
    public double pesquisarFaixaDePreco(double valorInicial, double valorFinal) {
    	double valor = (double) (valorInicial + valorFinal) / 2;
        return valor;
    }
	
	public double calcularTotalLivros() {
		//for (int i = 0; i < array.length; i++) {
			
		
		return 0;
		
	}
}
