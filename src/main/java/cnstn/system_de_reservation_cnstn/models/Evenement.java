package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.sql.results.graph.Fetch;

import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotBlank
    private String titre;
    private String description;
    @Column(nullable = false)
    private Date dateDebut;
    @Column(nullable = false)
    private Date dateFin;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeEvenement typeEvenement;
    @JsonIgnore
    @OneToMany(mappedBy = "evenement", cascade = CascadeType.ALL)
    private List<Partenaire> partenaire = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    @OneToMany(mappedBy ="evenement")
    private List<Equipement> equipement ;
    @OneToMany(mappedBy = "evenement")
    private List<Salle> salle;







}
