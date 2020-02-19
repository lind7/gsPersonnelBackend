package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.entities.Personnel;
import com.uni2grow.gspersonnel.entities.Session;
import com.uni2grow.gspersonnel.services.SessionRestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/session")
public class SessionController {
    private SessionRestService sessionRestService;

    public SessionController(SessionRestService sessionRestService) {
        this.sessionRestService = sessionRestService;
    }
    @GetMapping
    public List<Session> getSession() {
        return  this.sessionRestService.getSession();
    }
    @PostMapping
    public Session addSession(@RequestBody Session session) {
        return  this.sessionRestService.addSession(session);
    }
    @PutMapping
    public Session updateSession(@RequestBody Session session) {
        return  this.sessionRestService.updateSession(session);
    }

}
