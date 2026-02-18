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
    public void deleteService(Long id) {
        servicesRepository.deleteById(id);
    }

    public Services updateService(Long id, Services service) {

        Services existingService = servicesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found with id: " + id));

        existingService.setNom(service.getNom());
        existingService.setDirection(service.getDirection());

        return servicesRepository.save(existingService);

    }

}
