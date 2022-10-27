package com.esisa.dp.structural.adapter.class_adapter;

import com.esisa.dp.structural.adapter.Adaptee2;
import com.esisa.dp.structural.adapter.Target;

public class Adapter2 extends Adaptee2 implements Target {

	public Adapter2() {
		
	}

	public void log() {
		show();
	}

}
