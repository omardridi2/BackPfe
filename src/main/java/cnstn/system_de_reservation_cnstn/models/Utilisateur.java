package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom;
    private String prenom;
    @Email
    private String email;
    private String poste;
    private String adresse;
    private int telephone;
    private int matricule;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @JsonIgnore
    @OneToMany(mappedBy = "utilisateur")
    private List<Intervention> intervention;


    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore
    private List<Evenement> evenements;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Services service;

    @ManyToMany
    @JoinTable(
            name = "utilisateur_document",
            joinColumns = @JoinColumn(name = "utilisateur_id"),
            inverseJoinColumns = @JoinColumn(name = "document_id")
    )
    private List<Document> documents = new ArrayList<>();



}

