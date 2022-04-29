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
			bw.append("Ol� Mundo");
			bw.write("Teste");
			//Uma das diferen�as entre bw.appen e bw.write � que o 
			//bw.append aceita valor nulo e bw.write n�o.
			bw.close();
		} catch (IOException e) {
			System.out.println("Arquivo encontrado");
			e.printStackTrace();
		}
		
		

	}

}
