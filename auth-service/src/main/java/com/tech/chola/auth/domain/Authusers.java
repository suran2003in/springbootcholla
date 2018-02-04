/**
 * 
 */
package com.tech.chola.auth.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author Suresh
 *
 */

@Entity
@Table(name="userauth")
public class Authusers {
	@Id
	@Column(name ="username")
	private String username;
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



	@Override
	    public String toString() {
	        return String.format(
	                "Users [id=%d, userName='%s', password='%s']",
	                username, password, null);
	    }
}
