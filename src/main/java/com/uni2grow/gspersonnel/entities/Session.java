package com.uni2grow.gspersonnel.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
//@Table(name = "gs_Session")
public class Session implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idSession;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private boolean closed;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="session")
    private List<Personnel> personnel;


    public Session() {
    }
    public Session(String name, Date startDate, Date endDate, boolean closed) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.closed = closed;
    }

    public Long getIdSession() {
        return idSession;
    }

    public void setIdSession(Long id) {
        this.idSession = id;
    }

    public String getName() {
        return name;
    }
    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Personnel> personnel) {
        this.personnel = personnel;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Session)) return false;
        Session session = (Session) o;
        return getIdSession().equals(session.getIdSession());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSession());
    }
}
