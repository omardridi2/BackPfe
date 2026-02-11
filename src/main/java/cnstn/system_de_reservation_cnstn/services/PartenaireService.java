package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Partenaire;
import cnstn.system_de_reservation_cnstn.repository.PartenaireRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartenaireService {
    private final PartenaireRepository partenaireRepository;

    public Partenaire createPartenaire(Partenaire partenaire) {
        return partenaireRepository.save(partenaire);
    }

    public List<Partenaire> findAll() {
        return partenaireRepository.findAll();
    }

}

