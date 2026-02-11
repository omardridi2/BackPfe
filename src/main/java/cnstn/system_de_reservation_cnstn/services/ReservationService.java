package cnstn.system_de_reservation_cnstn.services;
// Définition du package service

import cnstn.system_de_reservation_cnstn.models.Reservation;
// Import de l’entité Reservation

import cnstn.system_de_reservation_cnstn.repository.ReservationRepository;
// Import du repository Reservation

import lombok.RequiredArgsConstructor;
// Lombok : génère automatiquement le constructeur avec les attributs final

import org.springframework.stereotype.Service;
// Indique que cette classe est un service Spring

import java.util.List;
// Import pour utiliser List

@Service
// Annotation indiquant que la classe contient la logique métier
@RequiredArgsConstructor
// Injection automatique du repository via constructeur
public class ReservationService {

    private final ReservationRepository reservationRepository;
    // Repository permettant l’accès à la base de données

    public Reservation create(Reservation reservation) {
        // Méthode pour créer une réservation
        return reservationRepository.save(reservation);
        // Sauvegarde de l’objet reservation dans la base
    }

    public List<Reservation> findAll() {
        // Méthode pour récupérer toutes les réservations
        return reservationRepository.findAll();
        // Retourne la liste des réservations
    }
}
