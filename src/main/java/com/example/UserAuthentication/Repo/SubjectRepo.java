package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepo extends MongoRepository<Subject, String> {

}
