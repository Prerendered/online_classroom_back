package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {

}
