package com.esisa.dp.structural.proxy.decorator;

import java.util.Arrays;
import java.util.List;

import com.esisa.dp.structural.proxy.RealSubject;
import com.esisa.dp.structural.proxy.Subject;

public class LogProxy implements Subject{

	private Subject subject; 
	
	public LogProxy(Subject subject) {
		super();
		this.subject = subject;
	}

	private void log(String action,Object...data) {
		System.out.println("## "
				+ action + " : " 
				+Arrays.toString(data)
				+ ", by : "+Thread.currentThread().getName()
		);
	}
	
	public void insert(Object item) {
		subject.insert(item);
		log("INSERT",item);
	}

	public void update(int index, Object item) {
		subject.update(index, item);
		log("UPDATE",index,item);
	}

	public Object delete(int index) {
		Object item= subject.delete(index);
		log("DELETE", index,item);
		return item;
	}

	public Object select(int index) {
		Object item= subject.select(index);
		log("SELECT",index,item);
		return item;
	}

	public List<Object> selectAll() {
		List<Object> data= subject.selectAll();
		log("SELECT ALL",data);
		return data;
	}

	public int size() {
		return subject.size();
	}
	
}