package com.example.UserAuthentication.Service;

import com.example.UserAuthentication.Entity.Student;
import com.example.UserAuthentication.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public void save_Update(Student students) {
        repo.save(students);
    }

    public Iterable<Student> listAll() {
        return this.repo.findAll();
    }

    public void deleteStudent(String id) {
        repo.deleteById(id);
    }

    public Student getStudentById(String id) {
        return repo.findById(id).get();
    }
}
