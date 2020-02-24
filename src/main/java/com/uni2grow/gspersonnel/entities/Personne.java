package com.uni2grow.gspersonnel.entities;

import com.uni2grow.gspersonnel.enums.EnumSex;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
public class Personne implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumSex sex;
  //  @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
  //  @Column(nullable = false)
    private String placeOfBirth;
  //  @Column(nullable = false)
    private String address;
   // @Column(nullable = false)
    private String phonePrincipal;
    private String phoneSecondary;
    private String email;

    public Personne() {
    }

    public Personne(String firstName, String lastName, EnumSex sex, Date dateOfBirth, String placeOfBirth,
                    String address, String phonePrincipal, String phoneSecondary, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.address = address;
        this.phonePrincipal = phonePrincipal;
        this.phoneSecondary = phoneSecondary;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBith) {
        this.placeOfBirth = placeOfBith;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonePrincipal() {
        return phonePrincipal;
    }

    public void setPhonePrincipal(String phonePrincipal) {
        this.phonePrincipal = phonePrincipal;
    }

    public String getPhoneSecondary() {
        return phoneSecondary;
    }

    public void setPhoneSecondary(String phoneSecondary) {
        this.phoneSecondary = phoneSecondary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public EnumSex getSex() {
        return sex;
    }

    public void setSex(EnumSex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne)) return false;
        Personne personne = (Personne) o;
        return getId().equals(personne.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
