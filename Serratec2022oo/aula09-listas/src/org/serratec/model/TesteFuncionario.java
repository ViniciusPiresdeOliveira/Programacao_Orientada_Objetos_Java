package org.serratec.model;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		funcionarios[0] = new Funcionario(nome, "Gerente de TI", 8000);
		funcionarios[1] = new Funcionario("Roni", "Professor", 9000);
		funcionarios[2] = new Funcionario("Talles", "Programador", 6000);
		
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println(funcionarios[i] + " || Salário com abono: R$" + funcionarios[i].abonoSalario(100));

		}
		System.out.println("=====================================================");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

}
