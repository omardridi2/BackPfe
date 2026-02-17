package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Partenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String secteurActivite;
    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;
}
