package com.esisa.dp.behavioral.mediator;

public class Colleague {
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
