package exercicios;

import javax.swing.JOptionPane;

public class SucessorAntecessor {

	public static void main(String[] args) {
		//Crie um programa que leia um n�mero inteiro 
		//e imprima o seu antecessor e seu sucessor.
		
		String num1 = JOptionPane.showInputDialog("Digite um n�mero: ");
		Double n1 = Double.parseDouble(num1);
		JOptionPane.showInternalMessageDialog(null, "O antecessor do n�mero " + n1 + " � " +(n1-1) + " e o sucessor � " + (n1+1));                                 
	
	}

}
