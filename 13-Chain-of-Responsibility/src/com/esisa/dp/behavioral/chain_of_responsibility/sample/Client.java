package com.esisa.dp.behavioral.chain_of_responsibility.sample;

import java.util.List;

public class Client {

	private Request request; 
	private Handler handler; 
	
	public Client() {
		config();
		test02();
	}
	
	void config() {
		request = new Request(
				"id=DOC-1002&title=Design Patterns in Java&price=876&date=23/12/2021"
				);
		handler = new StringLengthValidator("id", 8, 8);
		handler.add(new StringLengthValidator("title",10,30));
		handler.add(new DoubleRangeValidator("price",0,1000));
	}

	void test01() {
		System.out.println("id : " + request.getParameter("id"));
		System.out.println("title : " + request.getParameter("title"));
		System.out.println("price : " + request.getParameter("price"));
		System.out.println("date : " + request.getParameter("date"));
	}
	
	void test02() {
		Result result = handler.handleRequest(request);
		System.out.println("Status : "+ result.getStatus());
		List<Error> errors = result.getErrors();
		for (Error error : errors) {
			System.out.println(" - " + error);
		}
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
