package com.esisa.dp.creational.abstract_factory;

import java.awt.FlowLayout;

import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

public class ConcreteFactory1 implements AbstractFactory{

	public ConcreteFactory1() {
	}

	public static void main(String[] args) {
	
	}

	
	public JComponent createProductA(String label, int size) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(new JLabel(label +" : "));
		p.add(new JTextField(size));
		return p;
	}

	public JComponent createProductB(Object[][] data) {
		DefaultListModel<String> model = new DefaultListModel<String>(); 
		for (int i = 0; i < data.length; i++) {
			model.addElement(Arrays.toString(data[i]));
		}
		return new JScrollPane(new JList<String>(model));
	}

	public JComponent createProductC(String... choices) {
		return new JComboBox<String>(choices);
	}

}
