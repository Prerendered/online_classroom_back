package com.example.writeex.Service;

import com.example.writeex.Repo.ExerciseRepository;
import com.example.writeex.Entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;

    @Autowired
    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise createExercise(String question, String answer) {
        Exercise exercise = new Exercise();
        exercise.setQuestion(question);
        exercise.setAnswer(answer);
        return exerciseRepository.save(exercise);
    }
}
