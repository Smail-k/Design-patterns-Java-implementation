package com.esisa.dp.structural.composite.app.file_system;

import com.esisa.dp.structural.composite.Component;

public class Client {

	public Client() {
		exp01();
	}

	void exp01() {
		FileSystem fs = new FileSystem(".");
		Component tree = fs.getTree();
		tree.operation();
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}