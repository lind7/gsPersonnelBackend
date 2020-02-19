package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Personnel_Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelServiceRepository extends JpaRepository<Personnel_Service,Long> {
}
