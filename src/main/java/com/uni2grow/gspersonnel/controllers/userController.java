package com.uni2grow.gspersonnel.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/user")
public class userController {
    public Principal user(Principal user) {
        return user;
    }

}
