package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session,Long> {
}
