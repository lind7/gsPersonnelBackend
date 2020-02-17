package com.uni2grow.gspersonnel.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
//@Table(name = "gs_Personnel_service")
public class Personnel_Service {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Service service;
    @OneToOne(mappedBy = "personnelService")
    private Personnel personnel;
    @ManyToOne
    private Session session;


    public Personnel_Service() {
    }
    public Personnel_Service(Service service, Personnel personnel, Session session) {
        this.service = service;
        this.personnel = personnel;
        this.session = session;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personnel_Service)) return false;
        Personnel_Service that = (Personnel_Service) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
