package com.esisa.dp.behavioral.observer;

import java.util.List;
import java.util.Vector;

abstract public class Subject {

	private List<Observer> observers;
	
	public Subject() {
		observers = new Vector<Observer>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void dettach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public abstract int size();
	public abstract Object get(int index);
}
