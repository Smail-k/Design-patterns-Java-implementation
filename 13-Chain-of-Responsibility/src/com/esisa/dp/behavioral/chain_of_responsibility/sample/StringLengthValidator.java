package com.esisa.dp.behavioral.chain_of_responsibility.sample;

public class StringLengthValidator extends Handler{

	private String parameter;
	private int min,max; 
	
	public StringLengthValidator(String parameter, int min, int max) {
		this.parameter = parameter;
		this.min = min;
		this.max = max;
	}



	public Result handleRequest(Request request) {
		Result result = next(request);
		String value = request.getParameter(parameter);
		
		if(value == null) {
			result.addError(
					new Error(getName(), parameter, "No such Parameter")
					);
		}
		else if(value.length()>max || value.length()<min)
		{ 
			result.addError(
					new Error(getName(), parameter, "String length Not in range : ["+min+" - "+max+"]")
					);
		}else {
			result.setModel(parameter, value);
		}
		return result;
	}

}
