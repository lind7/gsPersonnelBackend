package com.uni2grow.gspersonnel.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
//@Table(name = "gs_Grade")
public class Grade implements Serializable   {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
 //   @Column(nullable = false)
    private Long id;

  //  @Column(nullable = false)
    private String name;
    private String description;
    private int maxHoursPerWeek;

    public Grade() {
    }
    public Grade( String name, String description, int maxHoursPerWeek) {
    this.name = name;
    this.description =description;
    this.maxHoursPerWeek = maxHoursPerWeek;
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

    public int getMaxHoursPerWeek() {
        return maxHoursPerWeek;
    }

    public void setMaxHoursPerWeek(int maxHoursPerWeek) {
        this.maxHoursPerWeek = maxHoursPerWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grade)) return false;
        Grade grade = (Grade) o;
        return getId().equals(grade.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
