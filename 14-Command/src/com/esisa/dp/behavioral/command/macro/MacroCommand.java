package com.esisa.dp.behavioral.command.macro;

import java.util.List;
import java.util.Vector;

import com.esisa.dp.behavioral.command.sample.Command;
import com.esisa.dp.behavioral.command.sample.Event;

public class MacroCommand implements Command{

	private List<Command> commands;
	
	public MacroCommand() {
		commands= new Vector<Command>();
	}

	public void execute(Event e) {
		for (Command command : commands) {
			command.execute(e);
		}
		
	}

	public void add(Command c) {
		commands.add(c);
	}
	
	
}
