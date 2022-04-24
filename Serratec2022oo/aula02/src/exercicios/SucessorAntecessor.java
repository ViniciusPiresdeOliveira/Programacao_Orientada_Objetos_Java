package exercicios;

import javax.swing.JOptionPane;

public class SucessorAntecessor {

	public static void main(String[] args) {
		//Crie um programa que leia um número inteiro 
		//e imprima o seu antecessor e seu sucessor.
		
		String num1 = JOptionPane.showInputDialog("Digite um número: ");
		Double n1 = Double.parseDouble(num1);
		JOptionPane.showInternalMessageDialog(null, "O antecessor do número " + n1 + " é " +(n1-1) + " e o sucessor é " + (n1+1));                                 
	
	}

}
