package org.serratec;

public class ExemploSwitch {

	public static void main(String[] args) {
		int notaFinal = 6;
		
		switch (notaFinal) {
		case 10:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Excepcional");
			break;
		case 9:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Excelente");
			break;
		case 8:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Muitom bom");
			break;
		case 7:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Bom");
			break;
		case 6:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Precisa melhorar");
			break;
		case 5:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Ruim");
			break;
		case 4:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Muito ruim");
			break;
		case 3:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Lamentável");
			break;
		case 2:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Péssimo");
			break;
		case 1:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Horroroso");
			break;
		case 0:
			System.out.println("Sua nota é: " + notaFinal);
			System.out.println("Deprimente");
			break;
		
		default:
			System.out.println("Nota inválida. Tente novamente.");
			break;
		}

	}

}
