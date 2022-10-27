package com.esisa.dp.structural.composite.app.abstract_factory;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import com.esisa.dp.structural.composite.Component;
import com.esisa.dp.structural.composite.Composite;
import com.esisa.dp.structural.composite.Leaf;
import com.esisa.dp.structural.composite.app.file_system.FileSystem;

public class Client {

	public Client() {
		exp04();
	}

	void exp01() {
		FileSystem fs = new FileSystem("./src");
		Component tree = fs.getTree();
		tree.setFactory(new StringFactory());
		String s = (String) tree.construct(); 
		System.out.println(s);
	}
	
	void exp02() {
		Component root = new Composite("A"); 
		Component B = new Composite("B");
		Component C = new Composite("C");
		Component D = new Composite("D");
		Component F = new Composite("F");
		Component J = new Composite("J");
		
		root.add(B);
		root.add(C);
		root.add(D);
		
		B.add(new Leaf("E"));
		B.add(F);
		
		
		C.add(new Leaf("I"));
		
		D.add(J);
		D.add(new Leaf("K"));
		
		F.add(new Leaf("G"));
		F.add(new Leaf("H"));
		
		J.add(new Leaf("L"));
		J.add(new Leaf("M"));
		
		root.setFactory(new StringFactory());
		System.out.println(root.construct());
	}
	
	void exp03() {
		FileSystem fs = new FileSystem("./src");
		Component tree = fs.getTree();
		tree.setFactory(new SelectFactory(".java"));
		@SuppressWarnings("unchecked")
		Vector<Component> list =(Vector<Component>) tree.construct(); 
		for (Component component : list) {
			System.out.println(" - " +component.getName());
		}
	}
	
	void exp04() {
		FileSystem fs = new FileSystem("..");
		Component tree = fs.getTree();
		tree.setFactory(new TreeNodeFactory());
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.construct();
		
		JTree jt = new JTree(new DefaultTreeModel(node));
		JFrame f =new JFrame();
		f.setContentPane(new JScrollPane(jt));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Client();
	}
	
}
