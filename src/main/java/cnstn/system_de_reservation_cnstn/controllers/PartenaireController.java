package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Partenaire;
import cnstn.system_de_reservation_cnstn.services.PartenaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Partenaire")
public class PartenaireController {
    private final PartenaireService partenaireService;

    public PartenaireController(PartenaireService partenaireService) {
        this.partenaireService = partenaireService;
    }

    @PostMapping("/add")
    public Partenaire createPartenaire(@RequestBody Partenaire partenaire) {
        return partenaireService.createPartenaire(partenaire);
    }

    @GetMapping("/all")
    public List<Partenaire> afficher() {
        return partenaireService.findAll();
    }
}
