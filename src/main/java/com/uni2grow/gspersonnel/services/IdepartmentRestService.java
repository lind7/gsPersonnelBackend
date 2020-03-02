package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.entities.Department;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface IdepartmentRestService {
    List<Department> getDepartment();
    Department addDepartment(Department department);
    Department updateDepartment(Department department);
    Page<Department> searchDepartment(String mc, int page, int size);
    Optional<Department> findDepartment(Long id);
}
