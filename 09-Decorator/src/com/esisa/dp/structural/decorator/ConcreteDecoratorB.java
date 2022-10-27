package com.esisa.dp.structural.decorator;

import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConcreteDecoratorB extends Decorator{
	
	private String label;
	
	public ConcreteDecoratorB(String label,Component component) {
		super(component);
		this.label=label;
	}

	public JComponent operation() {
		JComponent cmp = super.operation();
		return addedBehavior(cmp);
	}
	
	public JPanel addedBehavior(JComponent cmp) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		p.add(new JLabel(label + ": "));
		p.add(cmp);
		return p;
	}
	
}