package com.esisa.dp.behavioral.observer;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableObserver extends JScrollPane implements Observer{

	private static final long serialVersionUID = 1L;
	private ConcreteSubject subject;
	private DefaultTableModel model;
	private int maxRows;
	
	public TableObserver(ConcreteSubject subject,int maxRows) {
		this.subject=subject;
		this.maxRows=maxRows;
		subject.attach(this);
		model = new DefaultTableModel(subject.getTitles(),0);
		JTable table = new JTable(model);
		setViewportView(table);
	}

	public void update() {
		model.insertRow(0,subject.getData());
		if(model.getRowCount()>maxRows) {
			model.setRowCount(maxRows);
		}
	}

}
