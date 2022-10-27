package com.esisa.dp.structural.flyweight;

import java.util.List;
import java.util.Vector;

public class Client extends Thread{

	private FlyweightFactory factory;
	private List<Flyweight> usedFlyweight; 
	
	public Client(FlyweightFactory factory) {
		super();
		this.factory = factory;
		usedFlyweight = new Vector<Flyweight>();
	}

	public void run() {
		do {
			String name = (char)(Math.random() * 26 + 'A')+""; 
			System.out.println(name);
			Flyweight flyweight = factory.getFlyweight(name);
			usedFlyweight.add(flyweight);
			try {
				sleep(20);
			} catch (Exception e) {}
			
		}while(true);
	}
	
	public int flyweightCount() {
		return usedFlyweight.size();
	}
}
