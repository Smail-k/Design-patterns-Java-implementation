package com.esisa.dp.behavioral.command.sample;

public class DrawingCommand implements Command{

	private PanelReceiver receiver; 
	
	public DrawingCommand() {
		
	}
	
	public DrawingCommand(PanelReceiver receiver) {
		super();
		this.receiver = receiver;
	}

	public void setReceiver(PanelReceiver receiver) {
		this.receiver = receiver;
	}

	public void execute(Event e) {
		/*
		 * adabtation entre la logique de l'invoker et celle du receiver
		 */
		if(e.getData() instanceof Double) {
			int item = (int) ((double) e.getData() * receiver.getPreferredHeight() / 2);
			receiver.action(item);
		}
	}

}
