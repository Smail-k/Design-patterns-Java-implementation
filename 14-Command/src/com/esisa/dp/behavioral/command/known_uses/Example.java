package com.esisa.dp.behavioral.command.known_uses;

import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Example extends JFrame{

	private Invoker invoker;
	private static final long serialVersionUID = 1L;

	public Example() {
		JToolBar tb = new JToolBar();
		invoker=new Invoker();
		tb.add(invoker);
		getContentPane().add("North",tb);
		
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Example();
	}
}
