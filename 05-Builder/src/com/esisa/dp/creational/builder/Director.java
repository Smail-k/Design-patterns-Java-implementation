package com.esisa.dp.creational.builder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder=builder;
	}

	public Object construct(String source,String filter) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(source));
			String row = in.readLine(); 
			while(row != null) {
				String data[] = row.split(";");
				builder.buildPart1(data);
				builder.buildPart2(filter);
				
				row=in.readLine();
			}
			in.close();
			builder.buildPart3();
			return builder.getResult(); 
		} catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
			return null; 
		}
	}
}
