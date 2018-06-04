package client.forms;

import static constant.ComponentConstant.colon;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constant.AccountType;
import net.miginfocom.swing.MigLayout;

public class UserAdd extends JFrame{
	JPanel pnlform = new JPanel();
	JLabel lblusr = new JLabel("ID");
	JLabel lblname = new JLabel("Name");
	JLabel lblic = new JLabel("IC");
	JLabel lblcontact = new JLabel("Contact no.");
	JLabel lblemail = new JLabel("Email");
	JLabel lbltype = new JLabel("Account Type");
	
	JTextField txtusr = new JTextField(10);
	JTextField txtname= new JTextField(10);
	JTextField txtic = new JTextField(10);
	JTextField txtcontact = new JTextField(10);
	JTextField txtemail = new JTextField(10);
	
	JComboBox<String> cboxtype;
	
	JPanel pnlbtn = new JPanel();
	JButton btnconfirm = new JButton("Confirm");
	JButton btncancel = new JButton("Cancel");
	
	public UserAdd(){
		//init
		super();
		setSize(500,500);
		setLayout(new MigLayout("align 50% 50%"));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		createformpnl();	
	}
	private void createformpnl(){
		//get account type constant
		cboxtype = new JComboBox<String>(AccountType.retrieveacctype());
		
		//set button size
		Dimension btnsize = new Dimension(70,btnconfirm.getHeight());
		btnconfirm.setMinimumSize(btnsize);
		btncancel.setMinimumSize(btnsize);
		
		//form panel
		pnlform.setLayout(new MigLayout());
		
		pnlform.add(lblusr);
		pnlform.add(colon());
		pnlform.add(txtusr,"wrap");
		pnlform.add(lbltype,"gapy 10");
		pnlform.add(colon());
		pnlform.add(cboxtype,"wrap");
		pnlform.add(lblname,"gapy 10");
		pnlform.add(colon());
		pnlform.add(txtname,"wrap");
		pnlform.add(lblic,"gapy 10");
		pnlform.add(colon());
		pnlform.add(txtic,"wrap");
		pnlform.add(lblcontact,"gapy 10");
		pnlform.add(colon());
		pnlform.add(txtcontact,"wrap");
		pnlform.add(lblemail,"gapy 10");
		pnlform.add(colon());
		pnlform.add(txtemail);
		
		//button panel
		pnlbtn.setLayout(new MigLayout());
		
		pnlbtn.add(btnconfirm, "gapx 15");
		pnlbtn.add(btncancel, "gapx 30");
		
		//JFrame
		getContentPane().add(pnlform,"wrap");
		getContentPane().add(pnlbtn,"gapy 30");
	}	
}
