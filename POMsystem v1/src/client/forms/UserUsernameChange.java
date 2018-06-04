package client.forms;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constant.ComponentConstant;
import net.miginfocom.swing.MigLayout;

public class UserUsernameChange extends JFrame{
	JPanel pnlform = new JPanel();
	
	JLabel lbloldusr = new JLabel("Username");
	JLabel lblnewusr = new JLabel("New Username");
	JLabel lblpass = new JLabel("Password");
	
	JTextField txtoldusr = new JTextField(10);
	JTextField txtnewusr = new JTextField(10);
	JPasswordField txtpass = new JPasswordField(10);
	
	JPanel pnlbtn = new JPanel();
	
	JButton btnconfirm = new JButton("Confirm");
	JButton btncancel = new JButton("Cancel");
	
	public UserUsernameChange(){
		//init
		super();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		createformpanel();		
	}
	private void createformpanel(){
		//form panel
		pnlform.setLayout(new MigLayout());
		
		pnlform.add(lbloldusr);
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtoldusr,"gapx 20, wrap");
		
		pnlform.add(lblnewusr,"gapy 10");
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtnewusr,"gapx 20, wrap");
		
		pnlform.add(lblpass,"gapy 10");
		pnlform.add(ComponentConstant.colon(), "gapx 10");
		pnlform.add(txtpass,"gapx 20, wrap");
		
		//button panel
		pnlbtn.setLayout(new MigLayout());
		
		pnlbtn.add(btnconfirm, "gapx 20");
		pnlbtn.add(btncancel, "gapx 50");
		//JFrame
		setSize(500,500);
		setLayout(new MigLayout("align 50% 50%"));
		setLocationRelativeTo(null);
		
		getContentPane().add(pnlform, "wrap");
		getContentPane().add(pnlbtn, "gapy 20");
	}
}
