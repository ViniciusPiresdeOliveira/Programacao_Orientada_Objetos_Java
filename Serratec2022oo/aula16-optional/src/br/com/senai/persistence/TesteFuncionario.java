package br.com.senai.persistence;

import java.util.Optional;

import br.com.senai.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		
		Optional<Funcionario> funcionario = dao.buscar("Roni");
		/*if (funcionario.isPresent()) {
			System.out.println("Resultado: " + funcionario.get().getNome());

		}*/
		
		funcionario.ifPresent(f -> f.getNome());
		

	}

}
