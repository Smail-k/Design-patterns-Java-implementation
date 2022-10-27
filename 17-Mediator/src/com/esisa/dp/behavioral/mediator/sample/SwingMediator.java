package com.esisa.dp.behavioral.mediator.sample;

public class SwingMediator implements Mediator{

	private LabeledTextField field;
	private DataList list; 
	private ButtonPanel buttons;
	
	
	public SwingMediator() {
		
	}

	public void setColleague(LabeledTextField c1) {
		field = c1;
		field.setMediator(this);
	}
	public void setColleague(ButtonPanel c2) {
		buttons = c2;
		buttons.setMediator(this);
	}
	public void setColleague(DataList c3) {
		list = c3;
		list.setMediator(this);
	}
	
	public void enable(int index) {
		buttons.enable(index);
	}

	public void disable(int index) {
		buttons.disable(index);
	}


	public void setValue(String value) {
		field.setValue(value);
	}

	public String getValue() {
		return field.getValue();
	}

	public void addItem(String item) {
		list.addItem(item);
	}

	public String getItem(int index) {
		return list.getItem(index);
	}


	public int getSelectedIndex() {
		return list.getSelectedIndex();
	}

	public String deleteItem(int index) {
		return list.deleteItem(index);
	}

}
