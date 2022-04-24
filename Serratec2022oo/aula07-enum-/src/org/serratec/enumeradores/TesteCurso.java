package org.serratec.enumeradores;

public class TesteCurso {

	public static void main(String[] args) {

		Turma turma = new Turma("Java WEB", PeriodoCurso.NOTURNO);
		System.out.println("Curso: " + turma.getCurso());
		System.out.println("Turno: " + turma.getPeriodoCurso());
		System.out.println(turma.getPeriodoCurso());
		System.out.println(turma.getPeriodoCurso().getValor());
		System.out.println(turma.getPeriodoCurso().getCargaHoraria());
	}

}
