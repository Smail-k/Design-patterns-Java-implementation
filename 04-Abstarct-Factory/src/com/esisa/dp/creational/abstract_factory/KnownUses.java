package com.esisa.dp.creational.abstract_factory;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class KnownUses extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private UIManager.LookAndFeelInfo laf[];
	private JTextField textField;
	
	public KnownUses() {
		lookAndFeels();
		userInterface();
	}
	
	public void lookAndFeels() {
		laf = UIManager.getInstalledLookAndFeels();
		for (int i = 0; i < laf.length; i++) {
			System.out.println(laf[i].getName()+ " : "+ laf[i].getClassName());
		}
		//changeLookAndFeel(laf[1].getClassName());
	}

	public void userInterface() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p.add(new JLabel("Look And Feel"));
		textField = new JTextField(20);
		p.add(textField);
		getContentPane().add("North",p);
		
		JPanel p2 = new JPanel(); 
		for (int i = 0; i < laf.length; i++) {
			JButton b =new JButton(laf[i].getName());
			b.setName(laf[i].getClassName());
			b.addActionListener(this);
			p2.add(b);
		}		
		getContentPane().add("South",p2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);
	}
	
	public void changeLookAndFeel(String concreteFactoryName) {
		try {
			UIManager.setLookAndFeel(concreteFactoryName);
		} catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
		}
		//appliquer le look and feel to a Jframe
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public static void main(String[] args) {
		new KnownUses();
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		changeLookAndFeel(b.getName());
		textField.setText(b.getText());
	}

}