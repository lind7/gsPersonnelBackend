package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Services, Long> {
}
