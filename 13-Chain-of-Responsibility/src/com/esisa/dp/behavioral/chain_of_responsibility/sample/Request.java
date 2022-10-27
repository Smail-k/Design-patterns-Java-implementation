package com.esisa.dp.behavioral.chain_of_responsibility.sample;

import java.util.Hashtable;

public class Request {

	private Hashtable<String, String> httpParameters; 
	
	public Request() {
		httpParameters = new Hashtable<String, String>();
	}

	public Request(String params) { //f1=v1&f2=v2&...
		httpParameters = new Hashtable<String, String>();
		setParameters(params);
	}
	
	public void setParameter(String name,String value) {
		httpParameters.put(name, value);
	}
	
	public String getParameter(String name) {
		return httpParameters.get(name);
	}
	
	public void setParameters(String params) { //f1=v1&f2=v2&...
		String[] f = params.split("&");
		for (String field : f) {
			String t[] = field.split("=");
			setParameter(t[0], t[1]);
		}
	}
	
	public Hashtable<String, String> getParameters() {
		return httpParameters;
	}
	
}
