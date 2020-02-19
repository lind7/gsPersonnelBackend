package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
