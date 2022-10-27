package com.esisa.dp.structural.flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Info extends JPanel{

	private static final long serialVersionUID = 1L;

	public Info(String label,Object info, Color color) {
		setLayout(new GridLayout(1,2));
		setBorder(new EmptyBorder(5,5,5,5));
		
		JLabel l1 = new JLabel(label +" : ");
		l1.setFont(new Font("Verdana",Font.PLAIN,20));
		
		JLabel l2 = new JLabel(""+info);
		l2.setForeground(color);
		l2.setFont(new Font("Verdana",Font.BOLD,20));
		
		add(l1);
		add(l2);
	}

	public void setInfo(Object info) {
		((JLabel) getComponent(1)).setText(""+info);
	}
}
