package com.esisa.dp.behavioral.chain_of_responsibility.sample;

public class Error {
	
	private String source; 
	private String parameter; 
	private String message;
	
	public Error(String source, String parameter, String message) {
		super();
		this.source = source;
		this.parameter = parameter;
		this.message = message;
	}

	public String toString() {
		return "Error Handling Request by " + source + "on '"
				+ parameter + "' : " + message;
	} 
	
	public String getSource() {
		return source;
	}
	
	public String getParameter() {
		return parameter;
	}
	
	public String getMessage() {
		return message;
	}
	
}
