package edu.utfpr.cp.sa.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

import edu.utfpr.cp.sa.dao.CountryDao;
import edu.utfpr.cp.sa.entity.Country;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Point;

class CountryTableModel extends AbstractTableModel {
	
	private ArrayList<Country> countries;
	private String columnNames[] = {"Id", "Name", "Acronym", "Phone Digits"};
	
	public CountryTableModel(Set<Country> countries) {
		this.countries = new ArrayList<>(countries);
	}
	
	@Override
	public int getRowCount() {
		return countries.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch (columnIndex) {
                        case 0:
                                return this.countries.get(rowIndex).getId();
                                
			case 1:
				return this.countries.get(rowIndex).getName();
				
			case 2:
				return this.countries.get(rowIndex).getAcronym();
				
			case 3:
				return this.countries.get(rowIndex).getPhoneDigits();
	
			default:
				break;
		}
		
		return null;
	}
        @Override
        public void setValueAt(Object value, int rowIndex, int columnIndex) {
          switch(columnIndex) {
              case 0:
                    this.countries.get(rowIndex).setName((String) value);
                    break;
              case 1:
                    this.countries.get(rowIndex).setAcronym((String) value);
                    break;
              case 2:
                    this.countries.get(rowIndex).setPhoneDigits(Integer.parseInt((String) value));
                    break;
          }
          this.fireTableRowsUpdated(rowIndex, rowIndex);
        }

    public Country get(int rowIndex) {
        return countries.get(rowIndex);
    }
    
    public void retira(int rowIndex) {
        this.countries.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
	
}

public class CountryWindow extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField acronym;
	private JTextField phoneDigits;
	private JTable table;
	private Set<Country> countries;
	
	private void create () {
		Country c = new Country();
        CountryDao cd = new CountryDao();
                
		c.setName(name.getText());
		c.setAcronym(acronym.getText());
		c.setPhoneDigits(new Integer(phoneDigits.getText()));
				
        cd.insert(c);
                    
		if (this.countries.add(c)) {
			JOptionPane.showMessageDialog(this, "Country successfully added!");
			
		} else
			JOptionPane.showMessageDialog(this, "Sorry, country already exists");
		
	}
        
    private void read () {
    	table.setModel(new CountryTableModel(new CountryDao().getListaCountry()));
    }
    
    private void update () {
    	Country c = new Country();
        
		c.setName(name.getText());
		c.setAcronym(acronym.getText());
		c.setPhoneDigits(new Integer(phoneDigits.getText()));
		
		new CountryDao().update(c);
    }
    
    
    private void delete(){
    	new CountryDao().delete(name.getText());
    }
	
	public CountryWindow(Set<Country> countries) {
		setTitle("Country Management");
		this.countries = countries;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane panelTable = new JScrollPane();
		contentPane.add(panelTable, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new CountryTableModel(countries));
		panelTable.setViewportView(table);
		
		JPanel panelInclusion = new JPanel();
		contentPane.add(panelInclusion, BorderLayout.NORTH);
		panelInclusion.setLayout(new GridLayout(6, 3, 0, 0));
		
		JLabel lblName = new JLabel("Name");
		panelInclusion.add(lblName);
		
		name = new JTextField();
		panelInclusion.add(name);
		name.setColumns(10);
		
		JLabel lblAcronym = new JLabel("Acronym");
		panelInclusion.add(lblAcronym);
		
		acronym = new JTextField();
		panelInclusion.add(acronym);
		acronym.setColumns(10);
		
		JLabel lblPhoneDigits = new JLabel("Phone Digits");
		panelInclusion.add(lblPhoneDigits);
		
		phoneDigits = new JTextField();
		panelInclusion.add(phoneDigits);
		phoneDigits.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		panelInclusion.add(btnCreate);
		btnCreate.addActionListener(e -> this.create());
		
		JButton btnList = new JButton("List");
        panelInclusion.add(btnList);
        btnList.addActionListener(e -> this.read());
                
        JButton btnUpdate = new JButton("Update");
        panelInclusion.add(btnUpdate);
        btnUpdate.addActionListener(e -> this.update());
        
                
        JButton btnDelete = new JButton("Delete");
        panelInclusion.add(btnDelete);
        btnDelete.addActionListener(e -> this.delete());

		JButton btnClose = new JButton("Close");
		panelInclusion.add(btnClose);
		btnClose.addActionListener(e -> this.dispose());
		
		this.pack();
		this.setVisible(true);
	}

}
