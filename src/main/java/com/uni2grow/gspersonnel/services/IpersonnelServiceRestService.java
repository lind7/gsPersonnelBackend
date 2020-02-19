package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.entities.Personnel_Service;
import java.util.List;

public interface IpersonnelServiceRestService {
    List<Personnel_Service> getPersonnelService();
    Personnel_Service addPersonnelService(Personnel_Service personnel_service);
    Personnel_Service updatePersonnelService(Personnel_Service personnel_service);

}
