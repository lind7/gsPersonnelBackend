package com.uni2grow.gspersonnel.services;
import com.uni2grow.gspersonnel.entities.PersonnelSession;
import java.util.List;

public interface IpersonnelSessionRestService {
    List<PersonnelSession> getPersonnelSession();
    PersonnelSession addPersonnelSession(PersonnelSession personnel_Session);
    PersonnelSession updatePersonnelSession(PersonnelSession personnel_Session);
}
