package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String statut;
    private Date dateDemande;

    @ManyToOne
    private Employe demandeur;

    @ManyToOne
    private Equipement equipement;
}
