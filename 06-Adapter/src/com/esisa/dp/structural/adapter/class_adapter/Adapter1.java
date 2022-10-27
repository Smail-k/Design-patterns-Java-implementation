package com.esisa.dp.structural.adapter.class_adapter;

import com.esisa.dp.structural.adapter.Adaptee1;
import com.esisa.dp.structural.adapter.Target;

public class Adapter1 extends Adaptee1 implements Target{

	public Adapter1() {
		
	}

	public void log() {
		afficher();
		
	}

}
