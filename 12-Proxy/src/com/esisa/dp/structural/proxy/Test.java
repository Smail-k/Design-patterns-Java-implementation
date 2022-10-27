package com.esisa.dp.structural.proxy;

public class Test {

	private Subject subject; 
	
	public Test() {
		config03();
		exp02();
	}

	void config01() {
		subject = new RealSubject();
	}
	void config02() {
		subject = new LogProxy(new RealSubject());
	}
	void config03() {
		subject = new AuthenticationProxy(new RealSubject());
		
	}
	void exp01() {
		Client client = new Client("Cl01", "admin", subject);
		client.start();
	}
	
	void exp02() {
		Client client = new Client("Cl01", "user", subject);
		((AuthenticationProxy)subject).login(client);
		client.start();
	}
	void exp03() {
		Client client = new Client("Cl01", "manager", subject);
		((AuthenticationProxy)subject).login(client);
		client.start();
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
