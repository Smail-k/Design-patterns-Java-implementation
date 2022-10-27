package com.esisa.dp.structural.composite;

import com.esisa.dp.structural.composite.app.abstract_factory.StringFactory;

public class Client {

	public Client() {
		exp01();
	}

	void exp01() {
		Component root = new Composite("A");
		Component B = new Composite("B");
		Component C = new Composite("C");
		Component D = new Composite("D");
		Component F = new Composite("F");
		Component J = new Composite("J");
		
		root.add(B);
		root.add(C);
		root.add(D);
		
		B.add(new Leaf("E"));
		B.add(F);
		
		
		C.add(new Leaf("I"));
		
		D.add(J);
		D.add(new Leaf("K"));
		
		F.add(new Leaf("G"));
		F.add(new Leaf("H"));
		
		J.add(new Leaf("L"));
		J.add(new Leaf("M"));
		
		//root.operation();
		
		root.setFactory(new StringFactory());
		
		System.out.println(root.getFactory());
		System.out.println(B.getFactory());
		
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
