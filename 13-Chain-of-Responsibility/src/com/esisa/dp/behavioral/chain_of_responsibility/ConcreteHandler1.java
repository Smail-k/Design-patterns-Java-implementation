package com.esisa.dp.behavioral.chain_of_responsibility;

public class ConcreteHandler1 extends Handler{

	public ConcreteHandler1() {
		super("italic");
	}

	public String handleRequest(String request) {
		if(successor == null) {
			return "<i>"+ request + "</i>"; 
		}
		return "<i>" + successor.handleRequest(request) + "</i>";
	}

}
