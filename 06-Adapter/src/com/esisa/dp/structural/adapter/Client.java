package com.esisa.dp.structural.adapter;

public class Client {

	public Client() {
		exp01();
	}
	
	void exp01() {
		Object t[] = {
			new Adaptee1(),
			new Adaptee1(),
			new Adaptee2(),
			new Adaptee1(),
			new Adaptee3(),
			new Adaptee3(),
			new Adaptee2(),
			new Adaptee3()
		};
		
		for (int i = 0; i < t.length; i++) {
			if(t[i] instanceof Adaptee1) {
				((Adaptee1)t[i]).afficher();
			}else if(t[i] instanceof Adaptee2) {
				((Adaptee2)t[i]).show();
			}else if(t[i] instanceof Adaptee3) {
				((Adaptee3)t[i]).print();
			}
		}
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}