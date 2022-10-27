package com.esisa.dp.structural.adapter.class_adapter;

import com.esisa.dp.structural.adapter.Target;

public class Client {


	public Client() {
		exp01();
	}
	
	void exp01() {
		Target t[] = {
			new Adapter1(),
			new Adapter1(),
			new Adapter2(),
			new Adapter1(),
			new Adapter3(),
			new Adapter3(),
			new Adapter2(),
			new Adapter3()
		};
		
		for (int i = 0; i < t.length; i++) {
			t[i].log();
		}
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}
