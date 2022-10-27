package com.esisa.dp.structural.proxy.decorator;

import java.util.LinkedList;
import java.util.List;

import com.esisa.dp.structural.proxy.Client;
import com.esisa.dp.structural.proxy.RealSubject;
import com.esisa.dp.structural.proxy.Subject;

public class AuthenticationProxy implements Subject{

	private Subject subject; 
	private Client client = null; 

	public AuthenticationProxy(Subject subject) {
		super();
		this.subject = subject;
	}

	public void login(Client client) {
		this.client=client;
	}
	
	public void insert(Object item) {
		if(check("insert")) {
			subject.insert(item);
		}
	}

	public void update(int index, Object item) {
		if(check("update")) {
			subject.update(index, item);
		}
		
	}

	public Object delete(int index) {
		if(check("delete")) {
			return subject.delete(index);
		}
		return null; 
	}

	public Object select(int index) {
		if(check("select")) {
			return subject.select(index);
		}
		return null;
	}

	public List<Object> selectAll() {
		if(check("select")) {
			return subject.selectAll();
		}
		return new LinkedList<Object>();
	}

	public int size() {
		if(check("size")) {
			return subject.size();
		}
		return 0;
	}
	
	private boolean check(String action) {
		if(client == null) {
			error("User is not connected");
			return false; 
		}
		if(client.getRole().equals("admin")) {
			return true;
		}
		if(client.getRole().equals("manager")) {
			if(action.equals("update") || action.equals("delete")) {
				error("Operation "+ action 
						+ " not allowed for user : " 
						+ client.getName());
				return false;
			}
			return true;
		}if(action.contains("select") || action.equals("size")) {
			return true; 
		}
		error("Operation "+ action 
				+ " not allowed for user : " 
				+ client.getName() 
				+ " with " + client.getRole()+ " role");
		return false;
	}
	
	private void error(String msg) {
		System.out.println(">>" + msg + "!!!!");
	}
}
