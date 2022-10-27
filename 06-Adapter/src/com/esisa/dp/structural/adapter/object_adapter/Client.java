package com.esisa.dp.structural.adapter.object_adapter;

import com.esisa.dp.structural.adapter.Adaptee1;
import com.esisa.dp.structural.adapter.Adaptee2;
import com.esisa.dp.structural.adapter.Adaptee3;
import com.esisa.dp.structural.adapter.Target;

public class Client {

	public Client() {
		exp01();
	}
	
	void exp01() {
		
		Target t[] = {
			new Adapter1(new Adaptee1()),
			new Adapter1(new Adaptee1()),
			new Adapter2(new Adaptee2()),
			new Adapter1(new Adaptee1()),
			new Adapter3(new Adaptee3()),
			new Adapter3(new Adaptee3()),
			new Adapter2(new Adaptee2()),
			new Adapter3(new Adaptee3())
		};
		
		for (Target target : t) {
			target.log();
		}
		
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}
