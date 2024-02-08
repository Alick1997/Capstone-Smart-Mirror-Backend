package com.capstonesmartmirror.controller;

import com.capstonesmartmirror.model.User;
import com.capstonesmartmirror.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mobileApp")
@RequiredArgsConstructor
public class mobileController {

    private final UserService userService;

    @GetMapping("/profile/{userId}")
    public User getUser(@PathVariable String userId) {
        System.err.println("Userid is: " + userId);
        var user = userService.getUserById(userId);
        System.err.println("User is: " + user.getName());
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
