package com.esisa.dp.structural.decorator;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ConcreteDecoratorD extends Decorator{

	private Color color; 
	
	public ConcreteDecoratorD(Component component,Color color) {
		super(component);
		this.color=color;
	}

	public JComponent operation() {
		JComponent cmp =  super.operation();
		return addedBehavior(cmp);
	}

	public JPanel addedBehavior(JComponent cmp) {
		JPanel p = new JPanel(new GridLayout());
		p.setBorder(new CompoundBorder(new LineBorder(color),new EmptyBorder(5, 5, 5, 5)));
		p.add("Center",cmp);
		return p; 
	}
}
