package com.esisa.dp.creational.prototype;

public class Client {

	public Client() {
		exp01(); 
	}
	
	void exp01() {
		Prototype prototype = new Prototype(100,"Prototype"); 
		Prototype p1 = prototype.clone(); 
		
		System.out.println("prototype = "+prototype);
		System.out.println("p1 = "+p1);
		
		System.out.println("p1 == prototype : "+(p1 == prototype));
		p1.setValue("new");
		
		System.out.println("prototype = "+prototype);
		System.out.println("p1 = "+p1);
		
	}
	void exp02() {
		Prototype prototype = new Prototype(100,"Prototype",new Date(5, 8, 2000)); 
		Prototype p1 = prototype.clone(); 
		
		System.out.println("prototype = "+prototype);
		System.out.println("p1 = "+p1);
		
		System.out.println("p1 == prototype : "+(p1 == prototype));
		p1.getDate().setYear(2020);
		
		System.out.println("prototype = "+prototype);
		System.out.println("p1 = "+p1);
	
	}
	
	public static void main(String[] args) {
		new Client();
	}
}