package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExerciseRepo extends MongoRepository<Exercise, String> {
}
