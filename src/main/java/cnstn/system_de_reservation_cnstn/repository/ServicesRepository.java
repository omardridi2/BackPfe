package cnstn.system_de_reservation_cnstn.repository;

import cnstn.system_de_reservation_cnstn.models.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {
    Services findByNomContainingIgnoreCase(String nom);
}
