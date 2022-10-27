package com.esisa.dp.structural.composite;

import java.util.Vector;

import com.esisa.dp.structural.composite.app.abstract_factory.AbstractFactory;

public class Composite extends Component{

	private Vector<Component> children; 
	
	public Composite() {
		children = new Vector<Component>();
	}
	
	public Composite(String name) {
		super(name);
		children = new Vector<Component>();
	}


	public void add(Component cmp) {
		children.add(cmp);
	}
	
	public boolean remove(Component cmp) {
		return children.remove(cmp);
	}
	
	public Component get(int index) {
		return children.get(index);
	}
	
	public void setFactory(AbstractFactory factory) {
		this.factory=factory;
		for (Component child : children) {
			child.setFactory(factory);
		}
	}
	
	public int size() {
		return children.size();
	}

	public void operation() {
		System.out.println("<"+getName()+">");
		for (Component child : children) {
			child.operation();
		}
	}
	
	public Object construct() {
		return factory.createComposite(this);
	}
}
