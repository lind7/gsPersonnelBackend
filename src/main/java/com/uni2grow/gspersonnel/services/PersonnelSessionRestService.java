package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.PersonnelSessionRepository;
import com.uni2grow.gspersonnel.entities.PersonnelSession;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonnelSessionRestService implements IpersonnelSessionRestService {
    private PersonnelSessionRepository personnelSessionRepository;

    public PersonnelSessionRestService(PersonnelSessionRepository personnelSessionRepository) {
        this.personnelSessionRepository = personnelSessionRepository;
    }

    @Override
    public List<PersonnelSession> getPersonnelSession() {
        return this.personnelSessionRepository.findAll();
    }

    @Override
    public PersonnelSession addPersonnelSession(PersonnelSession personnel_Session) {
        return this.personnelSessionRepository.save(personnel_Session);
    }

    @Override
    public PersonnelSession updatePersonnelSession(PersonnelSession personnel_Session) {
        return this.personnelSessionRepository.save(personnel_Session);
    }
}
