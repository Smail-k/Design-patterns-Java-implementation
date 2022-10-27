package com.esisa.dp.behavioral.mediator;

public class D extends Colleague{

	public D() {
		
	}

	public void s8New() {
		System.out.println("D.s8New()");
		mediator.s9();
	}
	public void s9New() {
		System.out.println("D.s9New()");
	}
}