package com.example.UserAuthentication.Service;

import com.example.UserAuthentication.Entity.Subject;
import com.example.UserAuthentication.Repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepo repo;

    public void save_Update(Subject subjects) {
        repo.save(subjects);
    }

    public Iterable<Subject> listAll() {
        return this.repo.findAll();
    }

    public void deleteSubject(String id) {
        repo.deleteById(id);
    }

    public Subject getSubjectById(String id) {
        return repo.findById(id).get();
    }
}
