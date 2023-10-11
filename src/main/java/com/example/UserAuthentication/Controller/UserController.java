package com.example.UserAuthentication.Controller;

import com.example.UserAuthentication.Entity.User;
import com.example.UserAuthentication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/users")

public class UserController {
    @Autowired
    private UserService userServices;

    // save user into database
    @PostMapping(value= "/save")
    public String saveUser(@RequestBody User users)
    {
        userServices.save_Update(users);
        return  users.get_id();
    }

    // get all users
    @GetMapping(value= "/getAll")
    public Iterable <User>getUsers()
    {
        return userServices.listAll();
    }

    // update user by id
    @PutMapping(value= "/edit/{id}")
    public User update(@RequestBody User user,@PathVariable(name="id") String _id)
    {
        user.set_id(_id);
        userServices.save_Update(user);
        return  user;
    }

    // delete user by id
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") String _id)
    {
        userServices.deleteUser(_id);
    }





    // get user by id
   @RequestMapping("/search/{id}")
   private User getUser(@PathVariable(name="id") String userid)
   {
       return userServices.getUserById(userid);
   }
   
   // backend
    @GetMapping(value = "/checkUser/{userName}&{password}")
    public ResponseEntity<?> checkUserExists(@PathVariable String userName, @PathVariable String password) {
        Iterable<User> users = userServices.listAll();
        boolean userExists = false;
        String userRole = null;
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                userExists = true;
                userRole = user.getRole();
                break; // Break the loop once the user is found
            }
        }

        if (userExists) {
            return ResponseEntity.ok(userRole);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }

}


//