package com.uni2grow.gspersonnel.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Personnel_Session {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
  private Date startDate;
    @Temporal(TemporalType.DATE)
  private Date endDate;
  @ManyToOne(fetch = FetchType.LAZY)
  private Session session;
    @ManyToOne(fetch = FetchType.LAZY)
  private Personnel Personnel;


    public Personnel_Session(Date startDate, Date endDate, Session session, Personnel personnel) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.session = session;
        Personnel = personnel;
    }
    public Personnel_Session(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public com.uni2grow.gspersonnel.entities.Personnel getPersonnel() {
        return Personnel;
    }

    public void setPersonnel(com.uni2grow.gspersonnel.entities.Personnel personnel) {
        Personnel = personnel;
    }


}
