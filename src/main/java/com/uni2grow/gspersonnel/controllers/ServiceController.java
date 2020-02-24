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
        @GetMapping("/all")
        public List<Services> getServices () {
            return  this.serviceRestService.getService();
        }
        @PostMapping("/add")
        public Services addServices ( @RequestBody Services service) {
            return  this.serviceRestService.addService(service);
        }
        @PutMapping("/update")
        public Services updateServices (@RequestBody Services service) {
            return  this.serviceRestService.updateService(service);
        }
    }

