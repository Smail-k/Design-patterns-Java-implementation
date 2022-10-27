package com.esisa.dp.creational.factory_method;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

public class ConcreteCreatorB extends Creator{

	private static final long serialVersionUID = 1L;

	public ConcreteCreatorB() {
		
	}
	
	public ConcreteCreatorB(String... labels) {
		super(labels);
		
	}

	public AbstractButton factoryMethod(String label) {
		return new JCheckBox(label);
	}
}