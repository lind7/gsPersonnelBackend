package com.uni2grow.gspersonnel.services;

import com.uni2grow.gspersonnel.entities.Services;

import java.util.List;

public interface IserviceRestService {
    List<Services> getService();
    Services addService(Services service);
    Services updateService(Services service);
}
