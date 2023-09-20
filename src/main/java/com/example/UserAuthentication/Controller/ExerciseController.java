package com.example.UserAuthentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.UserAuthentication.Entity.Exercise;
import com.example.UserAuthentication.Service.ExerciseService;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/exercises")

public class ExerciseController {
    @Autowired
    private ExerciseService exerciseServices;

    // save user into database
    @PostMapping(value= "/save")
    public String saveUser(@RequestBody Exercise exercises)
    {
        exerciseServices.save_Update(exercises);
        return exercises.get_id();
    }

    // get all users
    @GetMapping(value= "/getAll")
    public Iterable <Exercise>getUsers()
    {
        return exerciseServices.listAll();
    }

    // update user by id
    @PutMapping(value= "/edit/{id}")
    public Exercise update(@RequestBody Exercise exercise,@PathVariable(name="id") String _id)
    {
        exercise.set_id(_id);
        exerciseServices.save_Update(exercise);
        return  exercise;
    }

    // delete user by id
    @DeleteMapping("/delete/{id}")
    public void deleteExercise(@PathVariable("id") String _id)
    {
        exerciseServices.deleteExercise(_id);
    }

    // get user by id
   @RequestMapping("/search/{id}")
   private Exercise getExercise(@PathVariable(name="id") String exerciseid)
   {
       return exerciseServices.getSubjectById(exerciseid);
   }
   
}
