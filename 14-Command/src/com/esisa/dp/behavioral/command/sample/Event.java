package com.esisa.dp.behavioral.command.sample;

public class Event {

	private DataInvoker source;
	private String action; 
	private Object data;
	
	public Event() {
		
	}

	public Event(DataInvoker source, String action, Object data) {
		super();
		this.source = source;
		this.action = action;
		this.data = data;
	}

	public DataInvoker getSource() {
		return source;
	}

	public void setSource(DataInvoker source) {
		this.source = source;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String toString() {
		return "Action <" + action + "> "
				+ " by <"+source.getName() +">" 
				+ " on data <" + data +">";
	}
	
}
