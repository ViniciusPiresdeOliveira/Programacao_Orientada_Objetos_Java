package exercicio_agenda;

import java.util.HashMap;
import java.util.Map;

public class Agenda_Telefonica<T> {
	private HashMap<String, String> colecao = new HashMap<>();

	public void inserir(String nome, String numero) {
		colecao.put(nome, numero);
	}

	public void buscarNumero(String nome) {
		System.out.println(colecao.get(nome));

	}
}
