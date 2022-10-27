package com.esisa.dp.structural.composite.app.abstract_factory;

import java.util.Vector;

import com.esisa.dp.structural.composite.Component;
import com.esisa.dp.structural.composite.Composite;
import com.esisa.dp.structural.composite.Leaf;


// Recherche de toutes les feuilles de l'arbre dont le nom contient le keyword


public class SelectFactory implements AbstractFactory{

	private String keyword;
	
	public SelectFactory(String keyword) {
		this.keyword=keyword;
	}

	public Object createLeaf(Leaf leaf) {
		Vector<Component> result = new Vector<Component>();
		if(leaf.getName().toLowerCase().contains(keyword)) {
			result.add(leaf);
		}
		return result;
	}

	public Object createComposite(Composite cmp) {
		Vector<Component> result = new Vector<Component>();
		for (int i = 0; i < cmp.size(); i++) {
			@SuppressWarnings("unchecked")
			Vector<Component> child = (Vector<Component>) cmp.get(i).construct();
			result.addAll(child);
		}
		return result;
	}

}
