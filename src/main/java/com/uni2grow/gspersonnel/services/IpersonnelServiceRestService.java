package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.entities.PersonnelService;
import java.util.List;

public interface IpersonnelServiceRestService {
    List<PersonnelService> getPersonnelService();
    PersonnelService addPersonnelService(PersonnelService personnel_service);
    PersonnelService updatePersonnelService(PersonnelService personnel_service);

}
