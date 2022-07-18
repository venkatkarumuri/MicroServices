package com.sta.authservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthController {
    @GetMapping("status")
    public String getUserWithDepartment() {
        return "Welcome to STA Application.... Response from Auth Service Through Gateway";
    }
}
