package exercicio_divisao;

public class CalcularDivisao {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;

		try {
			c = a / b;
			System.out.println("Resultado: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Digite um n?mero v?lido");
		}
	}
}
