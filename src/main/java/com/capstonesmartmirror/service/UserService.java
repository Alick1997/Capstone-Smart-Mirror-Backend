package com.capstonesmartmirror.service;

import com.capstonesmartmirror.model.User;
import com.capstonesmartmirror.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public User getUserById(String userId) {
        var user = userRepository.findByUserId(userId);
        System.err.println("user id: " + user);
        return user;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
