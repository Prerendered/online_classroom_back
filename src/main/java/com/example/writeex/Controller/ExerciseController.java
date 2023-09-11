package com.example.writeex.Controller;

import com.example.writeex.Entity.Exercise;
import com.example.writeex.Service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/exercises")

public class ExerciseController {
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping("/api/exercises")
    public Exercise createExercise(@RequestBody Exercise request) {
        return exerciseService.createExercise(request.getQuestion(), request.getAnswer());
    }

    @GetMapping(value = "/getAll")
    public Iterable<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @RequestMapping("/search/{Id}")
    private Exercise getExerciseById(@PathVariable("Id") String Id) {
        return exerciseService.getExerciseById(Id);
    }

    // Backend
    @GetMapping(value = "/checkSubject/{Id}")
    public ResponseEntity<?> checkExerciseExists(@PathVariable String Id) {
        Iterable<Exercise> exercises = getAllExercises();
        boolean checkExerciseExists = false;
        String Subject = null;
        String Answer = null;
        String Question = null;
        String number = null;

        for (Exercise exercise : exercises) {
            if (exercise.getId().equals(Id)) {
                checkExerciseExists = true;
                Subject = exercise.getSubject();
                Answer = exercise.getAnswer();
                Question = exercise.getQuestion();
                number = exercise.getId();
                break;
            }
        }

        if (checkExerciseExists) {
            return ResponseEntity.ok(number + " " + Subject + " " + Question + " " + Answer);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Exercise does not exist");
        }

    }

    //Get all entries in database and return them as a list


    // Get question
    @GetMapping(value = "/getQuestion")
    public ResponseEntity<?> getQuestion() {
        Iterable<Exercise> exercises = getAllExercises();
        String Question = null;

        for (Exercise exercise : exercises)
        {
                Question = exercise.getQuestion();
                break;
            }
        return ResponseEntity.ok(Question);
    }

    // Get answer
    @GetMapping(value = "/getAnswer")
    public ResponseEntity<?> getAnswer() {
        Iterable<Exercise> exercises = getAllExercises();
        String Answer = null;

        for (Exercise exercise : exercises)
        {
                Answer = exercise.getAnswer();
                break;
            }
        return ResponseEntity.ok(Answer);
    }

    // Get subject
    @GetMapping(value = "/getSubject")
    public ResponseEntity<?> getSubject() {
        Iterable<Exercise> exercises = getAllExercises();
        String Subject = null;

        for (Exercise exercise : exercises)
        {
                Subject = exercise.getSubject();
                break;
            }
        return ResponseEntity.ok(Subject);
    }

    // Get status
    @GetMapping(value = "/getStatus")
    public ResponseEntity<?> getStatus() {
        Iterable<Exercise> exercises = getAllExercises();
        String Status = null;

        for (Exercise exercise : exercises)
        {
                Status = exercise.getStatus();
                break;
            }
        return ResponseEntity.ok(Status);
    }





}
