package exercicio_agenda;

import java.util.HashMap;

public class Teste_Agenda {

	public static void main(String[] args) {
		
		HashMap<String, String> colecao = new HashMap<>();
		
		colecao.put("Jos�", "12345678");
		colecao.put("Cano", "78945612");
		colecao.put("Abel", "74126541");
		System.out.println(colecao.get("Jos�"));

	}

}
