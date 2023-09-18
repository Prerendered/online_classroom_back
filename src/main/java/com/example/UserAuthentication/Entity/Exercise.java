package com.example.UserAuthentication.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Exercises")
public class Exercise {
    @Id
    private String _id;
    private String question;
    private String subject;
    private String completed;

    private String answer; // added by Emmanuel

    public Exercise(String _id, String question, String answer, String subject, String completed) {
        this._id = _id;
        this.question = question;
        this.answer = answer; // added by Emmanuel
        this.subject = subject;
        this.completed = completed;

    }

    
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_question() {
        return question;
    }

    public void set_question(String question) {
        this.question = question;
    }

    public String get_answer() { // added by Emmanuel
        return answer;
    }

    public void set_answer(String answer) { // added by Emmanuel
        this.answer = answer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "_id='" + _id + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", subject='" + subject + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }
    
}
