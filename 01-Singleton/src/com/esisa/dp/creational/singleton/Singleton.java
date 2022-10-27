package com.esisa.dp.creational.singleton;

public class Singleton {
	private String value="Singleton"; 
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}