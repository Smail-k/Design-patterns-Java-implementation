package com.esisa.dp.creational.factory_method;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class ConcreteCreatorA extends Creator{

	private static final long serialVersionUID = 1L;

	public ConcreteCreatorA() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ConcreteCreatorA(String... labels) {
		super(labels);
	}


	public AbstractButton factoryMethod(String label) {
		return new JButton(label); 
	}
}
