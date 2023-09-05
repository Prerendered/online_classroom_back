package com.example.writeex;

import Entity.Exercise;
import Repo.ExerciseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;






@SpringBootApplication
@ComponentScan({"Controller", "Service", "Repo", "Entity", "com.example.writeex"})
public class WriteExApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WriteExApplication.class, args);

        ExerciseRepository exerciseRepository = context.getBean(ExerciseRepository.class);

        Exercise exercise = new Exercise();
        exercise.setQuestion("What is 2 + 2?");
        exercise.setAnswer("4");

        exerciseRepository.save(exercise);

        context.close();
    }
}
