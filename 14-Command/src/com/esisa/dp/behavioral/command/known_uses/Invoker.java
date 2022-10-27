package com.esisa.dp.behavioral.command.known_uses;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Invoker extends JButton implements ActionListener{

	private static final long serialVersionUID = 1L;

	private Command command = null;
	
	public Invoker() {
		super("Invoker");
		setFont(new Font("Verdana",Font.BOLD,24));
		addActionListener(this);
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(command != null)
			command.execute(e);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(80,40);
	}
	
}
