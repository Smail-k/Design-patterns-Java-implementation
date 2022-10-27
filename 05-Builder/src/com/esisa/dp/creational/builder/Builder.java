package com.esisa.dp.creational.builder;

public interface Builder {

	public void buildPart1(String...data);
	public void buildPart2(String filter); 
	public void buildPart3();
	
	public Object getResult(); 
	
}