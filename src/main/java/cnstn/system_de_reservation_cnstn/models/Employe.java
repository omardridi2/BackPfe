package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
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
    @NotBlank
    private String nom;

    @NotBlank
    private String prenom;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String poste;
    @NotBlank
    private String adresse;
    @Positive
    private int telephone;
    @Positive
    private int matricule;
    @NotBlank
    private String password;
    @OneToMany(mappedBy = "employee")
    List<Equipement> equipements;



}

