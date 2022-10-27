package com.esisa.dp.behavioral.chain_of_responsibility.sample;

public class DoubleRangeValidator extends Handler{

	private String parameter; 
	private double min,max;
	
	public DoubleRangeValidator(String parameter, double min, double max) {
		super();
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
		}else {
			
			try {
				double dValue = Double.parseDouble(value);
				if(dValue<min || dValue>max) {
					result.addError(
							new Error(getName(), parameter, "value Not in range : ["+min+" - "+max+"]")
							);
				}else {
					result.setModel(parameter, dValue);
				}
			} catch (Exception e) {
				result.addError(
						new Error(getName(), parameter, "value is not double")
						);
			}
		}
		
		return result;
	} 
	
	
	

}
