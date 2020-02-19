package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository  extends JpaRepository<Grade, Long> {
}
