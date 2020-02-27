package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.dao.LoginRepository;
import com.uni2grow.gspersonnel.entities.Login;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceRest  implements  IloginRestService{
    private LoginRepository loginRepository;

    public LoginServiceRest(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public Login login(Login login) {
        return this.loginRepository.save(login);
    }
}
