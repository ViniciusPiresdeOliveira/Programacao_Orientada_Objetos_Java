package org.serratec.model;
import java.util.Iterator;

public class Exemplo1Vetor {

	public static void main(String[] args) {
		
		//String[] vetor = new String[3];
		//vetor[0] = "Celular";
		//vetor[1] = "TV";
		//vetor[2] = "Blu-Ray";
		//vetor[2] = "Aparelho de Som";//Vetor 2 vai deixar de ser Blu-Ray e passar� a ser Aparelho de Som
		
		String[][] funcionario = {{"Vinicius", "piresvinicius35@gmail.com"},
								 {"Jo�o", "joao@hotomail"},
								 {"Carla", "carla@uol.com"}};
		
		//ou
		/*String[][] funcionario = new String[3][2];
		funcionario[0][0] = "Vinicius";	
		funcionario[0][1] = "piresvinicius35@gmail.com";
		funcionario[1][0] = "Jo�o";
		funcionario[1][1] = "joaoahtomail";
		funcionario[2][0] = "Carla";
		funcionario[2][1] = "carlauol.com";*/
		
		for (int linha = 0; linha < funcionario.length; linha++) {
			for (int coluna = 0; coluna < funcionario[linha].length; coluna++) {//funcionario[linha].length -> pega o tamanho do vetor[2] e adiciona mais 1 = [3]
				System.out.printf(funcionario[linha][coluna] + "|");
			}
				System.out.printf("\n");
		}
	}

}
