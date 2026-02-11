package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.repository.EvenementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class EvenementService {
    private final EvenementRepository evenementRepository;
    public Evenement Create (Evenement evenement){
        return evenementRepository.save(evenement);

    }
    public List<Evenement> findAll(){
        return evenementRepository.findAll();
    }
}




