package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String type;
    private String chemin;
    private String niveauAcces;

    @ManyToOne
    private CatDocument categorie;
}

