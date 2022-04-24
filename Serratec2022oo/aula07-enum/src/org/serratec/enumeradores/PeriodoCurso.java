package org.serratec.enumeradores;

public enum PeriodoCurso {

	INTEGRAL("Segunda a Sexta", 80, 3600),
	NOTURNO("Terca e Quinta", 40, 1200), 
	MANHA("Quarta e Sexta", 60, 2400);
	
	private String diasDaSemana;
	private int cargaHoraria;
	private double valor;
	
	private PeriodoCurso(String diasDaSemana, int cargaHoraria, double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDiasDaSemana() {
		return diasDaSemana;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public double getValor() {
		return valor;
	}
	
	
}
