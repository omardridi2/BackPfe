package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.services.EvenementService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Evenement")
public class EvenementController {

    private final EvenementService evenementService;
    public EvenementController(EvenementService evenementService)
    {
        this.evenementService=evenementService;
    }
    @PostMapping("/add")
    public Evenement create( @Valid @RequestBody Evenement evenement){
        return evenementService.Create(evenement);

    }
    @GetMapping("/all")
    public List<Evenement> Affiche(){

        return evenementService.findAll();
    }

    @PutMapping("/{id}")
    public Evenement updateEvenement(@PathVariable Long id, @RequestBody Evenement evenement) {
        return evenementService.updateEvenement(id, evenement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        evenementService.deleteById(id);
        return ResponseEntity.ok("Evenement supprimé avec succès");
    }
}
