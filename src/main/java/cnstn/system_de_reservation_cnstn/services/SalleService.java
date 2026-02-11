package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Salle;
import cnstn.system_de_reservation_cnstn.repository.SalleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalleService {
    private final SalleRepository salleRepository;
    public Salle Create(Salle salle){
        return salleRepository.save(salle);

    }
    public List<Salle> findAll(){
        return salleRepository.findAll();
    }

}
