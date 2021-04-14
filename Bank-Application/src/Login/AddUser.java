package Login;

import java.util.Map;

public class AddUser { 
	String name;
	int pass;
	AddUser(String name,int pass){
		this.name = name;
		this.pass = pass;
	}
	public int addUser(Map<String,Integer> user) {
		user.put(name,pass);
		return 1;
	}
}
