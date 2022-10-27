package com.esisa.dp.structural.proxy.decorator;

import com.esisa.dp.structural.proxy.Client;
import com.esisa.dp.structural.proxy.RealSubject;
import com.esisa.dp.structural.proxy.Subject;

public class Test {

	private Subject subject; 
	
	public Test() {
		config04();
		exp06();
	}

	void config01() {
		subject = new RealSubject();
	}
	void config02() {
		subject = new LogProxy(new RealSubject());
	}
	void config03() {
		subject = new AuthenticationProxy(new LogProxy(new RealSubject()));
		
	}
	void config04() {
		subject = new AuthenticationProxy(new LogProxy(new RealSubject()));
		
	}
	void exp01() {
		Client client = new Client("Cl01", "admin", subject);
		client.start();
	}
	
	void exp02() {
		Client client = new Client("Cl01", "user", subject);
		client.start();
	}
	void exp03() {
		Client client = new Client("Cl01", "manager", subject);
		((AuthenticationProxy)subject).login(client);
		client.start();
	}
	void exp04() {
		Client client = new Client("Cl01", "admin", subject);
		((AuthenticationProxy)subject).login(client);
		client.start();
	}
	void exp05() {
		Client client = new Client("Cl01", "manager", subject);
		((AuthenticationProxy)subject).login(client);
		client.start();
	}
	void exp06() {
		Client c1 = new Client("Cl01", "admin", subject);
		Client c2 = new Client("Cl02", "manager", subject);
		Client c3 = new Client("Cl03", "user", subject);
		
		((AuthenticationProxy)subject).login(c1);
		c1.start();
		try {
			c1.join();
			((AuthenticationProxy)subject).login(c2);
			c2.start();
			c2.join();
			((AuthenticationProxy)subject).login(c3);
			c3.start();
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
