package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.DepartmentRepository;
import com.uni2grow.gspersonnel.entities.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentRestService implements IdepartmentRestService {
   private DepartmentRepository departmentRepository;
    private Page Page;

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

    @Override
    public Page<Department> searchDepartment(String mc, int page, int size) {
        return departmentRepository.search("%"+mc+"%",  PageRequest.of(size,page));
    }

    @Override
    public Optional<Department> findDepartment(Long id) {
        return  departmentRepository.findById(id);
    }
}
