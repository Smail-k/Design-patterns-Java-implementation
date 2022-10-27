package com.esisa.dp.creational.abstract_factory;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ConcreteFactory2 implements AbstractFactory{

	private String titles[];
	
	public ConcreteFactory2(String...titles) {
		this.titles=titles;
	}
	
	public JComponent createProductA(String label, int size) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		p.add(new JLabel(label +" : "));
		p.add(new JScrollPane(new JTextArea(3,size)));
		return p; 
	}

	
	public JComponent createProductB(Object[][] data) {
		return new JScrollPane(new JTable(data, titles));
	}

	
	public JComponent createProductC(String... choices) {
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ButtonGroup g = new ButtonGroup(); 
		for (int i = 0; i < choices.length; i++) {
			JRadioButton b = new JRadioButton(choices[i]);
			p1.add(b);
			g.add(b);
		}
		return p1; 
	}

}
