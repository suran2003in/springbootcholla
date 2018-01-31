package com.tech.cholla.config.domain;

public class Users {
	int id;
	
	String userName;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Users [id=%d, userName='%s', Modifieddate='%s']",
	                id, userName, null);
	    }
}
