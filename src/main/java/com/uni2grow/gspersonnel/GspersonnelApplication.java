package com.uni2grow.gspersonnel;

import com.uni2grow.gspersonnel.dao.*;
import com.uni2grow.gspersonnel.entities.*;
import com.uni2grow.gspersonnel.enums.EnumMaritalStatus;
import com.uni2grow.gspersonnel.enums.EnumSex;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GspersonnelApplication  implements CommandLineRunner {

    private PersonnelRepository personnelRepository;
    private DepartmentRepository departmentRepository;
    private ServiceRepository serviceRepository;
    private PersonnelTypeRepository personnelTypeRepository;
    private GradeRepository gradeRepository;
    private SessionRepository  sessionRepository;
    private PersonnelServiceRepository personnelServiceRepository;
    private PersonnelSessionRepository personnelSessionRepository;

    public GspersonnelApplication(PersonnelRepository personnelRepository, DepartmentRepository departmentRepository,
                                  ServiceRepository serviceRepository, PersonnelTypeRepository personnelTypeRepository,
                                  GradeRepository gradeRepository, SessionRepository sessionRepository,
                                  PersonnelServiceRepository personnelServiceRepository,
                                  PersonnelSessionRepository personnelSessionRepository) {
        this.personnelRepository = personnelRepository;
        this.departmentRepository = departmentRepository;
        this.serviceRepository = serviceRepository;
        this.personnelTypeRepository = personnelTypeRepository;
        this.gradeRepository = gradeRepository;
        this.sessionRepository = sessionRepository;
        this.personnelServiceRepository = personnelServiceRepository;
        this.personnelSessionRepository = personnelSessionRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(GspersonnelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        List<Personnel> personnelList= new ArrayList<>();
        Personnel linda = new Personnel("Matene", "Linda", EnumSex.F,
                df.parse("01/07/1997"), "Dschang", "bp 78", "690653660",
                "145444", "linda@gmail.com", "nid", 2, true,
                EnumMaritalStatus.SINGLE, 2, true);
         personnelRepository.save(linda);
        personnelList.add(linda);
        Department computerScience = new Department("informatique", "departement d'informatique", linda,personnelList);
        departmentRepository.save(computerScience);
        Services censor = new Services("censeur", "censeur de l'établissement");
        Services provisor = new Services("provi", "provi de l'établissement");
        serviceRepository.save(provisor);

        PersonnelType teacher = new PersonnelType("enseignant", "Personnes enseignant dans l'établissemnt");
        personnelTypeRepository.save(teacher);
        Grade dipes2 = new Grade("Dipes II", "diplome d'enseignement secondaire II",10);
        gradeRepository.save(dipes2);
        Session session1 = new Session("session1",df.parse("18/02/2019"), df.parse("18/02/2020"),true);
        sessionRepository.save(session1);
        PersonnelSession personnel_session1 = new PersonnelSession(df.parse("18/02/2019"), df.parse("18/02/2020"),session1, linda);
        personnelSessionRepository.save(personnel_session1);
        PersonnelService personnel_service1 = new PersonnelService(provisor,linda, session1);
        personnelServiceRepository.save(personnel_service1);

    }
}

