package org.serratec;

public class Conversao {

	public static void main(String[] args) {
		int a = 100;
		float b;
		int d;
		double c = 4.25;
		b = a;
		// Desse jeito iria dar erro d = c;
		// Desse jeito vai dar certo
		d = (int)c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
