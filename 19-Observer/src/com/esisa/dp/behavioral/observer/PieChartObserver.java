package com.esisa.dp.behavioral.observer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PieChartObserver extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	private ConcreteSubject subject;
	private int margin = 30;
	
	public PieChartObserver(ConcreteSubject subject) {
		this.subject = subject;
		subject.attach(this);
		setBackground(Color.white);
	}

	public void update() {
		repaint();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Integer data[] = subject.getData();
		Color colors[] = subject.getColors();
		String titles[] = subject.getTitles();
		int width = Math.min(getWidth(),getHeight()) - 2* margin;
		
		int sum = 0;
		for (int value : data) {
			sum += value;
		}
		int sa=0,a;
		for (int i = 0; i < data.length; i++) {
			if(i<data.length -1)
			a = 360 * data[i] / sum;
			else 
				a = 360-sa;
			g.setColor(colors[i % colors.length]);
			g.fillArc(margin, margin, width, width, sa, a);
			sa +=a;
			int x = margin +i * 30; 
			int y= getHeight()-margin + 5;
			g.fillRect(x, y, 20, 5);
			g.drawString(titles[i],x+5 , y + 20);
		}
		g.drawOval(margin, margin, width , width );
		
	}
	
}
