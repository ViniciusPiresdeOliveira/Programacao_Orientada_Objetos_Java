package pacote_enum;

public enum Tipo_Salario {

	GERENTE("Gerente", 8500.00), AÇOGUEIRO("Açogueiro", 6500.00), REPOSITOR("Repositor",8500.00),
	JOVEMAPRENDIZ("Jovem Aprendiz", 900.00), PADEIRO("Padeiro", 3500.00);

	private String cargo;
	private double salario;

	private Tipo_Salario(String string, double d) {
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
}
