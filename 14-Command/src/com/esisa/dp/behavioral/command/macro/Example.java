package com.esisa.dp.behavioral.command.macro;

import javax.swing.JFrame;

public class Example extends JFrame{

	private static final long serialVersionUID = 1L;

	public Example() {
		exp01();
	}

	void exp01() {
		Client4 cl4 = new Client4();
		setTitle("Le Design Pattern Command"); 
		setContentPane(cl4.getReceiver());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		
		cl4.start();
	}

	
	public static void main(String[] args) {
		new Example();
	}
	
}
