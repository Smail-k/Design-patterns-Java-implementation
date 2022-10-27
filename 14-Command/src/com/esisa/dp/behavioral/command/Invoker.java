package com.esisa.dp.behavioral.command;

public class Invoker {

	private Command command; 
	
	public Invoker() {
		
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void service() {
		System.out.println("+ Invoker.service()");
		command.execute();
	}
	
}
