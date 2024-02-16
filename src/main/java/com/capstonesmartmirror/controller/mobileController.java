package com.capstonesmartmirror.controller;

import com.capstonesmartmirror.model.User;
import com.capstonesmartmirror.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mobileApp")
@RequiredArgsConstructor
public class mobileController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId) {
        System.err.println("Userid is: " + userId);
        var user = userService.getUserById(userId);
        System.err.println("User is: " + user.getName());
        return user;
    }

    @PutMapping("/users/{userId}")
    public User updateUser(
            @PathVariable String userId,
            @RequestBody User user
    ) {
        return userService.saveUser(user);
    }

    @PostMapping("/users")
    public User createUser(User user) {
        return userService.saveUser(user);
    }
}
