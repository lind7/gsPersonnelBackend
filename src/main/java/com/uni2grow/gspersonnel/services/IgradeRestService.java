package com.uni2grow.gspersonnel.services;
import com.uni2grow.gspersonnel.entities.Grade;
import java.util.List;

public interface IgradeRestService {
    List<Grade> getAllGrades();
    Grade addGrade(Grade grade);
    Grade updateGrade(Grade grade);
    Grade getGrade(Long idGrade);
}
