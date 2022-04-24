package org.serratec.model;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Funcionario("Vinicius", "Gerente de TI", 8000);
		funcionarios[1] = new Funcionario("Roni", "Professor", 80000);
		funcionarios[2] = new Funcionario("Adrian", "Programado", 6000);
		
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("=====================================================");
			System.out.println(funcionarios[i] + "Sal�rio com abono: R$" + funcionarios[i].abonoSalario(100));
		}
		for (Funcionario funcionario : funcionarios) {
			System.out.println("=====================================================");
			System.out.println(funcionario);
			
		}
	}

}