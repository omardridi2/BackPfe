package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Services;
import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.repository.ServicesRepository;
import cnstn.system_de_reservation_cnstn.services.ServicesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServicesController {
    private ServicesService servicesService;
    public ServicesController(ServicesService servicesService) {
        this.servicesService = servicesService;

    }
    @PostMapping("/add")
    public Services addService(@RequestBody Services services) {
        return servicesService.createServices(services);
    }
    @GetMapping("all")
    public List<Services> afficher(){
        return servicesService.findAllServices();
    }


}
