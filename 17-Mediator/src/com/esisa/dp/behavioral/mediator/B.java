package com.esisa.dp.behavioral.mediator;

public class B extends Colleague{

	public B() {
		// TODO Auto-generated constructor stub
	}

	public void s4() {
		System.out.println("B.s4()");
		mediator.s3();
		mediator.s7();		
	}
	public void s5() {
		System.out.println("B.s5()");
		mediator.s9();
	}
}
