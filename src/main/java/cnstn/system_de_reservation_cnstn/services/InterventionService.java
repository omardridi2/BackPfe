package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Intervention;
import cnstn.system_de_reservation_cnstn.repository.InterventionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InterventionService {
    private final InterventionRepository interventionRepository;
    public Intervention create (Intervention intervention){
        return interventionRepository.save(intervention);
    }
    public List<Intervention> findAll(){
        return interventionRepository.findAll();
    }

    public Intervention updateIntervention(Long id, Intervention intervention) {
        Intervention existingIntervention = interventionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Intervention not found with id: " + id));
        existingIntervention.setDescription(intervention.getDescription());
        existingIntervention.setStatut(intervention.getStatut());
        existingIntervention.setDateDemande(intervention.getDateDemande());
        existingIntervention.setUtilisateur(intervention.getUtilisateur());
        return interventionRepository.save(existingIntervention);
    }

    public void deleteById(Long id) {
        interventionRepository.deleteById(id);
    }
}
