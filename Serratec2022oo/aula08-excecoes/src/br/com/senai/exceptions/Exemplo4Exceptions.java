package br.com.senai.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo4Exceptions {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		try {
			
			fr = new FileReader("C://Users//RESIDENCIA//ok//teste.txt");
			System.out.println("Arquivo existe");
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		} finally {
			fr.close();
			System.out.println("Sempre entra aqui !");
		}
	}

}
