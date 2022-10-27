package com.esisa.dp.behavioral.observer;

import java.awt.Color;

public class ConcreteSubject extends Subject{
	private Integer data[];
	private String titles[];
	private Color colors[]= {Color.blue,Color.green,Color.magenta,Color.orange,Color.gray};
	
	
	public ConcreteSubject(Integer...data) {
		setData(data);
		titles = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			titles[i] = "" + (char) ('A'+i);
		}
	}

	
	public int size() {
		return data.length;
	}

	public Object get(int index) {
		return data[index];
	}

	public void setData(Integer ...data) {
		this.data=data;
		notifyObservers();
	}
	public void set(int index,Integer item) {
		data[index] = item;
		notifyObservers();
	}
	
	public Integer[] getData() {
		return data;
	}
	public void setTitles(String...titles) {
		this.titles = titles;
	}
	public String[] getTitles() {
		return titles;
	}
	public Color[] getColors() {
		return colors;
	}
	public void setColors(Color[] colors) {
		this.colors = colors;
	}
}
