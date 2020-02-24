package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.entities.PersonnelSession;
import com.uni2grow.gspersonnel.services.PersonnelSessionRestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/personnelSession")
public class PersonnelSessionController {
 private PersonnelSessionRestService personnelSessionRestService;

    public PersonnelSessionController(PersonnelSessionRestService personnelSessionRestService) {
        this.personnelSessionRestService = personnelSessionRestService;
    }

    @GetMapping("/all")
    public List<PersonnelSession> getPersonnelSession() {
        return  this.personnelSessionRestService.getPersonnelSession();
    }
    @PostMapping("/add")
    public PersonnelSession addPersonnelSession(@RequestBody PersonnelSession personnelSession) {
        return  personnelSessionRestService.addPersonnelSession(personnelSession);
    }
    @PutMapping("/update")
    public PersonnelSession updatePersonnelSession(@RequestBody PersonnelSession department) {
        return  personnelSessionRestService.updatePersonnelSession(department);
    }
}
