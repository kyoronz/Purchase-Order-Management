package constant;

import java.util.Arrays;
import java.util.List;

import constant.AccountType.LoginUser;

public class AccountType {
	public enum LoginUser{
		//enum value
		admin("Admin",0),
		sales_manager("Sales Manager",1),
		purchase_manager("Purchase Manager",2);
		
		//enum properties
		private String accdesc;
		private int acctype;
		
		//Constructor
		private LoginUser(String accdesc,int acctype){
			this.accdesc = accdesc;
			this.acctype = acctype;
		}
		
		//getter and setter
		public String getdesc(){
			return accdesc;
		}
		public int gettype(){
			return acctype;
		}
	}
	public static String[] retrieveacctype(){
		List<LoginUser> list = Arrays.asList(LoginUser.values());
		String[] type = new String[list.size()];
		for(int i=0;i<list.size();i++){
			type[i]=list.get(i).getdesc();
		}
		Arrays.sort(type);
		return type; 
	}
	public String spaceTOdash(String typefullname){
		//Sales Manager --> sales_manager
		String temp[] = typefullname.split(" ");
		String newfullname = new String();
		for(int i =0;i<temp.length;i++){
			newfullname+=temp[i];
			if(i+1<temp.length){
				newfullname+="_";
			}
		}
		return newfullname;
	}
}
