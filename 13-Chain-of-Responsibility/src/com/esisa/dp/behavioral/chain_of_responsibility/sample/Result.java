package com.esisa.dp.behavioral.chain_of_responsibility.sample;

import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class Result {

	public static final String ERROR="error";
	public static final String SUCCESS="success";
	
	private String status; 
	private List<Error> errors;
	private Hashtable<String, Object> models;
	
	public Result() {
		status = SUCCESS;
		errors=new Vector<Error>();
		models = new Hashtable<String, Object>();
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setError() {
		status = ERROR;
	}
	
	public boolean isError() {
		return (status == ERROR);
	}
	
	public boolean isSuccess() {
		return (status == SUCCESS);
	}
	
	public void addError(Error error) {
		errors.add(error);
		setError();
	}
	public List<Error> getErrors() {
		return errors;
	}
	public void setModel(String name,Object value) {
		models.put(name, value);
	}
	public Hashtable<String, Object> getModels() {
		return models;
	}
}