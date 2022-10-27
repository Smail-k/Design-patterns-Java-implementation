package com.esisa.dp.creational.factory_method;

import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

public class ConcreteCreatorC extends Creator{

	private static final long serialVersionUID = 1L;

	public ConcreteCreatorC() {
		
	}
	
	public ConcreteCreatorC(String... labels) {
		super(labels);
		
	}

	public AbstractButton factoryMethod(String label) {
		return new JRadioButton(label);
	}
}
