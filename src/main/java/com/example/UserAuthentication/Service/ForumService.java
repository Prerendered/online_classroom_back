package com.example.UserAuthentication.Service;

import com.example.UserAuthentication.Entity.Forum;
import com.example.UserAuthentication.Repo.ForumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ForumService
{
    @Autowired
    private ForumRepo repo;

    public void save_Update(Forum forums)
    {
        repo.save(forums);
    }

    public Iterable<Forum> listAll()
    {
        return this.repo.findAll();
    }

    public void deleteForum(String id)
    {
        repo.deleteById(id);
    }

    public Forum getForumById(String id)
    {
        return repo.findById(id).get();
    }


    public boolean checkForumExists(String id)
    {
        return repo.existsById(id);
    }

    // delete
    public void deleteForumPost(String id)
    {
        repo.deleteById(id);
    }

    // get by id
    public Forum getForumPostById(String id)
    {
        return repo.findById(id).get();
    }

    // check if exists
    public boolean checkForumPostExists(String id)
    {
        return repo.existsById(id);
    }

    // get forum post by user
    public Iterable<Forum> getForumPostByUser(String user)
    {
        return repo.findByUser(user);
    }

}
