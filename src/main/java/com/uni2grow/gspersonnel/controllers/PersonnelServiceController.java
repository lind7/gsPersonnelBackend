package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.entities.PersonnelService;
import com.uni2grow.gspersonnel.services.PersonnelServiceRestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/personnelService")
public class PersonnelServiceController {
    private PersonnelServiceRestService personnelServiceRestService;

    public PersonnelServiceController(PersonnelServiceRestService personnelServiceRestService) {
        this.personnelServiceRestService = personnelServiceRestService;
    }

    @GetMapping("/add")
    public List<PersonnelService> getPersonnelService() {
        return  this.personnelServiceRestService.getPersonnelService();
    }
    @PostMapping("/add")
    public PersonnelService addPersonnelService(@RequestBody PersonnelService personnel_Service) {
        return  this.personnelServiceRestService.addPersonnelService(personnel_Service);
    }
    @PutMapping("/update")
    public PersonnelService updatePersonnelService(@RequestBody PersonnelService personnel_Service) {
        return  this.personnelServiceRestService.updatePersonnelService(personnel_Service);
    }
}
