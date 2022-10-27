package com.esisa.dp.structural.facade;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class TableFacade extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel header;
	private JTable table; 
	private DefaultTableModel model;
	
	private Color columnForeground[];
	private Color columnBackground[];
	
	private int columnsWidth[]=null;
	
	public TableFacade(String title,String...columns) {
		setLayout(new BorderLayout());
		setBorder(new CompoundBorder(new LineBorder(Color.gray),
				new EmptyBorder(10,10,10,10)));
		
		header= new JLabel(title);
		add("North",header);
		header.setFont(new Font("Verdana", Font.BOLD, 14));
		header.setHorizontalAlignment(JLabel.CENTER);
		header.setForeground(Color.blue);
		
		model=new NotEditableTableModel(columns,0);
		table = new JTable(model);
		add("Center",new JScrollPane(table));
		JTableHeader h =table.getTableHeader();
		h.setReorderingAllowed(false);
		h.setResizingAllowed(false);
		
		columnForeground = new Color[columns.length];
		columnBackground = new Color[columns.length];
		
		CellRenderer renderer = new CellRenderer();
		for (int i = 0; i < columns.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(renderer);
			columnForeground[i] = Color.black;
			columnBackground[i] = Color.white;
		}
		
	}
	
	public void add(Object...row) {
		model.addRow(row);
	}
	
	public void setColumnForground(int col,Color color) {
		columnForeground[col] = color;
	}
	
	public void setColumnBackground(int col,Color color) {
		columnBackground[col] = color;
	}
	
	public void setColumnsWidth(int...width) {
		columnsWidth=width;
	}
	
	public void setCellValue(int row,int col,Object value) {
		model.setValueAt(value, row, col);
	}
	
	public Object getCellValue(int row,int col) {
		return model.getValueAt(row, col);
	}
	
	public int getColumnCount() {
		return model.getColumnCount();
	}
	
	public int getRowCount() {
		return model.getRowCount();
	}
	
	private class NotEditableTableModel extends DefaultTableModel{

		private static final long serialVersionUID = 1L;

		public NotEditableTableModel(String columns[],int rowsCount) {
			super(columns,rowsCount);
		}
		
		public boolean isCellEditable(int row, int column) {
			
			return false;
		}
	}
	
	private class CellRenderer extends DefaultTableCellRenderer{

		private static final long serialVersionUID = 1L;

		
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			Component renderer = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			renderer.setForeground(columnForeground[column]);
			renderer.setBackground(columnBackground[column]);
			
			return renderer;
		}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(columnsWidth!=null) {
			int size = table.getWidth();
			for (int i = 0; i < model.getColumnCount(); i++) {
				int wi = columnsWidth[i] * size /100;
				table.getColumnModel().getColumn(i).setPreferredWidth(wi);
			}
		}
		
	}
}
