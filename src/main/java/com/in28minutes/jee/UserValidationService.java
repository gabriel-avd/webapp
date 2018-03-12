package com.in28minutes.jee;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if(user.equals("gabo") && password.equals("password"))
			return true;
		
		return false;
	}

}
