package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.CatDocument;
import cnstn.system_de_reservation_cnstn.repository.CatDocumentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatDocumentService {

    private final CatDocumentRepository catDocumentRepository;

    public CatDocument CreateCatDocument(CatDocument catDocument) {
        return catDocumentRepository.save(catDocument);
    }

    public List<CatDocument> findAll() {
        return catDocumentRepository.findAll();
    }

    public CatDocument updateCatDocument(Long id, CatDocument catDocument) {
        CatDocument existingCatDocument = catDocumentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CatDocument not found with id: " + id));
        existingCatDocument.setCategorie(catDocument.getCategorie());
        existingCatDocument.setDirection(catDocument.getDirection());
        return catDocumentRepository.save(existingCatDocument);
    }

    public void deleteById(Long id) {
        catDocumentRepository.deleteById(id);
    }
}
