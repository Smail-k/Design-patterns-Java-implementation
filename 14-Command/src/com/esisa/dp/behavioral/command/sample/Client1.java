package com.esisa.dp.behavioral.command.sample;

public class Client1 extends Thread{

	private DataInvoker invoker;
	
	public Client1() {
		ConsoleLoggingReceiver receiver = new ConsoleLoggingReceiver();
		Command command = new ConsoleLoggingCommand(receiver);
		invoker=new DataInvoker("Invoker-01"); 
		invoker.setCommand(command);
	}
	
	public void run() {
		do {
			int data = (int) (Math.random() * 9000) + 1000;
			invoker.add(data);
			pause(1000);			
		}while(true);
	}

	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}
	
}
