package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Personnel_Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelSessionRepository extends JpaRepository<Personnel_Session,Long> {
}