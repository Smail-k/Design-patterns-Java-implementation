package com.esisa.dp.creational.prototype;

public class Date implements Cloneable{

	private int day,month,year; 
	
	public Date() {
		
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year ;
	}
	
	@Override
	public Date clone() {
		try {
			Date d = (Date) super.clone();
			return d; 
		} catch (Exception e) {
			return null; 
		}
	}
}
