package template;

public class User {
	//user login
	public String username=new String();
	private String password = new String();
	//user details
	public String name=new String();
	public String ic=new String();
	public String contact=new String();
	public String email=new String();
	public String acctype=new String();
	
	public void setpass(String pass){
		this.password=pass;
	}
	public String getpass(){
		return this.password;
	}
}
