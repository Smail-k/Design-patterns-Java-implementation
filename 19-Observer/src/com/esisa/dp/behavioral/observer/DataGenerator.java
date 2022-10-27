package com.esisa.dp.behavioral.observer;

public class DataGenerator extends Thread{

	private ConcreteSubject subject;
	
	public DataGenerator(ConcreteSubject subject) {
		this.subject=subject;
	}
	
	public void run() {
		int n = subject.size();
		do {
			for (int i = 0; i < n; i++) {
				int data=(int) subject.get(i);
				data += (int) (Math.random() * 7) - 3;
				if(data>100)
					data=100;
				else if(data<0)
					data=0;
				subject.set(i, data);
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
		}while(true);
	}

	
}
