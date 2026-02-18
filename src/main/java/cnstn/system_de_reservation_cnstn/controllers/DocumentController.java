package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Document;
import cnstn.system_de_reservation_cnstn.services.DocumentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Document")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/add")
    public Document CreateDocument(@RequestBody Document document) {
        return documentService.CreateDocument(document);
    }

    @GetMapping("/all")
    public List<Document> afficher() {
        return documentService.findAll();
    }

    @PutMapping("/{id}")
    public Document updateDocument(@PathVariable Long id, @RequestBody Document document) {
        return documentService.updateDocument(id, document);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        documentService.deleteById(id);
        return ResponseEntity.ok("Document supprimé avec succès");
    }
}
