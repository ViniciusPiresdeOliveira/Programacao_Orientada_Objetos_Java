package br.senai.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6Gravacao {

	public static void main(String[] args){
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("teste\\exercicio3.txt"));
			bw.append("Serratec - Java");
			bw.append("Olá Mundo");
			bw.write("Teste");
			bw.close();
		} catch (IOException e) {
			System.out.println("Arquivo encontrado");
			e.printStackTrace();
		}
		
		

	}

}
