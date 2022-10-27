package com.esisa.dp.structural.composite.app.abstract_factory;

import com.esisa.dp.structural.composite.Composite;
import com.esisa.dp.structural.composite.Leaf;

public interface AbstractFactory {

	public Object createLeaf(Leaf leaf); 
	public Object createComposite(Composite cmp); 
	
}
