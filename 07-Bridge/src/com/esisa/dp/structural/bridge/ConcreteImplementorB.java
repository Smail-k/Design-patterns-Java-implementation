package com.esisa.dp.structural.bridge;

import java.util.List;
import java.util.Vector;
import org.w3c.dom.Node;

public class ConcreteImplementorB implements Implementor{

	private String source; 
	private DOMParser parser;
	
	public ConcreteImplementorB(String source) {
		this.source=source;
		this.parser=new DOMParser();
	}

	public List<DesignPattern> select() {
		List<DesignPattern> list = new Vector<DesignPattern>();
		parser.parse(source);
		Vector<Node> patterns  = parser.children();
		for (Node node : patterns) {
			DesignPattern dp = new DesignPattern();
			list.add(dp);
			dp.setId(parser.intAttribute(node, "id"));
			Vector<Node> props = parser.children(node);
			for (Node prop : props) {
				if(prop.getNodeName().equals("name")) {
					dp.setName(parser.value(prop));
				}else if(prop.getNodeName().equals("category")) {
					dp.setCategory(parser.value(prop));
				}else if(prop.getNodeName().equals("intent")) {
					dp.setIntent(parser.value(prop));
				}
				
			}
		}
		return list;
	}

}