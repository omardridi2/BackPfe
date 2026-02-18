package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Equipement;
import cnstn.system_de_reservation_cnstn.services.EquipementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Equipement")
public class EquipementController {

    private final EquipementService equipementService;

    public EquipementController(EquipementService equipementService){
        this.equipementService = equipementService;
    }

    @PostMapping("/add")
    public Equipement createEquipement(@RequestBody Equipement equipement){
        return equipementService.createEquipement(equipement);
    }

    @GetMapping
    public List<Equipement> afficher(){
        return equipementService.findAll();
    }

    @PutMapping("/{id}")
    public Equipement updateEquipement(@PathVariable Long id, @RequestBody Equipement equipement) {
        return equipementService.updateEquipement(id, equipement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        equipementService.deleteById(id);
        return ResponseEntity.ok("Equipement supprimé avec succès");
    }
}
