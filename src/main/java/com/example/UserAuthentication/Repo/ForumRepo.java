package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.Forum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ForumRepo extends MongoRepository<Forum, String> {
    Iterable<Forum> findByUser(String user);

    void deleteByTitle(String title);

    Iterable<Forum> findByCategory(String category);

    @Query(value = "{}", fields = "{'category': 1}")
    List<String> findCategories();
}
