package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Employe;
import cnstn.system_de_reservation_cnstn.repository.EmployeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService {
    private final EmployeRepository employeRepository;

    public Employe CreateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public List<Employe> findAll() {
        return employeRepository.findAll();
    }
}
