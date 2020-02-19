package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.PersonnelTypeRepository;
import com.uni2grow.gspersonnel.entities.PersonnelType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonnelTypeRestService implements IPersonnelTypeRestService {
    private PersonnelTypeRepository personnelTypeRepository;

    public PersonnelTypeRestService(PersonnelTypeRepository personnelTypeRepository) {
        this.personnelTypeRepository = personnelTypeRepository;
    }

    @Override
    public List<PersonnelType> getPersonnelType() {
        return this.personnelTypeRepository.findAll();
    }

    @Override
    public PersonnelType addPersonnelType(PersonnelType personnelType) {
        return this.personnelTypeRepository.save(personnelType);
    }

    @Override
    public PersonnelType updatePersonnelType(PersonnelType personnelType) {
        return this.personnelTypeRepository.save(personnelType);
    }
}
