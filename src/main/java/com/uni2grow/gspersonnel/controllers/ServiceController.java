package com.uni2grow.gspersonnel.controllers;
import com.uni2grow.gspersonnel.entities.Services;
import com.uni2grow.gspersonnel.services.ServiceRestService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/service")
public class ServiceController {
    private ServiceRestService serviceRestService;

    public ServiceController(ServiceRestService serviceRestService) {
        this.serviceRestService = serviceRestService;
    }
        @GetMapping
        public List<Services> getServices () {
            return  this.serviceRestService.getService();
        }
        @PostMapping
        public Services addServices (Services service) {
            return  this.serviceRestService.addService(service);
        }
        @PutMapping
        public Services updateServices (Services service) {
            return  this.serviceRestService.updateService(service);
        }
    }

