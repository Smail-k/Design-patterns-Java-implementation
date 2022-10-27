package com.esisa.dp.structural.proxy;

import java.util.List;

public interface Subject {

	public void insert(Object item);
	public void update(int index,Object item);
	public Object delete(int index);
	public Object select(int index);
	public List<Object> selectAll();
	public int size();
	
}
