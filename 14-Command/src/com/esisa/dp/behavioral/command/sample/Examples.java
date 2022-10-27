package com.esisa.dp.behavioral.command.sample;

import javax.swing.JFrame;

public class Examples {

	public Examples() {
		exp02();
	}

	void exp01() {
		Client1 cl1 = new Client1();
		cl1.start();
	}
	
	void exp02() {
		Client2 cl2 = new Client2();
		
		JFrame f = new JFrame("Le Design Pattern Command"); 
		f.setContentPane(cl2.getReceiver());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		cl2.start();
	}
	
	void exp03(){
		Client3 cl3 = new Client3();
		cl3.start();
	}
	
	public static void main(String[] args) {
		new Examples();
	}
	
}
