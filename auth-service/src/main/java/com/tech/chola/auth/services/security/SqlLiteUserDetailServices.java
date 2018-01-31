package com.tech.chola.auth.services.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tech.chola.auth.domain.Authusers;
import com.tech.chola.auth.repository.UserAuthRepository;


@Service
public class SqlLiteUserDetailServices implements UserDetailsService{

	@Autowired
	private UserAuthRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Authusers user = repository.findOne(username);

		if (user == null) {
			throw new UsernameNotFoundException(username);
		}

		return (UserDetails) user;
	}
}