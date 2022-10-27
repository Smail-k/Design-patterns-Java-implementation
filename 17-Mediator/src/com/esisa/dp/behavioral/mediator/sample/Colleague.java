package com.esisa.dp.behavioral.mediator.sample;

import javax.swing.JPanel;

public class Colleague extends JPanel{

	private static final long serialVersionUID = 1L;
	protected Mediator mediator; 
	
	public Colleague() {

	}

	public Mediator getMediator() {
		return mediator;
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
}
