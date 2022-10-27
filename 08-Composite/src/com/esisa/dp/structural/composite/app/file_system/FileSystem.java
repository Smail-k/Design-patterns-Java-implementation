package com.esisa.dp.structural.composite.app.file_system;

import java.io.File;

import com.esisa.dp.structural.composite.Component;
import com.esisa.dp.structural.composite.Composite;
import com.esisa.dp.structural.composite.Leaf;

public class FileSystem {

	private Component tree;
	
	public FileSystem(String source) {
		tree= createNode(new File(source));
	}
	
	private Component createNode(File f) {
		if(f.isFile()) {
			return new Leaf(f.getName());
		}
		else if(f.isDirectory()) {
			Component parent = new Composite(f.getName());
			File content[] = f.listFiles();
			for (File file : content) {
				parent.add(createNode(file));
			}
			return parent;
		}
		return null;
	}
	
	public Component getTree() {
		return tree;
	}
	
}