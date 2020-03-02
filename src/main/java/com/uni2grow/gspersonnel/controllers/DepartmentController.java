package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.dao.DepartmentRepository;
import com.uni2grow.gspersonnel.entities.Department;
import com.uni2grow.gspersonnel.services.DepartmentRestService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    private DepartmentRestService departmentRestService;

    public DepartmentController(DepartmentRestService departmentRestService) {
        this.departmentRestService = departmentRestService;
    }

    @GetMapping("/all")
    public List<Department> getDepartment() {
        return  departmentRestService.getDepartment();
    }
    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        return  departmentRestService.addDepartment(department);
    }
    @PutMapping("/update")
    public Department updateDepartment(@RequestBody Department department) {
        return  departmentRestService.updateDepartment(department);
    }
    @GetMapping("/search")
    public Page<Department> searchDepartment(@RequestParam(name ="mc", defaultValue ="in") String mc,
                                             @RequestParam(name ="page", defaultValue = "1")int page,
                                             @RequestParam(name ="size", defaultValue = "5")int size){
        return departmentRestService.searchDepartment(mc, page, size);

    }
    @GetMapping("/find")
    public Optional<Department> findDepartment(Long id) {
        return  departmentRestService.findDepartment(id);
    }
}
