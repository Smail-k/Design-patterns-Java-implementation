package com.esisa.dp.creational.builder;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Client {

	public Client() {
		exp02();
	}
	@SuppressWarnings("unchecked")
	void exp01() {
		Builder builder = new ConcreateBuilderA();
		Director director = new Director(builder);
		Vector<DesignPattern> product = (Vector<DesignPattern>) director.construct("resources/design-patterns.txt", "");
		for (DesignPattern pattern : product) {
			System.out.println(pattern);
		}
	}
	void exp02() {
		Builder builder = new ConcreateBuilderB("Id","Name","Category","Intent");
		Director director = new Director(builder);
		JTable product = (JTable) director.construct("resources/design-patterns.txt", "interface");
		
		JFrame f = new JFrame(); 
		f.setContentPane(new JScrollPane(product));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);	
	}

	public static void main(String[] args) {
		new Client();
	}
}
