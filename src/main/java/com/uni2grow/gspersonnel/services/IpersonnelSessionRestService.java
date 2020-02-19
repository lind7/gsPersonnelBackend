package com.uni2grow.gspersonnel.services;
import com.uni2grow.gspersonnel.entities.Personnel_Session;
import java.util.List;

public interface IpersonnelSessionRestService {
    List<Personnel_Session> getPersonnelSession();
    Personnel_Session addPersonnelSession(Personnel_Session personnel_Session);
    Personnel_Session updatePersonnelSession(Personnel_Session personnel_Session);
}
