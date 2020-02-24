package com.uni2grow.gspersonnel.controllers;
import com.uni2grow.gspersonnel.entities.PersonnelType;
import com.uni2grow.gspersonnel.services.PersonnelTypeRestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/personnelType")
public class PersonnelTypeController {
    private PersonnelTypeRestService personnelTypeRestService;

    public PersonnelTypeController(PersonnelTypeRestService personnelTypeRestService) {
        this.personnelTypeRestService = personnelTypeRestService;
    }
    @GetMapping("/all")
    public List<PersonnelType> getPersonnelType() {
        return  personnelTypeRestService.getPersonnelType();
    }
    @PostMapping("/add")
    public PersonnelType addPersonnelType(@RequestBody PersonnelType personnelType) {
        return  personnelTypeRestService.addPersonnelType(personnelType);
    }
    @PutMapping("/update")
    public PersonnelType updatePersonnelType(@RequestBody PersonnelType personnelType) {
        return  personnelTypeRestService.updatePersonnelType(personnelType);
    }
}
