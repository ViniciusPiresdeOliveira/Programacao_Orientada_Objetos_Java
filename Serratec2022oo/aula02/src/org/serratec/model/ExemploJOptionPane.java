package org.serratec.model;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		String num2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

		Double n1 = Double.parseDouble(num1);
		Double n2 = Double.parseDouble(num2);
		
		JOptionPane.showMessageDialog(null, (n1+n2));
	}
}
