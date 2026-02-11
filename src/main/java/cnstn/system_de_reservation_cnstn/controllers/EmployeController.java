package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Employe;
import cnstn.system_de_reservation_cnstn.services.EmployeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employe")
public class EmployeController {
    private EmployeService employeService;

    public EmployeController(EmployeService employeService) {

        this.employeService = employeService;
    }

    @PostMapping("/add")
    public Employe CreateEmploye(@Valid @RequestBody Employe employe) {
        return employeService.CreateEmploye(employe);
    }

    //cette méthode est dedié pour l'affichage
    @GetMapping("/all")
    public List<Employe> afficher() {
        return employeService.findAll();
    }

}
