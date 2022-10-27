package com.esisa.dp.structural.flyweight;

import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class FlyweightFactory {
	
	private Hashtable<String, Flyweight> flyweights; 
	private List<Observer> observers;
	
	public FlyweightFactory() {
		flyweights = new Hashtable<String, Flyweight>();
		observers=new Vector<Observer>();
	}
	
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight =  flyweights.get(key);
		if(flyweight == null) {
			flyweight = new Flyweight(key);
			flyweights.put(key, flyweight);
		}
		update();
		return flyweight;
	}

	public int size() {
		return flyweights.size();
	}
	
	private void update() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
}