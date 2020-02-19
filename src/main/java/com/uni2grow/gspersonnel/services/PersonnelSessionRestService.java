package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.PersonnelSessionRepository;
import com.uni2grow.gspersonnel.entities.Personnel_Session;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonnelSessionRestService implements IpersonnelSessionRestService {
    private PersonnelSessionRepository personnelSessionRepository;

    public PersonnelSessionRestService(PersonnelSessionRepository personnelSessionRepository) {
        this.personnelSessionRepository = personnelSessionRepository;
    }

    @Override
    public List<Personnel_Session> getPersonnelSession() {
        return this.personnelSessionRepository.findAll();
    }

    @Override
    public Personnel_Session addPersonnelSession(Personnel_Session personnel_Session) {
        return this.personnelSessionRepository.save(personnel_Session);
    }

    @Override
    public Personnel_Session updatePersonnelSession(Personnel_Session personnel_Session) {
        return this.personnelSessionRepository.save(personnel_Session);
    }
}
