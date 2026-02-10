package cnstn.system_de_reservation_cnstn.repository;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenmentRepositiry  extends JpaRepository<Evenement,Long>{
    Evenement findById(long id);

}
