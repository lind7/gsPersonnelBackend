package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.PersonnelServiceRepository;
import com.uni2grow.gspersonnel.entities.Personnel_Service;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonnelServiceRestService implements IpersonnelServiceRestService {
    private PersonnelServiceRepository personnelServiceRepository;

    public PersonnelServiceRestService(PersonnelServiceRepository personnelServiceRepository) {
        this.personnelServiceRepository = personnelServiceRepository;
    }

    @Override
    public List<Personnel_Service> getPersonnelService() {
        return this.personnelServiceRepository.findAll();
    }

    @Override
    public Personnel_Service addPersonnelService(Personnel_Service personnel_service) {
        return this.personnelServiceRepository.save(personnel_service);
    }

    @Override
    public Personnel_Service updatePersonnelService(Personnel_Service personnel_service) {
        return this.personnelServiceRepository.save(personnel_service);
    }
}
