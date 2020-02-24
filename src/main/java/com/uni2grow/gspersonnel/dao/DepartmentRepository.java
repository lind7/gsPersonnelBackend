package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("select c from Department c  where c.name like : X")
    public Page<Department> search(@Param("X")String mc, Pageable p);

}
