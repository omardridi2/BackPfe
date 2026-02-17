package cnstn.system_de_reservation_cnstn.repository;

import cnstn.system_de_reservation_cnstn.models.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatenaireRepository extends JpaRepository<Partenaire,Long> {
 List<Partenaire> findByNomContainsIgnoreCase(String nom);
}
