package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.repository.EvenmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class EvenementService {
    private final EvenmentRepository evenmentRepository;
    public Evenement Create (Evenement evenement){
        return evenmentRepository.save(evenement);

    }
    public List<Evenement> findAll(){
        return evenmentRepository.findAll();
    }

    public Evenement updateEvenement(Long id, Evenement evenement) {
        Evenement existingEvenement = evenmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evenement not found with id: " + id));
        existingEvenement.setTitre(evenement.getTitre());
        existingEvenement.setDescription(evenement.getDescription());
        existingEvenement.setDateDebut(evenement.getDateDebut());
        existingEvenement.setDateFin(evenement.getDateFin());
        existingEvenement.setTypeEvenement(evenement.getTypeEvenement());
        return evenmentRepository.save(existingEvenement);
    }

    public void deleteById(Long id) {
        evenmentRepository.deleteById(id);
    }
}




