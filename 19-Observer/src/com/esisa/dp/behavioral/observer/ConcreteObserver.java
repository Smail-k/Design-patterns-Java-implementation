package com.esisa.dp.behavioral.observer;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConcreteObserver extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	private ConcreteSubject subject;
	private JLabel screen;
	
	public ConcreteObserver(ConcreteSubject subject) {
		this.subject=subject;
		subject.attach(this);
		
		setLayout(new BorderLayout());
		screen = new JLabel();
		add("Center",screen);
		screen.setFont(new Font("Arial",Font.BOLD,36));
		screen.setHorizontalAlignment(JLabel.CENTER);
	}

	public void update() {
		screen.setText(Arrays.toString(subject.getData()));
	}

}
