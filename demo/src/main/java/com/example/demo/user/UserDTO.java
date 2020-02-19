package com.example.demo.user;
	/*
	 * Created by SAM
	 * ON 18th FEB 2020
	 * User class
	 * */

import com.example.demo.commons.BaseDTO;

public class UserDTO extends BaseDTO  {
    
    private String firstname;
    
    private String lastname;
    
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public UserDTO() {
    }
    
   

}
