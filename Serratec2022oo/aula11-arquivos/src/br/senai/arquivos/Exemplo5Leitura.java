package br.senai.arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Exemplo5Leitura {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("teste\\\\exercicio2.txt"),"UTF-8"));
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
