package com.uni2grow.gspersonnel;

import com.uni2grow.gspersonnel.dao.PersonnelRepository;
import com.uni2grow.gspersonnel.entities.Personnel;
import com.uni2grow.gspersonnel.enums.EnumMaritalStatus;
import com.uni2grow.gspersonnel.enums.EnumSex;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class GspersonnelApplication  implements CommandLineRunner {

    private PersonnelRepository personnelRepository;

    public GspersonnelApplication(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(GspersonnelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        personnelRepository.save(new Personnel("Matene", "Linda", EnumSex.M,
                df.parse("01/07/1997"),"Dschang", "bp 78", "690653660",
                "145444","linda@gmail.com","nid",2, true,
                EnumMaritalStatus.SINGLE, 2, true));

    }
}
