package com.tech.cholla.account.service;

import java.util.Date;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tech.cholla.account.client.AuthServiceClient;
import com.tech.cholla.account.domain.Account;
import com.tech.cholla.account.domain.User;
import com.tech.cholla.account.repository.AccountRepository;
@Data
@Service
public class AccountServiceImpl implements AccountService {
	private final Logger log = LoggerFactory.getLogger(getClass());



	@Autowired
	private AuthServiceClient authClient;

	@Autowired
	private AccountRepository repository;

	@Override
	public Account create(User user) {
		Account existing = repository.findByName(user.getUsername());
		Assert.isNull(existing, "account already exists: " + user.getUsername());

		authClient.createUser(user);

		
		Account account = new Account();
		account.setName(user.getUsername());
		account.setLastSeen(new Date());

		//repository.save(account);

		log.info("new account has been created: " + account.getName());

		return account;
	}
	
	@Override
	public Account findByName(String accountName) {
		Assert.hasLength(accountName, "Mininum 3 char");
		return repository.findByName(accountName);
	}

	
	

}
