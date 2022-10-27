package com.esisa.dp.behavioral.command;

public class Client {

	public Client() {
		Receiver receiver = new Receiver(); 
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.service();
	}

	public static void main(String[] args) {
		new Client();
	}
	
}
