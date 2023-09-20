package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.Forum;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForumRepo extends MongoRepository<Forum, String>
{

    Iterable<Forum> findByUser(String user);
}
