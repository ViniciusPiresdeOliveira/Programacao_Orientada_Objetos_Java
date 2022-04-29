package br.com.senai.exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.model.Fornecedor;

public class ExemploSerializacao {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("3644515541", "Empresa XPTO", "xpto@gmail.com", 1.0);
		Fornecedor f2 = new Fornecedor("5698442226", "Empresa ABC", "abc@gmail.com", 3.0);
		Fornecedor f3 = new Fornecedor("3644515541", "Empresa XPTO", "xpto@gmail.com", 1.0);
		
		if (f1.equals(f3)) {
			System.out.println("Mesmo CNPJ");
		}else {
			System.out.println("CNPJ diferentes");
		}
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(f1);
		fornecedores.add(f2);
		try {
			FileOutputStream arquivoGravar = new FileOutputStream("/exemplos/fornecedor.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(fornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.close();
			System.out.println("Objeto gravado com sucesso ");
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel gravar o objeto");
			e.printStackTrace();
		}
		
		System.out.println("Leitura do objeto criado");
		
		try {
			FileInputStream caminhoArquivo = new FileInputStream("/exemplos/fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(caminhoArquivo);
			System.out.println(lerObjeto.readObject());
			lerObjeto.close();
			caminhoArquivo.close();
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo");
		}
	}

}
