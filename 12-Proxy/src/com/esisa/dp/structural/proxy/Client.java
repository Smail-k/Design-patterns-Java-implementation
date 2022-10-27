package com.esisa.dp.structural.proxy;

import java.util.List;

public class Client extends Thread{

	private String role; 
	private Subject subject; 
	 
	public Client(String name, String role, Subject subject) {
		super(name);
		this.role = role;
		this.subject = subject;
	}
	
	public String getRole() {
		return role;
	}
	
	public void run() {
		subject.insert(item());
		subject.insert(item());
		subject.insert(item());
		subject.update(index(), item());
		subject.insert(item());
		subject.delete(index());
		Object obj = subject.select(index());
		subject.update(index(), obj);
		List<Object> data = subject.selectAll();
		
		System.out.println("data : "+data);
		
	}
	
	private String item() {
		return ""+(char) (Math.random() * 26 + 'A');
	}
	private int index() {
		return (int) (Math.random()*subject.size());
	}
}
