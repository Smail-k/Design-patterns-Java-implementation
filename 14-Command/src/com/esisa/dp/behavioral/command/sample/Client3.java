package com.esisa.dp.behavioral.command.sample;

public class Client3 extends Thread{

	private DataInvoker invoker;
	private FileReceiver receiver;
	private Command command;
	
	public Client3() {
		receiver = new FileReceiver("resources/data.txt");
		command = new FileCommand(receiver); 
		invoker=new DataInvoker("Invoker-03"); 
		invoker.setCommand(command);
	}

	public FileReceiver getReceiver() {
		return receiver;
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
