package com.tech.cholla.account.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

/*
@Entity	
@Table(name="authuser")
public class User {

	@Id
	@Column(name="username")
	private String username;
	
	@NotNull
	@Length(min = 6, max = 40)
	@Column(name="password")
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	
	
}
*/


@Entity
@Table(name="users")
public class User {
	@Id   
	@Column(name = "ID")
	int id;
	
	@Column(name = "NAME")
	String username;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String userName) {
		this.username = userName;
	}
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Users [id=%d, userName='%s', Modifieddate='%s']",
	                id, username, null);
	    }
}
