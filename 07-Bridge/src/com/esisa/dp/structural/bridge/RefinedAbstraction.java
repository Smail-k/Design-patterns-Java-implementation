package com.esisa.dp.structural.bridge;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RefinedAbstraction extends Abstraction{

	private String titles[];
	
	public RefinedAbstraction(Implementor imp,String...titles) {
		super(imp); 
		this.titles=titles;
	}

	
	public void print() {
		List<DesignPattern> list = getAllDesignPatterns();
		DefaultTableModel model = new DefaultTableModel(titles,0);
		for (DesignPattern dp : list) {
			model.addRow(
					new Object[] {
							dp.getId(),
							dp.getName(),
							dp.getCategory(),
							dp.getIntent()
					}
				);
		}
		JTable table = new JTable(model);
		JFrame f = new JFrame();
		JScrollPane s = new JScrollPane(table);
		f.setContentPane(s);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
	
}
