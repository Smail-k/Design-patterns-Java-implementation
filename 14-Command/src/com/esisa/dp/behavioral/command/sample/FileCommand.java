package com.esisa.dp.behavioral.command.sample;

public class FileCommand implements Command{

	private FileReceiver receiver;
	
	public FileCommand(FileReceiver receiver) {
		this.receiver=receiver;
	}

	public void execute(Event e) {
		receiver.action(e.getData());
	}

}
