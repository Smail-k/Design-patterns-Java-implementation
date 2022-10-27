package com.esisa.dp.creational.builder;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConcreateBuilderB implements Builder{

	private JTable product;
	private DefaultTableModel model; 
	private String row[];
	
	public ConcreateBuilderB(String...titles) {
		model = new DefaultTableModel(titles,0); 
	}
	
	public void buildPart1(String... data) {
		row = data;
	}

	public void buildPart2(String filter) {
		if(row[3].toLowerCase().contains(filter.toLowerCase())) {
			model.addRow(row);
		}
	}

	public void buildPart3() {
		product = new JTable(model);
	}

	public Object getResult() {
		return product;
	}

}