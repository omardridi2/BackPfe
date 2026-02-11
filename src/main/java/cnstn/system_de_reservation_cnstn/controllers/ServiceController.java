package cnstn.system_de_reservation_cnstn.controllers;


import cnstn.system_de_reservation_cnstn.models.Service;
import cnstn.system_de_reservation_cnstn.services.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Service")
public class ServiceController {
    private ServiceService serviceService;
    public void ServiceService (ServiceService serviceService){
        this.serviceService=serviceService;

    }
    @PostMapping("/add")
    public Service Create(@RequestBody Service service){
        return serviceService.Create(service);

    }
    @GetMapping("/all")
    public List<Service> affiche(){
        return serviceService.findAll();
    }



}
