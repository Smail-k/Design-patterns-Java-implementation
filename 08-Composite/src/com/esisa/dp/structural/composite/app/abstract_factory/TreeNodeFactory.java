package com.esisa.dp.structural.composite.app.abstract_factory;

import javax.swing.tree.DefaultMutableTreeNode;

import com.esisa.dp.structural.composite.Composite;
import com.esisa.dp.structural.composite.Leaf;

public class TreeNodeFactory implements AbstractFactory{

	public TreeNodeFactory() {
	
	}

	
	public Object createLeaf(Leaf leaf) {
		return new DefaultMutableTreeNode(leaf.getName());
	}

	public Object createComposite(Composite cmp) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(cmp.getName());
		for (int i = 0; i < cmp.size(); i++) {
			node.add((DefaultMutableTreeNode) cmp.get(i).construct());
		}
		
		return node;
	}

}
