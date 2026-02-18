package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Salle;
import cnstn.system_de_reservation_cnstn.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalleService {
    private final SaleRepository saleRepository;
    public Salle Create(Salle salle){
        return saleRepository.save(salle);

    }
    public List<Salle> findAll(){
        return saleRepository.findAll();
    }

    public Salle updateSalle(Long id, Salle salle) {
        Salle existingSalle = saleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Salle not found with id: " + id));
        existingSalle.setNom(salle.getNom());
        existingSalle.setCapacite(salle.getCapacite());
        existingSalle.setDescription(salle.getDescription());
        return saleRepository.save(existingSalle);
    }

    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }
}
