package com.uni2grow.gspersonnel.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
//@Table(name = "gs_Department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

  //  @Column(nullable = false)
    private String name;
    private String description;
   // @OneToOne(fetch = FetchType.LAZY)
   // private Personnel headOfDepartment;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Personnel> personnels;

    public Department() {
    }
    public Department(String name, String description, Personnel headOfDepartment, List<Personnel> personnels) {
        this.name = name;
        this.description = description;
        //this.headOfDepartment = headOfDepartment;
        this.personnels = personnels;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(List<Personnel> personnels) {
        this.personnels = personnels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
