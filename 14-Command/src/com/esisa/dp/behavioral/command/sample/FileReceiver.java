package com.esisa.dp.behavioral.command.sample;


import java.io.PrintWriter;
import java.util.List;
import java.util.Vector;

public class FileReceiver {

	private String source; 
	private List<Object> data; 
	
	public FileReceiver(String source) {
		this.source=source;
		data=new Vector<Object>();
	}

	public void action(Object item) {
		data.add(item);
		try {
			PrintWriter out = new PrintWriter(source);
			for (Object element : data) {
				out.println(element);
			}
			out.close();
		} catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
		}
	}
	
	
}