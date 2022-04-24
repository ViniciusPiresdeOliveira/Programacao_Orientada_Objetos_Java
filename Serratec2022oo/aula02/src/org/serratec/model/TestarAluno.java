package org.serratec.model;

public class TestarAluno {

	public static void main(String[] args) {
		// Criação de uma instância de um objeto
		Aluno a1 = new Aluno();
		a1.codigoAluno = 1;
		a1.nome = "Vinícius";
		a1.telefone = "(24)98823-8881";
		a1.email = "piresvinicius35@gmail.com";
		
		Aluno a2 = new Aluno();
		a2.codigoAluno = 2;
		a2.nome = "Ana Claudia";
		a2.telefone = "(24)2235-1643";
		a2.email = "claudiaana53@gmail.com";
		
		System.out.println(a1.codigoAluno);
		System.out.println(a1.nome);
		System.out.println(a1.telefone);
		System.out.println(a1.email);
		
		System.out.println(a2.codigoAluno);
		System.out.println(a2.nome);
		System.out.println(a2.telefone);
		System.out.println(a2.email);
	}

}
