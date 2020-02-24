package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.GradeRepository;
import com.uni2grow.gspersonnel.entities.Grade;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class GradeRestService  implements IgradeRestService{
    private GradeRepository gradeRepository;

    public GradeRestService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }


    @Override
    public List<Grade> getAllGrades() {
        return this.gradeRepository.findAll();
    }

    @Override
    public Grade addGrade(Grade grade) {
        return this.gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(Grade grade) {
        return this.gradeRepository.save(grade);
    }

    @Override
    public Grade getGrade(Long idGrade) {
        return gradeRepository.findById(idGrade).orElse(null);
    }
}
