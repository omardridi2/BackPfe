package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employe {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private String nom;

    private String prenom;
    private String email;
    private String poste;
    private String adresse;
    private int telephone;
    private int matricule;
    private String password;
    @OneToMany(mappedBy = "employee")
    List<Equipement> equipements;



}

