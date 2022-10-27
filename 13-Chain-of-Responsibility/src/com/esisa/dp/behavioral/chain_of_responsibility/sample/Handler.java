package com.esisa.dp.behavioral.chain_of_responsibility.sample;

abstract public class Handler {

	private String name; 
	protected Handler successor; 
	
	public Handler(String name) {
		this.name=name; 
		successor=null;
	}

	public Handler() {
		this.name=getClass().getSimpleName(); 
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
	
	public Result next(Request request) {
		if(successor == null)
		{
			return new Result();
		}else {
			return successor.handleRequest(request);
		}
	}
	
	abstract public Result handleRequest(Request request);
}
