package com.esisa.dp.behavioral.chain_of_responsibility;

public class ConcreteHandler3 extends Handler{

	public ConcreteHandler3() {
		super("underline");
	}

	public String handleRequest(String request) {
		if(successor == null) {
			return "<u>"+ request + "</u>"; 
		}
		return "<u>" + successor.handleRequest(request) + "</u>";
	}

}
