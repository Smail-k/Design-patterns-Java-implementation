package com.esisa.dp.behavioral.mediator;

public class A extends Colleague{

	public A() {
		
	}

	public void s1() {
		System.out.println("A.s1()");
		mediator.s4();
	}
	
	public void s2() {
		System.out.println("A.s2()");
		mediator.s4();
	}
	
	public void s3() {
		System.out.println("A.s3()");
		mediator.s8();
		mediator.s5();
	}
	
}
