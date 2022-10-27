package com.esisa.dp.behavioral.mediator;

public class C extends Colleague{

	public C() {
		
	}
	public void s6() {
		System.out.println("C.s6()");
		mediator.s3();
	}
	public void s7() {
		System.out.println("C.s7()");
		mediator.s5();
	}
	public void s8() {
		System.out.println("C.s8()");
		mediator.s5();
	}
	public void s9() {
		System.out.println("C.s9()");
	}
	
}
