package com.esisa.dp.behavioral.chain_of_responsibility;

public class ConcreteHandler2 extends Handler{

	public ConcreteHandler2() {
		super("bold");
	}

	public String handleRequest(String request) {
		if(successor == null) {
			return "<b>"+ request + "</b>"; 
		}
		return "<b>" + successor.handleRequest(request) + "</b>";
	}

}
