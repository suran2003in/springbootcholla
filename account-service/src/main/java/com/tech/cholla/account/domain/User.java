package com.tech.cholla.account.domain;


public class User {

	private String username;
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
/*

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
*/