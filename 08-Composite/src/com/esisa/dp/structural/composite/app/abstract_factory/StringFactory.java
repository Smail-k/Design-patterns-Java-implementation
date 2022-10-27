package com.esisa.dp.structural.composite.app.abstract_factory;

import com.esisa.dp.structural.composite.Composite;
import com.esisa.dp.structural.composite.Leaf;

public class StringFactory implements AbstractFactory{

	public StringFactory() {
		// TODO Auto-generated constructor stub
	}

	public Object createLeaf(Leaf leaf) {
		return leaf.getName();
	}

	
	public Object createComposite(Composite cmp) {
		String s = cmp.getName() + "(";
		for (int i = 0; i < cmp.size(); i++) {
			s=s+ cmp.get(i).construct();
			s+=", ";
		}
		s=s+")";
		return s;
		
	}

}
