package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Equipement;
import cnstn.system_de_reservation_cnstn.repository.EquipementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService {
    private final EquipementRepository equipementRepository;

    public Equipement createEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);

    }

    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    public Equipement updateEquipement(Long id, Equipement equipement) {
        Equipement existingEquipement = equipementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipement not found with id: " + id));
        existingEquipement.setEtat(equipement.getEtat());
        existingEquipement.setReservable(equipement.getReservable());
        existingEquipement.setTypeEquipement(equipement.getTypeEquipement());
        return equipementRepository.save(existingEquipement);
    }

    public void deleteById(Long id) {
        equipementRepository.deleteById(id);
    }
}
