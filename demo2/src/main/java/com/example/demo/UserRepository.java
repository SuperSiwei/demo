package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
public interface UserRepository extends MongoRepository<User, Long> {

    public User findByid(Long id);

}
