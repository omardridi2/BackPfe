package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    public Utilisateur CreateUtilisateur(Utilisateur utilisateur) {

        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> findAll() {

        return utilisateurRepository.findAll();

    }
    public List<Utilisateur> rechercherParNom(String nom) {
        return utilisateurRepository.findByNomContainingIgnoreCase(nom);
    }

    public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur) {
        Utilisateur existingUtilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur not found with id: " + id));
        existingUtilisateur.setNom(utilisateur.getNom());
        existingUtilisateur.setPrenom(utilisateur.getPrenom());
        existingUtilisateur.setEmail(utilisateur.getEmail());
        return utilisateurRepository.save(existingUtilisateur);
    }

    public void deleteById(Long id) {
        utilisateurRepository.deleteById(id);
    }
}
