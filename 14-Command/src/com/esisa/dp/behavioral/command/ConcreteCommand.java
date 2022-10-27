package com.esisa.dp.behavioral.command;

public class ConcreteCommand implements Command{

	private Receiver receiver; 
	
	public ConcreteCommand() {
		
	}
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void execute() {
		System.out.println("+ ConcreteCommand.execute()");
		receiver.action();
	}

}
