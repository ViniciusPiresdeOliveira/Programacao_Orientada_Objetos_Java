package br.senai.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.senai.model.Empregado;

public class TesteLeituraGravacao {

	public static void main(String[] args) {
		Set<Empregado> empregados = new HashSet<>();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo:");
			String nomeArquivo = sc.next();
			File arquivo = new File(nomeArquivo);

			Scanner sc1 = new Scanner(arquivo);
			while (sc1.hasNextLine()) {
				String linha = sc1.nextLine();
				if (!linha.isEmpty()) {
					String[] dadosLinha = linha.split(";");
					String nome = dadosLinha[0];
					String profissao = dadosLinha[1];
					empregados.add(new Empregado(nome, profissao));
				}
			}
			sc1.close();
			//Caminho do arquivo
			FileWriter caminho = new FileWriter("teste/saida2.txt");
			//Gravar o arquivo
			PrintWriter gravar = new PrintWriter(caminho);
			for (Empregado empregado : empregados) {
				String linhaArquivo = empregado.getNome() + ";" + empregado.getProfissao() + "\n";
				gravar.printf(linhaArquivo);
			}
			gravar.close();
			System.out.println("Arquivo gravado com sucesso !!!");
		} catch (Exception e) {
			System.out.println("Erro de leitura de gravação !!!");
		}

	}

}
