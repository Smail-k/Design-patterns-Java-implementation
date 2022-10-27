package com.esisa.dp.behavioral.mediator;

public class Client {

	private A a; 
	private B b; 
	private C c;
	private D d;
	private ConcreteMediator mediator;
	
	public Client() {
		init();
		exp01();
	}

	public void init() {
		a=new A();
		b=new B();
		c=new C();
		d=new D();
		mediator = new ConcreteMediator();
		mediator.setColleague(a);
		mediator.setColleague(b);
		mediator.setColleague(c);
		mediator.setColleague(d);
		
	}
	
	void exp01() {
		mediator.s1();
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}
