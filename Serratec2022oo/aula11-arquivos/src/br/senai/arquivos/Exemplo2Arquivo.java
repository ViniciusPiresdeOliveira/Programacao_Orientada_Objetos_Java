package br.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exemplo2Arquivo {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("teste\\exercicio2.txt"));
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		}
		
	}

}