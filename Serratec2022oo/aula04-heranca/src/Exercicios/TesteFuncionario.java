package Exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Vin�cius", 500);
		Funcionario assistente = new Assistente("Albertina", 1000);
		
		gerente.aumentarSalario();
		System.out.println(gerente.getNome() + " vai receber R$" + gerente.getSalario() + " de sal�rio");
		
		assistente.aumentarSalario();
		System.out.println(assistente.getNome() + " vai receber R$" + assistente.getSalario() + " de sal�rio");
		
	}

}
