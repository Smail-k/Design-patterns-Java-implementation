package com.esisa.dp.structural.flyweight;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test extends JFrame implements ActionListener,Observer{

	private static final long serialVersionUID = 1L;

	private FlyweightFactory factory;
	private Client client;
	private Info createdFlyweight; 
	private Info usedFlyWeight;
	
	public Test() {
		factory=new FlyweightFactory();
		factory.addObserver(this);
		client=new Client(factory);
		
		createdFlyweight = new Info("Created Flyweight", 0, Color.blue);
		usedFlyWeight = new Info("Used Flyweight", 0, Color.red);
		
		JPanel p = new JPanel(new GridLayout(2,1));
		p.add(createdFlyweight);
		p.add(usedFlyWeight);
		
		getContentPane().add("Center",p);
		JButton b = new JButton("Start Client");
		getContentPane().add("South",b);
		b.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		new Test();
	}

	public void actionPerformed(ActionEvent e) {
		client.start();
	}
	

	public void update() {
		createdFlyweight.setInfo(factory.size());
		usedFlyWeight.setInfo(client.flyweightCount());	
	}
}
