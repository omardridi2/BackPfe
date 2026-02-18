package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Document;
import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;
    public Document CreateDocument(Document document) {
        return documentRepository.save(document
        );
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Document updateDocument(Long id, Document document) {
        Document existingDocument = documentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Document not found with id: " + id));
        existingDocument.setTitre(document.getTitre());
        existingDocument.setType(document.getType());
        existingDocument.setChemin(document.getChemin());
        existingDocument.setNiveauAcces(document.getNiveauAcces());
        return documentRepository.save(existingDocument);
    }

    public void deleteById(Long id) {
        documentRepository.deleteById(id);
    }
}
