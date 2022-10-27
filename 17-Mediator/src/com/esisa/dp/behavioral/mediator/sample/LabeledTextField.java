package com.esisa.dp.behavioral.mediator.sample;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabeledTextField extends Colleague implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JTextField text;
	
	public LabeledTextField() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l = new JLabel("Design Pattern"); 
		text=new JTextField(40);
		text.addKeyListener(this);
		add(l); 
		add(text); 
		
	}
	
	//services
	public void setValue(String value) {
		text.setText(value);
	}
	public String getValue() { 
		return text.getText();
	}

	
	public void keyTyped(KeyEvent e) {
	}

	
	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		if(text.getText().trim().equals("")) {
			mediator.disable(0);
		}else {
			mediator.enable(0);
		}
	}

}
