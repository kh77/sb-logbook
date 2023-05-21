package com.sm.controller;

import com.sm.model.User;
import com.sm.model.UserRequest;
import com.sm.model.UserResponse;
import com.sm.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }

    @GetMapping("/{id}")
    public List<User> getUsers(@PathVariable Long id) {
        return userRepository.getAllUsers();
    }

    @PostMapping
    public UserResponse getUsers(@RequestBody UserRequest request, @RequestHeader("APP_ID") String appId) {
        User user = userRepository.getAllUsers().get(0);
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(user, userResponse);
        return userResponse;
    }
}
