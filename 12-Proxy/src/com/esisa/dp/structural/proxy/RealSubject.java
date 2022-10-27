package com.esisa.dp.structural.proxy;

import java.util.List;
import java.util.Vector;

public class RealSubject implements Subject{

	private List<Object> data;
	
	public RealSubject() {
		data=new Vector<Object>();
	}

	public void insert(Object item) {
		data.add(item);
	}

	public void update(int index, Object item) {
		if(index>= data.size()) 
			return;
		data.set(index, item);
		pause();
	}

	public Object delete(int index) {
		if(index>= data.size())
			return null;
		pause();
		return data.remove(index);
		
	}

	public Object select(int index) {
		if(index>= data.size())
			return null;
		pause();
		return data.get(index);
	}

	public List<Object> selectAll() {
		pause();
		return data;
	}

	
	public int size() {
		pause();
		return data.size();
	}
	
	private void pause() {
		try {
			Thread.sleep((int) (Math.random() * 2000 + 100));
		} catch (Exception e) {
			
		}
	}
}
