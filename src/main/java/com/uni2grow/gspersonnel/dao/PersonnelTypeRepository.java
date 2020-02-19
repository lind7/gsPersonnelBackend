package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.PersonnelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelTypeRepository extends JpaRepository<PersonnelType,Long> {
}
