package com.esisa.dp.structural.bridge;

public class DesignPattern {

	private int id; 
	private String name; 
	private String category; 
	private String intent;
	
	public DesignPattern() {
		
	}

	public DesignPattern(int id, String name, String category, String intent) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.intent = intent;
	}
	
	public DesignPattern(String...row) {
		super();
		this.id = Integer.parseInt(row[0]);
		this.name = row[1];
		this.category = row[2];
		this.intent = row[3];
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public String toString() {
		return "DesignPattern [id=" + id + ", name=" + name + ", category=" + category + ", intent=" + intent + "]";
	}
	
}
