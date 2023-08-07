package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {

}
