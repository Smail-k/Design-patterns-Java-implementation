package com.esisa.dp.behavioral.command.sample;

public class ConsoleLoggingCommand implements Command{

	private ConsoleLoggingReceiver receiver; 
	
	public ConsoleLoggingCommand() {
		// TODO Auto-generated constructor stub
	}

	public ConsoleLoggingCommand(ConsoleLoggingReceiver receiver) {
		super();
		this.receiver = receiver;
	}

	public void setReceiver(ConsoleLoggingReceiver receiver) {
		this.receiver = receiver;
	}
	
	public void execute(Event e) {
		receiver.log(e.toString());	
	}

}
