package com.esisa.dp.behavioral.command.sample;

import java.util.List;
import java.util.Vector;

public class DataInvoker {

	private String name;
	private List<Object> data;
	private Command command;
	
	public DataInvoker() {
		this("DataInvoker");
	}

	public DataInvoker(String name) {
		data=new Vector<Object>();
		this.name=name;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void add(Object item) {
		data.add(item);
		command.execute(new Event(this,"add",item));
	}
	
	public String getName() {
		return name;
	}
	
	public List<Object> getData() {
		return data;
	}
	
}
