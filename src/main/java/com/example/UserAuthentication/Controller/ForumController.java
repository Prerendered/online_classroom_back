package com.example.UserAuthentication.Controller;

// Controller for forum
// Purpose: to create a forum for users to post questions and answers
//          to other users' questions
// Methods:
//          - saveForumPost: saves a forum post to the database
//          - getForumPosts: gets all forum posts from the database
//          - updateForumPost: updates a forum post in the database
//          - deleteForumPost: deletes a forum post from the database
//          - getForumPost: gets a forum post from the database
//          - checkForumPostExists: checks if a forum post exists in the database
//          - getForumPostByUser: gets all forum posts by a user from the database
//          - getForumPostByTitle: gets all forum posts by title from the database
//          - getForumPostByCategory: gets all forum posts by category from the database
//          - getForumPostByDate: gets all forum posts by date from the database
//          - getForumPostByAnswer: gets all forum posts by answer from the database

import com.example.UserAuthentication.Entity.Forum;
import com.example.UserAuthentication.Service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/forum")

public class ForumController{

    @Autowired
    private ForumService forumServices;

    // save forum post into database
    @PostMapping(value= "/save")
    public String saveForumPost(@RequestBody Forum forum)
    {
        forumServices.save_Update(forum);
        return forum.get_id();
    }

    // get all forum posts
    @GetMapping(value= "/getAll")
    public Iterable <Forum>getForumPosts()
    {
        return forumServices.listAll();
    }

    // update forum post by id
    @PutMapping(value= "/edit/{id}")
    public Forum updateForumPost(@RequestBody Forum forum, @PathVariable(name="id") String _id)
    {
        forum.set_id(_id);
        forumServices.save_Update(forum);
        return  forum;
    }

    // update the answer of a forum post by id
    @PutMapping(value= "/edit/answer/{id}/{answer}")
    public Forum updateForumPostAnswer(@PathVariable(name="id") String _id, @PathVariable(name="answer") String answer)
    {
        Forum forum = forumServices.getForumPostById(_id);
        forum.set_answer(answer);
        forumServices.save_Update(forum);
        return  forum;
    }

    @DeleteMapping("/deleteByTitle/{title}")
    public void deleteByTitle(@PathVariable("title") String title)
    {
        forumServices.deleteByTitle(title);
    }


    // delete forum post by id
    @DeleteMapping("/delete/{id}")
    public void deleteForumPost(@PathVariable("id") String _id)
    {
        forumServices.deleteForumPost(_id);
    }

    // get forum post by id
    @RequestMapping("/search/{id}")
    private Forum getForumPost(@PathVariable(name="id") String forumid)
    {
        return forumServices.getForumPostById(forumid);
    }

    // sort subjects by category
    @RequestMapping("/search/category/{category}")
    private Iterable <Forum> getForumPostByCategory(@PathVariable(name="category") String category)
    {
        return forumServices.getForumPostByCategory(category);
    }

    // check if forum post exists by id
    @RequestMapping("/exists/{id}")
    private boolean checkForumPostExists(@PathVariable(name="id") String forumid)
    {
        return forumServices.checkForumPostExists(forumid);
    }

    // get all forum posts by user
    @RequestMapping("/search/user/{user}")
    private Iterable <Forum> getForumPostByUser(@PathVariable(name="user") String user)
    {
        return forumServices.getForumPostByUser(user);
    }

    @GetMapping("/search/categories")
    public Iterable<String> getForumPostCategories() {
        return forumServices.getForumPostCategories();
    }


}
