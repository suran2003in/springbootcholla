package com.tech.cholla.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id   
	@Column(name = "ID")
	int id;
	
	@Column(name = "NAME")
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
