package com.uni2grow.gspersonnel.entities;

import com.uni2grow.gspersonnel.enums.EnumMaritalStatus;
import com.uni2grow.gspersonnel.enums.EnumSex;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
//@Table(name = "gs_Personnnel")
public class Personnel extends Personne implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String nid;
    private int seniority;
    @ManyToOne(fetch = FetchType.LAZY)
    private Grade grade;
    @Enumerated(EnumType.STRING)
    private EnumMaritalStatus maritalStatus;
    private boolean permanent;
    private int numberOfChildren;
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonnelType personnelType;
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

  //  @OneToOne(mappedBy = "headOfDepartment", fetch = FetchType.LAZY)
   // private Department departmentHead;

    private boolean isHead;

    @ManyToOne(fetch = FetchType.LAZY)
    private Session session;


    public Personnel(String firstName, String lastName, EnumSex sex, Date dateOfBirth, String placeOfBirth, String address,
                     String phonePrincipal, String phoneSecondary, String email, String nid, int seniority, boolean permanent,
                     EnumMaritalStatus maritalStatus, int numberOfChildren, boolean isHead, Grade grade, Session session,
                     PersonnelType personnelType, Department department ) {
        super(firstName, lastName,  sex,  dateOfBirth, placeOfBirth, address, phonePrincipal, phoneSecondary, email);
        this.nid = nid;
        this.seniority = seniority;
        this.grade = grade;
        this.permanent = permanent;
        this.maritalStatus = maritalStatus;
        this.numberOfChildren = numberOfChildren;
        this.personnelType = personnelType;
        this.department = department;
        this.isHead = isHead;
        this.session = session;
    }
    public Personnel(String firstName, String lastName, EnumSex sex, Date dateOfBirth, String placeOfBirth, String address,
                     String phonePrincipal, String phoneSecondary, String email, String nid, int seniority, boolean permanent,
                     EnumMaritalStatus maritalStatus, int numberOfChildren, boolean isHead ) {
        super(firstName, lastName,  sex,  dateOfBirth, placeOfBirth, address, phonePrincipal, phoneSecondary, email);
        this.nid = nid;
        this.seniority = seniority;
        this.permanent = permanent;
        this.maritalStatus = maritalStatus;
        this.numberOfChildren = numberOfChildren;
        this.isHead = isHead;

    }

    public Personnel() {
       super();
    }


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
    public EnumMaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }


    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setMaritalStatus(EnumMaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }



    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public PersonnelType getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(PersonnelType personnelType) {
        this.personnelType = personnelType;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }


    public boolean isHead() {
        return isHead;
    }

    public void setHead(boolean head) {
        isHead = head;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personnel)) return false;
        Personnel personnel = (Personnel) o;
        return Objects.equals(getId(), personnel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
