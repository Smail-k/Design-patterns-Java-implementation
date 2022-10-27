package com.esisa.dp.structural.decorator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class ConcreteDecoratorC extends Decorator{

	private String[] actions;
	
	public ConcreteDecoratorC(Component component,String...actions) {
		super(component);
		this.actions=actions;
	}

	public JComponent operation() {
		JComponent cmp = super.operation();
		return addedBehavior(cmp);
	}
	
	public JPanel addedBehavior(JComponent cmp) {
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel p2 = new JPanel(new BorderLayout());
		for (String action : actions) {
			p1.add(new JButton(action));
		}
		p2.add("North",cmp);
		p2.add("South",p1);
		
		return p2;
	}
	
}