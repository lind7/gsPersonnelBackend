package com.uni2grow.gspersonnel.services;
import com.uni2grow.gspersonnel.entities.Grade;
import java.util.List;

public interface IgradeRestService {
    List<Grade> getGrade();
    Grade addGrade(Grade grade);
    Grade updateGrade(Grade grade);
}
