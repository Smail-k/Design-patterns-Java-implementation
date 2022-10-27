package com.esisa.dp.behavioral.chain_of_responsibility;

public class Client {

	private Handler chain;
	
	public Client() {
		exp01();
	}

	void exp01() {
		chain = new ConcreteHandler1();
		chain.add(new ConcreteHandler2());
		chain.add(new ConcreteHandler3());
		
		String result = chain.handleRequest("Chain of Responsibility");
		System.out.println("result : "+ result);
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
