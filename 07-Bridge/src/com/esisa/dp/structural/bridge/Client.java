package com.esisa.dp.structural.bridge;

public class Client {

	public Client() {
		exp03();
	}
	
	void exp01() {
		Implementor imp = new ConcreteImplementorA("resources/design-patterns.txt");
		Abstraction abs = new Abstraction(imp);
		abs.print();
	}

	void exp02() {
		Implementor imp = new ConcreteImplementorB("resources/design-patterns.xml");
		Abstraction abs = new Abstraction(imp);
		abs.print();
	}
	void exp03() {
		Implementor imp = new ConcreteImplementorB("resources/design-patterns.xml");
		Abstraction abs = new RefinedAbstraction(imp,"id","name","category","intent");
		abs.print();
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}
