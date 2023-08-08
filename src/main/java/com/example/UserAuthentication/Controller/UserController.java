package com.example.UserAuthentication.Controller;

import com.example.UserAuthentication.Entity.User;
import com.example.UserAuthentication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/users")

public class UserController {
    @Autowired
    private UserService userServices;

    @PostMapping(value= "/save")
    public String saveUser(@RequestBody User users)
    {
        userServices.save_Update(users);
        return  users.get_id();
    }

    @GetMapping(value= "/getAll")
    public Iterable <User>getUsers()
    {
        return userServices.listAll();
    }

    @PutMapping(value= "/edit/{id}")
    public User update(@RequestBody User user,@PathVariable(name="id") String _id)
    {
        user.set_id(_id);
        userServices.save_Update(user);
        return  user;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") String _id)
    {
        userServices.deleteUser(_id);
    }

   @RequestMapping("/search/{id}")
   private User getUser(@PathVariable(name="id") String userid)
   {
       return userServices.getUserById(userid);
   }

}
