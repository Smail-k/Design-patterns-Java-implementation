package com.esisa.dp.behavioral.command.sample;

public class ConsoleLoggingReceiver {

	public ConsoleLoggingReceiver() {
		
	}

	//action
	public void log(String message) {
		System.out.println("# "+message);
	}
	
}
