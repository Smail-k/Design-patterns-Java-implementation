package com.esisa.dp.structural.decorator;

import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public JComponent operation() {
		JComponent cmp = super.operation();
		return addedBehavior(cmp);
	}

	public JScrollPane addedBehavior(JComponent cmp) {
		return new JScrollPane(cmp,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
			);
	}
}
