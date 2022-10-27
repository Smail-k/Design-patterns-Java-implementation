package com.esisa.dp.creational.singleton;

import java.awt.Toolkit;

public class Client {

	public Client() {
		exp01(); 
		//knownUses();
	}
	
	void exp01() {
		//Singleton s1 = new Singleton(); //x1 (instancié juste une fois) = classe abstract ou conscructeur prv
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.getValue());
		s1.setValue("new value");
		System.out.println(s1.getValue());
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getValue());
	}
	
	void knownUses() {
		Toolkit tk1 = Toolkit.getDefaultToolkit(); 
		Toolkit tk2 = Toolkit.getDefaultToolkit(); 
		
		System.out.println(tk1);
		System.out.println(tk2);
		
	}
	
	public static void main(String[] args) {
		new Client();
	}
}