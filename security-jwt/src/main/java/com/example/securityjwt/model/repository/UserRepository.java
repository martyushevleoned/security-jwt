package com.example.securityjwt.model.repository;

import com.example.securityjwt.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String username);
    User findByUsername(String username);
}
