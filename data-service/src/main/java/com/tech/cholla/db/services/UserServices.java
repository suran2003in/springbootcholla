package com.tech.cholla.db.services;

import java.util.List;
import com.tech.cholla.db.entity.Users;


public interface UserServices {
	public List<Users> getDetailsByName(String name);
	
	Iterable<Users> findAll();
	List<Users> getDetailsById(int id);
	
}
