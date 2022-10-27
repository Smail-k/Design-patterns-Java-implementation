package com.esisa.dp.structural.adapter.object_adapter;

import com.esisa.dp.structural.adapter.Adaptee3;
import com.esisa.dp.structural.adapter.Target;

public class Adapter3 implements Target{

	private Adaptee3 adaptee;
		
	public Adapter3(Adaptee3 adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public void log() {
		adaptee.print();
		
	}
	
}