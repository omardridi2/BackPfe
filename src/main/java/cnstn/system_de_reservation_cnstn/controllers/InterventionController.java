package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Intervention;
import cnstn.system_de_reservation_cnstn.services.InterventionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Intervention")
public class InterventionController {

    private final InterventionService interventionService;

    public InterventionController(InterventionService interventionService) {
        this.interventionService = interventionService;
    }

    @PostMapping("/add")
    public Intervention create(@RequestBody Intervention intervention) {
        return interventionService.create(intervention);
    }

    @GetMapping("/all")
    public List<Intervention> Affiche() {
        return interventionService.findAll();
    }

    @PutMapping("/{id}")
    public Intervention updateIntervention(@PathVariable Long id, @RequestBody Intervention intervention) {
        return interventionService.updateIntervention(id, intervention);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        interventionService.deleteById(id);
        return ResponseEntity.ok("Intervention supprimée avec succès");
    }
}
