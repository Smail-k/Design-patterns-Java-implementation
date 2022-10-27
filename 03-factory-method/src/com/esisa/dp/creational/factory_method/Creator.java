package com.esisa.dp.creational.factory_method;

import javax.swing.AbstractButton;
import javax.swing.JPanel;

/*
 * ButtonPanel
*/
abstract public class Creator extends JPanel{

	private static final long serialVersionUID = 1L;

	public Creator() {
		// TODO Auto-generated constructor stub
	}
	public Creator(String ...labels) {
		for (String label : labels) {
			AbstractButton product = factoryMethod(label); 
			add(product); 
		}
	}
	public void anOperation(String label) {
		AbstractButton product = factoryMethod(label); 
		add(product); 
	}
	
	public AbstractButton get(int index) {
		return (AbstractButton) getComponent(index);
	}
	public abstract AbstractButton factoryMethod(String label);//la tache de creation
	
}