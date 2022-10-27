package com.esisa.dp.behavioral.command.sample;

public class Client2 extends Thread{

	private DataInvoker invoker;
	private PanelReceiver receiver;
	private Command command;
	
	public Client2() {	
		receiver = new PanelReceiver();
		command = new DrawingCommand(receiver); 
		invoker=new DataInvoker("Invoker-02"); 
		invoker.setCommand(command);
	}

	public PanelReceiver getReceiver() {
		return receiver;
	}
	
	public Command getCommand() {
		return command;
	}
	
	public void run() {
		double a = 0;
		do {
			double data = Math.cos(a);
			invoker.add(data);
			a = a + 0.1;
			pause(100);
		}while(true);
	}
	
	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}

}
