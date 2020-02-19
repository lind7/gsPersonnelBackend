package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.dao.PersonnelSessionRepository;
import com.uni2grow.gspersonnel.entities.Department;
import com.uni2grow.gspersonnel.entities.Personnel_Service;
import com.uni2grow.gspersonnel.entities.Personnel_Session;
import com.uni2grow.gspersonnel.services.PersonnelSessionRestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/personnelSession")
public class PersonnelSessionController {
 private PersonnelSessionRestService personnelSessionRestService;
    @GetMapping
    public List<Personnel_Session> getPersonnelSession() {
        return  this.personnelSessionRestService.getPersonnelSession();
    }
    @PostMapping
    public Personnel_Session addPersonnelSession(@RequestBody Personnel_Session department) {
        return  personnelSessionRestService.addPersonnelSession(department);
    }
    @PutMapping
    public Personnel_Session updatePersonnelSession(@RequestBody Personnel_Session department) {
        return  personnelSessionRestService.updatePersonnelSession(department);
    }
}
