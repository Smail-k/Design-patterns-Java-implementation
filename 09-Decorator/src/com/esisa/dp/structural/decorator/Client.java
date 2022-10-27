package com.esisa.dp.structural.decorator;

import java.awt.Color;

import javax.swing.JFrame;

public class Client extends JFrame{

	private static final long serialVersionUID = 1L;

	public Client() {
		exp01();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	void exp01() {
		Component component = new ConcreteComponent(); 
		Decorator d1 = new ConcreteDecoratorA(component);
		Decorator d2 = new ConcreteDecoratorB("Design Pattern ",d1);
		Decorator d3 = new ConcreteDecoratorC(d2,"ajouter","supprimer","modifier");
		Decorator d4 = new ConcreteDecoratorD(d3, Color.red);
		Decorator d5 = new ConcreteDecoratorD(d4, Color.blue);
		
		setContentPane(d5.operation());
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}
