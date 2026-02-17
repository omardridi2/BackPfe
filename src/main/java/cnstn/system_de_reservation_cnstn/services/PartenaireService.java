package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Partenaire;
import cnstn.system_de_reservation_cnstn.repository.PatenaireRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartenaireService {
    private final PatenaireRepository patenaireRepository;
    public Partenaire createPartenaire(Partenaire partenaire) {
        return patenaireRepository.save(partenaire);
    }
    public Partenaire updatePartenaire(Partenaire partenaire) {
        return patenaireRepository.save(partenaire);
    }

    public List<Partenaire> findAll() {
        return patenaireRepository.findAll();
    }
    public List<Partenaire>searchPartenaire(String nom) {
        return patenaireRepository.findByNomContainsIgnoreCase(nom);
    }

}
