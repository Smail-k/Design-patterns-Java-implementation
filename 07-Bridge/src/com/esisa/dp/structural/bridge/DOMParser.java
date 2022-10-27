package com.esisa.dp.structural.bridge;

import java.io.File;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {

/*
	DOM : Document Object Model
	
*/	
	private Node root; 
	
	public DOMParser() {
		
	}
	
	
	public boolean parse (String source) {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultNSInstance(); 
		try {
			DocumentBuilder builder= factory.newDocumentBuilder();
			Document document = builder.parse(new File(source));
			root = document.getFirstChild(); 
			System.out.println(root.getNodeName() + " : " + 
			root.getNodeType()+ " :"+ root.getNodeValue());
			
			while(root.getNodeType() != Node.ELEMENT_NODE) {
				root=root.getNextSibling();
			}
			System.out.println(root.getNodeName());
			return true;
			
		} catch (Exception e) {
			System.out.println("Erreur : " +e.getMessage());
			
			return false; 
		}
	}
	public Node getRoot() {
		return root;
	}
	
	public Vector<Node> children(Node node){
		Vector<Node> result = new Vector<Node>(); 
		NodeList list =  node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if(list.item(i).getNodeType() == node.ELEMENT_NODE)
				result.add(list.item(i));
		}
		return result;
	}
	
	public Vector<Node> children(){
		return children(root);
	}
	
	public String attribute(Node node,String name) {
		NamedNodeMap atts = node.getAttributes(); 
		Node att =atts.getNamedItem(name);
		if(att != null)
			return att.getNodeValue();
		return "";
	}
	
	public int intAttribute(Node node,String name) {
		String v= attribute(node, name);
		try {
			return Integer.parseInt(v);
		} catch (Exception e) {
			return -1; 
		}
	}
	
	//valeur d'un node element
	public String value(Node node) {
		return node.getFirstChild().getNodeValue();
	}
}