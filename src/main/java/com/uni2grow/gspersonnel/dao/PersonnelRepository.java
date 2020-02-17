package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
}
