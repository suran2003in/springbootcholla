package com.tech.cholla.account.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="account")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	@Id
	@Column(name ="name")
	private String name;
	@Column(name="lastseen")
	private Date lastSeen;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastSeen() {
		return lastSeen;
	}
	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}


}
