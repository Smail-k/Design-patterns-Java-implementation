package com.esisa.dp.structural.decorator;

import javax.swing.JComponent;

public class Decorator extends Component{

	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	public JComponent operation() {
		return component.operation();
	} 
	
}
