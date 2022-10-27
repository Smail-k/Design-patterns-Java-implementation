package com.esisa.dp.creational.prototype;

public class Prototype implements Cloneable{

	private int id; 
	private String value; 
	private Date date; 
	
	public Prototype() {
		
	}
	
	public Prototype(int id, String value) {
		this.id = id;
		this.value = value;
	}

	public Prototype(int id, String value,Date date) {
		this.id = id;
		this.value = value;
		this.date=date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Prototype [id=" + id + ", value=" + value + ", date="+ date +"]";
	}
	
	@Override
	public Prototype clone(){
		try {
			Prototype p=(Prototype) super.clone();
			if(this.date!=null)
				p.date = this.date.clone(); 
			return p; 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null; 
		}
		
	}
}
