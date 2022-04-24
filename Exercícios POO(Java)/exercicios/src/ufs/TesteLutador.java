package ufs;

public class TesteLutador {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];//Declarei um vetor de 6 posi��es(0 � 5)
		
		l[0] = new Lutador("Fred", "Brasil", 38, 1.83, 82, 14, 1, 0);
		l[1] = new Lutador("Germ�n Cano", "Argentina", 34, 1.75, 71, 14, 4, 1);
		l[2] = new Lutador("Zlatan", "Su�cia", 41, 1.95, 92, 9, 3, 2);
		l[3] = new Lutador("M�ller", "Alemanha", 34, 1.75, 74, 13, 4, 1);
		l[4] = new Lutador("Pogba", "Fran�a", 27, 1.86, 87, 7, 1, 0);
		l[5] = new Lutador("Haaland", "Noruega", 21, 1.95, 89, 6, 1, 1);
		
		l[0].apresentar();
		l[0].status();
		l[1].apresentar();
		l[1].status();
		l[2].apresentar();
		l[2].status();
		l[3].apresentar();
		l[3].status();
		l[4].apresentar();
		l[4].status();
		l[5].apresentar();
		l[5].status();
		
		Luta UFS1 = new Luta();
		UFS1.marcarLuta(l[2], l[4]);
		UFS1.lutar();
		l[2].status();
		l[4].status();
	}

}
