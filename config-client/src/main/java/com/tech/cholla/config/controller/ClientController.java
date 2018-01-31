package com.tech.cholla.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.cholla.config.client.ConfigClient;
import com.tech.cholla.config.domain.Users;


@RestController
public class ClientController{
	
	@Autowired
	private ConfigClient confclient;

	@RequestMapping(path = "/clientusers/{id}", method = RequestMethod.GET)
	public Iterable<Users> getUsers(@PathVariable int id) {
		System.out.println("Users input is : " + id+""); 
		return confclient.getUserById(id);
	}
}
