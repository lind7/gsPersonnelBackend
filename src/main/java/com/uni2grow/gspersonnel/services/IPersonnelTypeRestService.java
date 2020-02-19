package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.entities.PersonnelType;

import java.util.List;

public interface IPersonnelTypeRestService {
    List<PersonnelType> getPersonnelType();
    PersonnelType addPersonnelType(PersonnelType personnelType);
    PersonnelType updatePersonnelType(PersonnelType personnelType);
}
