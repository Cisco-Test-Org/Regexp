package com.cisco.regexp.api;

import com.cisco.regexp.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
    // get all users
    @GetMapping
    public List<User> getUserList() {
        return null;
    }
    // get a user
    @GetMapping
    public User getUser(@PathVariable String id) {
        return null;
    }
    // save user
    @PostMapping
    public void saveUser(@RequestBody User user) {

    }
    // update user
    @PutMapping
    public void updateUser(@RequestBody User user, @PathVariable String id) {

    }
    // delete user
    @DeleteMapping
    public void deleteUser(@PathVariable String id) {

    }
}
