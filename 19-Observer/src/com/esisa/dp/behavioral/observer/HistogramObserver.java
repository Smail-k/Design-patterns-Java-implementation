package com.esisa.dp.behavioral.observer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HistogramObserver extends JPanel implements Observer{
	private static final long serialVersionUID = 1L;

	private ConcreteSubject subject;
	private int margin = 30;
	private int size = 20;
	
	public HistogramObserver(ConcreteSubject subject) {
		this.subject=subject;
		subject.attach(this);
		setBackground(Color.white);
	}

	public void update() {
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(margin, 10,margin, getHeight()-10);
		g.drawLine(10, getHeight()- margin,getWidth() -10, getHeight()- margin);
		Integer data[] = subject.getData();
		Color colors[] = subject.getColors();
		String titles[] = subject.getTitles();
		for (int i = 0; i < data.length; i++) {
			int x= margin + i*(size +5) +10;
			int y= getHeight()- margin - data[i];
			g.setColor(colors[i % colors.length]);
			g.fillRect(x, y, size, data[i]);
			//g.setColor(Color.black);
			g.drawString(titles[i], x+5, getHeight()-margin + 15);
		}
		
	}
}
