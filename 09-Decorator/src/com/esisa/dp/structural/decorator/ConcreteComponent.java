package com.esisa.dp.structural.decorator;

import javax.swing.JComponent;
import javax.swing.JTextArea;

public class ConcreteComponent extends Component{

	private JComponent jc; 
	
	
	
	public ConcreteComponent() {
		jc = new JTextArea(3,50);
	}

	public ConcreteComponent(int rows,int cols) {
		this.jc= new JTextArea(rows,cols);
	}
	
	public ConcreteComponent(JComponent jc) {
		this.jc = jc;
	}

	public JComponent operation() {
		return jc;
	}

}
