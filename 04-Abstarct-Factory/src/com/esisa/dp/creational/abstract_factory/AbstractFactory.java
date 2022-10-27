package com.esisa.dp.creational.abstract_factory;

import javax.swing.JComponent;

public interface AbstractFactory {

	public JComponent createProductA(String label,int size); 
	public JComponent createProductB(Object data[][]); 
	public JComponent createProductC(String...choices); 
	
}