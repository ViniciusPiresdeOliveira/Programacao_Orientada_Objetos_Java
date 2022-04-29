package br.com.senai.exemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExemploAnonima {

	public static void main(String[] args) {
		JButton jButton = new JButton();
		
		/*Classe Anônima*/jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Teste");
				
			}
		});

		/*Lambda*/jButton.addActionListener(e -> System.out.println("Teste"));

	}

}
