package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Partenaire;
import cnstn.system_de_reservation_cnstn.services.PartenaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partenaire")

public class PatenaireController {
    private final PartenaireService partenaireService;
    public PatenaireController(PartenaireService partenaireService) {
        this.partenaireService = partenaireService;
    }
    @PostMapping("/add")
    public Partenaire createPartenaire(@RequestBody Partenaire partenaire){
        return partenaireService.createPartenaire(partenaire);

    }
    @GetMapping("/all")
    public List<Partenaire> findAll() {
        return partenaireService.findAll();
    }

    @GetMapping("/search")
    public List<Partenaire> searchPartenaire(@RequestBody (required = false)Partenaire partenaire){
        return partenaireService.findAll();
    }
    @PutMapping("/update")
    public Partenaire updatePartenaire(@RequestBody Partenaire partenaire){
        return partenaireService.updatePartenaire(partenaire);
    }
}
