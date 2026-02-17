package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Services;
import cnstn.system_de_reservation_cnstn.repository.ServicesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicesService {
    private final ServicesRepository servicesRepository;
    public Services createServices(Services services) {
        return servicesRepository.save(services);
    }
    public List<Services> findAllServices() {
        return servicesRepository.findAll();
    }
}
