package teste;

import pacote_enum.TipoParentesco;
import pacote_enum.Tipo_Salario;

public class Teste_Funcionario {

	public static void main(String[] args) {
		Dependente d1 = new Dependente("Siclano", 213546, 65456465, TipoParentesco.FILHO);
		Funcionario f1 = new Funcionario("Fulano", 5413654, 64165465, Tipo_Salario.REPOSITOR, d1);

		f1.descontoIR();

		System.out.printf("R$:%.2f", f1.descontoInss(Tipo_Salario.REPOSITOR.getSalario()));
		System.out.printf("\nR$:%.2f", f1.descontoIR());

	}

}
