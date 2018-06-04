package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.privatejgoodies.common.base.Objects;

import template.User;

public class UserFile {
	// Data Representation
	/* ========== 
	 * Username
	 * Password
	 * Account Type
	 * Name
	 * IC
	 * Contact
	 * Email 
	 * ==========	
	*/
	
	private File Userfile = new File("File\\user.txt");
	private Scanner reader;
	private ArrayList<User> record = new ArrayList<User>();
	public UserFile(){
		if (!(Userfile.exists())){
			try{
				Userfile.createNewFile();				
			}
			catch(Exception e){
				//IO exception maybe occur
			}
		}		
		
		//get the list of user
		this.record=recordset();
	}
	private ArrayList<User> recordset(){
		ArrayList<User> record = new ArrayList<User>();
		try{
			Scanner reader = new Scanner(Userfile);
			while (reader.hasNextLine()){
				User a = new User();
				a.username 	= reader.nextLine();
				a.setpass	(reader.nextLine());
				a.acctype	= reader.nextLine();
				a.name		= reader.nextLine();
				a.ic		= reader.nextLine();
				a.contact	= reader.nextLine();
				a.email		= reader.nextLine();
				record.add(a);
			}
			reader.close();
		}
		catch(Exception e){	}
		return record;
	}
	public void refreshList(){
		this.record=recordset();
	}
	
	public User getSpecificRecord(String username){
		// return record if found
		// return null if not found
		for(User a: this.record){
			if(Objects.equals(a.username, username)){
				return a;
			}
		}
		return null;
	}
	
	public ArrayList<User> getAccTypeRecord(int acctype){
		ArrayList<User> record = new ArrayList<User>();
		for(User a: this.record){
			if(Objects.equals(a.acctype, acctype)){
				record.add(a);
			}
		}
		return record;
	}
	
	public int addrecord(String username,String password, String acctype
	 				,String name, String ic, String contact, String email)
	{ 
	//return value of fileupdate error
		User a = new User();
		a.username=username;
		a.setpass(password);
		a.acctype=acctype;
		a.name=name;
		a.ic=ic;
		a.contact=contact;
		a.email=email;
		this.record.add(a);
		 
		return fileupdate();
	 }
	 
	 public int updaterecord(String username,String name,String ic,String contact,String email){
		//return value of fileupdate error
		for(User a:this.record){
			if(Objects.equals(a.username, username)){
				a.name=name;
				a.ic=ic;
				a.contact=contact;
				a.email=email;
				break;
			}
		}
		return fileupdate();
	 }	 
	 
	 public boolean AccVerify(String username,String password){
		 for(User a:this.record){
			 if(Objects.equals(a.username, username)&&Objects.equals(a.getpass(),password)){
				return true; 
			 }
		 }
		 return false;
	 }
	 
	 public boolean changeAccInfo(String username,String password,String newdetails,int Changetype){
		 //0 - username change
		 //1 - password change
		 //return true when success and vice versa
		 if(AccVerify(username,password)){
			 for(User a:this.record){
				 if(Changetype==0){
					 return changepassword(username,newdetails)==0?true:false;
				 }
				 else if(Changetype==1){
					 return changeusername(username,newdetails)==0?true:false;
				 }
			 }
			 return false;
		 }
		 return false;
	 }
	 
	 private int changepassword(String username,String newpass){
		 for(User a:this.record){
			 if(Objects.equals(a.username, username)){
				 a.setpass(newpass);
				 break;
			 }
		 }
		 return fileupdate();
	 }
	 
	 private int changeusername(String username,String newusr){
		 for(User a:this.record){
			 if(Objects.equals(a.username, username)){
				 a.username=username;
				 break;
			 }
		 }
		 return fileupdate();
	 }
	 
	 private int fileupdate(){
		 //return 0 if NO exception occur
		 try{
			 PrintWriter writer = new PrintWriter(new FileWriter(Userfile));
			 for(User a:this.record){
				 writer.println(a.username);
				 writer.println(a.getpass());
				 writer.println(a.acctype);
				 writer.println(a.name);
				 writer.println(a.ic);
				 writer.println(a.contact);
				 writer.println(a.email);
			 }
			 writer.close();
			 return 0;
		 }catch(Exception e){return 1;}
	 }
	 
	 //Checklist for unfinished function
	 
	 //should delete function implemented?
	 //make hash and salt algo here
}
