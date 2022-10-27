package com.esisa.dp.structural.adapter.class_adapter;

import com.esisa.dp.structural.adapter.Adaptee3;
import com.esisa.dp.structural.adapter.Target;

public class Adapter3 extends Adaptee3 implements Target{

	public Adapter3() {
		
	}

	public void log() {
		print();
	}

}