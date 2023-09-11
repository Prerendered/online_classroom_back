package com.example.writeex;

import com.example.writeex.Entity.Exercise;
import com.example.writeex.Repo.ExerciseRepository;
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
        Exercise exercise2 = new Exercise();
        Exercise exercise3 = new Exercise();
        Exercise exercise4 = new Exercise();
        Exercise exercise5 = new Exercise();


        exercise.setId("1");
        exercise.setQuestion("What is 144/4?");
        exercise.setAnswer("36");
        exercise.setSubject("Math");
        exercise.setCompleted("false");

        exercise2.setId2("2");
        exercise2.setQuestion2("What is 12x12?");
        exercise2.setAnswer2("144");
        exercise2.setSubject2("Math");
        exercise2.setCompleted2("false");


        exercise3.setId3("3");
        exercise3.setQuestion3("What is 13x12?");
        exercise3.setAnswer3("156");
        exercise3.setSubject("Math");
        exercise3.setCompleted3("false");

        exercise4.setId4("4");
        exercise4.setQuestion4("What is 14x12?");
        exercise4.setAnswer4("168");
        exercise4.setSubject("Math");
        exercise4.setCompleted4("false");

        exercise5.setId5("5");
        exercise5.setQuestion5("What is 15x12?");
        exercise5.setAnswer5("180");
        exercise5.setSubject("Math");
        exercise5.setCompleted5("false");


        exerciseRepository.save(exercise);
        exerciseRepository.save(exercise2);
        exerciseRepository.save(exercise3);
        exerciseRepository.save(exercise4);
        exerciseRepository.save(exercise5);

        context.close();
    }
}
