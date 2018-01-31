package com.tech.cholla.config.client;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tech.cholla.config.domain.Users;


@FeignClient(name = "USER-SERVICE")
public interface ConfigClient {
	@RequestMapping(method = RequestMethod.GET, value = "/userservice/users/{id}")
	Iterable<Users> getUserById(@PathVariable("id") int id) ;
}





