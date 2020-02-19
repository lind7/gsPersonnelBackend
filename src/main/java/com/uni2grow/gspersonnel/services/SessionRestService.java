package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.SessionRepository;
import com.uni2grow.gspersonnel.entities.Session;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SessionRestService implements IsessionRestService {
    private SessionRepository sessionRepository;

    public SessionRestService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public List<Session> getSession() {
        return this.sessionRepository.findAll();
    }

    @Override
    public Session addSession(Session session) {
        return this.sessionRepository.save(session);
    }

    @Override
    public Session updateSession(Session session) {
        return this.sessionRepository.save(session);
    }
}
