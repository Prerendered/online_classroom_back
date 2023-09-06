package Repo;

import Entity.Exercise;
import Entity.ExerciseRequest;
import Service.ExerciseService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends MongoRepository<Exercise, String> {

}
