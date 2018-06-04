package client.forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import constant.AccountType;
import constant.ComponentConstant;
import net.miginfocom.swing.MigLayout;


public class UserView extends JFrame{	
	DefaultTableModel ds = new DefaultTableModel();
	JTable acctable = new JTable();
	JScrollPane scroll = new JScrollPane(acctable);
	
	JPanel contentpnl = new JPanel();
	
	JPanel funcpnl = new JPanel();
	
	JLabel lbltype = new JLabel("User type");
	
	String[] typeopt = AccountType.retrieveacctype();
	JComboBox cboxtype = new JComboBox();
	
	JPanel btnpnl = new JPanel();
	
	JButton btnadd = new JButton("Add New User");
	JButton btnback = new JButton("Return");
	
	public UserView(){
		//init
		super();
		setSize(500,500);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		createformpanel();
	}
	private void createformpanel(){
		//test
		contentpnl.setBackground(new Color(255,255,0));
		funcpnl.setBackground(new Color(255,0,255));
		btnpnl.setBackground(new Color(0,0,255));
		
		//add table to scrollpanel
		scroll.add(acctable);
		
		//get account type option
		cboxtype.addItem("All");
		for(int i=0;i<typeopt.length;i++){
			cboxtype.addItem(typeopt[i]);
		}
		
		//function panel
		funcpnl.setLayout(new MigLayout());
		
		funcpnl.add(lbltype);
		funcpnl.add(ComponentConstant.colon(), "gapx 10");
		funcpnl.add(cboxtype,"gapx 20, wrap");
		
		//button panel
		btnpnl.setLayout(new MigLayout());
		
		btnpnl.add(btnadd, "wrap");
		btnpnl.add(btnback);
		
		//content panel
		contentpnl.setLayout(new BorderLayout());
		
		contentpnl.add(funcpnl, BorderLayout.CENTER);
		contentpnl.add(btnpnl, BorderLayout.SOUTH);
		
		//JFrame
		setMinimumSize(new Dimension(500,500));
		getContentPane().add(scroll,BorderLayout.CENTER);
		getContentPane().add(contentpnl,BorderLayout.EAST);		
	}
}
