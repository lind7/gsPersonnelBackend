package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.entities.Personnel;

import java.util.List;

public interface IpersonnelRestService {
    List<Personnel> getPersonnel();
    Personnel addPersonnel(Personnel personnel);
    Personnel updatePersonnel(Personnel personnel);
}
