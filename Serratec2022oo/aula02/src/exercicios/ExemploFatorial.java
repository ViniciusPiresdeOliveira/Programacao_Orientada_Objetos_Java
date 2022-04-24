package exercicios;

public class ExemploFatorial {

	public static void main(String[] args) {
		
		int n1 = 10;
		int i = 1;
		long fatorial = 1;
		
		do {
			fatorial = fatorial * i;
			i ++;
			System.out.println(fatorial);
		} while (fatorial <= n1);
	}

}
