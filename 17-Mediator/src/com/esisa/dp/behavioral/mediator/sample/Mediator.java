package com.esisa.dp.behavioral.mediator.sample;

public interface Mediator {

	public void enable(int index);
	public void disable(int index);
	public void setValue(String value);
	public String getValue();
	public void addItem(String item);
	public String getItem(int index);
	public int getSelectedIndex();
	public String deleteItem(int index);
	
}