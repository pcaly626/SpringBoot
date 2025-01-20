package com.fleshlight.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user); // Save a new user to the database
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll(); // Return all users as a JSON list
    }
}
