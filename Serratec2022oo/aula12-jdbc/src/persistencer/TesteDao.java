package persistencer;

import model.Cliente;

public class TesteDao {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		/*Cliente cliente = new Cliente(null, "Marta", "234433", "marta@gmail.com");
		dao.inserir(cliente);
		*/
		/*Cliente cliente = new Cliente(1,"Joao da Silva", "23434345", "josilva@hotmail.com");
		dao.atualizar(cliente);*/
		//dao.apagar(3);
		
		//System.out.println(dao.listar());
		/*for (Cliente cliente : dao.listar()) {
			//System.out.println(cliente);*/
		;
		System.out.println(dao.buscar(4));
		
	
	
	
	}
	}


