package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.PersonnelRepository;
import com.uni2grow.gspersonnel.entities.Personnel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PersonnelRestService implements IpersonnelRestService {
private PersonnelRepository personnelRepository;

    public PersonnelRestService(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public List<Personnel> getPersonnel() {
       return this.personnelRepository.findAll();
    }

    @Override
    public Personnel addPersonnel(Personnel produit) {
        return this.personnelRepository.save(produit);
    }

    @Override
    public Personnel updatePersonnel(Personnel produit) {
        return this.personnelRepository.save(produit);
    }


}
