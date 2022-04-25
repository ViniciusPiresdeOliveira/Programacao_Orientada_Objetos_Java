package br.com.senai.generics;

public class TesteSorteio {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Augusto", "Analista de Sistemas", "CPD");
		Funcionario f2 = new Funcionario("Jos�", "Advogado", "Jur�dico");
		Funcionario f3 = new Funcionario("Ant�nio", "Engenheiro", "Projetos");
		Funcionario f4 = new Funcionario("Luiz", "Auxiliar", "DP");
		
		Sorteio<Funcionario> sorteio = new Sorteio<>();
		sorteio.adicionar(f1);
		sorteio.adicionar(f2);
		sorteio.adicionar(f3);
		sorteio.adicionar(f4);
		
		Funcionario funcionario = sorteio.sortear();
		System.out.println("O vencedor do sorteio �: " + funcionario);
		
		Sorteio<Integer> sortearNumeros = new Sorteio<>();
		sortearNumeros.adicionar(100);
		sortearNumeros.adicionar(200);
		sortearNumeros.adicionar(300);
		sortearNumeros.adicionar(400);
		Integer i = sortearNumeros.sortear();
		System.out.println("O n�mero sorteado �: " + i);
	}

}
