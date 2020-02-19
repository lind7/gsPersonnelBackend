package com.uni2grow.gspersonnel.controllers;

import com.uni2grow.gspersonnel.entities.Grade;
import com.uni2grow.gspersonnel.entities.Personnel;
import com.uni2grow.gspersonnel.services.GradeRestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/grade")
public class GradeController {
    private GradeRestService gradeRestService;

    public GradeController(GradeRestService gradeRestService) {
        this.gradeRestService = gradeRestService;
    }

    @GetMapping
    public List<Grade> getGrade() {
        return  gradeRestService.getGrade();
    }
    @PostMapping
    public Grade addGrade(@RequestBody Grade grade) {
        return  gradeRestService.addGrade(grade);
    }
    @PutMapping
    public Grade updateGrade(@RequestBody Grade personnel) {
        return  gradeRestService.updateGrade(personnel);
    }

}
