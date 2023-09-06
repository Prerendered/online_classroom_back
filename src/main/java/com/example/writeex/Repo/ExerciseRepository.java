package com.example.writeex.Repo;

import com.example.writeex.Entity.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends MongoRepository<Exercise, String> {
}
