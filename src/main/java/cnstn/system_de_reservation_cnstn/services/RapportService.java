package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Intervention;
import cnstn.system_de_reservation_cnstn.models.Rapport;
import cnstn.system_de_reservation_cnstn.repository.InterventionRepository;
import cnstn.system_de_reservation_cnstn.repository.RapportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RapportService {
    private final RapportRepository rapportRepository;
    public Rapport create (Rapport rapport){
        return rapportRepository.save(rapport);
    }
    public List<Rapport> findAll(){
        return rapportRepository.findAll();
    }
}
