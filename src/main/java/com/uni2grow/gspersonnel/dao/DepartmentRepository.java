package com.uni2grow.gspersonnel.dao;

import com.uni2grow.gspersonnel.entities.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("select d from Department d  where d.name like %:x%") // select toto from totologie where name like %it%
    Page<Department> search(@Param("x") String mc, Pageable p);

@RestResource(path = "/byName")
      List<Department> findByNameContains(@Param("mc")String name );
}
