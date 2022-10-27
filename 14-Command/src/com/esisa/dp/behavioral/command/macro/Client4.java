package com.esisa.dp.behavioral.command.macro;

import com.esisa.dp.behavioral.command.sample.Command;
import com.esisa.dp.behavioral.command.sample.ConsoleLoggingCommand;
import com.esisa.dp.behavioral.command.sample.ConsoleLoggingReceiver;
import com.esisa.dp.behavioral.command.sample.DataInvoker;
import com.esisa.dp.behavioral.command.sample.DrawingCommand;
import com.esisa.dp.behavioral.command.sample.FileCommand;
import com.esisa.dp.behavioral.command.sample.FileReceiver;
import com.esisa.dp.behavioral.command.sample.PanelReceiver;

public class Client4 extends Thread{

	private DataInvoker invoker;
	private PanelReceiver receiver;
	private MacroCommand macroCommand;
	
	public Client4() {	//SOLID
		/*
		 * S : single responsibility principle
		 * O : Open/close principle
		 * L : Liskov principle
		 * I : Interface segregation principle
		 * D : Dependency Inversion principle
		 */
		macroCommand = new MacroCommand();
		
		receiver = new PanelReceiver();
		ConsoleLoggingReceiver receiver2 = new ConsoleLoggingReceiver();
		
		Command command1 = new DrawingCommand(receiver);
		Command command2 = new ConsoleLoggingCommand(receiver2);
		Command command3 = new FileCommand(new FileReceiver("resources/data.txt"));
		
		
		macroCommand.add(command1);
		macroCommand.add(command2);
		macroCommand.add(command3);
		
		invoker=new DataInvoker("Invoker-02");
		invoker.setCommand(macroCommand);
	}

	public PanelReceiver getReceiver() {
		return receiver;
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
