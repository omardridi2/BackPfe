package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.repository.EmployeRepository;
import cnstn.system_de_reservation_cnstn.repository.EvenmentRepositiry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class EvenementService {
    private final EvenmentRepositiry evenmentRepositiry;
    public Evenement Create (Evenement evenement){
        return evenmentRepositiry.save(evenement);

    }
    public List<Evenement> findAll(){
        return evenmentRepositiry.findAll();
    }
}




