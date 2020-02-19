package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.entities.Department;
import com.uni2grow.gspersonnel.services.DepartmentRestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    private DepartmentRestService departmentRestService;

    public DepartmentController(DepartmentRestService departmentRestService) {
        this.departmentRestService = departmentRestService;
    }

    @GetMapping
    public List<Department> getDepartment() {
        return  departmentRestService.getDepartment();
    }
    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return  departmentRestService.addDepartment(department);
    }
    @PutMapping
    public Department updateDepartment(@RequestBody Department department) {
        return  departmentRestService.updateDepartment(department);
    }
}