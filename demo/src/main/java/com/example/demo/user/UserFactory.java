package com.example.demo.user;

public class UserFactory {
	
	public static User create(String firstname, String lastname) {
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		return user;
	}

}
