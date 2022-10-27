package com.esisa.dp.behavioral.observer;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Client {

	private ConcreteSubject subject;
	private ConcreteObserver observer1;
	private TableObserver observer2;
	private HistogramObserver observer3;
	private PieChartObserver observer4;
	
	
	public Client() {
		init();
		show(observer1,0,350,800,200);
		show(observer2,0,100,250,250);
		show(observer3,300,100,250,250);
		show(observer4,540,100,250,250);
		
		start();
	}

	private void init() {
		subject  = new ConcreteSubject(50,50,50,50,50);
		observer1 = new ConcreteObserver(subject);
		observer2 = new TableObserver(subject,8);
		observer3 = new HistogramObserver(subject);
		observer4 = new PieChartObserver(subject);
	}
	private void show(JComponent cmp,int x,int y,int width,int height) {
		JFrame f = new JFrame(cmp.getClass().getSimpleName());
		f.setContentPane(cmp);
		f.setBounds(x,y,width,height);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		//f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	private void start() {
		DataGenerator gen = new DataGenerator(subject);
		gen.start();
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
