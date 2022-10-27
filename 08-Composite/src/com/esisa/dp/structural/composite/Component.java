package com.esisa.dp.structural.composite;

import com.esisa.dp.structural.composite.app.abstract_factory.AbstractFactory;

abstract public class Component {

	private String name;
	protected AbstractFactory factory;
	
	public Component() {
		
	}

	public Component(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFactory(AbstractFactory factory) {
		this.factory = factory;
	}
	
	public AbstractFactory getFactory() {
		return factory;
	}
	
	public void add(Component cmp) {
		
	}
	public boolean remove(Component cmp) {
		return false; 
	}
	
	public Component get(int index) {
		return null;
	}
	
	public int size() {
		return 0;
	}
	
	abstract public void operation();
	abstract public Object construct();
}
