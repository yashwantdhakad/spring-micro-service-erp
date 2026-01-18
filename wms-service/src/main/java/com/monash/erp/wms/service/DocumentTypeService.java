package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DocumentType;
import com.monash.erp.wms.repository.DocumentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DocumentTypeService {

    private final DocumentTypeRepository repository;

    public DocumentTypeService(DocumentTypeRepository repository) {
        this.repository = repository;
    }

    public List<DocumentType> list() {
        return repository.findAll();
    }

    public DocumentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DocumentType %d not found".formatted(id)));
    }

    public DocumentType create(DocumentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DocumentType update(Long id, DocumentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DocumentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}