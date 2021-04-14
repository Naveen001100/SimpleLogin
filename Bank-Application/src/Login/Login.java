package Login;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class Login{
	public static int option;
	
	public void displayUsers(Map<String,Integer> user) {
			Set<String> name = user.keySet();
			name.forEach(s->{System.out.println(s);});
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> user = new HashMap<>();
		Login l = new Login();
		while(option != 4) {
		System.out.println("Press 1 to Add User");
		System.out.println("Press 2 to Validate the User");
		System.out.println("Press 3 to Display User List");		
		System.out.println("Press 4 to Exit the Entire Application");
		option = sc.nextInt();
		if(option == 1) {
			System.out.println("Enter the Username");
			String name = sc.next();
			System.out.println("Enter the Pass");
			int pass = sc.nextInt();
			AddUser au = new AddUser(name,pass);
			if(au.addUser(user)==1)
					System.out.println("User added Successfully");
		}else if(option == 2) {
			System.out.println("Enter the Username");
			String name = sc.next();
			System.out.println("Enter the Pass");
			int pass = sc.nextInt();
			Authenticate au = new Authenticate(name,pass);
			if(au.validate(user))
				System.out.println("User is Authenticated");
			else {
				System.out.println("User is not Authenticated");
			}
		}else if(option == 3) {
			l.displayUsers(user);
		}else if(option == 4) {
			sc.close();
			System.out.println("Application Exited");
		}else {
			System.out.println("Enter the Valid Value");
		}
	  }
	}
}