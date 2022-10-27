package com.esisa.dp.structural.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Vector;

public class ConcreteImplementorA implements Implementor{

	private String source; 
	
	public ConcreteImplementorA(String source) {
		this.source=source;
	}

	public List<DesignPattern> select() {
		List<DesignPattern> list = new Vector<DesignPattern>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(source));
			String row = in.readLine(); 
			while(row != null) {
				String data[] = row.split(";");
				list.add(new DesignPattern(data));
				
				row=in.readLine();
			}
			in.close();
		} catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
		}
		
		return list;
	}

}
