package com.esisa.dp.structural.bridge;

import java.util.List;

public class Abstraction {

	private Implementor imp; 
	
	public Abstraction(Implementor imp) {
		this.imp=imp;
	}

	public void setImplementor(Implementor imp) {
		this.imp = imp;
	}
	
	public Implementor getImplementor() {
		return imp;
	}
	
	//operation : 
	public List<DesignPattern> getAllDesignPatterns(){
		return imp.select();
	}
	
	public void print() {
		List<DesignPattern> list = imp.select();
		for (DesignPattern dp : list) {
			System.out.println(" - "  + dp);
		}
	}
}
