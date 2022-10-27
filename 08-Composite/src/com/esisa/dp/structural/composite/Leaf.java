package com.esisa.dp.structural.composite;

public class Leaf extends Component{

	public Leaf() {
	}

	public Leaf(String name) {
		super(name);
	}
	
	public void operation() {
		System.out.println(" - "+getName());
	}

	public Object construct() {
		return factory.createLeaf(this);
	}
	
}