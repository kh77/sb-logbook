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
@RequestMapping("/admin")
public class AdminController {


    @GetMapping("/health/info")
    public String getHealthInfo() {
        return "UP";
    }
}
