package com.example.writeex.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Exercises")
public class Exercise {
    @Id
    private String id;
    private String question;
    private String answer;

    private String status;

    private String subject;

    private String completed;

    public Exercise(String Id , String Question , String Answer , String subject , String status){
        this.id = Id;
        this.question = Question;
        this.answer = Answer;
        this.subject = subject;
        this.status = status;
    }

    public Exercise() {

    }

    // Constructors, getters, and setters

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getStatus() {
        return completed;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId2(String id) {
        this.id = id;
    }

    public void setId3(String id) {
        this.id = id;
    }

    public void setId4(String id) {
        this.id = id;
    }

    public void setId5(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public void setQuestion2(String question) {
        this.question = question;
    }

    public void setQuestion3(String question) {
        this.question = question;
    }

    public void setQuestion4(String question) {
        this.question = question;
    }

    public void setQuestion5(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getAnswer2() {
        return answer;
    }

    public String getAnswer3() {
        return answer;
    }

    public String getAnswer4() {
        return answer;
    }

    public String getAnswer5() {
        return answer;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setAnswer2(String answer) {
        this.answer = answer;
    }

    public void setAnswer3(String answer) {
        this.answer = answer;
    }

    public void setAnswer4(String answer) {
        this.answer = answer;
    }

    public void setAnswer5(String answer) {
        this.answer = answer;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSubject2(String subject) {
        this.subject = subject;
    }

    public void setSubject3(String subject) {
        this.subject = subject;
    }

    public void setSubject4(String subject) {
        this.subject = subject;
    }

    public void setSubject5(String subject) {
        this.subject = subject;
    }



    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public void setCompleted2(String completed) {
        this.completed = completed;
    }

    public void setCompleted3(String completed) {
            this.completed = completed;
        }

    public void setCompleted4(String completed) {
            this.completed = completed;
        }

    public void setCompleted5(String completed) {
            this.completed = completed;
        }

}

