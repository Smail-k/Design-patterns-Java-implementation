package com.esisa.dp.structural.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

public class KnownUses {

	public KnownUses() {
		exp02();
	}

	void exp01() {
		/*
		 * Component : Reader
		 * ConcreteComponent : FileReader
		 * decorator : BufferedReader
		 * ConcreteDecorator : LineNumberReader
		 */
		try {
			Reader component = new FileReader("src/com/esisa/dp/structural/decorator/KnownUses.java");
			BufferedReader decorator = new BufferedReader(component);
			LineNumberReader concreteDecorator = new LineNumberReader(decorator);
			String row = concreteDecorator.readLine();
			while(row != null) {
				System.out.print(concreteDecorator.getLineNumber());
				System.out.println("\t"+row);
				row =concreteDecorator.readLine();
			}
			concreteDecorator.close();
		} catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
		}
	}
	
	void exp02() {
		System.out.println("Classe Mere de LineNumberReader : " + 
				LineNumberReader.class.getSuperclass().getSimpleName()
			);
		System.out.println("Classe Mere de BufferedReader : " + 
				BufferedReader.class.getSuperclass().getSimpleName()
			);
		System.out.println("Classe Mere de FileReader : " + 
				FileReader.class.getSuperclass().getSimpleName()
			);
		System.out.println("Classe Mere de InputStreamReader : " + 
				InputStreamReader.class.getSuperclass().getSimpleName()
			);
	}
	
	public static void main(String[] args) {
		new KnownUses();
	}
	
}
