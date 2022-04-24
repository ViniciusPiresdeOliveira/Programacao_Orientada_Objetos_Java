package exercicio_lutadores;

public class TesteLuta {

	public static void main(String[] args) {
		
		CategoriaLuta pm = new CategoriaLuta("1", "Peso Médio");
		CategoriaLuta pp = new CategoriaLuta("2", "Peso Pesado");
		Lutador lut1 = new Lutador("Anderson Silva", "Peso Médio", 39, 87);
		Lutador lut2 = new Lutador("Vitor Belfort", "Peso Médio", 37, 85);
		Lutador lut3 = new Lutador("Conor McGregor", "Peso Pesado", 33, 92);
		Luta ev1 = new Luta(lut2, lut1, "3");
				
		System.out.println(ev1);
		System.out.println(ev1.confirmarLuta());
		//System.out.println("Lutadores: " + lut2.getNome() + " Vs " + lut1.getNome());
		//System.out.println("Status: " + ev1.confirmarLuta());
		//System.out.println("Rounds: " + ev1.getRounds());
		
		/*if (luta1.confirmarLuta()) {
        //System.out.println("Luta confirmada");
        luta1.setConfirmado(true);
    } else {
        System.out.println("Luta cancelada");*/
		//Teria que passar o confirmado para boolean, e puxar
		// o get e o set do confirmado.
    }
}

	


