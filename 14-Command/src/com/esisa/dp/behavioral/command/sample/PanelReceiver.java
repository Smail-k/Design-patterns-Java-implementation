package com.esisa.dp.behavioral.command.sample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;

public class PanelReceiver extends JPanel{

	private static final long serialVersionUID = 1L;
	private List<Integer> data;
	private int width,height,y0;
	
	public PanelReceiver() {
		this(700,300);
	}
	
	public PanelReceiver(int width,int height) {
		this.width=width;
		this.height=height;
		data=new Vector<Integer>();
		y0 = height / 2;
	}
	
	public void action(int item) {
		data.add(item);
		repaint();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		y0 = getHeight() / 2;
		
		g.setColor(Color.red);
		g.drawLine(0, y0, getWidth(), y0);
		
		g.setColor(Color.blue);
		//g.drawLine(width, 0, 0, 0);
		
		for (int x = 1; x < data.size(); x++) {
			g.drawLine(x - 1,y0- data.get(x-1) * getHeight() / height, x,y0 - data.get(x)* getHeight() / height);
		}
	}

	public Dimension getPreferredSize() {
		return new Dimension(width,height);
	}
	
	public int getPreferredHeight() {
		return height;
	}
	
}
