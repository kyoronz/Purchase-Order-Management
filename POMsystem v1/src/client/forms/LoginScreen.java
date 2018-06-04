package client.forms;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import static constant.ComponentConstant.colon;
import net.miginfocom.swing.MigLayout;

public class LoginScreen extends JFrame{
	//content panel
	private JPanel formpnl = new JPanel();
	
	private JLabel lblusr = new JLabel("Username");
	private JLabel lblpsw = new JLabel("Password");
	
	private JTextField txtusr = new JTextField(10);
	private JTextField txtpsw = new JTextField(10);
	
	//button panel
	private JPanel btnpnl = new JPanel();
	
	private JButton btnlogin = new JButton("Login");
	private JButton btnexit = new JButton("Exit");
	
	public LoginScreen(){
		//init
		super();
		setSize(500,500);
		getContentPane().setLayout(new MigLayout("align 50% 50%"));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		setLocationRelativeTo(null);
		
		//form panel
		formpnl.setLayout(new MigLayout());
		
		formpnl.add(lblusr);
		formpnl.add(colon(),"gapx 20");
		formpnl.add(txtusr,"gapx 20, wrap");
		formpnl.add(lblpsw,"gapy 20");
		formpnl.add(colon(),"gapx 20");
		formpnl.add(txtpsw,"gapx 20");
		
		//button panel
		btnpnl.setLayout(new MigLayout());
		Dimension btnsize = new Dimension(70,btnlogin.getHeight());
		btnlogin.setMinimumSize(btnsize);
		btnexit.setMinimumSize(btnsize);
		
		btnpnl.add(btnlogin, "gapy 20, gapx 20");
		btnpnl.add(btnexit, "gapx 40");
		
		//JFrame Content
		Container c = getContentPane();
		c.add(formpnl, "wrap");
		c.add(btnpnl);
	}
}
