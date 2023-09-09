package com.example.UserAuthentication.Service;

import com.example.UserAuthentication.Entity.Topic;
import com.example.UserAuthentication.Repo.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired
    private TopicRepo repo;

    public void save_Update(Topic subjects) {
        repo.save(subjects);
    }

    public Iterable<Topic> listAll() {
        return this.repo.findAll();
    }

    public void deleteTopic(String id) {
        repo.deleteById(id);
    }

    public Topic getTopicById(String id) {
        return repo.findById(id).get();
    }    
}
