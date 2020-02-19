package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.entities.Department;
import com.uni2grow.gspersonnel.entities.Personnel;

import java.util.List;

public interface IdepartmentRestService {
    List<Department> getDepartment();
    Department addDepartment(Department department);
    Department updateDepartment(Department department);
}
