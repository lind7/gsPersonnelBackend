package com.uni2grow.gspersonnel.services;
import com.uni2grow.gspersonnel.entities.Services;
import org.springframework.stereotype.Service;
import com.uni2grow.gspersonnel.dao.ServiceRepository;


import java.util.List;

@Service
public class ServiceRestService implements IserviceRestService{
    private ServiceRepository serviceRepository;

    public ServiceRestService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<Services> getService() {
        return this.serviceRepository.findAll();
    }

    @Override
    public Services addService(Services service) {
        return  this.serviceRepository.save(service);
    }

    @Override
    public Services updateService(Services service) {
        return this.serviceRepository.save(service);
    }
}
