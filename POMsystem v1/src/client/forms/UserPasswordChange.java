package client.forms;

import static constant.ComponentConstant.colon;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class UserPasswordChange extends JFrame{
	JPanel pnlform = new JPanel();
	
	JLabel lblusr = new JLabel("Username");
	JLabel lbloldpsw = new JLabel("Old password");
	JLabel lblnewpsw = new JLabel("New password");
	JLabel lblrepsw = new JLabel("Re-enter password");
	
	JTextField txtusr = new JTextField(10);
	JPasswordField txtoldpsw = new JPasswordField(10);
	JPasswordField txtnewpsw = new JPasswordField(10);
	JPasswordField txtrepsw = new JPasswordField(10);
	
	JPanel pnlbtn = new JPanel();
	
	JButton btnconfirm = new JButton("Confirm");
	JButton btncancel = new JButton("Cancel");
	
	public UserPasswordChange(){
		//init
		super();
		setSize(500,500);
		setLayout(new MigLayout("align 50% 50%"));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		
		createformpanel();
	}
	private void createformpanel(){
		//set button size
		Dimension btnsize = new Dimension(70,btnconfirm.getHeight());
		btnconfirm.setMinimumSize(btnsize);
		btncancel.setMinimumSize(btnsize);
		
		//form panel
		pnlform.setLayout(new MigLayout());
		
		pnlform.add(lblusr);
		pnlform.add(colon(),"gapx 10");
		pnlform.add(txtusr, "gapx 10, wrap");
		
		pnlform.add(lbloldpsw,"gapy 20");
		pnlform.add(colon(),"gapx 10");
		pnlform.add(txtoldpsw, "gapx 10, wrap");
		
		pnlform.add(lblnewpsw,"gapy 20");
		pnlform.add(colon(),"gapx 10");
		pnlform.add(txtnewpsw, "gapx 10, wrap");
		
		pnlform.add(lblrepsw,"gapy 20");
		pnlform.add(colon(),"gapx 10");
		pnlform.add(txtrepsw, "gapx 10, wrap");
		
		//button panel
		pnlbtn.setLayout(new MigLayout());
		pnlbtn.add(btnconfirm,"gapx 20");
		pnlbtn.add(btncancel,"gapx 30");
		
		getContentPane().add(pnlform,"wrap");
		getContentPane().add(pnlbtn,"gapy 20");
	}
}
