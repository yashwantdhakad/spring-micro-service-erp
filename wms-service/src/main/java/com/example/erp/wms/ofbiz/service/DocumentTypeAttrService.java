package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.DocumentTypeAttr;
import com.example.erp.wms.ofbiz.repository.DocumentTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DocumentTypeAttrService {

    private final DocumentTypeAttrRepository repository;

    public DocumentTypeAttrService(DocumentTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<DocumentTypeAttr> list() {
        return repository.findAll();
    }

    public DocumentTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DocumentTypeAttr %d not found".formatted(id)));
    }

    public DocumentTypeAttr create(DocumentTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DocumentTypeAttr update(Long id, DocumentTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DocumentTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}