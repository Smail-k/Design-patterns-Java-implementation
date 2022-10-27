package com.esisa.dp.behavioral.chain_of_responsibility;

abstract public class Handler {

	private String name; 
	protected Handler successor; 
	
	public Handler(String name) {
		this.name=name; 
		successor=null;
	}

	public void add(Handler handler) {
		if(successor == null )
			successor = handler;
		else 
			successor.add(handler);
	}
	
	public String getName() {
		return name;
	}
	
	abstract public String handleRequest(String request);
}
