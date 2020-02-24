package com.uni2grow.gspersonnel.controllers;
import com.uni2grow.gspersonnel.entities.Personnel;
import com.uni2grow.gspersonnel.services.PersonnelRestService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {
    private PersonnelRestService personnelRestService;

    public PersonnelController(PersonnelRestService personnelRestService) {
        this.personnelRestService = personnelRestService;
    }
    @GetMapping("/all")
    public List<Personnel> getPersonnel() {
        return  personnelRestService.getPersonnel();
    }
    @PostMapping("/add")
    public Personnel addPersonnel(@RequestBody Personnel personnel) {
        return  personnelRestService.addPersonnel(personnel);
    }
    @PutMapping("/update")
    public Personnel updatePersonnel(@RequestBody Personnel personnel) {
        return  personnelRestService.updatePersonnel(personnel);
    }

}


