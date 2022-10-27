package com.esisa.dp.structural.adapter.object_adapter;

import com.esisa.dp.structural.adapter.Adaptee1;
import com.esisa.dp.structural.adapter.Target;

public class Adapter1 implements Target {
	private Adaptee1 adaptee;

	public Adapter1(Adaptee1 adaptee) {
		super();
		this.adaptee = adaptee;
	}

	
	public void log() {
		adaptee.afficher();
	}
	
}
