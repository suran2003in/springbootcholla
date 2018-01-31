package com.tech.chola.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tech.chola.auth.domain.Authusers;

@Repository
public interface UserAuthRepository extends CrudRepository<Authusers, String> {

}
