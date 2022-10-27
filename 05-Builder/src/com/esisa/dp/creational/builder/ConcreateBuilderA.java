package com.esisa.dp.creational.builder;

import java.util.Vector;

public class ConcreateBuilderA implements Builder{

	private Vector<DesignPattern> product; 
	private DesignPattern pattern; 
	
	public ConcreateBuilderA() {
		product = new Vector<DesignPattern>();
	}

	public void buildPart1(String... data) {
		pattern = new DesignPattern(); 
		pattern.setId(Integer.parseInt(data[0].trim()));
		pattern.setName(data[1].trim());
		pattern.setCategory(data[2].trim());
		pattern.setIntent(data[3].trim());
	}

	public void buildPart2(String filter) {
		if(pattern.getCategory().toLowerCase().contains(filter.toLowerCase())) {
			product.add(pattern);
		}
	}

	public void buildPart3() {
		for (int i = 0; i < product.size(); i++) {
			int m=i; 
			for (int j = i+1; j < product.size(); j++) {
				if(product.get(j).getName().compareTo(product.get(m).getName())<0) {
					m=j;
				}
			}
			DesignPattern tmp = product.get(i);
			product.set(i, product.get(m));
			product.set(m, tmp);
		}
	}

	public Object getResult() {
		return product;
	}

}
