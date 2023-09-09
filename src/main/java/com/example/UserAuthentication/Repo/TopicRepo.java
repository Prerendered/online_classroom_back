package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepo extends MongoRepository<Topic, String> {

}
