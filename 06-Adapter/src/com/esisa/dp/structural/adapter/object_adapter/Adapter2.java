package com.esisa.dp.structural.adapter.object_adapter;

import com.esisa.dp.structural.adapter.Adaptee2;
import com.esisa.dp.structural.adapter.Target;

public class Adapter2 implements Target{

	private Adaptee2 adaptee;
	
	
	public Adapter2(Adaptee2 adaptee) {
		super();
		this.adaptee = adaptee;
	}




	public void log() {
		adaptee.show();
	}

}
