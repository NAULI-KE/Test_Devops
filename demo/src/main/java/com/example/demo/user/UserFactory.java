package com.example.demo.user;

import java.time.LocalDateTime;

import com.example.demo.commons.RecordStatus;

public class UserFactory {
	
	public static User create(String firstname, String lastname, RecordStatus recordStatus) {
		
		User user = new User();
		
		user.setFirstname(firstname);
		
		user.setLastname(lastname);
		
		user.setCreatedDate(LocalDateTime.now());
		
		user.setRecordStatus(recordStatus);
		
		//user.setCreatedById(createdById);
		
		return user;
	}
	
	public static User UpdateUser(String firstname, String lastname, RecordStatus recordStatus) {
		
		User user = new User();
		
		user.setFirstname(firstname);
		
		user.setLastname(lastname);
		
		user.setCreatedDate(LocalDateTime.now());
		
		user.setRecordStatus(recordStatus);
		
		
		return user;
	}

}
