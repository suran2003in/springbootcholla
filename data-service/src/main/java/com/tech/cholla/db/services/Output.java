package com.tech.cholla.db.services;

import java.util.List;

import com.tech.cholla.db.entity.Users;

public class Output {
	String code;
	
	String message;
	List<Users> users;
	public Output(String code, String message, List<Users> users){
		this.code = code;
		this.message = message;
		this.users = users;
				
	}

	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
}
