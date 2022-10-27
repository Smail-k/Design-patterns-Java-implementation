package com.esisa.dp.creational.factory_method;

import javax.swing.JFrame;

public class Client extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public Client() {
		exp01();
		exp02();
		exp03();
		setVisible(true);
		setSize(500,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	void exp01() {
		Creator creator = new ConcreteCreatorA("btn1","btn2","btn3");
		creator.anOperation("exit");
		getContentPane().add("South",creator);
	}
	void exp02() {
		Creator creator = new ConcreteCreatorB("checkbox1","checkbox2","checkbox3");
		getContentPane().add("North",creator);
	}
	void exp03() {
		Creator creator = new ConcreteCreatorC("radiobtn1","radiobtn2","radiobtn3");
		getContentPane().add("Center",creator);
	}
	public static void main(String[] args) {
		new Client();
	}
}
