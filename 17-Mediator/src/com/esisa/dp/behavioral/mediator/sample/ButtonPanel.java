package com.esisa.dp.behavioral.mediator.sample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ButtonPanel extends Colleague implements ActionListener{

	private static final long serialVersionUID = 1L;

	public ButtonPanel() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton a = new JButton("Ajouter");
		JButton b = new JButton("Supprimer");
		
		a.addActionListener(this);
		b.addActionListener(this);
		add(a);
		add(b); 
		a.setEnabled(false);
		b.setEnabled(false);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getComponent(0)) {
			String item =mediator.getValue();
			mediator.addItem(item);
			mediator.setValue("");
			mediator.disable(0);
		}else if(e.getSource() == getComponent(1)) {
			int index = mediator.getSelectedIndex();
			mediator.deleteItem(index);
			mediator.disable(1);
		}
	}

//Services :
	public void enable(int index) {
		getComponent(index).setEnabled(true);
	}
	public void disable(int index) {
		getComponent(index).setEnabled(false);
	}
	
}
