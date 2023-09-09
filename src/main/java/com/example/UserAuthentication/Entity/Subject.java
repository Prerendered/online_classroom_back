package com.example.UserAuthentication.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Subjects")
public class Subject {
    @Id
    private String _id;
    private String SubjectName;
    private String SubjectCompletion;

    public Subject(String _id, String SubjectName, String SubjectCompletion) {
        this._id = _id;
        this.SubjectName = SubjectName;
        this.SubjectCompletion = SubjectCompletion;
    }

    
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public String getCompletion() {
        return SubjectCompletion;
    }

    public void setSubjectCompletion(String SubjectCompletion) {
        this.SubjectCompletion = SubjectCompletion;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "_id='" + _id + '\'' +
                ", SubjectName='" + SubjectName + '\'' +
                ", SubjectCompletion='" + SubjectCompletion + '\'' +
                '}';
    }
}
