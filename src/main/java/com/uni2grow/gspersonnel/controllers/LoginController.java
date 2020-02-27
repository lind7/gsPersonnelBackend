package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.entities.Login;
import com.uni2grow.gspersonnel.services.LoginServiceRest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class LoginController {
    private LoginServiceRest loginServiceRest;

    public LoginController(LoginServiceRest loginServiceRest) {

        this.loginServiceRest = loginServiceRest;
    }
    @PostMapping
    public Login login(Login login){
      return  this.loginServiceRest.login(login);

    }
}
