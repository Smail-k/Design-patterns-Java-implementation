package com.esisa.dp.structural.facade;

import java.awt.Color;

import javax.swing.JFrame;

public class Client extends JFrame{

	private static final long serialVersionUID = 1L;

	public Client() {
		init();
		config();
	}
	
	private void init() {
		TableFacade facade = new TableFacade("Design Patterns","Id","Name","Category");
		facade.add("1","Singleton","Creational");
		facade.add("2","Abstract Factory","Creational");
		facade.add("10","Facade","Structural");
		facade.add("13","Chain of Responsibility","Behavioral");
		facade.add("14","Command","Behavioral");
		
		facade.setColumnForground(0, Color.red);
		facade.setColumnBackground(1, Color.orange);
		
		facade.setColumnsWidth(10,60,30);
		
		facade.setCellValue(1, 0, 4);
		System.out.println(facade.getCellValue(2, 1));
		
		setContentPane(facade);
	}
	
	private void config() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
