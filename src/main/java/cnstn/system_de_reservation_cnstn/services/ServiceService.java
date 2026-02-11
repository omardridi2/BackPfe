package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Service;
import cnstn.system_de_reservation_cnstn.repository.SaleRepository;
import cnstn.system_de_reservation_cnstn.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceService {
    private ServiceRepository serviceRepository;
    public Service Create(Service service) {
        return serviceRepository.save(service);
    }

    public List<Service> findAll() {
        return serviceRepository.findAll();
    }
}
