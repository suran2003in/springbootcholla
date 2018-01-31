package com.tech.cholla.account.service;

import com.tech.cholla.account.domain.Account;
import com.tech.cholla.account.domain.User;

public interface AccountService {
	Account create(User user);
	Account findByName(String accountName);

}
