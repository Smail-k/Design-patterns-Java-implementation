package com.esisa.dp.behavioral.mediator;

public class ConcreteMediator implements Mediator{

	private A a; 
	private B b; 
	private C c;
	private D d;
	
	public ConcreteMediator() {
		
	}

	public void setColleague(A a) {
		this.a =a;
		a.setMediator(this);
	}
	public void setColleague(B b) {
		this.b =b;
		b.setMediator(this);
	}
	public void setColleague(C c) {
		this.c =c;
		c.setMediator(this);
	}
	public void setColleague(D d) {
		this.d =d;
		d.setMediator(this);
	}
	public void s1() {
		a.s1();
	}

	public void s2() {
		a.s2();
	}

	public void s3() {
		a.s3();
	}

	public void s4() {
		b.s4();
	}

	public void s5() {
		b.s5();
	}

	public void s6() {
		c.s6();
	}

	public void s7() {
		c.s7();
	}

	public void s8() {
		d.s8New();
	}

	public void s9() {
		d.s9New();
	}

}
