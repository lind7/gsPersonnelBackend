package com.uni2grow.gspersonnel.services;
import com.uni2grow.gspersonnel.entities.Session;

import java.util.List;

public interface IsessionRestService {
    List<Session> getSession();
    Session addSession(Session session);
    Session updateSession(Session session);
}
