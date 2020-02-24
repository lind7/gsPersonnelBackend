package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.PersonnelServiceRepository;
import com.uni2grow.gspersonnel.entities.PersonnelService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonnelServiceRestService implements IpersonnelServiceRestService {
    private PersonnelServiceRepository personnelServiceRepository;

    public PersonnelServiceRestService(PersonnelServiceRepository personnelServiceRepository) {
        this.personnelServiceRepository = personnelServiceRepository;
    }

    @Override
    public List<PersonnelService> getPersonnelService() {
        return this.personnelServiceRepository.findAll();
    }

    @Override
    public PersonnelService addPersonnelService(PersonnelService personnel_service) {
        return this.personnelServiceRepository.save(personnel_service);
    }

    @Override
    public PersonnelService updatePersonnelService(PersonnelService personnel_service) {
        return this.personnelServiceRepository.save(personnel_service);
    }
}
