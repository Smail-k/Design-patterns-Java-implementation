package com.esisa.dp.behavioral.mediator.sample;

import javax.swing.JFrame;


public class Client extends JFrame{

	private static final long serialVersionUID = 1L;
	private LabeledTextField field; 
	private DataList list;
	private ButtonPanel buttons;
	private SwingMediator mediator;
	
	public Client() {
		config();
		init();
	}

	public void config() {
		field = new LabeledTextField();
		list = new DataList(); 
		buttons = new ButtonPanel();
		mediator = new  SwingMediator();
		
		mediator.setColleague(field);
		mediator.setColleague(list);
		mediator.setColleague(buttons);
		
	}
	
	public void init() {
		getContentPane().add("North",field);
		getContentPane().add("Center",list);
		getContentPane().add("South",buttons);
		//pack();
		setSize(600,300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
