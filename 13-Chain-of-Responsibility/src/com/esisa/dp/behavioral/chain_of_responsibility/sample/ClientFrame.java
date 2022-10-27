package com.esisa.dp.behavioral.chain_of_responsibility.sample;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private JTextField source; 
	private JLabel status;
	private TableFacade errors;
	private TableFacade models;
	
	private Handler handler;
	
	public ClientFrame() {
		config();
		init();
	}
	
	void config() {
		handler = new StringLengthValidator("id", 8, 8);
		handler.add(new StringLengthValidator("title",10,30));
		handler.add(new DoubleRangeValidator("price",0,1000));
	}
	
	void init() {
		setTitle("Chain of Responsibility");
		source=new JTextField(50);
		source.setText("id=DOC-1002&title=Design Patterns in Java&price=876&date=23/12/2021");
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel("Request")); 
		p1.add(source);
		JButton b1 = new JButton("Handle");
		b1.addActionListener(this);
		p1.add(b1);
		
		getContentPane().add("North",p1);
			
		status = new JLabel("---"); 
		status.setFont(new Font("verdana",Font.BOLD,30));
		status.setHorizontalAlignment(JLabel.CENTER);
		getContentPane().add("South",status);
		
		errors = new TableFacade("Errors", "handler","parameter","Message");
		errors.setColumnsWidth(20,20,60);
		models = new TableFacade("Models","Model","value");

		models.setPreferredSize(new Dimension(200,0));
		
		getContentPane().add("Center",errors);
		getContentPane().add("East",models);
		
		
		setSize(800,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e) {
		Result result = handler.handleRequest(new Request(source.getText()));
		status.setText(result.getStatus());
		errors.clear();
		
		List<Error> errorList = result.getErrors();
		
		for (Error error : errorList) {
			errors.add(error.getSource(),error.getParameter(),error.getMessage());
		}
		
		models.clear();
		Hashtable<String, Object> modelsList= result.getModels();
		for (String model : modelsList.keySet()) {
			models.add(model,modelsList.get(model));
		}
		
	}

	public static void main(String[] args) {
		new ClientFrame();
	}
	
}
