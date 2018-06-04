package client.forms;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constant.ComponentConstant;
import net.miginfocom.swing.MigLayout;

public class UserEdit extends JFrame{
	//Swing component
	JPanel pnlform = new JPanel();
	
	JLabel lblusr = new JLabel("Username");
	JLabel lblname = new JLabel("Name");
	JLabel lblic = new JLabel("IC");
	JLabel lblcontact = new JLabel("Contact no.");
	JLabel lblemail = new JLabel("Email");
	
	JTextField txtusr = new JTextField(10);
	JTextField txtname= new JTextField(10);
	JTextField txtic = new JTextField(10);
	JTextField txtcontact = new JTextField(10);
	JTextField txtemail = new JTextField(10);
	
	JPanel pnlbtn = new JPanel();
	
	JButton btnconfirm = new JButton("Confirm");
	JButton btncancel = new JButton("Cancel");
	
	//Constructor
	public UserEdit(){
		//init
		super();		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		createformpanel();
	}
	
	//init method
	private void createformpanel(){
		//form panel
		pnlform.setLayout(new MigLayout());
		
		pnlform.add(lblusr,"gapy 10");
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtusr,"gapx 20, wrap");
		
		pnlform.add(lblname,"gapy 10");
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtname,"gapx 20, wrap");
		
		pnlform.add(lblic,"gapy 10");
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtic,"gapx 20, wrap");
		
		pnlform.add(lblcontact,"gapy 10");
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtcontact,"gapx 20, wrap");
				
		pnlform.add(lblemail,"gapy 10");
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtemail,"gapx 20, wrap");
		
		//button panel
		pnlbtn.setLayout(new MigLayout());
		
		pnlbtn.add(btnconfirm,"gapx 10");
		pnlbtn.add(btncancel,"gapx 30");
		
		//JFrame
		setSize(500,500);
		setLayout(new MigLayout("align 50% 50%"));
		setLocationRelativeTo(null);
		
		getContentPane().add(pnlform, "wrap");
		getContentPane().add(pnlbtn, "gapy 20");
	}
}
