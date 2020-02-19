package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.DepartmentRepository;
import com.uni2grow.gspersonnel.entities.Department;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentRestService implements IdepartmentRestService {
   private DepartmentRepository departmentRepository;

    public DepartmentRestService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> getDepartment() {
        return this.departmentRepository.findAll();
    }

    @Override
    public Department addDepartment(Department department) {
        return  this.departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        return  this.departmentRepository.save(department);
    }
}
