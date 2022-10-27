package com.esisa.dp.behavioral.mediator.sample;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class DataList extends Colleague implements MouseListener{
	private static final long serialVersionUID = 1L;

	private JList<String> list;
	private DefaultListModel<String> model;
	
	public DataList() {
		setLayout(new BorderLayout());
		add("North",new JLabel("Liste des design Patterns : "));
		model = new DefaultListModel<String>();
		list = new JList<String>(model);
		add("Center",new JScrollPane(list));
		list.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		String item =list.getSelectedValue();
		mediator.setValue(item);
		mediator.enable(0);
		mediator.enable(1);
	}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void addItem(String item) {
		model.addElement(item);
	}
	public String deleteItem(int index) {
		return model.remove(index);
	}
	public String getItem(int index) {
		return model.get(index);
	}
	public int getSelectedIndex() {
		return list.getSelectedIndex();
	}
}
