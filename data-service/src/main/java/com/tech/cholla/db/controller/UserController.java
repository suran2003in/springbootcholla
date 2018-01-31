package com.tech.cholla.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.cholla.db.entity.Users;
import com.tech.cholla.db.repositories.UserRepository;
import com.tech.cholla.db.services.UserServices;


@RestController
public class UserController {
	
	@Autowired
	UserServices userService;
	
	/*@Autowired
	UserRepository userrepo;*/
	
	 @RequestMapping("/users/{id}")
	    public Iterable<Users> getUserById(@PathVariable int id){	       
		 return userService.getDetailsById(id);
	    }
	 
	 
	 @RequestMapping("/users")
	    public Iterable<Users> getAllUsers(){	       
		 Iterable<Users> usrList = userService.findAll();
		 //Iterable<Users> usrList = userrepo.findAll();
		 return usrList;
	    }
}
