package curso_em_video;

public class TesteContaBanco {
	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco(1, "Vinicius");
		ContaBanco p2 = new ContaBanco(2, "Afonso");
		
		
		
		p1.abrirConta("CP", "V");
		p1.estadoAtual();
		p2.abrirConta("CC", "V");
		p2.estadoAtual();
	}
}
