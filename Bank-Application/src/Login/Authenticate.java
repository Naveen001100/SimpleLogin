package Login;

import java.util.Map;

public class Authenticate {
	String name;
	int pass;
	Authenticate(String name,int pass){
		this.name = name;
		this.pass = pass;
	}
	public boolean validate(Map <String,Integer> user) {
		if(!user.containsKey(name)) {
			return false;
		}else{
			if(user.get(name) == pass) {
				return true;
			}else{
				return false;
			}
		}
	}
}
