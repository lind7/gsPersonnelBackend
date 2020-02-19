package com.uni2grow.gspersonnel.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "gs_Personnel_service")
public class Personnel_Service {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Services services;
    @OneToOne(fetch = FetchType.LAZY)
    private Personnel personnel;
    @ManyToOne(fetch = FetchType.LAZY)
    private Session session;


    public Personnel_Service() {
    }
    public Personnel_Service(Services services, Personnel personnel, Session session) {
        this.services = services;
        this.personnel = personnel;
        this.session = session;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
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
