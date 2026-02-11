package cnstn.system_de_reservation_cnstn.controllers;
import cnstn.system_de_reservation_cnstn.models.Reservation;
import cnstn.system_de_reservation_cnstn.services.ReservationService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
// Import de List

@RestController
// Contrôleur REST (retourne du JSON)
@RequestMapping("/reservation")
// URL de base des réservations
public class ReservationController {

    private final ReservationService reservationService;
    // Déclaration du service

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
        // Injection du service via le constructeur
    }

    @PostMapping("/add")
    // Endpoint pour ajouter une réservation
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationService.create(reservation);
        // Appel de la méthode create du service
    }

    @GetMapping("/all")
    // Endpoint pour afficher toutes les réservations
    public List<Reservation> afficher() {
        return reservationService.findAll();
        // Retourne la liste des réservations
    }
}
