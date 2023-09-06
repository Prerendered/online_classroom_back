package Controller;

import Entity.Exercise;
import Entity.ExerciseRequest;
import Service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping("/api/exercises")
    public Exercise createExercise(@RequestBody ExerciseRequest request) {
        return exerciseService.createExercise(request.getQuestion(), request.getAnswer());
    }
}
