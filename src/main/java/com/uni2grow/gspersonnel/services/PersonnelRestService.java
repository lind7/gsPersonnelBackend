package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.PersonnelRepository;
import com.uni2grow.gspersonnel.entities.Personnel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnel")
public class PersonnelRestService {
private PersonnelRepository personnelRepository;

    public PersonnelRestService(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }
    @GetMapping
    public List<Personnel> getPersonnel() {
        return  personnelRepository.findAll();
    }
    @PostMapping
    public Personnel addPersonnel(@RequestBody  Personnel personnel) {
        return  personnelRepository.save(personnel);
    }
}
