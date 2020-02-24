package com.uni2grow.gspersonnel.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
//@Table(name = "gs_Personnel_service")
public class PersonnelService implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
  //  @Column(nullable = false)
    private Long id;
    @ManyToOne
   // @JoinColumn(nullable = false)
    private Services services;

  //  @JoinColumn(nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Personnel personnel;
  //  @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Session session;


    public PersonnelService() {
    }
    public PersonnelService(Services services, Personnel personnel, Session session) {
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
        if (!(o instanceof PersonnelService)) return false;
        PersonnelService that = (PersonnelService) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
