package client;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import client.forms.UserUsernameChange;

public class ClientStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
		    public void run(){
				JFrame login = new UserUsernameChange();
				login.setVisible(true);
		    }
		});
	}
}
