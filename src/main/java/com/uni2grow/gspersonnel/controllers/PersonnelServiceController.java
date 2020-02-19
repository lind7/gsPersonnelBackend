package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.entities.Department;
import com.uni2grow.gspersonnel.entities.Personnel_Service;
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

    @GetMapping
    public List<Personnel_Service> getPersonnelService() {
        return  this.personnelServiceRestService.getPersonnelService();
    }
    @PostMapping
    public Personnel_Service addPersonnelService(@RequestBody Personnel_Service personnel_Service) {
        return  this.personnelServiceRestService.addPersonnelService(personnel_Service);
    }
    @PutMapping
    public Personnel_Service updatePersonnelService(@RequestBody Personnel_Service personnel_Service) {
        return  this.personnelServiceRestService.updatePersonnelService(personnel_Service);
    }
}
