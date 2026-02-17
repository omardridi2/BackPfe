package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "direction_id")
    private Direction direction;
    @OneToMany(mappedBy = "service")
    @JsonIgnore
    private List <Utilisateur>  utilisateur;
}
