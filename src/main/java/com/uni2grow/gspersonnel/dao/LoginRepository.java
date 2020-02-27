package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository< Login, Long> {
}
