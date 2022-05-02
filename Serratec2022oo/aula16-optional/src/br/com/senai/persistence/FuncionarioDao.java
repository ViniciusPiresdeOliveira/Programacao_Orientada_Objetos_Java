package br.com.senai.persistence;

import java.sql.Connection;
import java.util.Optional;

import br.com.senai.model.Funcionario;

public class FuncionarioDao {
	
	public FuncionarioDao() {
		Connection connection = ConnectionFactorySingleton.getConnection();
	}
	
	public Optional<Funcionario> buscar(String nome) {
		//return Optional.ofNullable(null);
		return null;
	}
}
