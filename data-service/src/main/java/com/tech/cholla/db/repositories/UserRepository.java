package com.tech.cholla.db.repositories;


import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tech.cholla.db.entity.Users;
@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

    List<Users> findById(int id);
    //List<Users> findByName(String name);
    Page<Users> findAll(Pageable pageable);
}
