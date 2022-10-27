package com.esisa.dp.creational.abstract_factory;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private Object data[][] = {
			{ 1 ,"Singleton","Creational"},
			{ 2 ,"Prototype","Creational"},
			{ 7 ,"Bridge","Structure"},
			{ 12 ,"Proxy","Structure"},
			{ 13 ,"chain of Responsibility","Behavioral"}
	};
	private String choices []= {"Creational","Structure","Behavioral" };
	
	public Client() {
		
		
	}
	
	public void create(AbstractFactory factory) {
		JPanel p = new JPanel(new BorderLayout());
		
		JComponent a1 = factory.createProductA("Design Pattern", 25);
		JComponent b1 = factory.createProductB(data);
		JComponent c1 = factory.createProductC(choices);
		
		p.add("North",a1);
		p.add("Center",b1); 
		p.add("South",c1);
		
		setContentPane(p);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		Client client = new Client(); 
		AbstractFactory af= new ConcreteFactory1(); 
		client.create(af);
		//AbstractFactory af= new ConcreteFactory2("id","name","type"); 
		//client.create(af);
	}
}
