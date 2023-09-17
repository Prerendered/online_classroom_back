package com.example.UserAuthentication.Service;

import com.example.UserAuthentication.Entity.Exercise;
import com.example.UserAuthentication.Repo.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
    @Autowired
    private ExerciseRepo repo;

    public void save_Update(Exercise exercises) {
        repo.save(exercises);
    }

    public Iterable<Exercise> listAll() {
        return this.repo.findAll();
    }

    public void deleteExercise(String id) {
        repo.deleteById(id);
    }

    public Exercise getSubjectById(String id) {
        return repo.findById(id).get();
    }
    
}
