package com.example.UserAuthentication.Service;

import com.example.UserAuthentication.Entity.User;
import com.example.UserAuthentication.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public void save_Update(User users) {
        repo.save(users);
    }

    public Iterable<User> listAll() {
        return this.repo.findAll();
    }

    public void deleteUser(String id) {
        repo.deleteById(id);
    }

    public User getUserById(String id) {
        return repo.findById(id).get();
    }

    public void deleteByTitle(String title) {
    }
}
