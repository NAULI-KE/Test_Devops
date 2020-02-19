package com.example.demo.user;
	/*
	 * Created by SAM
	 * ON 18th FEB 2020
	 * User class
	 * */

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.commons.BaseEntity;

@Entity
@Table(name="users")
public class User extends BaseEntity{
    
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
}
