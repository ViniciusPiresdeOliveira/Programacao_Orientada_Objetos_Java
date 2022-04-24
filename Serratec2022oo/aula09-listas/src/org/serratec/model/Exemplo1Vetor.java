package org.serratec.model;
import java.util.Iterator;

public class Exemplo1Vetor {

	public static void main(String[] args) {
		
		//String[] vetor = new String[3];
		//vetor[0] = "Celular";
		//vetor[1] = "TV";
		//vetor[2] = "Blu-Ray";
		//vetor[2] = "Aparelho de Som";//Vetor 2 vai deixar de ser Blu-Ray e passará a ser Aparelho de Som
		
		String[][] funcionario = {{"Vinicius", "piresvinicius35@gmail.com"},
								 {"João", "joaoahtomail"},
								 {"Carla", "carlauol.com"}};
		
		//ou
		/*String[][] funcionario = new String[3][2];
		funcionario[0][0] = "Vinicius";	
		funcionario[0][1] = "piresvinicius35@gmail.com";
		funcionario[1][0] = "João";
		funcionario[1][1] = "joaoahtomail";
		funcionario[2][0] = "Carla";
		funcionario[2][1] = "carlauol.com";*/
		
		for (int linha = 0; linha < funcionario.length; linha++) {
			for (int coluna = 0; coluna < funcionario[linha].length; coluna++) {
				System.out.printf(funcionario[linha][coluna] + "|");
			}
				System.out.printf("\n");
		}
	}

}
